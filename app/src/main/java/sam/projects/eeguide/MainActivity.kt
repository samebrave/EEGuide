package sam.projects.eeguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.NavType
import sam.projects.eeguide.screens.*
import sam.projects.eeguide.ui.theme.EEGuideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EEGuideTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "main_categories"
                    ) {
                        composable("main_categories") {
                            MainCategoriesScreen(navController = navController)
                        }

                        composable(
                            "sub_categories/{categoryTitle}",
                            arguments = listOf(
                                navArgument("categoryTitle") { type = NavType.StringType }
                            )
                        ) { backStackEntry ->
                            SubCategoriesScreen(
                                navController = navController,
                                categoryTitle = backStackEntry.arguments?.getString("categoryTitle") ?: ""
                            )
                        }

                        composable(
                            "topics/{categoryTitle}/{subCategoryTitle}",
                            arguments = listOf(
                                navArgument("categoryTitle") { type = NavType.StringType },
                                navArgument("subCategoryTitle") { type = NavType.StringType }
                            )
                        ) { backStackEntry ->
                            TopicsScreen(
                                navController = navController,
                                categoryTitle = backStackEntry.arguments?.getString("categoryTitle") ?: "",
                                subCategoryTitle = backStackEntry.arguments?.getString("subCategoryTitle") ?: ""
                            )
                        }

                        composable(
                            "topic_content/{categoryTitle}/{subCategoryTitle}/{topicTitle}",
                            arguments = listOf(
                                navArgument("categoryTitle") { type = NavType.StringType },
                                navArgument("subCategoryTitle") { type = NavType.StringType },
                                navArgument("topicTitle") { type = NavType.StringType }
                            )
                        ) { backStackEntry ->
                            TopicContentScreen(
                                navController = navController,
                                categoryTitle = backStackEntry.arguments?.getString("categoryTitle") ?: "",
                                subCategoryTitle = backStackEntry.arguments?.getString("subCategoryTitle") ?: "",
                                topicTitle = backStackEntry.arguments?.getString("topicTitle") ?: ""
                            )
                        }

                        composable(
                            "image_display/{title}/{imageResource}",
                            arguments = listOf(
                                navArgument("title") { type = NavType.StringType },
                                navArgument("imageResource") { type = NavType.IntType }
                            )
                        ) { backStackEntry ->
                            ImageDisplayScreen(
                                navController = navController,
                                title = backStackEntry.arguments?.getString("title") ?: "",
                                imageResource = backStackEntry.arguments?.getInt("imageResource") ?: 0
                            )
                        }
                    }
                }
            }
        }
    }
}