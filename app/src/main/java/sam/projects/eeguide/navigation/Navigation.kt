package sam.projects.eeguide.navigation

sealed class Screen(val route: String) {
    object MainCategories : Screen("main_categories")
    object SubCategories : Screen("sub_categories/{categoryTitle}") {
        fun createRoute(categoryTitle: String) = "sub_categories/$categoryTitle"
    }
    object Topics : Screen("topics/{categoryTitle}/{subCategoryTitle}") {
        fun createRoute(categoryTitle: String, subCategoryTitle: String) =
            "topics/$categoryTitle/$subCategoryTitle"
    }
    object TopicContent : Screen("content/{categoryTitle}/{subCategoryTitle}/{topicTitle}") {
        fun createRoute(categoryTitle: String, subCategoryTitle: String, topicTitle: String) =
            "content/$categoryTitle/$subCategoryTitle/$topicTitle"
    }
}