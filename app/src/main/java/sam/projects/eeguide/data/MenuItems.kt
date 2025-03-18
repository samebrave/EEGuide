package sam.projects.eeguide.data

import sam.projects.eeguide.R

data class MainCategory(
    val title: String,
    val icon: Int,
    val subCategories: List<SubCategory>,
    val isImageCategory: Boolean = false,
    val imageResourceId: Int? = null
)

data class SubCategory(
    val title: String,
    val topics: List<Topic>
)

data class Topic(
    val title: String,
    val content: String
)

object MenuData {
    val mainCategories = listOf(
        MainCategory(
            "Temel",
            R.drawable.ic_basics,
            listOf(
                SubCategory(
                    "Temel Kavramlar",
                    listOf(

                        Topic("Elektriğin Tanıtımı", "Elektrik Nedir?\n" +
                                "\n" +
                                "    Elektrik, elektrik gücünün veya yükün akışı olarak tanımlanır ve doğanın temel bir parçasıdır. Yıldırımlar, bulutlarda biriken gerilimin ani boşalmasıyla oluşur. Elektrik iletim hatları, birincil enerji kaynakları kullanılarak üretilen elektrik akımının dağıtımında kullanılır.\n" +
                                "\n" +
                                "Atom Yapısı ve Elektron Akışı\n" +
                                "\n" +
                                "    Maddeler atomlardan oluşur; atomlar proton, nötron ve elektron içerir. Elektronlar atom çekirdeğinin etrafında hareket eder. İletken maddeler, serbest elektronlar sayesinde elektrik akımı oluşturur. Elektronlar, bir potansiyel fark uygulandığında belirli bir yönde hareket eder.\n" +
                                "\n" +
                                "Elektrik Akımı\n" +
                                "\n" +
                                "    Elektrik akımı, serbest elektronların hareketiyle oluşur. Elektron akışı, bataryanın negatif terminalinden pozitif terminaline doğrudur. Elektrik akımı, alternatif akım (AC) ve doğru akım (DC) olarak ikiye ayrılır. Doğru akım tek yönlü, alternatif akım ise her iki yönde değişir.\n" +
                                "\n" +
                                "Gerilim ve Akım Türleri\n" +
                                "\n" +
                                "    Gerilim farkı, elektronların hareketini etkiler. Doğru akım, doğada kendiliğinden oluşabilir (örneğin yıldırım). Alternatif akım, hidroelektrik santrallerinde jeneratörler aracılığıyla üretilir ve evlerdeki prizlere taşınır.\n"),

                        Topic("Gerilim, Akım ve Direnç", "Gerilim (V)\n" +
                                "\n" +
                                "Gerilim, elektrik yükleri arasında potansiyel farkı ifade eder ve birim olarak volt (V) ile ölçülür. Elektrik devrelerinde, gerilim, yüklerin hareket etmesi için gerekli olan \"itici güç\" olarak düşünülebilir. Yüksek gerilim, daha fazla enerji taşıyan yüklerin hareket etmesine olanak tanır. Gerilim, bir devredeki enerji kaynağından (örneğin, batarya veya jeneratör) çıkar ve devre elemanları arasında dağıtılır.\n" +
                                "\n" +
                                "Akım (I)\n" +
                                "\n" +
                                "Akım, elektrik yüklerinin bir iletken üzerinden akışını ifade eder ve birim olarak amper (A) ile ölçülür. Elektrik akımı, genellikle elektronların hareketiyle oluşur. Akım, bir devredeki yüklerin zamanla ne kadarının geçtiğini gösterir. Doğru akım (DC) tek yönde akar, alternatif akım (AC) ise yön değiştirir. Akım, devredeki gerilim ve dirence bağlı olarak değişir.\n" +
                                "\n" +
                                "Direnç (R)\n" +
                                "\n" +
                                "Direnç, bir iletkenin elektrik akımına karşı gösterdiği dirençtir ve birim olarak ohm (Ω) ile ölçülür. Direnç, iletkenin malzemesine, uzunluğuna ve kesit alanına bağlıdır. Yüksek direnç, akımın geçişini zorlaştırırken, düşük direnç akımın daha kolay geçmesini sağlar. Ohm Yasası, gerilim (V), akım (I) ve direnç (R) arasındaki ilişkiyi tanımlar: V = I × R. Bu yasa, bir devredeki gerilim, akım ve direnç arasındaki dengeyi anlamak için temel bir araçtır."),

                        Topic("Ohm Yasası", "Ohm'un Yasası, 1826 yılında Alman fizikçi ve matematikçi Georg Simon Ohm tarafından keşfedilen, gerilim (voltaj), akım ve direnç arasındaki ilişkiyi tanımlar. Bu yasa, sabit bir sıcaklıkta, bir iletken üzerinden akan akımın potansiyel fark (gerilim) ile doğru orantılı ve direnç ile ters orantılı olduğunu belirtir. Matematiksel olarak ifade edildiğinde, formül şu şekildedir:\n" +
                                "\n" +
                                "V=I×R\n" +
                                "\n" +
                                "Burada:\n" +
                                "\n" +
                                "    V = Gerilim (Volt)\n" +
                                "    I = Akım (Amper)\n" +
                                "    R = Direnç (Ohm)\n" +
                                "\n" +
                                "Ohm'un Yasası Üçgeni\n" +
                                "\n" +
                                "Ohm'un Yasası'nı daha iyi anlamak için bir üçgen kullanabiliriz. Bu üçgende, V, I ve R değerleri üst üste yerleştirilmiştir. Bu yapı sayesinde, herhangi bir değeri çözmek kolaylaşır:\n" +
                                "\n" +
                                "    V=I×R\n" +
                                "    I=RV\u200B\n" +
                                "    R=IV\u200B\n" +
                                "\n" +
                                "Örnek Problemler\n" +
                                "\n" +
                                "    Akım Hesaplama:\n" +
                                "\n" +
                                "    Bir devrede 12V'luk bir batarya ve 600Ω'luk bir yük direnci var. Akımı bulmak için:\n" +
                                "\n" +
                                "    I=RV\u200B=600Ω12V\u200B=0.02A=20mA\n" +
                                "\n" +
                                "    Bu devrede 20mA akım akar.\n" +
                                "\n" +
                                "    Gerilim Hesaplama:\n" +
                                "\n" +
                                "    600Ω'luk bir yük direnci ve 3mA'lik bir akım olan bir devrede gerilimi bulmak için:\n" +
                                "\n" +
                                "    V=I×R=0.003A×600Ω=1.8V\n" +
                                "\n" +
                                "    Gerilim 1.8V'dir.\n" +
                                "\n" +
                                "    Direnç Hesaplama:\n" +
                                "\n" +
                                "    6V gerilim ve 3mA akım olan bir devrede direnci bulmak için:\n" +
                                "\n" +
                                "    R=IV\u200B=0.003A6V\u200B=2000Ω\n" +
                                "\n" +
                                "    Direnç 2000Ω'dur.\n" +
                                "\n" +
                                "Güç Hesabı\n" +
                                "\n" +
                                "Güç, belirli bir işin yapılma hızını ifade eder ve genellikle watt (W) cinsinden ölçülür. Elektriksel güç, gerilim ve akım ile ilişkilidir ve şu formülle tanımlanır:\n" +
                                "\n" +
                                "P=V×I\n" +
                                "\n" +
                                "Burada:\n" +
                                "\n" +
                                "    P = Güç (Watt)\n" +
                                "    V = Gerilim (Volt)\n" +
                                "    I = Akım (Amper)\n" +
                                "\n" +
                                "Güç Üçgeni\n" +
                                "\n" +
                                "Güç üçgeni kullanarak, güç, gerilim ve akım arasındaki ilişkileri çözebiliriz:\n" +
                                "\n" +
                                "    P=V×I\n" +
                                "    V=IP\u200B\n" +
                                "    I=VP\u200B\n" +
                                "\n" +
                                "Örnek Güç Hesabı:\n" +
                                "\n" +
                                "Bir devrede gerilim 24V, akım 2A ve yük direnci 12Ω ise:\n" +
                                "\n" +
                                "    Gerilim: V=I×R=2A×12Ω=24V\n" +
                                "    Akım: I=RV\u200B=12Ω24V\u200B=2A\n" +
                                "    Direnç: R=IV\u200B=2A24V\u200B=12Ω\n" +
                                "    Güç: P=V×I=24V×2A=48W\n"),
                        Topic("Elektronik Devreler", "Elektronik Devre Nedir?\n" +
                                "\n" +
                                "Elektronik devre, belirli bir işlevi yerine getirmek için bir araya getirilmiş kapalı bir döngüdeki birbirine bağlı elektronik bileşenlerden oluşur. Bu bileşenler arasında dirençler, kapasitörler, indüktörler, diyotlar, transistörler ve entegre devreler bulunur. Mühendisler, bu bileşenleri dikkatlice düzenleyerek, sinyalleri güçlendiren, açıp kapatan, matematiksel hesaplamalar yapan ve daha fazlasını gerçekleştiren devreler oluşturabilirler.\n" +
                                "\n" +
                                "Temel Bileşenler\n" +
                                "\n" +
                                "    Dirençler:\n" +
                                "\n" +
                                "    Dirençler, elektrik akımını sınırlayan pasif bileşenlerdir. Gerilim seviyelerini kontrol etmek, transistörlerin bias'ını ayarlamak ve hassas bileşenleri aşırı akımdan korumak için kullanılır.\n" +
                                "\n" +
                                "    Kapasitörler:\n" +
                                "\n" +
                                "    Kapasitörler, elektrik enerjisini depolayan ve serbest bırakan bileşenlerdir. Zamanlama devrelerinde, gürültü filtrelemede ve enerji depolama uygulamalarında kullanılır.\n" +
                                "\n" +
                                "    İndüktörler:\n" +
                                "\n" +
                                "    İndüktörler, enerjiyi manyetik alanda depolar. Filtrelerde, osilatörlerde ve güç kaynaklarında kullanılır.\n" +
                                "\n" +
                                "    Diyotlar:\n" +
                                "\n" +
                                "    Diyotlar, akımın bir yönde akmasına izin verirken, ters yönde akışını engelleyen bileşenlerdir. Genellikle alternatif akımı (AC) doğru akıma (DC) dönüştürmek için kullanılır.\n" +
                                "\n" +
                                "    Transistörler:\n" +
                                "\n" +
                                "    Transistörler, modern elektroniğin yapı taşlarıdır. Elektronik sinyalleri güçlendirebilir ve anahtarlayabilirler.\n" +
                                "\n" +
                                "    Entegre Devreler (IC):\n" +
                                "\n" +
                                "    Entegre devreler, tek bir çip üzerine miniaturize edilmiş tam devrelerdir. Binlerce veya milyonlarca transistör, direnç ve diğer bileşenleri içerebilir.\n" +
                                "\n" +
                                "Örnek: Örnekleme ve Tutma Devresi\n" +
                                "\n" +
                                "Örnekleme ve tutma devresi, analog elektroniğin temel bileşenlerinden biridir. Giriş sinyalini \"örnekleyerek\" ve bu değeri \"tutarak\" işlemeye hazır hale getirir. Genellikle analogdan dijitale dönüştürücülerde (ADC) kullanılır.\n" +
                                "\n" +
                                "Uygulamalar\n" +
                                "\n" +
                                "Elektronik devreler, çeşitli alanlarda uygulama bulur:\n" +
                                "\n" +
                                "    İletişim Sistemleri: Sinyal iletiminde kritik rol oynar.\n" +
                                "    Tüketici Elektroniği: Televizyonlar, bilgisayarlar ve akıllı telefonlar gibi günlük cihazları çalıştırır.\n" +
                                "    Tıbbi Cihazlar: Pacemaker'lar ve tanı ekipmanları gibi hassas ölçümler yapar.\n" +
                                "    Otomotiv Sistemleri: Motor yönetimi, güvenlik sistemleri ve eğlence sistemlerini kontrol eder.\n" +
                                "    Yenilenebilir Enerji: Güneş ve rüzgar enerjisi gibi kaynakları dönüştürür.\n" +
                                "\n" +
                                "Gelecek\n" +
                                "\n" +
                                "Teknoloji ilerledikçe, elektronik devrelerin daha güçlü, kompakt ve enerji verimli hale gelmesi bekleniyor. Nanoteknoloji ve yeni malzemelerin geliştirilmesi, daha küçük ve hızlı devrelerin yaratılmasına olanak tanıyabilir. Ayrıca, elektronik devrelerin yapay zeka, nesnelerin interneti (IoT) ve kuantum hesaplama gibi yeni teknolojilerle entegrasyonu, devrim niteliğinde uygulamalar için büyük bir potansiyel sunmaktadır.")
                    )
                ),


                SubCategory(
                    "Elektrik Temelleri",
                    listOf(
                        Topic("Elektrik Yükü ve Elektriksel Alan", "Elektriksel Yük Nedir?\n" +
                                "\n" +
                                "Elektriksel yük, bir nesnenin elektriksel özelliklerini belirleyen temel bir niceliktir. Elektriksel yük, pozitif ve negatif olmak üzere iki türde bulunur. Pozitif yük, protonlar tarafından taşınırken, negatif yük elektronlar tarafından taşınır. Elektriksel yüklerin birimi coulomb (C) olarak tanımlanır. Aynı tür yükler birbirini iterken, zıt tür yükler birbirini çeker. Bu etkileşim, Coulomb Yasası ile tanımlanır ve iki yük arasındaki kuvvetin, yüklerin büyüklükleriyle doğru orantılı ve aralarındaki mesafe ile ters orantılı olduğunu belirtir.\n" +
                                "\n" +
                                "Elektriksel Alan Nedir?\n" +
                                "\n" +
                                "Elektriksel alan, bir elektriksel yükün etrafında oluşan ve diğer elektriksel yükler üzerinde kuvvet uygulayan bir alandır. Elektriksel alan, birim yük başına düşen kuvvet olarak tanımlanır ve birimi newton/coulomb (N/C) veya volt/metre (V/m) olarak ifade edilir. Elektriksel alan, bir yükün etrafında yönlü bir alan oluşturur ve bu alanın yönü, pozitif yükten çıkan ve negatif yüke doğru yönelen bir ok ile gösterilir.\n" +
                                "\n" +
                                "Elektriksel Alanın Oluşumu\n" +
                                "\n" +
                                "Bir elektriksel yük, çevresinde bir elektriksel alan oluşturur. Örneğin, pozitif bir yük, çevresinde dışarıya doğru bir elektriksel alan oluştururken, negatif bir yük, çevresinde içeriye doğru bir elektriksel alan oluşturur. Elektriksel alan, yüklerin etkileşimlerini anlamak için kritik öneme sahiptir. Bir yük, elektriksel alan içinde hareket ettiğinde, bu alan tarafından bir kuvvet etkisi altında kalır.\n" +
                                "\n" +
                                "Elektriksel Alanın Hesaplanması\n" +
                                "\n" +
                                "Bir elektriksel alanın büyüklüğü, aşağıdaki formülle hesaplanabilir:\n" +
                                "\n" +
                                "E=qF\u200B\n" +
                                "\n" +
                                "Burada:\n" +
                                "\n" +
                                "    E = Elektriksel alan (N/C veya V/m)\n" +
                                "    F = Elektriksel kuvvet (N)\n" +
                                "    q = Yük (C)\n" +
                                "\n" +
                                "Ayrıca, bir noktasal yükten (Q) uzaklık (r) ile elektriksel alanın hesaplanması için kullanılan formül:\n" +
                                "\n" +
                                "E=r2k⋅∣Q∣\u200B\n" +
                                "\n" +
                                "Burada k Coulomb sabitidir (yaklaşık 8.99×109N m2/C2).\n" +
                                "\n" +
                                "Sonuç\n" +
                                "\n" +
                                "Elektriksel yük ve elektriksel alan, elektrik ve manyetizma alanında temel kavramlardır. Elektriksel yükler, yüklerin etkileşimlerini belirlerken, elektriksel alanlar bu etkileşimlerin nasıl gerçekleştiğini anlamamıza yardımcı olur. Bu kavramlar, elektrik devreleri, elektromanyetik alanlar ve birçok teknolojik uygulama için kritik öneme sahiptir. Elektriksel yük ve alan arasındaki ilişkiyi anlamak, mühendislik ve fizik alanlarında önemli bir temel oluşturur."),

                        Topic("İletkenler ve Yalıtkanlar", "İletkenler ve Yalıtkanlar\n" +
                                "\n" +
                                "İletkenler, elektronların serbestçe akmasına izin veren malzemelerdir. Bir iletken malzeme, yük transferine olanak tanır ve yük, nesnenin yüzeyine hızla dağılır. Yük, iletkenin yüzeyinde eşit olarak dağılarak, fazla elektronlar arasındaki itici kuvvetleri minimize eder. Eğer bir iletken başka bir nesneye dokunursa, yük bu nesneye de aktarılabilir. İletkenler, yük transferini serbest elektron hareketi ile sağlar.\n" +
                                "\n" +
                                "Yalıtkanlar ise elektronların atomdan atom veya molekülden moleküle serbestçe akışını engelleyen malzemelerdir. Yalıtkan bir nesneye yük aktarıldığında, bu yük başlangıç noktasında kalır ve yüzeyde eşit olarak dağılmaz. Yalıtkanlar, elektrik yüklerini transfer etmekte etkili olmasalar da, elektrostatik deneylerde kritik bir rol oynarlar. İletken nesneler genellikle yalıtkan nesneler üzerine monte edilir, bu da iletkenin çevresine yük transferini engeller.\n" +
                                "\n" +
                                "İletkenler ve Yalıtkanlar Örnekleri\n" +
                                "\n" +
                                "İletken örnekleri arasında metaller, tuzlu su çözeltileri, grafit ve insan vücudu bulunur. Yalıtkan örnekleri ise plastik, Styrofoam, kağıt, kauçuk, cam ve kuru havadır. Malzemelerin iletkenler ve yalıtkanlar olarak sınıflandırılması, biraz yapay bir ayrım olarak düşünülebilir. Malzemeleri bir süreklilik boyunca yerleştirmek daha uygundur; süper iletkenler bir uçta, en az iletken malzemeler ise diğer uçta yer alır.\n" +
                                "\n" +
                                "Yük Dağılımı ve Elektron Hareketi\n" +
                                "\n" +
                                "Bir iletken malzeme üzerinde negatif yük oluşturulduğunda, fazla elektronlar birbirlerini iterek daha fazla alana yayılma eğilimindedir. Elektronlar, itici kuvvetleri azaltmak için nesnenin yüzeyinde hareket ederler. Eğer bir iletken pozitif yük alırsa, elektronlar diğer atomlardan çekilerek pozitif yükün bulunduğu bölgeye doğru hareket eder. Bu, yükün yüzeyde dağılımını sağlar.\n" +
                                "\n" +
                                "Nem ve Statik Yük\n" +
                                "\n" +
                                "Nem, statik yük birikimlerini etkileyebilir. Kuru hava, statik yük birikimini artırırken, yüksek nem seviyeleri yüklerin su molekülleri tarafından alınmasına neden olur. Bu nedenle, kış aylarında statik elektrik etkileri daha belirgin hale gelir.\n" +
                                "\n" +
                                "Sonuç\n" +
                                "\n" +
                                "Elektriksel yük ve elektriksel alan, elektrik ve manyetizma alanında temel kavramlardır. İletkenler ve yalıtkanlar arasındaki farklar, yük transferi ve dağılımı üzerinde önemli etkilere sahiptir. Bu kavramlar, elektrik devreleri, elektrostatik deneyler ve birçok teknolojik uygulama için kritik öneme sahiptir. Elektriksel yük ve alan arasındaki ilişkiyi anlamak, mühendislik ve fizik alanlarında önemli bir temel oluşturur."),

                        Topic("Güç ve Enerji", "Elektrik enerjisi, bir elektrik devresinde yük akışını sürdürmek için elektrik kaynağı tarafından yapılan iş olarak tanımlanır. Elektrik yükünün hareketi, elektrik enerjisi üretir. Kinetik enerji, yüklerin bir yerden başka bir yere hareketidir. Elektrik yük transferinin hızı arttıkça, daha fazla elektrik enerjisi taşıma kapasitesi de artar.\n" +
                                "\n" +
                                "Dönüşüm yasasına göre, \"Enerji yok edilemez veya dönüştürülemez, ancak bir formdan diğerine dönüştürülebilir.\" Elektrik enerjisi de bu şekilde bir formdan diğerine aktarılır. Örneğin, bir ampulü açtığınızda, elektrik enerjisi ışık ve ısıya dönüştürülür. Elektrik enerjisi, çok çeşitli elektrikli cihazları çalıştırmak için kullanılabilir.\n" +
                                "\n" +
                                "Elektrik enerjisi genellikle 'W' veya 'E' ile gösterilir.\n" +
                                "\n" +
                                "Elektrik Enerjisinin İşleyişi\n" +
                                "\n" +
                                "Elektriğin işleyebilmesi için elektronlar ve protonlar gereklidir. Bakır teldeki elektronlar serbestçe hareket edebilir; bu, temel ilkedir. Her elektron negatif bir yük taşır. Elektronlar, pozitif elektrik yükleri (protonlar ve pozitif yüklü iyonlar gibi) ile aralarındaki çekim kuvvetleri ve negatif yükler (diğer elektronlar ve negatif yüklü iyonlar gibi) ile aralarındaki itme kuvvetleri nedeniyle hareket eder.\n" +
                                "\n" +
                                "Yani, bir yüklü parçacığın (bu durumda bir elektron) etrafındaki elektrik alanı, diğer yüklü parçacıklar üzerinde çekim veya itme kuvveti uygular, bu da onların hareket etmesine ve dolayısıyla iş yapmasına neden olur. Elektronlar, protonlar, atom çekirdekleri, pozitif yüklü iyonlar ve negatif yüklü iyonlar (anyonlar) elektrik enerjisi üretebilen yüklü parçacıklardır.\n" +
                                "\n" +
                                "Elektrik Enerjisi Formülü\n" +
                                "\n" +
                                "Basit bir devreyi düşünelim; bir güç kaynağı (batarya), bir direnç ve akım akışını tamamlamak için bir iletken olsun.\n" +
                                "\n" +
                                "Varsayalım ki 'V' devredeki potansiyel fark, 'I' akım, 'Q' yük ve 'R' dirençtir.\n" +
                                "\n" +
                                "O zaman elektrik yükü tarafından yapılan iş şöyle ifade edilir:\n" +
                                "\n" +
                                "W=V⋅Q\n" +
                                "\n" +
                                "Biliyoruz ki,\n" +
                                "\n" +
                                "I=tQ\u200B\n" +
                                "\n" +
                                "Bu,\n" +
                                "\n" +
                                "Q=I⋅t şeklinde yazılabilir.\n" +
                                "\n" +
                                "Akım 'I' bir iletken üzerinden 't' saniye boyunca aktığında, yük 'Q' tarafından yapılan toplam iş:\n" +
                                "\n" +
                                "W=V⋅I⋅t\n" +
                                "\n" +
                                "Bu nedenle, elektrik enerjisi formülü şu şekilde verilebilir:\n" +
                                "\n" +
                                "E=V⋅I⋅tjoule\n" +
                                "\n" +
                                "Elektrik Enerjisinin Temel Birimleri\n" +
                                "\n" +
                                "Elektrik enerjisinin SI birimleri joule veya watt-saniye olarak verilir. Ayrıca, elektrik enerjisi erg ve kalori gibi diğer birimlerde de ölçülür. Elektrik enerjisi genellikle elektron-watt, kilowatt-saat (kWh) ve megawatt-saat (MWh) cinsinden ölçülür.\n" +
                                "\n" +
                                "Elektrik Gücü Tanımı\n" +
                                "\n" +
                                "Elektrik gücü, bir elektrik devresinde işin tamamlanma hızıdır. Daha önce tartıştığımız gibi, iş enerji üretir. Bu nedenle, elektrik gücü, bir devredeki elektrik enerjisinin birim zaman başına tüketim oranı olarak tanımlanabilir. Elektrik gücü 'P' ile gösterilir.\n" +
                                "\n" +
                                "Yapılan iş şu şekilde ifade edilir:\n" +
                                "\n" +
                                "W=V⋅Q\n" +
                                "\n" +
                                "Elektrik gücü, birim zamanda gerçekleştirilen elektrik işinin miktarı olarak tanımlanır. Bu nedenle, türev formda şöyle yazabiliriz:\n" +
                                "\n" +
                                "Gu¨c¸\u200B=dtdQ\u200B\n" +
                                "\n" +
                                "Akım (I) ise:\n" +
                                "\n" +
                                "I=dTdQ\u200B\n" +
                                "\n" +
                                "Elektrik gücü formülü şu şekildedir:\n" +
                                "\n" +
                                "P=V⋅IwattElektrik Gücünün Temel Birimleri (Devam)\n" +
                                "\n" +
                                "Voltaj, volt (V) cinsinden ölçülürken, akım amper (A) cinsinden ölçülür. Watt, güç birimi olarak kabul edilir ve elektrik devrelerinde enerji tüketimini veya üretimini ifade eder. Watt, bir joule'ün bir saniyede harcandığı veya üretildiği durumları tanımlar.\n" +
                                "\n" +
                                "Daha büyük güç değerleri genellikle kilowatt (kW) veya megawatt (MW) cinsinden ifade edilir. 1 kilowatt, 1000 watt'a eşittir ve 1 megawatt, 1,000,000 watt'a eşittir. Bu birimler, özellikle enerji üretimi ve tüketimi ile ilgili büyük ölçekli uygulamalarda yaygın olarak kullanılır.\n" +
                                "\n" +
                                "Elektrik Gücü Formülü\n" +
                                "\n" +
                                "Elektrik gücü, akım ve gerilim arasındaki ilişkiyi ifade eden formül ile hesaplanır:\n" +
                                "\n" +
                                "P=V⋅I\n" +
                                "\n" +
                                "Burada:\n" +
                                "\n" +
                                "    P = Güç (Watt)\n" +
                                "    V = Gerilim (Volt)\n" +
                                "    I = Akım (Amper)\n" +
                                "\n" +
                                "Bu formül, bir devredeki elektrik gücünü hesaplamak için temel bir araçtır. Ayrıca, Ohm'un Yasası kullanılarak güç hesaplamaları daha da genişletilebilir. Örneğin, Ohm'un Yasası'na göre V=I⋅R olduğundan, güç formülü şu şekilde de ifade edilebilir:\n" +
                                "\n" +
                                "P=I2⋅R\n" +
                                "\n" +
                                "veya\n" +
                                "\n" +
                                "P=RV2\u200B\n" +
                                "\n" +
                                "Bu formüller, direnç, akım ve gerilim arasındaki ilişkileri kullanarak elektrik gücünü hesaplamaya olanak tanır.\n" +
                                "\n" +
                                "Sonuç\n" +
                                "\n" +
                                "Sonuç olarak, elektrik gücü, elektrik devrelerinde işin tamamlanma hızını ifade eder ve enerji tüketimi ile ilgili önemli bir ölçüdür. Elektrik enerjisi, joule cinsinden ölçülürken, elektrik gücü watt cinsinden ölçülür. Güç, gerilim ve akımın çarpımı olarak tanımlanır ve bu ilişkiler, elektrik mühendisliği ve uygulamalarında kritik öneme sahiptir. Elektrik gücünün anlaşılması, enerji verimliliği, sistem tasarımı ve enerji yönetimi gibi konularda önemli bir rol oynamaktadır.")
                    )
                ),


                SubCategory(
                    "AC Temelleri",
                    listOf(
                        Topic("AC Üretimi", "### AC Üretimi\n" +
                                "\n" +
                                "**Turbine Tabanlı AC Elektrik Üretimi**  \n" +
                                "Turbine tabanlı AC elektrik üretimi, yüklü parçacıklar ile manyetik alanlar arasındaki etkileşim yoluyla elektrik akımının indüklenmesini içerir ve bu, türbinin kinetik enerjisini elektronların kinetik enerjisine dönüştürür. Bu yöntem, yüksek enerji toplumları için elektrik kaynağının ana kaynağıdır. Enerjinin korunumu yasasına göre, jeneratörler enerji yaratmaz; bir enerji biçimini elektrik enerjisine dönüştürürler. Bu tür üretim, türbin hareketini içeren çeşitli enerji kaynaklarında kullanılır; bunlar arasında hidroelektrik, fosil yakıtlar, nükleer enerji ve güneş termal enerji santralleri bulunmaktadır. Çoğu büyük enerji santrali ve dizel jeneratörler alternatif akım (AC) üretir.\n" +
                                "\n" +
                                "**Teori**  \n" +
                                "Faraday Yasası, döngüsel bir iletken üzerindeki değişen manyetik akının, elektronların hareket etmesine neden olan bir manyetik kuvvet indüklediğini belirtir; bu olaya elektromanyetik indüksiyon denir. Manyetik kuvvet, iletken içinde bir voltaj oluşturur ve bu voltaja elektromotor kuvvet (EMF) denir. EMF'nin gücü ve yönü, manyetik alanın gücüne ve yönüne, ayrıca mıknatısın veya iletkenin hızına bağlıdır.\n" +
                                "\n" +
                                "**Jeneratör**  \n" +
                                "Elektrik akımı, dönen bir tel halkası (armatur) bir uniform manyetik alanda yer aldığında veya sabit bir armatur dönen bir manyetik alanda bulunduğunda üretilir. Armatur dönerken, bir yarısı diğer yarısının ters yönünde hareket eder ve bu, karşıt yönlerde elektromotor kuvvet oluşturur; bu da akımın halkadan akmasına izin verir. Bu akım üretimi, armaturun veya mıknatısın dönüşüne bağlıdır ve bu dönüş, türbinler tarafından sağlanır.\n" +
                                "\n" +
                                "Armaturun kolları, fırçalar olarak adlandırılan kayma kontaklarına bağlıdır ve bu fırçalar, bir güç dağıtım sistemine bağlanarak devreyi tamamlar ve jeneratörün cihazları beslemesini sağlar. Armatur dönerken, manyetik alana dik olan hız bileşeni yön değiştirir ve bu, akım yönünün periyodik olarak tersine dönmesine yol açar. Devredeki elektromotor kuvvet, armaturun hızına bağlı olarak değişir ve bu, alternatif akımın karakteristik özelliği olan sinüzoidal olarak değişen bir voltaj üretir."),

                        Topic("Frekans ve Periyot", "Alternatif akım (AC) frekansı, bir AC sinüs dalgasındaki saniyedeki döngü sayısını ifade eder. Frekans, akımın yön değiştirme hızıdır ve hertz (Hz) cinsinden ölçülür; 1 hertz, 1 döngü/saniye eşittir.\n" +
                                "\n" +
                                "    Hertz (Hz): 1 hertz, 1 döngü/saniye.\n" +
                                "    Döngü: Alternatif akım veya voltajın bir tam dalgası.\n" +
                                "    Alternasyon: Bir döngünün yarısı.\n" +
                                "    Periyot: Bir dalga formunun bir tam döngüsünü üretmek için gereken süre.\n" +
                                "\n" +
                                "Frekans, bir şeyin ne sıklıkla tekrarlandığını gösterir. Elektrik akımında, frekans, bir sinüs dalgasının pozitiften negatife döngüsünü ne kadar sıklıkla tamamladığını belirtir. Daha fazla döngü, daha yüksek frekans anlamına gelir.\n" +
                                "\n" +
                                "Frekans Aralıkları\n" +
                                "\n" +
                                "Frekans, genellikle elektrikli ekipmanların çalışma durumunu tanımlamak için kullanılır. İşte bazı yaygın frekans aralıkları:\n" +
                                "\n" +
                                "    Güç hattı frekansı: Genellikle 50 Hz veya 60 Hz.\n" +
                                "    Değişken frekanslı sürücüler: Genellikle 1-20 kilohertz (kHz) taşıyıcı frekansı kullanır.\n" +
                                "    Ses frekansı aralığı: 15 Hz - 20 kHz (insan işitme aralığı).\n" +
                                "    Radyo frekansı: 30-300 kHz.\n" +
                                "    Düşük frekans: 300 kHz - 3 megahertz (MHz).\n" +
                                "    Orta frekans: 3-30 MHz.\n" +
                                "    Yüksek frekans: 30-300 MHz.\n" +
                                "\n" +
                                "Devreler ve ekipmanlar genellikle sabit veya değişken frekansta çalışacak şekilde tasarlanır. Sabit frekansta çalışacak şekilde tasarlanmış bir ekipman, belirtilen frekanstan farklı bir frekansta çalıştırıldığında anormal performans gösterir. Örneğin, 60 Hz'de çalışması tasarlanmış bir AC motor, frekans 60 Hz'nin altına düştüğünde daha yavaş, üstüne çıktığında daha hızlı çalışır. Frekansta herhangi bir değişiklik, motor hızında orantılı bir değişikliğe neden olur.\n" +
                                "\n" +
                                "Frekans Ölçümü\n" +
                                "\n" +
                                "Frekans sayıcı modu içeren bir dijital multimetre, AC sinyallerinin frekansını ölçebilir ve aşağıdaki özellikleri sunabilir:\n" +
                                "\n" +
                                "    MIN/MAX kaydı: Belirli bir süre boyunca frekans ölçümlerinin kaydedilmesini sağlar.\n" +
                                "    Otomatik aralık: Ölçülen voltaj frekans ölçüm aralığının dışındaysa otomatik olarak frekans aralığını seçer.\n" +
                                "\n" +
                                "Güç Şebekeleri\n" +
                                "\n" +
                                "Güç şebekeleri ülkelere göre değişiklik gösterir. ABD'de, şebeke, 60 hertz sinyaline dayanmaktadır, bu da saniyede 60 döngü anlamına gelir. ABD'deki evsel elektrik gücü, tek fazlı, 120 volt AC güç kaynağına dayanır. Bir ABD evindeki duvar prizinde ölçülen güç, ±170 volt arasında osilasyon yapan sinüs dalgaları üretir ve gerçek RMS voltajı 120 volt olarak ölçülür. Osilasyon hızı 60 döngü/saniye olacaktır.\n" +
                                "\n" +
                                "Not: Hertz, radyo dalgalarını ilk ileten ve alan Alman fizikçi Heinrich Hertz'in (1857-1894) adını taşımaktadır. Radyo dalgaları, saniyede bir döngü (1 Hz) hızında hareket eder." +
                                "Periyot Nedir?\n" +
                                "\n" +
                                "Periyot, bir dalga formunun bir tam döngüsünü tamamlaması için gereken süreyi ifade eder. Elektrik mühendisliğinde, periyot genellikle alternatif akım (AC) sinüs dalgaları gibi dalga formlarının analizinde önemli bir kavramdır. Periyot, genellikle saniye (s) cinsinden ölçülür ve bir dalga formunun ne kadar sürede bir tekrar ettiğini gösterir.\n" +
                                "\n" +
                                "Periyot ve Frekans İlişkisi\n" +
                                "\n" +
                                "Periyot ile frekans arasında ters bir ilişki vardır. Frekans, birim zamanda (saniye) gerçekleşen döngü sayısını ifade ederken, periyot bu döngülerin tamamlanması için geçen süreyi belirtir. Matematiksel olarak, bu ilişki şu şekilde ifade edilir:\n" +
                                "\n" +
                                "Frekans (f) = 1 / Periyot (T)\n" +
                                "\n" +
                                "Buradan, periyodu hesaplamak için formül şu şekilde düzenlenebilir:\n" +
                                "\n" +
                                "Periyot (T) = 1 / Frekans (f)\n" +
                                "\n" +
                                "Örneğin, bir dalga formunun frekansı 60 Hz ise, periyodu şu şekilde hesaplanır:\n" +
                                "\n" +
                                "T = 1 / 60 Hz = 0.01667 saniye (16.67 ms)\n" +
                                "\n" +
                                "Bu, dalga formunun her 16.67 milisaniyede bir tam döngü tamamladığı anlamına gelir.\n" +
                                "\n" +
                                "Uygulama Alanları\n" +
                                "\n" +
                                "Periyot, elektrik devreleri, iletişim sistemleri ve sinyal işleme gibi birçok alanda kritik bir rol oynar. Örneğin, bir AC motorun çalışma periyodu, motorun hızını ve performansını etkileyebilir. Ayrıca, ses dalgalarının periyodu, sesin tonunu belirler; daha kısa periyotlar daha yüksek frekanslı sesler, daha uzun periyotlar ise daha düşük frekanslı sesler üretir.\n" +
                                "\n" +
                                "Sonuç\n" +
                                "\n" +
                                "Periyot, elektrik mühendisliği ve fizik alanında temel bir kavramdır. Alternatif akım sistemlerinin ve dalga formlarının analizi için önemli bir ölçü birimidir. Frekans ile olan ilişkisi sayesinde, periyot, elektriksel sistemlerin tasarımında ve analizinde kritik bir rol oynamaktadır."),

                        Topic("Faz İlişkileri", "AC Devrelerinde Faz Farkı\n" +
                                "\n" +
                                "Kondansatörler veya indüktörler bir AC devresinde bulunduğunda, akım ve voltaj sinüs dalgaları aynı anda zirveye ulaşmaz. Bu kaymış zirveler arasındaki fark, derece cinsinden ifade edilen faz farkı olarak adlandırılır.\n" +
                                "\n" +
                                "Alternatif akım teorisinde, faz farkı 90 dereceye kadar eşit veya daha az olabilir. Genellikle, voltajın akımı ne kadar önde olduğu açısı kullanılır.\n" +
                                "\n" +
                                "- İndüktif Devreler: İndüktif devrelerde, akım voltajın gerisinde kalır ve bu pozitif bir faz farkı oluşturur.\n" +
                                "- Kondansatörlü Devreler: Kondansatörlü devrelerde, akım voltajın önünde yer alır ve bu negatif bir faz farkı oluşturur.\n" +
                                "\n" +
                                "Fazör Diyagramları\n" +
                                "\n" +
                                "Fazı, bir düzlemde bir vektör olarak temsil etmek, anlamayı kolaylaştırabilir. Sıfır faz için genellikle referans, pozitif x eksenidir ve bu, dirençle ilişkilidir çünkü direnç üzerinden geçen voltaj ve akım fazdadır.\n" +
                                "\n" +
                                "AC Fazör Diyagramı Denklemleri\n" +
                                "\n" +
                                "Fazörün uzunluğu, temsil ettiği büyüklüğün oranına bağlıdır ve açısı, direnç üzerinden geçen akıma göre fazını gösterir. AC devresindeki voltaj ve akım arasındaki faz farkı, devrenin empedansı (Z) ile ilişkilidir.\n" +
                                "\n" +
                                "ELI the ICE Man\n" +
                                "\n" +
                                "Faz farkının işaretini hatırlamak için \"ELI the ICE man\" adlı yararlı bir mnemonik vardır. Bu ilişki, genellikle bir fazör diyagramında grafiksel olarak gösterilir.\n" +
                                "\n" +
                                "- ELI: Voltaj, bir indüktörde akımı önde tutar.\n" +
                                "  - E (Voltaj)\n" +
                                "  - L (İndüktör)\n" +
                                "  - I (Akım)\n" +
                                "\n" +
                                "Bir indüktöre voltaj uygulandığında, akımın değişimine karşı direnç gösterir. Sonuç olarak, akım voltajdan daha yavaş bir şekilde artar ve zaman ve faz açısından geride kalır.\n" +
                                "\n" +
                                "- ICE: Akım, bir kondansatörde voltajdan öndedir.\n" +
                                "  - I (Akım)\n" +
                                "  - C (Kondansatör)\n" +
                                "  - E (Voltaj)\n" +
                                "\n" +
                                "Bir kondansatör üzerindeki voltaj, üzerindeki yükle doğru orantılı olduğundan, akımın voltajdan önde olması gerekir. Bu, kondansatör plakalarına yük iletmek ve voltajı artırmak için gereklidir."),

                        Topic("RMS Değerleri", "AC dalga formu ile ilgili eğitimimizde, sinüzoidal bir dalga formunun RMS (Karekök Ortalama) voltaj değerine kısaca değinmiştik ve bu RMS değerinin, eşdeğer bir DC gücü ile aynı ısıtma etkisini sağladığını belirtmiştik. Bu eğitimde, RMS voltaj ve akımlarını daha ayrıntılı bir şekilde inceleyeceğiz.\n" +
                                "\n" +
                                "“RMS” terimi, “Karekök Ortalama” anlamına gelir. Çoğu kitap, bunu “eşdeğer bir DC gücü ile aynı ısıtma etkisini üreten AC gücü miktarı” olarak tanımlar, ancak RMS değeri bundan daha fazlasıdır.\n" +
                                "\n" +
                                "RMS değeri, anlık değerlerin karelerinin ortalamasının kareköküdür. RMS değerini tanımlamak için kullanılan semboller VRMS veya IRMS'dir.\n" +
                                "\n" +
                                "RMS terimi, yalnızca zamanla değişen sinüzoidal voltajlar, akımlar veya karmaşık dalga formları için geçerlidir; çünkü bu tür dalga formlarının büyüklüğü zamanla değişir ve DC devre analizi veya hesaplamalarında kullanılmaz, burada büyüklük her zaman sabittir.\n" +
                                "\n" +
                                "Alternatif bir sinüzoidal dalga formunun, belirli bir yükte aynı elektrik gücünü sağlayan eşdeğer DC devresinin RMS voltaj değeri ile karşılaştırıldığında, RMS değeri “etkili değer” olarak adlandırılır ve genellikle Veff veya Ieff olarak sunulur.\n" +
                                "\n" +
                                "Diğer bir deyişle, etkili değer, zamanla değişen bir sinüzoidal dalga formunun, aynı gücü üretme yeteneği açısından eşdeğer DC değerini belirtir.\n" +
                                "\n" +
                                "Örneğin, Birleşik Krallık'taki evsel ana besleme 240Vac'dir. Bu değer, “240 Volt rms” etkili değerini belirtmek için varsayılır. Bu, bir UK evinin duvar prizlerinden gelen sinüzoidal rms voltajının, 240 voltluk sabit bir DC voltajı ile aynı ortalama pozitif gücü üretebileceği anlamına gelir.")
                    )
                ),
                SubCategory(
                    "Alternatif Akım",
                    listOf(
                        Topic("Empedans ve Reaktans", "Reaktans ve empedans, AC devresinde dirençle eşdeğerdir. Bu iki kavram, devredeki alternatif akımın akışına karşı bir direnç sağlar. Reaktans ve empedans, kondansatör ve indüktör gibi bileşenlerin varlığı nedeniyle oluşur. Bu bileşenlerde üretilen elektromotif kuvvet nedeniyle ortaya çıkarlar.\n" +
                                "Reaktans Nedir?\n" +
                                "\n" +
                                "Reaktans, bir AC devresinde kapasitans ve indüktans nedeniyle oluşan direnci ifade eder. Devrede iki tür bileşen nedeniyle reaktans oluşabilir: indüktör ve kondansatör.\n" +
                                "\n" +
                                "Her iki tür reaktansın birimi Ohm'dur.\n" +
                                "İndüktif Reaktans\n" +
                                "\n" +
                                "Bir indüktör AC devresine yerleştirildiğinde, devredeki zamanla değişen voltaj, devrede zamanla değişen bir akıma neden olur. İndüktör, ihmal edilebilir bir dirençten yapılmış olsa bile, devredeki akım yine de azalır. Bunun nedeni, indüktörün enerjiyi manyetik alanlarda depolamasıdır. Zamanla değişen voltaj, değişen bir manyetik alan oluşturur. İndüktör etrafındaki manyetik alan değiştikçe, Faraday'ın indüksiyon yasasına göre bir elektromotif kuvvet (emf) oluşturur. Lenz yasasına göre, değişen manyetik alan nedeniyle oluşan bir indüklenmiş emf, değişimi karşılayan bir yönde akım akmasına neden olur. Bu duruma indüktif reaktans denir ve direnç etkisiyle eşdeğerdir.\n" +
                                "\n" +
                                "İndüktif reaktansın formülü:\n" +
                                "\n" +
                                "XL\u200B=2πfL\n" +
                                "\n" +
                                "Burada,\n" +
                                "\n" +
                                "    XL\u200B = İndüktif reaktans\n" +
                                "    f = Alternatif akımın frekansı\n" +
                                "    L = İndüktörün indüktansı\n" +
                                "\n" +
                                "Kapasitif Reaktans\n" +
                                "\n" +
                                "Kapasitif reaktans, AC devresinde bulunan kondansatörlerden kaynaklanır. Kondansatör yavaşça şarj olduğunda, kondansatör plakaları arasındaki karşıt elektrik alanı da artar. Bu karşıt elektrik alanı o kadar yüksek hale gelir ki, tamamen şarj olduğunda devreyi tamamen keser.\n" +
                                "\n" +
                                "Kapasitif reaktans, aşağıdaki formülle ifade edilir:\n" +
                                "\n" +
                                "XC\u200B=2πfC1\u200B\n" +
                                "\n" +
                                "Burada,\n" +
                                "\n" +
                                "    XC\u200B = Kapasitif reaktans\n" +
                                "    f = Alternatif akımın frekansı\n" +
                                "    C = Kondansatörün kapasitansı\n" +
                                "\n" +
                                "Empedans Nedir?\n" +
                                "\n" +
                                "Bir devrede empedans, AC devresinde akım ve voltajın hissettiği direnci tanımlar. Empedans, hem direnç hem de reaktansın bir kombinasyonudur. Matematiksel olarak şu şekilde ifade edilir:\n" +
                                "\n" +
                                "Z=karekök(R2+(XL\u200B−XC\u200B)2\n)" +
                                "\n" +
                                "\u200B\n" +
                                "\n" +
                                "Burada,\n" +
                                "\n" +
                                "    Z = Empedans\n" +
                                "    R = Devredeki direnç\n" +
                                "    XC\u200B = Kapasitif reaktans\n" +
                                "    XL\u200B = İndüktif reaktans\n" +
                                "\n" +
                                "Empedans, Ohm birimiyle ifade edilir."),
                        Topic("AC Devrelerinde Güç", "AC devrelerinde, tamamen pasif bir devrede akan voltaj ve akım genellikle faz dışıdır ve bu nedenle gerçek bir iş yapmak için kullanılamazlar. Doğru akım (DC) devresinde elektrik gücünün voltaj ile akımın çarpımına eşit olduğunu, yani P = V*I formülünü kullanarak hesaplayabildiğimizi gördük. Ancak AC devrelerinde faz farkını dikkate almamız gerektiğinden aynı şekilde hesaplayamayız.\n" +
                                "\n" +
                                "Tamamen dirençli bir devrede, akım ve voltaj fazdadır ve tüm elektrik gücü direnç tarafından tüketilir, genellikle ısı olarak. Sonuç olarak, elektrik gücünün hiçbiri kaynak beslemesine veya devreye geri dönmez.\n" +
                                "\n" +
                                "Ancak, tamamen indüktif veya tamamen kapasitif bir devrede, reaktans (X) bulunduğunda, akım voltajı tam olarak 90 derece (faz açısı) kadar önde veya geride kalır. Bu durumda güç hem depolanır hem de kaynağa geri döner. Böylece, bir tam periyodik döngü boyunca hesaplanan ortalama güç sıfıra eşit olacaktır.\n" +
                                "\n" +
                                "Bir direnç (R) tarafından tüketilen elektrik gücüne gerçek veya doğru güç denir ve bu, rms voltaj ile rms akımın çarpımı ile elde edilir. Reaktans (X) tarafından depolanan güç ise reaktif güç olarak adlandırılır ve voltaj, akım ve aralarındaki faz açısının sinüsü ile çarpılarak elde edilir.\n" +
                                "\n" +
                                "Faz açısının sembolü θ (Theta) olup, bu sembol AC devresinin toplam reaktif empedans (Z) ile ilgili verimsizliğini temsil eder; bu empedans, devredeki akım akışına karşı koyar."),
                        Topic("Üç Fazlı Sistemler", "Üç fazlı sistemler, elektrik enerjisinin iletiminde ve dağıtımında yaygın olarak kullanılan bir yöntemdir. Bu sistem, üç ayrı akım dalgasının, her biri 120 derece faz farkıyla, aynı anda iletilmesi prensibine dayanır. Üç fazlı sistemler, hem endüstriyel hem de ticari uygulamalarda enerji verimliliğini artırmak ve daha dengeli bir güç dağılımı sağlamak için tercih edilir.\n" +
                                "Üç Fazlı Sistemlerin Avantajları\n" +
                                "\n" +
                                "    Daha Yüksek Güç: Üç fazlı sistemler, tek fazlı sistemlere göre daha fazla güç iletebilir. Bu, daha az kablo kullanarak daha fazla enerji taşımak anlamına gelir.\n" +
                                "\n" +
                                "    Daha Düşük Enerji Kayıpları: Üç fazlı sistemlerde, enerji kayıpları daha düşüktür. Bu, daha az ısı üretimi ve daha yüksek verimlilik sağlar.\n" +
                                "\n" +
                                "    Dengeli Yük Dağılımı: Üç fazlı sistemler, yüklerin daha dengeli bir şekilde dağıtılmasına olanak tanır. Bu, sistemin daha stabil çalışmasını sağlar ve ekipman ömrünü uzatır.\n" +
                                "\n" +
                                "    Daha Küçük Motor Boyutları: Üç fazlı motorlar, tek fazlı motorlara göre daha küçük ve hafif olabilir. Ayrıca, daha yüksek tork ve daha iyi performans sunarlar.\n" +
                                "\n" +
                                "Üç Fazlı Sistemlerin Yapısı\n" +
                                "\n" +
                                "Üç fazlı sistemler, genellikle üç iletken ve bir nötr iletken içerir. Üç faz, genellikle R, S ve T olarak adlandırılır. Her bir faz, 120 derece faz farkıyla birbirinden ayrılır. Bu yapı, sistemin sürekli bir güç akışı sağlamasına olanak tanır.\n" +
                                "\n" +
                                "    Fazlar: R, S ve T fazları, her biri farklı bir akım dalgasını temsil eder.\n" +
                                "    Nötr: Nötr iletken, fazlar arasındaki dengeyi sağlamak için kullanılır ve genellikle yüklerin dengelenmediği durumlarda devreye girer.\n" +
                                "\n" +
                                "Üç Fazlı Güç Hesaplamaları\n" +
                                "\n" +
                                "Üç fazlı sistemlerde güç hesaplamaları, genellikle şu formüllerle yapılır:\n" +
                                "\n" +
                                "    Toplam Güç (P):\n" +
                                "    P=kök3×VL×IL×cos(ϕ)\n" +
                                "\n" +
                                "    Burada VL\u200B fazlar arası voltaj, IL\u200B faz akımı ve ϕ faz açısını temsil eder.\n" +
                                "\n" +
                                "    Faz Gücü (P_f):\n" +
                                "    Pf\u200B=Vf\u200B×If\u200B×cos(ϕ)\n" +
                                "    Burada Vf\u200B faz voltajı ve If\u200B faz akımıdır.\n" +
                                "\n" +
                                "Uygulama Alanları\n" +
                                "\n" +
                                "Üç fazlı sistemler, birçok alanda yaygın olarak kullanılır:\n" +
                                "\n" +
                                "    Endüstriyel Uygulamalar: Üç fazlı motorlar, jeneratörler ve diğer endüstriyel ekipmanlar, yüksek güç gereksinimlerini karşılamak için kullanılır.\n" +
                                "    Elektrik Dağıtım Sistemleri: Üç fazlı sistemler, elektrik enerjisinin uzun mesafelere iletilmesinde ve dağıtımında verimliliği artırmak için tercih edilir.\n" +
                                "    Ticari Binalar: Büyük ticari binalar, aydınlatma ve HVAC sistemleri gibi yüksek enerji tüketen uygulamalar için üç fazlı sistemleri kullanır.\n" +
                                "\n" +
                                "Sonuç\n" +
                                "\n" +
                                "Üç fazlı sistemler, elektrik enerjisinin iletiminde ve dağıtımında önemli bir rol oynamaktadır. Daha yüksek güç, daha düşük enerji kayıpları ve dengeli yük dağılımı gibi avantajları sayesinde, endüstriyel ve ticari uygulamalarda yaygın olarak tercih edilmektedir. Bu sistemler, enerji verimliliğini artırarak, modern elektrik şebekelerinin temelini oluşturmaktadır.")
                    )
                )
            )
        ),
        MainCategory(
            "Makine",
            R.drawable.ic_machine,
            listOf(
                SubCategory(
                    "Transformatör",
                    listOf(
                        Topic("Transformatör Prensipleri", "Transformatörler, alternatif akımı (AC) bir gerilim seviyesinden başka bir seviyeye dönüştürmek için kullanılan elektromanyetik cihazlardır. Temel çalışma prensibi, elektromanyetik indüksiyon yasasına dayanır. Bir transformatör, iki sargıdan (primer ve sekonder) ve bir manyetik çekirdekten oluşur. Alternatif akım primer sargıdan geçtiğinde, çekirdek etrafında değişen bir manyetik alan oluşturur. Bu manyetik alan, sekonder sargıda bir gerilim indükler ve böylece elektrik enerjisi, fiziksel temas olmadan bir devreden diğerine aktarılmış olur.\n" +
                                "\n" +
                                "Transformatörlerin en önemli parametrelerinden biri dönüşüm oranıdır. Primer sargıdaki sarım sayısı N₁, sekonder sargıdaki sarım sayısı N₂ ise, giriş ve çıkış gerilimleri arasındaki ilişki şu şekilde ifade edilir:\n" +
                                "V₂ = (N₂ / N₁) * V₁\n" +
                                "Burada V₁ primer gerilimi, V₂ ise sekonder gerilimidir. Eğer N₂ > N₁ ise transformatör bir yükseltici (step-up) transformatördür ve çıkış gerilimi girişten büyüktür. Eğer N₂ < N₁ ise bir düşürücü (step-down) transformatördür ve çıkış gerilimi girişten küçüktür.\n" +
                                "\n" +
                                "Transformatörlerin verimi genellikle çok yüksektir (%95-99), çünkü hareketli parçaları yoktur ve ana enerji kaybı bakır kayıpları (sargılardaki direnç nedeniyle oluşan kayıplar), demir kayıpları (çekirdek içinde oluşan histerezis ve eddy akımları) ve kaçak manyetik akıdan kaynaklanır. Optimum tasarım ve uygun malzeme seçimi ile bu kayıplar en aza indirilebilir. Ayrıca, transformatörler elektrik enerjisinin uzun mesafelerde iletiminde de kritik bir rol oynar. Elektrik şebekelerinde gerilim yükseltilerek iletim yapılır, ardından tüketiciye ulaştırılmadan önce tekrar düşürülerek dağıtılır."),
                        Topic("Transformatör Türleri", "Transformatörler kullanım alanlarına, yapılarına ve çalışma prensiplerine göre farklı türlere ayrılır. En yaygın sınıflandırma, gerilim dönüşüm oranına göre yükseltici (step-up) ve düşürücü (step-down) transformatörlerdir. Yükseltici transformatörler enerji santrallerinde üretilen elektriğin yüksek gerilim seviyelerine çıkarılması için kullanılırken, düşürücü transformatörler elektrik şebekesinde tüketicilere uygun gerilim seviyesinde enerji sağlamak için kullanılır.\n" +
                                "\n" +
                                "Yapılarına göre transformatörler çekirdek tipi ve manto tipi olarak ikiye ayrılır. Çekirdek tipi transformatörlerde sargılar manyetik çekirdeğin etrafına sarılırken, manto tipi transformatörlerde manyetik çekirdek sargıları çevreleyecek şekilde tasarlanır. Çekirdek tipi tasarımlar genellikle yüksek güçlü uygulamalar için tercih edilirken, manto tipi transformatörler daha kompakt ve düşük güçlü uygulamalarda kullanılır.\n" +
                                "\n" +
                                "Özel amaçlı transformatörler arasında izolasyon transformatörleri, ölçü transformatörleri ve oto-transformatörler bulunur. İzolasyon transformatörleri, iki devreyi elektriksel olarak izole ederek güvenliği artırır. Ölçü transformatörleri (gerilim ve akım transformatörleri), yüksek gerilim ve akımları düşük seviyelere indirerek ölçüm cihazlarının güvenli bir şekilde çalışmasını sağlar. Oto-transformatörler ise tek bir sargı kullanarak, hem primer hem de sekonder devreyi aynı bobin üzerinden sağlayan, daha verimli ve kompakt bir yapıya sahiptir.\n" +
                                "\n" +
                                "Her bir transformatör türü, belirli bir uygulama ve teknik gereksinim doğrultusunda tasarlanmıştır. Bu nedenle, mühendislik uygulamalarında doğru transformatörün seçilmesi, enerji verimliliği ve sistem güvenliği açısından kritik bir öneme sahiptir."),
                        Topic("Transformatör Bağlantıları", "Transformatörler, tek fazlı ve üç fazlı sistemlerde farklı bağlantı yöntemleriyle kullanılabilir. Bu bağlantılar, sistem gereksinimlerine göre farklı avantajlar sunar. Tek fazlı transformatörler genellikle basit bağlantılarla kullanılırken, üç fazlı sistemlerde genellikle Y (Yıldız), Δ (Üçgen) veya bunların kombinasyonları tercih edilir.\n" +
                                "\n" +
                                "Üç fazlı transformatör bağlantılarında en yaygın olanlardan biri Y-Y (Yıldız-Yıldız) bağlantısıdır. Bu bağlantıda hem primer hem de sekonder sargılar yıldız şeklinde bağlanır. Avantajı, nötr hattı sağlayarak tek fazlı yükleri besleyebilmesidir. Ancak, dengesiz yük durumlarında gerilim bozulmaları görülebilir. Δ-Δ (Üçgen-Üçgen) bağlantısı, yük dengelemesi açısından daha iyidir ve nötr ihtiyacı olmayan üç fazlı sistemlerde tercih edilir. Y-Δ bağlantısı, primer tarafında yıldız, sekonder tarafında üçgen olarak bağlanır ve genellikle yüksek gerilimden düşük gerilime dönüşümde kullanılır. Tersine Δ-Y bağlantısı, yüksek güçlü şebekelerde gerilim yükseltmek için kullanılır.\n" +
                                "\n" +
                                "Özel bir bağlantı türü olarak Zig-Zag (Z) bağlantısı, harmonikleri azaltmak ve dengesiz yükleri kompanze etmek için kullanılır. Bu bağlantı, genellikle topraklama trafolarında veya izolasyon amaçlı uygulamalarda tercih edilir. Üç fazlı sistemlerde doğru bağlantı seçimi, güç kalitesi, sistem güvenliği ve verimlilik açısından büyük önem taşır."),
                        Topic("Verimlilik ve Kayıplar", "Transformatörler genellikle %95-99 gibi yüksek verimlilikle çalışırlar. Ancak, bazı kaçınılmaz kayıplar mevcuttur. Bu kayıplar, bakır kayıpları (I²R kayıpları), demir kayıpları (histerezis ve Foucault akımları) ve kaçak akı kayıpları olarak üç ana başlık altında incelenebilir.\n" +
                                "\n" +
                                "Bakır kayıpları, transformatör sargılarında elektrik akımı geçtiğinde oluşan direnç kayıplarıdır. Bu kayıplar P_{bakır} = I²R formülüyle hesaplanır ve akım arttıkça kayıplar da artar. Düşük dirençli ve kaliteli iletkenler (örneğin, kalın kesitli bakır veya alüminyum teller) kullanılarak bakır kayıpları minimize edilebilir.\n" +
                                "\n" +
                                "Demir kayıpları, manyetik çekirdekte oluşan iki ana bileşenden meydana gelir: histerezis kayıpları ve Foucault (eddy) akımları. Histerezis kayıpları, manyetik malzemenin manyetik akı değişimlerine direnç göstermesi sonucu oluşur. Bu kayıplar, düşük histerezisli malzemeler (örneğin, silikonlu çelik) kullanılarak azaltılabilir. Foucault akımları ise çekirdek içinde oluşan girdap akımlarıdır ve ince laminasyonlu çekirdek yapısı ile kontrol altına alınır.\n" +
                                "\n" +
                                "Kaçak akı kayıpları ise manyetik akının bir kısmının sekonder sargıya ulaşmadan çevreye yayılmasıyla oluşur. Uygun manyetik devre tasarımı ve sargı düzenlemeleri ile bu kayıplar azaltılabilir. Genel olarak, iyi tasarlanmış bir transformatörde kayıplar en aza indirildiğinde, maksimum enerji verimliliği sağlanır.")
                    )
                ),
                SubCategory(
                    "Motor",
                    listOf(
                        Topic("DC Motorlar", "Doğru akım (DC) motorları, elektrik enerjisini mekanik enerjiye çeviren ve genellikle hassas hız kontrolü gerektiren uygulamalarda kullanılan motorlardır. Çalışma prensibi, Lorentz kuvveti ilkesine dayanır: Bir iletken manyetik alan içinde akım taşıdığında, iletkene bir kuvvet uygulanır ve dönme hareketi başlar.\n" +
                                "\n" +
                                "DC motorlar genellikle fırçalı ve fırçasız olarak ikiye ayrılır. Fırçalı DC motorlar, rotor üzerindeki akımı iletmek için fırça ve komütatör sistemine sahiptir. Ucuz ve basit bir yapıya sahip olsalar da, fırçaların zamanla aşınması nedeniyle bakım gerektirirler. Fırçasız DC (BLDC) motorlar ise elektronik komütasyon kullanarak fırça ihtiyacını ortadan kaldırır. Daha uzun ömürlü ve verimli olmalarının yanı sıra, sessiz çalışmalarıyla öne çıkarlar.\n" +
                                "\n" +
                                "DC motorların en büyük avantajı, hassas hız ve tork kontrolü sağlamalarıdır. Gerilim değişimi ile hız kontrolü yapılabilirken, akım değişimi ile tork ayarlanabilir. Bu özelliklerinden dolayı robotik sistemlerde, elektrikli araçlarda ve endüstriyel otomasyon sistemlerinde yaygın olarak kullanılırlar."),
                        Topic("AC Motorlar", "Alternatif akım (AC) motorları, elektrik enerjisini döner mekanik harekete çeviren ve endüstriyel uygulamalarda yaygın olarak kullanılan motor türleridir. AC motorların en temel sınıflandırması senkron motorlar ve asenkron (indüksiyon) motorlar şeklindedir.\n" +
                                "\n" +
                                "Asenkron motorlar, rotorun stator manyetik alanından daha düşük hızda dönmesi prensibine dayanır. Stator sargılarında alternatif akım uygulanarak döner manyetik alan oluşturulur ve rotor üzerinde indüklenen akımlar manyetik kuvvet oluşturarak motoru döndürür. Asenkron motorlar, özellikle dayanıklılıkları, düşük bakım gereksinimleri ve ucuz olmaları nedeniyle sanayi uygulamalarında yaygın olarak kullanılır. En yaygın türü kafes rotorlu indüksiyon motorlarıdır.\n" +
                                "\n" +
                                "Senkron motorlar ise statorun döner manyetik alanıyla rotor hızının eşit olduğu motorlardır. Yani rotor, statorun döner alanıyla senkronize olarak döner. Senkron motorlar genellikle yüksek hassasiyet gerektiren uygulamalarda, büyük güç sistemlerinde ve jeneratörlerde kullanılır.\n" +
                                "\n" +
                                "AC motorlar, frekans kontrolü ile kolayca hız ayarlanabilir ve genellikle VFD (Değişken Frekanslı Sürücüler) kullanılarak verimli bir şekilde kontrol edilirler. Günümüzde HVAC sistemlerinde, pompa ve fan motorlarında, asansörlerde ve taşıma sistemlerinde en çok tercih edilen motor tipidir."),
                        Topic("Motor Seçimi", "Elektrik motoru seçimi, belirli bir uygulamanın gereksinimlerini karşılayacak en uygun motorun belirlenmesi sürecidir. Yanlış motor seçimi, enerji verimsizliği, aşırı ısınma, düşük performans veya mekanik arızalara yol açabilir. Motor seçiminde dikkate alınması gereken temel faktörler arasında güç ihtiyacı (kW veya HP), hız (RPM), tork gereksinimi (Nm), besleme gerilimi, verimlilik, çalışma ortamı ve kontrol yöntemleri bulunur.\n" +
                                "\n" +
                                "Güç ihtiyacı, motorun taşıması gereken yükü belirler. Ağır yük uygulamaları, yüksek tork ve düşük hız gerektiren motorları tercih ederken, hafif yük ve yüksek hız gerektiren sistemler daha farklı motor tiplerini gerektirir. Örneğin, CNC makineleri hassas hız kontrolü için servo motorları tercih ederken, endüstriyel konveyör bantları genellikle asenkron motorları kullanır.\n" +
                                "\n" +
                                "Besleme gerilimi de seçimde kritik bir faktördür. DC motorlar, genellikle batarya ile çalışan sistemlerde veya düşük voltajlı kontrol gerektiren uygulamalarda kullanılırken, AC motorlar daha büyük güç gerektiren sanayi uygulamalarında tercih edilir. Eğer sistemde değişken hız kontrolü isteniyorsa, frekans kontrolüne uygun bir AC motor veya bir DC motor kullanılması gereklidir.\n" +
                                "\n" +
                                "Motorun çalışma ortamı da dayanıklılığını etkiler. Tozlu, nemli veya kimyasal maddelere maruz kalan ortamlarda, IP koruma seviyeleri yüksek motorlar tercih edilmelidir. Patlayıcı atmosferlerde, ex-proof motorlar kullanılmalıdır. Ayrıca, sürekli çalışma gerektiren sistemlerde yüksek verimli motorlar seçilerek enerji kayıpları azaltılabilir.\n" +
                                "\n" +
                                "Motor seçiminde bir diğer önemli konu kontrol ve sürücü uyumluluğudur. Eğer hassas konumlandırma ve hız kontrolü gereksinimi varsa servo motorlar tercih edilir. Yüksek verimli ve uzun ömürlü bir çözüm isteniyorsa, fırçasız DC motorlar veya senkron AC motorlar daha uygun olabilir. Kısacası, doğru motorun seçimi, sistemin performansını, enerji tüketimini ve bakım maliyetlerini doğrudan etkileyen kritik bir karardır."),
                        Topic("Motor Kontrolü", "Elektrik motorlarının kontrol edilmesi, hız, tork, yön ve güç tüketimi gibi parametrelerin optimize edilmesini sağlar. Motor kontrolü, manuel, aç-kapa (on-off) kontrolü, gerilim/frekans kontrolü, vektör kontrolü ve geri beslemeli (feedback) kontrol yöntemleriyle gerçekleştirilebilir.\n" +
                                "\n" +
                                "En basit motor kontrol yöntemi aç-kapa kontrolüdür. Bu yöntemde motor ya tam güçle çalışır ya da tamamen kapatılır. Basit fanlar ve pompalar gibi sistemlerde yeterli olsa da hassas hız kontrolü gerektiren uygulamalar için uygun değildir. Daha gelişmiş bir yöntem olan gerilim veya frekans kontrolü, özellikle AC motorlarda kullanılır. Gerilimi veya frekansı değiştirerek motorun hızını kontrol etmek mümkündür.\n" +
                                "\n" +
                                "Frekans kontrolü, AC motorların hızını kontrol etmenin en yaygın yöntemlerinden biridir ve Değişken Frekanslı Sürücüler (VFD) kullanılarak gerçekleştirilir. Bu yöntemle motorun besleme frekansı değiştirilerek hız ayarlanır. Örneğin, endüstriyel fanlar, pompalar ve konveyör sistemlerinde sıkça tercih edilir. VFD kullanımı sayesinde enerji tasarrufu sağlanırken motorun ömrü de uzatılabilir.\n" +
                                "\n" +
                                "DC motorların kontrolü için genellikle PWM (Darbe Genişlik Modülasyonu) yöntemi kullanılır. PWM ile motorun giriş gerilimi belirli aralıklarla açılıp kapatılarak hız ve tork ayarlanır. Bu yöntemle verimli bir şekilde düşük hızlarda çalışmak mümkün olur. Servo motorlar ve step motorlar gibi hassas hareket gerektiren sistemlerde ise geri beslemeli kontrol yöntemleri uygulanır. PID kontrol gibi algoritmalar kullanılarak motorun konumu ve hızı hassas bir şekilde ayarlanabilir.\n" +
                                "\n" +
                                "Son olarak, modern motor kontrol sistemlerinde yapay zeka ve IoT (Nesnelerin İnterneti) tabanlı çözümler yaygınlaşmaktadır. Akıllı motor sürücüler, çalışma verilerini analiz ederek verimliliği artırabilir ve arızaları önceden tespit edebilir. Özellikle endüstri 4.0 uygulamalarında motor kontrol sistemleri büyük bir rol oynamaktadır.")
                    )
                ),
                SubCategory(
                    "Jeneratör",
                    listOf(
                        Topic("DC Jeneratörler", "Doğru akım (DC) jeneratörleri, mekanik enerjiyi doğru akıma dönüştüren elektrik makineleridir. Temel çalışma prensibi Faraday’ın elektromanyetik indüksiyon yasasına dayanır. Dönen bir iletken manyetik alan içerisinde hareket ettiğinde, iletkende bir gerilim indüklenir ve elektrik enerjisi üretilir. DC jeneratörlerde bu gerilim, komütatör ve fırçalar kullanılarak DC bileşenine çevrilir.\n" +
                                "\n" +
                                "DC jeneratörler genellikle uyartım şekline göre sınıflandırılır: Kendinden uyartımlı (Self-excited) ve harici uyartımlı (Separately-excited) jeneratörler. Kendinden uyartımlı jeneratörlerde manyetik alanı oluşturmak için gerekli akım, jeneratörün kendi çıkışından sağlanırken, harici uyartımlı jeneratörlerde ayrı bir güç kaynağından beslenen bir alan sargısı bulunur.\n" +
                                "\n" +
                                "DC jeneratörlerin başlıca kullanım alanları arasında batarya şarj sistemleri, raylı sistemler, endüstriyel DC güç sistemleri ve elektrikli araçlar bulunur. Özellikle rüzgar ve hidroelektrik sistemlerinde mekanik enerjinin doğru akıma çevrilerek depolanması için kullanılabilirler. Ancak, AC jeneratörlerin daha verimli olması nedeniyle günümüzde DC jeneratörlerin kullanımı azalmıştır.\n" +
                                "\n" +
                                "DC jeneratörlerin en büyük avantajları, stabil DC çıkış sağlamaları ve hassas gerilim kontrolü yapabilmeleridir. Ancak komütatör ve fırça mekanizmalarının aşınması, bakım gereksinimlerini artırır. Modern uygulamalarda, DC jeneratörlerin yerine genellikle AC jeneratörler ve doğrultucu devreler (rectifiers) ile DC güç üreten sistemler tercih edilmektedir."),
                        Topic("AC Jeneratörler", "Alternatif akım (AC) jeneratörleri, mekanik enerjiyi alternatif akıma dönüştüren elektrik makineleridir. AC jeneratörlerin çalışma prensibi, elektromanyetik indüksiyon temel alınarak gerçekleştirilir. Rotorun dönmesiyle manyetik alan değişir ve stator sargılarında AC gerilim indüklenir.\n" +
                                "\n" +
                                "AC jeneratörler iki ana gruba ayrılır: Senkron jeneratörler (alternatörler) ve asenkron jeneratörler (indüksiyon jeneratörleri). Senkron jeneratörler, şebekeye bağlı yüksek güç üretimi için kullanılırken, asenkron jeneratörler genellikle rüzgar türbinlerinde ve küçük ölçekli enerji üretim sistemlerinde tercih edilir.\n" +
                                "\n" +
                                "AC jeneratörler, elektrik üretiminde en yaygın kullanılan jeneratör tipidir. Elektrik santralleri, rüzgar türbinleri, hidroelektrik santraller, dizel jeneratörler ve acil durum güç kaynakları gibi birçok alanda kullanılmaktadır. Özellikle üç fazlı AC jeneratörler, sanayi ve şebeke elektriği için standart hale gelmiştir.\n" +
                                "\n" +
                                "Modern AC jeneratörler, gerilim regülasyonu ve güç faktörü kontrolü için AVR (Automatic Voltage Regulator) gibi sistemlerle donatılmıştır. Verimli enerji üretimi ve şebekeye uyumluluk sağlamak için akıllı kontrol sistemleri ile entegre çalışmaktadırlar. AC jeneratörlerin yüksek verimliliği ve düşük bakım gereksinimi, onları elektrik üretimi için ideal hale getirmiştir."),
                        Topic("Jeneratör Çalışması", "Jeneratörler, mekanik enerjiyi elektrik enerjisine dönüştüren cihazlardır. Temel çalışma prensibi, Faraday’ın elektromanyetik indüksiyon yasasına dayanır. Bu yasa, manyetik bir alan içinde hareket eden bir iletkenin uçlarında bir elektrik gerilimi indükleneceğini ifade eder. Jeneratörlerde, bir rotorun (dönen bileşen) manyetik alan içinde hareket etmesi sonucu stator sargılarında bir gerilim üretilir.\n" +
                                "\n" +
                                "Jeneratörlerin çalışmasını sağlamak için bir hareket kaynağına (primer hareketli makineye) ihtiyaç vardır. Bu kaynak, içten yanmalı motorlar, türbinler (buhar, su veya gaz türbinleri), rüzgar türbinleri veya insan gücü olabilir. Rotor, bu güç kaynağı tarafından döndürüldüğünde, stator sargılarında alternatif akım (AC) üretilir. AC jeneratörlerde stator sargılarında doğrudan alternatif akım üretilirken, DC jeneratörlerde üretilen AC gerilimi komütatör ve fırçalar yardımıyla doğru akıma çevrilir.\n" +
                                "\n" +
                                "Jeneratörlerde uyartım sistemi, manyetik alanı oluşturmak için kullanılır. Büyük jeneratörlerde harici uyartım sistemleri ile daha stabil ve kontrollü manyetik alan sağlanırken, küçük ölçekli jeneratörlerde kendi kendine uyartımlı (self-excited) sistemler tercih edilir. Modern jeneratörlerde, gerilim ve güç dalgalanmalarını kontrol etmek için AVR (Automatic Voltage Regulator) gibi sistemler kullanılır. Bu sistem, çıkış gerilimini istenen seviyede tutmak için uyartım akımını otomatik olarak ayarlar.\n" +
                                "\n" +
                                "Jeneratörlerin performansını etkileyen en önemli faktörler arasında frekans stabilitesi, verimlilik, yük kapasitesi ve soğutma sistemi bulunur. Endüstride kullanılan büyük jeneratörlerde soğutma, hava, su veya hidrojen gazı ile sağlanır. Ayrıca, jeneratörlerin aşırı yüklenmesini önlemek için koruma sistemleri devreye alınır. Koruyucu röleler ve otomatik kesiciler, jeneratörlerin güvenli bir şekilde çalışmasını sağlar."),
                        Topic("Uygulamalar", "Jeneratörler, elektrik enerjisine duyulan ihtiyacın kesintisiz karşılanması için sanayi, ticaret, ulaşım ve altyapı sistemlerinde geniş bir kullanım alanına sahiptir. Enerji şebekelerine bağlı olan jeneratörler büyük sanayi tesislerinde yedek güç kaynağı olarak, şebekeye bağımsız sistemlerde ise ana güç kaynağı olarak kullanılır.\n" +
                                "\n" +
                                "1. Elektrik Üretim Santralleri: En yaygın jeneratör uygulamalarından biri, büyük ölçekli enerji santralleridir. Hidroelektrik, termik, nükleer ve rüzgar santralleri, jeneratörleri kullanarak elektrik üretir. Özellikle senkron jeneratörler, yüksek güçlü enerji üretimi için uygundur.\n" +
                                "\n" +
                                "2. Acil Durum ve Yedek Güç Sistemleri: Hastaneler, veri merkezleri, havaalanları ve kritik altyapılar gibi kesintisiz güç gerektiren sistemlerde jeneratörler yedek enerji kaynağı olarak kullanılır. Dizel jeneratörler, bu tip uygulamalar için yaygın olarak tercih edilir. Otomatik devreye girme sistemleri sayesinde, şebeke elektriği kesildiğinde jeneratörler saniyeler içinde çalışarak kesintisiz enerji sağlar.\n" +
                                "\n" +
                                "3. Endüstriyel Üretim Tesisleri: Büyük fabrikalar, madencilik tesisleri, petrol rafinerileri gibi sanayi alanlarında jeneratörler ana veya yedek enerji kaynağı olarak çalışır. Şebeke elektriği istikrarsız veya yetersiz olduğunda, jeneratörler kesintisiz üretimi sağlamak için devreye girer.\n" +
                                "\n" +
                                "4. İnşaat ve Şantiye Kullanımı: İnşaat sahalarında, özellikle altyapı tamamlanmadan önce jeneratörler geçici enerji kaynağı olarak kullanılır. Büyük projelerde, mobil dizel jeneratörler vinçler, kaynak makineleri ve aydınlatma sistemleri için güç sağlar.\n" +
                                "\n" +
                                "5. Tarım ve Kırsal Alanlar: Tarımda jeneratörler, sulama pompaları, sera sistemleri ve hayvancılık tesisleri için güç kaynağı olarak kullanılır. Şebeke elektriğinin ulaşamadığı kırsal alanlarda jeneratörler, bağımsız enerji kaynağı olarak çalışabilir.\n" +
                                "\n" +
                                "6. Ulaşım ve Taşımacılık: Deniz taşımacılığında, büyük gemilerde yardımcı jeneratörler, motorların yanı sıra aydınlatma, navigasyon ve haberleşme sistemleri için güç sağlar. Demiryolu sistemlerinde, özellikle elektrikli trenler ve metro sistemlerinde, jeneratörler ek güç kaynağı olarak görev alır.\n" +
                                "\n" +
                                "7. Telekomünikasyon ve Veri Merkezleri: Telekom kuleleri ve büyük veri merkezleri, elektrik kesintilerine karşı jeneratörleri yedek güç kaynağı olarak kullanır. Sürekli çalışması gereken internet sunucuları ve haberleşme sistemleri için dizel veya doğalgazlı jeneratörler ile güç sağlanır.\n" +
                                "\n" +
                                "Günümüzde jeneratörler, sadece enerji üretimi için değil, enerji depolama sistemleriyle birlikte akıllı enerji yönetimi çözümlerinde de kullanılmaktadır. Hibrit enerji sistemlerinde güneş panelleri, rüzgar türbinleri ve bataryalarla entegre edilen jeneratörler, enerji sürekliliğini sağlamak için devreye girerek verimli ve sürdürülebilir bir çözüm sunar.")
                    )
                )
            )
        ),
        MainCategory(
            "Güç",
            R.drawable.ic_power,
            listOf(
                SubCategory(
                    "Güç Sistemi",
                    listOf(
                        Topic("Üretim", "Elektrik enerjisi üretimi, mekanik enerjinin elektrik enerjisine dönüştürülmesini kapsayan bir süreçtir. Bu dönüşüm genellikle jeneratörler aracılığıyla gerçekleştirilir. Elektrik enerjisi üretiminde fosil yakıtlar (termik santraller), nükleer enerji, hidrolik enerji, rüzgar ve güneş gibi yenilenebilir kaynaklar kullanılır. Her kaynağın avantajları ve dezavantajları bulunur.\n" +
                                "\n" +
                                "Termik santrallerde, fosil yakıtlar yakılarak buhar elde edilir ve bu buhar türbinleri döndürerek jeneratörleri çalıştırır. Hidroelektrik santrallerde ise suyun potansiyel enerjisi türbinler aracılığıyla mekanik enerjiye, ardından elektrik enerjisine dönüştürülür. Rüzgar santralleri, hava akımlarının kinetik enerjisini kullanarak jeneratörleri çalıştırırken, güneş panelleri fotovoltaik etkiden yararlanarak elektrik üretir.\n" +
                                "\n" +
                                "Enerji üretiminde temel amaç, talebi karşılayacak düzeyde ve sürekli olarak elektrik sağlamaktır. Santrallerin bakım ve verimlilik analizleri düzenli olarak yapılmalı, üretim süreci optimize edilmelidir."),
                        Topic("İletim", "Elektrik enerjisi, üretildiği noktadan tüketiciye ulaştırılırken uzun mesafeler boyunca iletilmelidir. İletim süreci, yüksek gerilim hatları aracılığıyla gerçekleştirilir. Yüksek gerilim kullanılması, enerji kayıplarını minimize etmek içindir; çünkü düşük gerilimde iletim sırasında daha fazla akım gerekecek ve bu da daha büyük direnç kayıplarına neden olacaktır.\n" +
                                "\n" +
                                "Ana iletim hatları genellikle AC (Alternatif Akım) sistemleri üzerinden çalışır, ancak HVDC (Yüksek Gerilim Doğru Akım) sistemleri de uzun mesafeli iletimde kullanılır. HVDC, daha az kayıp oluşturduğu için kıta ötesi enerji iletiminde tercih edilir.\n" +
                                "\n" +
                                "Elektrik iletim hatlarının verimli çalışabilmesi için izolatörler, trafo merkezleri ve kompanzasyon sistemleri gibi destekleyici bileşenler kullanılır. İletim hatlarında oluşabilecek gerilim düşmeleri, reaktif gücün düzenlenmesi ve hat bakımları, sistemin sürekli çalışabilir olmasını sağlar."),
                        Topic("Dağıtım", "\n" +
                                "\n" +
                                "Elektrik enerjisinin iletim hatlarından tüketicilere ulaştırılması dağıtım aşamasında gerçekleştirilir. İletim hatlarından gelen yüksek gerilim, trafo merkezlerinde düşürülerek evler, iş yerleri ve sanayi tesislerine uygun hale getirilir. Genellikle önce orta gerilim (1 kV - 36 kV) ağlarında taşınan enerji, daha sonra alçak gerilim (220V - 380V) seviyesine indirgenerek kullanıcılara ulaştırılır.\n" +
                                "\n" +
                                "Dağıtım ağı, yer altı ve havaï hatlar olmak üzere iki ana yapıdan oluşur. Yer altı sistemleri görsel açıdan daha estetik ve dış etkenlere dayanıklı olsa da, bakım maliyetleri daha yüksektir. Havaï hatlar ise kurulumu daha kolay ve ucuz olmakla birlikte, hava koşullarından etkilenebilir.\n" +
                                "\n" +
                                "Dağıtım sistemlerinde otomasyon ve uzaktan izleme sistemleri yaygınlaşmaktadır. Akıllı şebekeler (smart grid), enerji tüketimini optimize ederken, arıza tespiti ve otomatik müdahale sistemleriyle enerji kesintilerini minimize etmektedir."),
                        Topic("Şebeke Sistemleri", "Elektrik şebekesi, elektrik enerjisinin üretim noktalarından tüketicilere güvenli ve verimli bir şekilde ulaştırılmasını sağlayan karmaşık bir altyapıdır. Bir elektrik şebekesi; üretim, iletim ve dağıtım bileşenlerinden oluşur ve bu bileşenlerin birbirleriyle uyum içinde çalışması gerekir.\n" +
                                "\n" +
                                "Şebeke sistemleri genellikle AC (Alternatif Akım) ve DC (Doğru Akım) şebekeleri olarak ikiye ayrılır. AC sistemleri, uzun mesafelerde enerji iletiminde daha yaygın olarak kullanılırken, DC sistemleri belirli uygulamalarda (örneğin, yüksek gerilim doğru akım-HVDC sistemleri) avantaj sağlayabilir. HVDC sistemleri, uzak mesafelerde enerji kayıplarını azaltarak daha verimli iletim sağlar.\n" +
                                "\n" +
                                "Merkezi ve Dağıtık Üretim Sistemleri olmak üzere iki temel yapı vardır. Merkezi üretim sistemlerinde büyük ölçekli santrallerden enerji dağıtılırken, dağıtık üretim sistemlerinde güneş panelleri, rüzgar türbinleri gibi daha küçük ve yerel enerji kaynakları kullanılır. Akıllı şebeke (smart grid) sistemleri, bu dağıtık kaynakları daha verimli yönetmek için geliştirilmiştir.\n" +
                                "\n" +
                                "Modern şebeke sistemlerinde, SCADA (Supervisory Control and Data Acquisition) sistemleri kullanılarak uzaktan izleme ve kontrol gerçekleştirilir. Bu sistemler sayesinde, yük yönetimi, arıza tespiti ve otomatik geri besleme sağlanabilir.\n" +
                                "\n" +
                                "Elektrik şebekeleri, havai hatlar ve yer altı kabloları ile oluşturulur. Havai hatlar daha ekonomik olmasına rağmen, hava koşullarına karşı daha savunmasızdır. Yer altı kabloları ise daha güvenilir ve estetik olmasına rağmen maliyeti yüksektir.\n" +
                                "\n" +
                                "Gelecekte, yenilenebilir enerji kaynaklarının entegrasyonu, elektrik şebekelerinin en büyük zorluklarından biri olmaya devam edecektir. Rüzgar ve güneş enerjisi gibi değişken üretim kaynakları, talep yönetimi ve enerji depolama çözümleri ile desteklenerek daha dengeli bir şebeke oluşturulabilir.")
                    )
                ),
                SubCategory(
                    "Güç Faktörü",
                    listOf(
                        Topic("Güç Faktörü Temelleri", "Güç faktörü, elektrik sistemlerinde güç kalitesinin önemli bir göstergesidir. Gerçek güç (P), görünür güç (S) ve reaktif güç (Q) ilişkisini tanımlayan bir büyüklüktür ve P/S oranı olarak hesaplanır. Matematiksel olarak:\n" +
                                "Güç Faktörü (PF) = cos(φ) = P/S\n" +
                                "\n" +
                                "Burada, φ (faz açısı), gerilim ve akım arasındaki faz farkını ifade eder. İdeal olarak, güç faktörü 1’e (veya %100’e) yakın olmalıdır, çünkü bu durumda üretilen enerji tamamen işe dönüştürülür ve reaktif güç oluşmaz.\n" +
                                "\n" +
                                "Düşük güç faktörü, enerji kayıplarına ve daha büyük iletim hatları gereksinimine neden olur. Endüstriyel tesislerde, motorlar ve endüktif yükler nedeniyle güç faktörü genellikle düşüktür ve düzeltilmesi gerekir.\n" +
                                "\n" +
                                "Örnek: Eğer bir sistemde görünür güç 100 kVA ve gerçek güç 80 kW ise, güç faktörü şu şekilde hesaplanır:\n" +
                                "PF = 80 kW / 100 kVA = 0.8\n" +
                                "\n" +
                                "Bu durumda, sistemin daha verimli çalışması için güç faktörü iyileştirilmelidir."),
                        Topic("İyileştirme Yöntemleri", "Düşük güç faktörünü iyileştirmenin en yaygın yolu kapasitör bankaları kullanmaktır. Kapasitörler, endüktif yüklerin neden olduğu reaktif gücü dengeler ve güç faktörünü artırır.\n" +
                                "\n" +
                                "Bir diğer yöntem senkron kompanzasyon olup, senkron motorlar kullanılarak sistemdeki faz açısı düzeltilir. Senkron motorlar, uygun şekilde çalıştırıldığında reaktif güç üretebilir veya tüketebilir.\n" +
                                "\n" +
                                "Otomatik kompanzasyon sistemleri, yük değişimlerine bağlı olarak kapasitör veya endüktif reaktansları devreye alarak sürekli bir güç faktörü optimizasyonu sağlar.\n" +
                                "\n" +
                                "Bunun yanında, harmonik filtreler kullanılarak güç sistemlerindeki bozulmalar önlenebilir. Yüksek harmonikler, güç kalitesini düşürebilir ve ekipmanların erken aşınmasına yol açabilir.\n" +
                                "\n" +
                                "Güç faktörü iyileştirme, sadece enerji verimliliği sağlamakla kalmaz, aynı zamanda enerji faturalarını düşürerek ekonomik faydalar da sunar."),
                        Topic("Hesaplamalar", "Güç faktörü hesaplamalarında üç temel parametre kullanılır:\n" +
                                "\n" +
                                "    Gerçek Güç (P) [Watt]\n" +
                                "    Reaktif Güç (Q) [VAr]\n" +
                                "    Görünür Güç (S) [VA]\n" +
                                "\n" +
                                "Bu üç değer arasındaki ilişki şu şekildedir:\n" +
                                "\n" +
                                "S² = P² + Q²\n" +
                                "\n" +
                                "Örneğin, bir işletmede P = 400 kW ve Q = 300 kVAr ise, görünür güç şu şekilde hesaplanır:\n" +
                                "\n" +
                                "S = √(400² + 300²) = 500 kVA\n" +
                                "\n" +
                                "Bu durumda güç faktörü:\n" +
                                "\n" +
                                "PF = P / S = 400 / 500 = 0.8\n" +
                                "\n" +
                                "Eğer bu işletmede istenen güç faktörü 0.95 olsaydı, yeni reaktif güç (Q') şu şekilde hesaplanır:\n" +
                                "\n" +
                                "Q' = P × tan(cos⁻¹(0.95)) = 400 × tan(18.19°) ≈ 130 kVAr\n" +
                                "\n" +
                                "Bu durumda, kompanzasyon için yaklaşık 170 kVAr kapasitif güç eklenerek reaktif güç azaltılmalıdır."),
                        Topic("Ekonomik Yönler", "Düşük güç faktörü, enerji şirketleri tarafından cezalandırılan bir durumdur. Endüstriyel tesislerde, düşük güç faktörüne sahip işletmeler reaktif güç tüketimi için ek bedel öder.\n" +
                                "\n" +
                                "Örneğin, birçok elektrik sağlayıcısı, güç faktörü belirli bir değerin (genellikle 0.9 veya 0.95) altına düştüğünde ek ücretler talep eder. Bu nedenle, işletmeler için güç faktörünü iyileştirmek enerji maliyetlerini düşürmek açısından önemlidir.\n" +
                                "\n" +
                                "Ayrıca, düşük güç faktörü daha yüksek akımlar gerektirdiği için iletim hatlarının, transformatörlerin ve jeneratörlerin daha büyük boyutlarda tasarlanmasına yol açar. Bu da altyapı maliyetlerini artırır.\n" +
                                "\n" +
                                "İyi optimize edilmiş bir güç faktörü, elektrik şebekelerinin daha verimli çalışmasını sağlar ve gereksiz enerji tüketimini azaltır. Özellikle büyük tesislerde, güç faktörü iyileştirme sistemlerine yapılan yatırım, kısa sürede kendini amorti eder ve uzun vadede büyük tasarruflar sağlar.\n" +
                                "\n" +
                                "Gelecekte, akıllı güç yönetim sistemleri ve yenilenebilir enerji ile entegrasyon, güç faktörü yönetiminde daha büyük bir rol oynayacaktır. Şebeke esnekliği ve enerji depolama çözümleri, güç faktörünü daha stabil hale getirebilir.")
                    )
                ),
                SubCategory(
                    "Yenilenebilir Enerji",
                    listOf(
                        Topic("Yenilenebilir Enerji Türleri", "Yenilenebilir enerji kaynakları, doğada sürekli olarak kendini yenileyen ve tükenmeyen enerji kaynaklarından elde edilen enerjidir. Bu kaynaklar, fosil yakıtlara kıyasla daha sürdürülebilir ve çevre dostudur. Başlıca yenilenebilir enerji türleri; güneş, rüzgar, hidroelektrik, jeotermal ve biyokütle enerjisidir.\n" +
                                "\n" +
                                "Güneş enerjisi, en yaygın yenilenebilir enerji türlerinden biridir ve güneş ışığını doğrudan elektrik enerjisine çeviren fotovoltaik (PV) paneller veya ısı enerjisi olarak kullanan güneş termal sistemleri aracılığıyla değerlendirilir. Güneş enerjisi, bol bulunması ve düşük işletme maliyetleri nedeniyle büyük bir potansiyele sahiptir.\n" +
                                "\n" +
                                "Rüzgar enerjisi, rüzgar türbinleri aracılığıyla kinetik enerjinin elektrik enerjisine dönüştürülmesini sağlar. Modern rüzgar türbinleri, karasal (onshore) ve deniz üstü (offshore) sistemler olarak ikiye ayrılır. Rüzgar enerjisi, düşük karbon salınımı ve verimli üretim kapasitesi nedeniyle önemli bir temiz enerji kaynağıdır.\n" +
                                "\n" +
                                "Hidroelektrik enerji, suyun potansiyel enerjisini kullanarak elektrik üreten bir yöntemdir. Nehirler ve barajlar üzerine kurulan hidroelektrik santraller (HES) sayesinde, büyük ölçekli enerji üretimi gerçekleştirilebilir. Ancak, baraj projeleri ekosistemlere zarar verebilir ve yerel çevreye etkileri dikkate alınmalıdır.\n" +
                                "\n" +
                                "Jeotermal enerji, yer altındaki sıcak su ve buharın kullanılmasıyla elektrik üretimi veya doğrudan ısıtma amaçlı kullanılan bir kaynaktır. Özellikle volkanik bölgelerde verimli bir şekilde kullanılabilen jeotermal enerji, sürekli bir güç kaynağı olmasıyla diğer yenilenebilir kaynaklardan ayrılır.\n" +
                                "\n" +
                                "Biyokütle enerjisi, organik atıkların yakılması veya biyogaz sistemleriyle enerjiye dönüştürülmesiyle elde edilir. Tarım ve hayvancılık atıkları, odun ve biyogaz tesislerinde işlenerek hem elektrik hem de ısı enerjisi üretilebilir.\n" +
                                "\n" +
                                "Her yenilenebilir enerji türünün kendine özgü avantajları ve zorlukları vardır. Küresel enerji ihtiyacını karşılamak için bu kaynakların dengeli bir şekilde kullanılması gerekmektedir."),
                        Topic("Şebeke Entegrasyonu", "Yenilenebilir enerji kaynakları, klasik enerji üretim sistemlerinden farklı olarak doğası gereği değişkendir. Güneşin doğup batması, rüzgarın şiddetinin değişmesi gibi faktörler, şebekeye entegrasyon sürecini karmaşık hale getirebilir.\n" +
                                "\n" +
                                "Akıllı şebeke (smart grid) sistemleri, yenilenebilir enerjinin şebekeye entegrasyonunda kritik bir rol oynar. Akıllı sayaçlar ve otomatik yük yönetimi sayesinde, üretim ve tüketim daha dengeli hale getirilir.\n" +
                                "\n" +
                                "Enerji depolama sistemleri, yenilenebilir enerjinin dalgalı yapısını dengelemek için büyük önem taşır. Özellikle lityum-iyon piller, pompajlı hidroelektrik depolama ve hidrojen bazlı sistemler, fazla üretilen enerjinin depolanmasını sağlar ve enerji arz güvenliğini artırır.\n" +
                                "\n" +
                                "Ayrıca, dağıtık enerji sistemleri, merkezi büyük santraller yerine daha küçük ölçekli yerel üretim sistemlerinin entegrasyonuna dayanır. Bu yaklaşım, enerji iletim kayıplarını azaltırken, yenilenebilir kaynakların daha verimli kullanılmasını sağlar.\n" +
                                "\n" +
                                "Yenilenebilir enerjinin şebekeye entegrasyonu, gelecekte enerji politikalarının belirlenmesinde ve altyapı yatırımlarında kritik bir konu olmaya devam edecektir."),
                        Topic("Enerji Depolama", "Yenilenebilir enerji üretiminde talep ve arz dengesinin sağlanması, enerji depolama sistemlerinin etkinliğiyle doğrudan ilişkilidir. Enerji depolama teknolojileri, yenilenebilir kaynaklardan üretilen fazla enerjiyi saklayarak ihtiyaç duyulan zamanlarda kullanılmasını sağlar.\n" +
                                "\n" +
                                "Lityum-iyon piller, günümüzde en yaygın kullanılan enerji depolama teknolojisidir. Yüksek verimlilikleri ve hızlı şarj-deşarj özellikleri sayesinde, küçük ölçekli ev sistemlerinden büyük şebeke depolama çözümlerine kadar birçok alanda tercih edilmektedir.\n" +
                                "\n" +
                                "Pompajlı hidroelektrik depolama (PHS), fazla enerjiyi suyu yüksek bir bölgeye pompalanarak depolamak için kullanan bir yöntemdir. Talep arttığında, su serbest bırakılarak türbinlerden geçirilir ve elektrik üretilir.\n" +
                                "\n" +
                                "Hidrojen depolama, elektroliz yoluyla suyu ayrıştırarak hidrojen üretimini içerir. Hidrojen, uzun süreli enerji depolama için büyük bir potansiyele sahiptir ve yakıt hücreleri aracılığıyla elektrik enerjisine dönüştürülebilir.\n" +
                                "\n" +
                                "Enerji depolama sistemlerinin gelişimi, yenilenebilir enerjinin güvenilirliğini artırarak fosil yakıtlara olan bağımlılığı önemli ölçüde azaltacaktır."),
                        Topic("Gelecek Trendleri", "Gelecekte yenilenebilir enerji alanında büyük değişimler beklenmektedir. Güneş ve rüzgar enerjisinin maliyetlerinin düşmeye devam etmesi, bu kaynakların yaygınlaşmasını hızlandıracaktır.\n" +
                                "\n" +
                                "Yapay zeka ve büyük veri analizi, enerji üretim ve tüketim modellerini optimize etmek için kullanılacaktır. Böylece, yenilenebilir enerji sistemleri daha akıllı hale gelecek ve şebeke yönetimi daha verimli olacaktır.\n" +
                                "\n" +
                                "Enerji blok zinciri teknolojisi, bireyler ve küçük üreticiler arasında enerji ticaretini kolaylaştırabilir. Bu sayede, merkezi enerji dağıtım sistemleri yerine, yerel enerji paylaşım ağları oluşturulabilir.")
                    )
                ),
                SubCategory(
                    "Güneş Enerjisi",
                    listOf(
                        Topic("Güneş PV Sistemleri", "Güneş PV (fotovoltaik) sistemleri, güneş ışığını doğrudan elektrik enerjisine dönüştüren sistemlerdir. PV paneller, inverterler, şarj kontrol üniteleri ve bataryalar gibi temel bileşenlerden oluşur.\n" +
                                "Çalışma Prensibi\n" +
                                "\n" +
                                "PV sistemlerin çalışma prensibi, fotovoltaik etkiye dayanır. Silikon bazlı yarı iletken hücreler, güneş ışığını absorbe eder ve bu ışığın enerjisiyle elektronlar serbest kalır, böylece bir elektrik akımı oluşur.\n" +
                                "\n" +
                                "Ana bileşenler şunlardır:\n" +
                                "\n" +
                                "    Fotovoltaik (PV) paneller: Güneş ışığını doğrudan elektriğe çevirir.\n" +
                                "    İnvertör: Panellerin ürettiği DC elektriği AC elektriğe çevirerek ev ve sanayi kullanımına uygun hale getirir.\n" +
                                "    Bataryalar (Opsiyonel): Fazla üretilen enerjiyi depolayarak gece veya güneşsiz günlerde kullanılmasını sağlar.\n" +
                                "    Şarj kontrol üniteleri: Bataryaların aşırı şarj veya deşarj olmasını önleyerek ömürlerini uzatır.\n" +
                                "\n" +
                                "Güneş PV Sistemlerinin Türleri\n" +
                                "\n" +
                                "PV sistemler kullanım alanlarına göre üç ana gruba ayrılır:\n" +
                                "\n" +
                                "    Şebekeye Bağlı Sistemler (On-Grid) \uD83D\uDD0C\n" +
                                "        Elektrik şebekesine entegre çalışır.\n" +
                                "        Fazla üretilen enerji şebekeye satılabilir.\n" +
                                "        Batarya gerektirmez.\n" +
                                "\n" +
                                "    Şebekeden Bağımsız Sistemler (Off-Grid) \uD83C\uDF32\n" +
                                "        Elektrik şebekesinin bulunmadığı yerlerde kullanılır.\n" +
                                "        Depolama için bataryalara ihtiyaç duyar.\n" +
                                "\n" +
                                "    Hibrit Sistemler ⚡\n" +
                                "        Hem şebekeye bağlı hem de batarya destekli çalışabilir.\n" +
                                "        Enerji kesintilerine karşı dayanıklıdır.\n" +
                                "\n" +
                                "PV sistemlerinin avantajları arasında düşük işletme maliyeti, temiz enerji üretimi ve uzun ömürlü kullanım bulunurken, dezavantajları arasında ilk yatırım maliyeti ve hava koşullarına bağımlılık sayılabilir."),
                        Topic("Kurulum", "Güneş enerjisi sistemlerinin verimli ve uzun ömürlü olabilmesi için doğru kurulum büyük önem taşır. Yanlış kurulum, sistemin verimini ciddi şekilde düşürebilir.\n" +
                                "Kurulum Aşamaları\n" +
                                "\n" +
                                "    Bölge Analizi ve İhtiyaç Belirleme \uD83D\uDD0D\n" +
                                "        Bölgenin güneş ışınımı haritaları incelenir.\n" +
                                "        Elektrik ihtiyacı hesaplanarak uygun panel kapasitesi belirlenir.\n" +
                                "\n" +
                                "    Panel Konumlandırma ve Açısı \uD83D\uDCD0\n" +
                                "        Panellerin yönü güneşin maksimum alınabileceği açıda olmalıdır.\n" +
                                "        Türkiye’de en iyi açı güney yönü ve yaklaşık 30-40 derece eğimdir.\n" +
                                "\n" +
                                "    Montaj ve Bağlantılar \uD83D\uDD27\n" +
                                "        Paneller sağlam montajlanmalı, rüzgar ve hava koşullarına dayanıklı olmalıdır.\n" +
                                "        İnvertör ve bağlantı kabloları güvenli şekilde yerleştirilmelidir.\n" +
                                "\n" +
                                "    Şebeke Bağlantısı veya Batarya Entegrasyonu \uD83D\uDD0B\n" +
                                "        On-grid sistemlerde şebekeye bağlantı için uygun izinler alınmalıdır.\n" +
                                "        Off-grid sistemlerde bataryalar ve şarj kontrol üniteleri kurulmalıdır.\n" +
                                "\n" +
                                "Kurulumun profesyoneller tarafından yapılması önerilir, çünkü yanlış kablolama veya yanlış açılandırma sistemin verimini ciddi şekilde düşürebilir."),
                        Topic("Bakım", "Güneş enerjisi sistemleri düşük bakım gerektirir ancak maksimum verim için düzenli kontroller şarttır.\n" +
                                "Önemli Bakım Adımları\n" +
                                "\n" +
                                "    Panel Temizliği \uD83E\uDDFD\n" +
                                "        Panellerin yüzeyi toz, yaprak ve kuş pisliklerinden temizlenmelidir.\n" +
                                "        Kirli paneller, verimi %20-30 oranında düşürebilir.\n" +
                                "\n" +
                                "    Bağlantı ve Kablolama Kontrolü \uD83D\uDD0D\n" +
                                "        Kablolar oksitlenme veya kopmalara karşı düzenli kontrol edilmelidir.\n" +
                                "\n" +
                                "    İnvertör ve Batarya Kontrolleri ⚡\n" +
                                "        İnvertörün verimli çalıştığı takip edilmeli, olası hatalar için sistem kontrol edilmelidir.\n" +
                                "        Bataryaların voltaj seviyeleri ve şarj-deşarj döngüleri düzenli izlenmelidir.\n" +
                                "\n" +
                                "    Performans İzleme \uD83D\uDCCA\n" +
                                "        Üretim verileri düzenli olarak kaydedilmeli, ani düşüşler varsa sorun araştırılmalıdır.\n" +
                                "\n" +
                                "Güneş enerjisi sistemlerinin bakımı düzenli yapıldığında ömrü 25-30 yıl arasında olabilir."),
                        Topic("Ekonomi", "Güneş enerjisi sistemlerinin en önemli avantajlarından biri uzun vadeli ekonomik getirileridir.\n" +
                                "Yatırım Maliyeti ve Geri Dönüş Süresi\n" +
                                "\n" +
                                "    İlk yatırım maliyeti genellikle 1 kW başına 800-1200 USD arasındadır.\n" +
                                "    Ortalama geri dönüş süresi 5-7 yıl arasındadır.\n" +
                                "    Devlet teşvikleri veya net metering (şebekeye satış) gibi mekanizmalar geri dönüş süresini kısaltabilir.\n" +
                                "\n" +
                                "Devlet Teşvikleri ve Vergi Avantajları\n" +
                                "\n" +
                                "    Türkiye’de YEKA (Yenilenebilir Enerji Kaynak Alanları) projeleri kapsamında destekler sunulmaktadır.\n" +
                                "    Ev ve işletmeler için çatı GES teşvikleri ile yatırım maliyetleri düşmektedir.\n" +
                                "    Fazla üretilen enerji şebekeye satılarak gelir elde edilebilir.\n" +
                                "\n" +
                                "Uzun Vadeli Kazançlar\n" +
                                "\n" +
                                "    Elektrik faturalarında %70-90 oranında düşüş sağlanabilir.\n" +
                                "    25 yıllık ömür boyunca toplam kazanç, yatırım maliyetinin 3-4 katına ulaşabilir.\n" +
                                "    Karbon ayak izinin düşmesi, ekolojik ve çevresel avantajlar sağlar.\n" +
                                "\n" +
                                "Güneş enerjisi, özellikle yüksek elektrik tüketimi olan bölgelerde hem bireysel hem de ticari açıdan büyük fırsatlar sunmaktadır.")
                    )
                )
            )
        ),
        MainCategory(
            "Kontrol",
            R.drawable.ic_control,
            listOf(
                SubCategory(
                    "Arıza Giderme",
                    listOf(
                        Topic("Temel Arıza Giderme Yöntemleri", "Temel Arıza Giderme Yöntemleri\n" +
                                "\n" +
                                "Elektrik ve elektronik sistemlerde arızaların hızlı ve etkili bir şekilde giderilmesi, hem güvenlik hem de sistemin verimli çalışması açısından kritik öneme sahiptir. Arıza giderme süreci, sorunun kaynağını belirleyerek en kısa sürede çözüm üretmeye dayanır. Bu süreçte sistematik bir yaklaşım benimsemek, gereksiz müdahaleleri önler ve zaman kaybını minimize eder.\n" +
                                "\n" +
                                "İlk olarak, görsel inceleme yapılmalıdır. Yanık izleri, gevşek bağlantılar, kopmuş kablolar veya aşırı ısınma belirtileri gözlemlenerek hızlı bir ön teşhis yapılabilir. Görsel kontroller, çoğu zaman basit bağlantı hatalarının veya gevşek terminallerin tespit edilmesini sağlar.\n" +
                                "\n" +
                                "İkinci adımda, adım adım sistematik testler uygulanmalıdır. Bir devrede arıza olup olmadığını anlamak için bileşenler tek tek izole edilerek test edilmelidir. Örneğin, bir devrede sorun yaşanıyorsa önce güç kaynağı, ardından kablolama, daha sonra sigortalar ve nihayetinde elektronik bileşenler kontrol edilmelidir.\n" +
                                "\n" +
                                "Üçüncü olarak, yedek bileşenler kullanılarak karşılaştırma testi yapılabilir. Örneğin, bir devrede röle arızası olup olmadığını anlamak için aynı türde sağlam bir röle ile değiştirme yapılabilir. Eğer sorun çözülürse, eski rölenin arızalı olduğu anlaşılır. Bu yöntem, özellikle mekanik parçalar veya entegre devrelerde oldukça etkilidir.\n" +
                                "\n" +
                                "Son olarak, log ve hata kodları analiz edilmelidir. Akıllı sistemlerde veya mikrodenetleyici tabanlı devrelerde, hata kodları ve sistem logları üzerinden doğrudan arıza kaynağı tespit edilebilir. Bu tür sistemlerde, hatanın tekrarlanabilir olup olmadığı da analiz edilerek doğru teşhis sağlanır.\n" +
                                "\n" +
                                "Başarılı bir arıza giderme süreci için planlı hareket etmek, sorunu kademeli olarak ele almak ve kesin tespit yapmadan rastgele bileşen değiştirmemek en iyi yaklaşımdır."),
                        Topic("Yaygın Sorunlar", "Elektrik ve elektronik sistemlerde bazı arızalar, tekrarlayan ve sıkça karşılaşılan sorunlardır. Bu yaygın arızaları tanımak ve nasıl giderileceğini bilmek, bakım süreçlerini hızlandırır ve sistem güvenliğini artırır.\n" +
                                "\n" +
                                "En sık rastlanan problemlerden biri kablolama hatalarıdır. Yanlış bağlanmış kablolar, gevşek terminaller veya kopmuş iletkenler, devrenin çalışmamasına neden olabilir. Bu tür bir durumda, kabloların bağlantı noktaları dikkatlice kontrol edilmeli ve gerektiğinde yeniden lehimleme veya sıkıştırma işlemi uygulanmalıdır.\n" +
                                "\n" +
                                "Güç kaynağı sorunları da oldukça yaygındır. Yetersiz gerilim, aşırı akım çekilmesi veya güç kaynağının tamamen arızalanması, tüm sistemin çalışmasını durdurabilir. Güç kaynağı arızalarını gidermek için multimetre ile çıkış voltajları kontrol edilmeli ve üretici standartlarına uygun olup olmadığı karşılaştırılmalıdır.\n" +
                                "\n" +
                                "Aşırı ısınma problemleri, özellikle yüksek güçlü bileşenlerde ve transformatörlerde sıkça görülen bir sorundur. Eğer bir bileşen normalden fazla ısınıyorsa, soğutma sistemi kontrol edilmeli, yeterli havalandırma olup olmadığına bakılmalı ve gerekirse ısı emiciler (heatsink) veya fanlar eklenmelidir.\n" +
                                "\n" +
                                "Yanlış sigorta veya devre kesici kullanımı, birçok sistemin aniden devre dışı kalmasına neden olabilir. Özellikle ev kablolamasında ve endüstriyel kontrol panellerinde yanlış amperaj değerine sahip sigortalar kullanıldığında, sigortalar gereksiz yere atabilir veya tam tersine koruma sağlamayarak yangın riski oluşturabilir.\n" +
                                "\n" +
                                "Bunlar dışında topraklama hataları, kısa devreler, gerilim dalgalanmaları ve elektromanyetik girişimler, yaygın ancak genellikle gözden kaçan problemlerdir. Bu tür sorunları önlemek için düzenli bakım yapılmalı, aşırı yüklenmelerden kaçınılmalı ve devreler gerektiği gibi izole edilmelidir."),
                        Topic("Teşhis Araçları", "Doğru bir arıza tespiti için elektriksel ve elektronik teşhis araçları kullanmak büyük önem taşır. Arızaların kaynağını hızlıca bulmak ve onarım sürecini hızlandırmak için çeşitli cihazlardan faydalanılır.\n" +
                                "\n" +
                                "Multimetre (AVO Metre), en yaygın kullanılan teşhis aracıdır. Bu cihaz sayesinde gerilim, akım ve direnç ölçümleri yapılarak devredeki anormallikler tespit edilebilir. Örneğin, bir sigortanın atıp atmadığını veya bir kablonun kesilip kesilmediğini anlamak için direnç ölçümü yapılabilir.\n" +
                                "\n" +
                                "Osiloskop, özellikle zamanla değişen sinyalleri analiz etmek için kullanılır. Analog veya dijital dalga şekillerinin görüntülenmesini sağlayarak, özellikle frekans analizleri, dalga bozulmaları ve gürültü sorunlarını tespit etmek için kritik bir rol oynar.\n" +
                                "\n" +
                                "Termal Kameralar ve Kızılötesi Sensörler, aşırı ısınma yapan bileşenleri belirlemek için oldukça etkilidir. Güç transistörleri, röleler veya trafo gibi bileşenlerdeki ısı kaynaklı arızaları tespit etmek için kullanılır.\n" +
                                "\n" +
                                "Mantık Analizörleri, dijital sistemlerdeki mantık seviyelerini ölçmek için kullanılır. Mikrodenetleyici tabanlı devrelerde, giriş-çıkış pinlerinin doğru çalışıp çalışmadığını görmek için oldukça kullanışlıdır.\n" +
                                "\n" +
                                "Bu teşhis araçlarının her biri, belirli bir arıza tipini analiz etmek için özelleşmiştir ve uygun aracı seçmek, arıza giderme sürecini büyük ölçüde hızlandırır."),
                        Topic("Güvenlik Prosedürleri", "Güvenlik Prosedürleri\n" +
                                "\n" +
                                "Arıza giderme sürecinde güvenlik, her zaman en öncelikli konu olmalıdır. Elektrik veya elektronik sistemlerde yanlış yapılan bir müdahale ciddi yaralanmalara veya büyük hasarlara yol açabilir. Bu nedenle güvenlik prosedürlerine kesinlikle uyulmalıdır.\n" +
                                "\n" +
                                "Elektriksel izole işlemleri, güvenlik açısından en önemli adımdır. Arıza giderme işlemi başlamadan önce, güç kaynağı tamamen kesilmeli ve devrede gerilim olup olmadığı kontrol edilmelidir. Özellikle yüksek gerilim hatlarında çalışırken, izole eldivenler ve yalıtımlı aletler kullanılmalıdır.\n" +
                                "\n" +
                                "Kapasitör deşarj işlemleri, yüksek voltajlı sistemlerde büyük önem taşır. Birçok güç kaynağı ve motor sürücü devresi, kapasitörler aracılığıyla enerji depolar ve güç kesildikten sonra bile gerilim taşıyabilir. Bu nedenle, devreye dokunmadan önce kapasitörlerin güvenli bir şekilde boşaltıldığından emin olunmalıdır.\n" +
                                "\n" +
                                "Ayrıca, statik elektrikten korunma (ESD - Electrostatic Discharge Protection) prosedürleri elektronik bileşenler için hayati öneme sahiptir. Hassas mikroçipler veya entegre devrelerle çalışırken anti-statik bileklikler ve topraklanmış çalışma yüzeyleri kullanılmalıdır.\n" +
                                "\n" +
                                "Yanıcı maddelerin bulunduğu ortamlarda elektrikli ekipmanlarla çalışırken kıvılcım oluşumunu önlemek için kıvılcım korumalı aletler tercih edilmelidir.\n" +
                                "\n" +
                                "Bu güvenlik prosedürlerine uyulması, hem teknik personelin güvenliğini sağlar hem de sistemin zarar görmesini önleyerek uzun ömürlü ve güvenilir bir işletim sağlar.")
                    )
                ),
                SubCategory(
                    "Koruma",
                    listOf(
                        Topic("Devre Koruma", "Elektrik devrelerinde koruma sistemleri, aşırı akım, kısa devre, gerilim dalgalanmaları gibi durumlarda devre elemanlarını ve bağlı yükleri korumak amacıyla tasarlanır. Bu koruma mekanizmaları, ekipmanların uzun ömürlü olmasını sağlar ve aynı zamanda yangın, elektrik çarpması gibi tehlikeleri önler.\n" +
                                "\n" +
                                "Sigortalar, en yaygın kullanılan devre koruma elemanlarıdır. Bir sigorta, içindeki ince telin belirli bir akım seviyesini aşması durumunda eriyerek devreyi kesmesini sağlayan bir güvenlik bileşenidir. Kullanım alanına göre hızlı veya gecikmeli tepki veren farklı tipleri bulunur.\n" +
                                "\n" +
                                "Devre kesiciler, sigortalara benzer şekilde aşırı akımlara karşı koruma sağlar, ancak sigortadan farklı olarak tekrar kullanılabilirler. Manyetik veya termal mekanizmalarla çalışan devre kesiciler, yüksek güçlü sistemlerde sıkça tercih edilir.\n" +
                                "\n" +
                                "Artık akım röleleri (RCD - Residual Current Device), kaçak akım oluştuğunda devreyi anında keserek elektrik çarpmasını önler. İnsan hayatı için kritik öneme sahiptir ve genellikle binaların ana panolarında yer alır.\n" +
                                "\n" +
                                "Gerilim koruma cihazları (Surge Protectors), yıldırım düşmesi veya ani gerilim yükselmeleri sırasında elektronik cihazları korumak için kullanılır. Özellikle hassas bilgisayar sistemleri, endüstriyel kontrol panelleri ve telekomünikasyon hatlarında gereklidir.\n" +
                                "\n" +
                                "Bu sistemlerin düzenli olarak test edilmesi ve bakımlarının yapılması, koruma mekanizmalarının her zaman etkin kalmasını sağlar."),
                        Topic("Topraklama", "Topraklama, elektrik sistemlerinde kaçak akımları güvenli bir şekilde toprağa yönlendirerek ekipmanları ve insanları koruyan kritik bir güvenlik önlemidir. İyi bir topraklama sistemi, elektrik çarpmasını önlediği gibi cihazların sağlıklı çalışmasını da sağlar.\n" +
                                "\n" +
                                "Koruma topraklaması, elektrikli cihazların metal gövdelerinin toprağa bağlanmasıyla olası kaçak akımların bertaraf edilmesini sağlar. Eğer bir cihazın izolasyonu bozulursa, kaçak akım doğrudan toprak üzerinden akarak insanların çarpılmasını engeller.\n" +
                                "\n" +
                                "Fonksiyonel topraklama (işletme topraklaması), bazı devrelerin ve sistemlerin düzgün çalışması için gereklidir. Örneğin, iletişim hatları ve hassas ölçüm cihazları için kullanılan topraklama türüdür.\n" +
                                "\n" +
                                "Topraklama direnci, bir sistemin etkinliğini belirleyen önemli bir faktördür. Topraklama elektrotları, mümkün olduğunca düşük dirençli bir topraklama hattı oluşturacak şekilde yerleştirilmelidir. Genellikle, topraklama direncinin 5 ohm’un altında olması tavsiye edilir.\n" +
                                "\n" +
                                "Binalarda ve endüstriyel tesislerde topraklama sistemleri, bakır çubuklar, topraklama levhaları veya derin kuyu elektrotları ile gerçekleştirilir. Düzenli kontroller yapılarak, korozyon veya bağlantı gevşemeleri nedeniyle topraklamanın etkinliği azalmaması sağlanmalıdır."),
                        Topic("Güvenlik Cihazları", "Elektrik tesisatlarında ve elektronik devrelerde güvenliği artırmak için çeşitli güvenlik cihazları kullanılır. Bu cihazlar, hem sistemleri hem de kullanıcıları olası risklerden korur.\n" +
                                "\n" +
                                "Termik röleler, motorlar ve endüstriyel sistemlerde aşırı yüklenmeyi algılayarak motorun zarar görmesini önler. İçinde bulunan bimetal eleman, ısıya bağlı olarak eğilip kontakları açarak devreyi keser.\n" +
                                "\n" +
                                "Yıldırım ve aşırı gerilim koruma cihazları, atmosferik olaylar nedeniyle oluşabilecek yüksek gerilim darbelerini sönümleyerek bağlı cihazların zarar görmesini önler. Genellikle endüstriyel tesislerde ve hassas elektronik ekipmanların bulunduğu ortamlarda kullanılır.\n" +
                                "\n" +
                                "Kaçak akım koruma röleleri, elektrik çarpmasını önlemek için devrelerdeki anormal kaçak akımları algılar ve çok kısa sürede sistemi kapatır. Özellikle banyo, mutfak gibi suya yakın alanlarda hayati önem taşır.\n" +
                                "\n" +
                                "Alev almayan (Ex-proof) ekipmanlar, patlayıcı gazların veya tozların bulunduğu ortamlarda kullanılmak üzere tasarlanmıştır. Petrol rafinerileri, kimya tesisleri ve maden ocaklarında bu tür cihazlar zorunludur.\n" +
                                "\n" +
                                "Elektrik güvenliği için bu cihazların düzenli test edilmesi ve bakımlarının yapılması büyük önem taşır. Aksi takdirde, koruma işlevlerini kaybederek ciddi riskler oluşturabilirler."),
                        Topic("Standartlar ve Yönetmelikler", "Elektrik ve elektronik sistemlerin güvenli ve verimli bir şekilde çalışması için ulusal ve uluslararası standartlara uyulması gereklidir. Bu standartlar, sistem tasarımı, kurulum, bakım ve işletme süreçlerini belirleyerek can ve mal güvenliğini sağlar.\n" +
                                "\n" +
                                "IEC (Uluslararası Elektroteknik Komisyonu) Standartları, dünya genelinde kabul gören en önemli elektrik mühendisliği standartlarını belirler. IEC 60364 serisi, elektrik tesisatları için güvenlik gereksinimlerini kapsar.\n" +
                                "\n" +
                                "IEEE (Elektrik ve Elektronik Mühendisleri Enstitüsü) Standartları, özellikle güç sistemleri, haberleşme ve otomasyon alanlarında kullanılan kritik güvenlik kurallarını içerir.\n" +
                                "\n" +
                                "TSE (Türk Standartları Enstitüsü) Yönetmelikleri, Türkiye’de elektrik sistemleriyle ilgili tüm yasal gereklilikleri belirler. Elektrik İç Tesisleri Yönetmeliği, binalarda elektrik tesisatlarının nasıl kurulması gerektiğini açıklar.\n" +
                                "\n" +
                                "NEC (National Electrical Code - Ulusal Elektrik Kodu), Amerika’da kullanılan ve dünya çapında birçok ülkenin de referans aldığı elektrik tesisatı güvenlik kodlarını içerir.\n" +
                                "\n" +
                                "Bu standartlara uyulması, sistemlerin daha güvenli ve uzun ömürlü olmasını sağladığı gibi, yasal gerekliliklerin yerine getirilmesine de yardımcı olur. Elektrik mühendisleri ve teknisyenler, projelerinde bu standartları göz önünde bulundurmalı ve en güncel yönetmeliklere göre çalışmalıdır.")
                    )
                ),
                SubCategory(
                    "Onarım",
                    listOf(
                        Topic("Temel Onarım Teknikleri", "Elektrik ve elektronik sistemlerde onarım, arızaların doğru teşhis edilmesi, uygun tamir yöntemlerinin uygulanması ve sistemin güvenli bir şekilde çalıştırılması süreçlerini içerir. Onarım teknikleri, sistemin karmaşıklığına göre değişse de, bazı temel prensipler her durumda geçerlidir.\n" +
                                "\n" +
                                "Öncelikle güvenlik önlemleri alınmalıdır. Cihaz enerjisi kesilmeli, gerekli koruyucu ekipmanlar (izole eldiven, gözlük vb.) kullanılmalı ve yüksek gerilimli bileşenlerin boşaltıldığı kontrol edilmelidir.\n" +
                                "\n" +
                                "Arıza teşhisinde gözle muayene önemlidir. Yanmış bileşenler, gevşek bağlantılar, kırık devre yolları gibi fiziksel problemler tespit edilebilir. Gözle muayenenin ardından test cihazları (multimetre, osiloskop vb.) kullanılarak voltaj, akım ve direnç ölçümleri yapılmalıdır.\n" +
                                "\n" +
                                "Onarım sürecinde bileşen bazlı test uygulanmalıdır. Dirençler, kapasitörler, transistörler gibi bileşenler devre dışıyken ölçülmeli, değişim gerekip gerekmediği belirlenmelidir. Sorunun kaynağı tespit edildikten sonra doğru lehimleme ve montaj yöntemleriyle onarım gerçekleştirilmelidir.\n" +
                                "\n" +
                                "Onarım sonrası, devre yeniden test edilmeli ve sistemin stabil çalıştığı doğrulanmalıdır. Ayrıca, tekrar eden arızaları önlemek için düzenli bakım ve önleyici tedbirler alınmalıdır."),
                        Topic("Bileşen Değiştirme", "Elektrik-elektronik sistemlerde zamanla bazı bileşenler aşınır veya bozulur. Arızalı bir bileşeni değiştirmek, tüm sistemi değiştirmekten daha ekonomik ve pratik olabilir. Ancak, yanlış bir bileşen seçimi veya yanlış montaj daha büyük problemlere yol açabilir.\n" +
                                "\n" +
                                "Öncelikle, değiştirilecek bileşenin özellikleri belirlenmelidir. Voltaj, akım, güç kapasitesi gibi parametreler dikkate alınarak uyumlu bir yedek bileşen seçilmelidir.\n" +
                                "\n" +
                                "Değişim öncesinde devre enerjisiz hale getirilmelidir ve gerekirse devredeki enerji depolayan elemanlar (örneğin büyük kapasitörler) boşaltılmalıdır. Özellikle yüksek voltajlı sistemlerde enerji birikmesi ölümcül olabilir.\n" +
                                "\n" +
                                "Lehimleme işlemi, bileşen değişiminde kritik bir aşamadır. Eski bileşen uygun şekilde sökülmeli, yeni bileşen doğru yönlendirilerek monte edilmeli ve kaliteli bir lehimleme yapılmalıdır. Soğuk lehim veya fazla ısı uygulaması devreye zarar verebilir.\n" +
                                "\n" +
                                "Bileşen değişimi sonrası sistem tekrar test edilmeli, değiştirilen parçanın işlevselliği kontrol edilmelidir. Gerekiyorsa ek ayarlamalar yapılmalı ve sistemin stabil çalıştığı doğrulanmalıdır."),
                        Topic("Test Prosedürleri", "Test prosedürleri, sistemlerin sorunsuz çalıştığını doğrulamak ve olası hataları önceden belirlemek için uygulanan yöntemlerdir. Elektrik ve elektronik sistemlerde test süreci, çeşitli aşamalardan oluşur.\n" +
                                "\n" +
                                "Görsel ve mekanik kontroller ilk adımdır. Fiziksel hasarlar, yanık izleri, gevşek bağlantılar ve soğuk lehimler incelenir.\n" +
                                "\n" +
                                "Elektriksel testler, devredeki voltaj, akım ve direnç değerlerini kontrol etmek için yapılır. Bu testlerde multimetre, osiloskop, güç analizörü gibi cihazlar kullanılır.\n" +
                                "\n" +
                                "Bazı sistemlerde yük altında test yapmak gerekir. Örneğin, bir motor veya güç kaynağı, çalışırken belirlenen değerlerde performans gösteriyor mu, yük değişimlerine nasıl tepki veriyor gibi faktörler incelenir.\n" +
                                "\n" +
                                "Test süreci belgelendirilmeli ve yapılan ölçümler kaydedilmelidir. Böylece ilerleyen dönemlerde karşılaşılabilecek arızalar için karşılaştırmalı analiz yapılabilir."),
                        Topic("Bakım Programı", "\n" +
                                "\n" +
                                "Elektrik ve elektronik sistemlerin ömrünü uzatmak, beklenmedik arızaları önlemek ve performansı artırmak için düzenli bakım gereklidir.\n" +
                                "\n" +
                                "Öngörücü bakım, sistemde oluşabilecek potansiyel problemleri erken teşhis etmek için sensörler ve analiz yazılımları kullanarak yapılan bakımdır. Büyük sanayi tesislerinde yaygın olarak kullanılır.\n" +
                                "\n" +
                                "Önleyici bakım, belirli periyotlarla yapılan standart kontroller ve parça değişimleri içerir. Filtre değişimi, kablo bağlantılarının sıkılığı, termal kontroller gibi işlemler düzenli olarak gerçekleştirilmelidir.\n" +
                                "\n" +
                                "Arıza sonrası bakım, sistemde bir hata meydana geldiğinde yapılan onarım sürecidir. Bu tip bakım, sistemde üretim kaybına neden olabileceği için mümkün olduğunca azaltılmalıdır.\n" +
                                "\n" +
                                "Bakım süreçleri düzenli olarak planlanmalı, kayıt altına alınmalı ve periyodik testlerle desteklenmelidir.")
                    )
                ),
                SubCategory(
                    "Ölçme Aletleri",
                    listOf(
                        Topic("Multimetre Kullanımı", "Multimetre, elektriksel büyüklükleri ölçmek için kullanılan en temel test cihazlarından biridir. Gerilim, akım, direnç ve bazen frekans gibi değerleri ölçebilir.\n" +
                                "\n" +
                                "Multimetrenin doğru kullanımı için önce uygun ölçüm modu seçilmelidir. Gerilim ölçümü için voltaj moduna, direnç ölçümü için ohm moduna, akım ölçümü için amper moduna alınmalıdır.\n" +
                                "\n" +
                                "Ölçüm sırasında prob bağlantıları doğru yapılmalıdır. Genellikle kırmızı prob pozitif (V, Ω, mA girişine), siyah prob ise toprak (COM) girişine bağlanır.\n" +
                                "\n" +
                                "Alternatif akım (AC) ve doğru akım (DC) ölçümleri farklıdır. AC ölçümlerinde dalgalı sinyaller okunurken, DC ölçümlerinde sabit gerilim ölçülür. Bu nedenle ölçüm modunun doğru ayarlandığından emin olunmalıdır.\n" +
                                "\n" +
                                "Direnç ölçümü yapılırken devrenin enerjisiz olması gerekir. Akım ölçümü için ise multimetre seri bağlanmalıdır, aksi takdirde cihaz zarar görebilir."),
                        Topic("Osiloskop", "Osiloskop, elektrik sinyallerini zamana bağlı olarak gösteren bir test cihazıdır. Genellikle sinyal analizlerinde, frekans ölçümlerinde ve devrelerde hata tespitinde kullanılır.\n" +
                                "\n" +
                                "Osiloskop, sinyalin genliğini, frekansını, dalga şeklini ve faz kaymasını görsel olarak analiz etme imkanı sunar. Genellikle kare dalga, sinüs dalga veya üçgen dalga gibi farklı sinyal tipleri üzerinde çalışır.\n" +
                                "\n" +
                                "Ölçüm yaparken, problar uygun şekilde bağlanmalı ve zaman/gerilim ölçekleri doğru ayarlanmalıdır. Aksi takdirde sinyal bozulabilir veya yanlış yorumlanabilir.\n" +
                                "\n" +
                                "Osiloskop ile dijital ve analog sinyaller analiz edilebilir. Dijital devrelerde osiloskop kullanımı, sinyal kesintilerini, veri hatalarını ve parazitleri belirlemede önemlidir.\n" +
                                "\n" +
                                "Modern osiloskoplar, FFT (Hızlı Fourier Dönüşümü) analizi, dalga biçimi kaydı ve otomatik ölçüm gibi gelişmiş özelliklere sahiptir."),
                        Topic("Güç Analizörleri", "Güç analizörleri, elektrik sistemlerinde güç tüketimini, harmonikleri, faz farklarını ve enerji kalitesini ölçen cihazlardır. Özellikle endüstriyel sistemlerde enerji yönetimi için kullanılır.\n" +
                                "\n" +
                                "Gerçek güç (W), görünür güç (VA) ve reaktif güç (VAR) ölçümleri yaparak sistemin enerji verimliliği analiz edilir.\n" +
                                "\n" +
                                "Enerji kayıplarını belirlemek için harmonik bozulmalar incelenir. Harmonikler, cihazların verimini düşürerek ısı kaybına ve ekipman ömrünün kısalmasına neden olabilir.\n" +
                                "\n" +
                                "Güç analizörleri, endüstriyel motorların, jeneratörlerin ve güç hatlarının sağlıklı çalıştığını doğrulamak için önemli bir test ekipmanıdır."),
                        Topic("Güvenlik Ölçerler", "Elektrik güvenliği, sistemin ve çalışanların korunması için kritik öneme sahiptir. Kaçak akım ölçerler, topraklama test cihazları ve izolasyon test cihazları, sistemlerin güvenliğini doğrulamak için kullanılır.\n" +
                                "\n" +
                                "Topraklama test cihazları, topraklama direncini ölçerek güvenli bir topraklama olup olmadığını belirler.\n" +
                                "\n" +
                                "İzolasyon test cihazları (Megger), kabloların ve elektrik ekipmanlarının yalıtım kalitesini kontrol eder.\n" +
                                "\n" +
                                "Kaçak akım ölçerler, devrelerde tehlikeli kaçak akımlar olup olmadığını tespit eder.\n" +
                                "\n" +
                                "Bu cihazlar, düzenli olarak kullanılmalı ve ölçümler kayıt altına alınmalıdır.")
                    )
                )
            )
        ),
        MainCategory(
            "Elektronik",
            R.drawable.ic_electronics,
            listOf(
                SubCategory(
                    "Temel Elektronik",
                    listOf(
                        Topic("Bileşenlere Genel Bakış", "Elektronik sistemler, belirli bir işlevi yerine getirmek için bir araya getirilen çeşitli bileşenlerden oluşur. Bu bileşenler, pasif ve aktif olmak üzere iki ana kategoriye ayrılır. Pasif bileşenler, enerjiyi depolayabilen veya iletebilen ancak kazanç (amplifikasyon) sağlayamayan elemanlardır. Aktif bileşenler ise, harici bir enerji kaynağı ile sinyali işleyebilen ve yükseltebilen elemanlardır.\n" +
                                "\n" +
                                "Temel pasif bileşenlerden biri dirençtir (R). Dirençler, elektrik akımına karşı belirli bir engelleme oluşturarak gerilim düşüşü yaratır ve devre akımını kontrol eder. Bir diğer pasif bileşen kondansatör (C) olup, elektrik yükünü depolayarak AC ve DC bileşenleri birbirinden ayırmak, filtreleme yapmak veya geçici enerji sağlamak gibi görevler üstlenir. Bobinler (L) ise manyetik alan oluşturarak akım değişimlerine karşı direnç gösterir ve özellikle filtreleme ve endüktif yüklerde kullanılır.\n" +
                                "\n" +
                                "Aktif bileşenler arasında en önemlisi transistörlerdir. BJT (Bipolar Junction Transistor) ve MOSFET (Metal-Oxide-Semiconductor Field-Effect Transistor) gibi türleri bulunur. Transistörler, anahtarlama ve sinyal yükseltme işlevlerinde yaygın olarak kullanılır. Diyotlar, akımın yalnızca tek yönlü akmasına izin veren yarı iletken elemanlardır. Zener diyotlar, belirli bir gerilimde kırılma noktasına ulaşarak voltaj regülasyonu sağlar.\n" +
                                "\n" +
                                "Modern elektronik sistemlerde entegre devreler (IC'ler) büyük öneme sahiptir. Birçok elektronik bileşenin tek bir çip içinde birleştirildiği IC'ler, mikrodenetleyicilerden sinyal işleme devrelerine kadar geniş bir alanda kullanılır. Op-amp (operasyonel yükselteçler), analog sinyal işlemede temel yapı taşlarından biridir. Ayrıca, mikrodenetleyiciler ve FPGA'ler, dijital kontrol sistemlerinin temel taşlarını oluşturur."),
                        Topic("Devre Analizi", "Elektronik devreleri anlamak ve tasarlamak için devre analiz teknikleri kullanılır. Temel olarak, Ohm Kanunu, Kirchhoff Kanunları, Thevenin ve Norton Teoremleri, AC-DC analiz yöntemleri gibi tekniklerden yararlanılır.\n" +
                                "\n" +
                                "Ohm Kanunu, devredeki gerilim, akım ve direnç arasındaki temel ilişkiyi belirler:\n" +
                                "V = I × R\n" +
                                "Bu basit denklem, herhangi bir devrede gerilim düşümünü veya akımı hesaplamak için kullanılır.\n" +
                                "\n" +
                                "Kirchhoff’un Gerilim Kanunu (KVL), kapalı bir devre döngüsünde toplam gerilim düşüşlerinin sıfır olması gerektiğini söyler. Kirchhoff’un Akım Kanunu (KCL) ise bir düğüme giren ve çıkan akımların toplamının eşit olması gerektiğini ifade eder.\n" +
                                "\n" +
                                "Daha karmaşık devrelerde Thevenin ve Norton teoremleri, devrenin belirli bir kısmını basitleştirerek analiz etmeye olanak tanır. AC devrelerinde empedans (Z) kavramı kullanılır. Empedans, direncin AC sinyallere karşı olan daha genel hali olup, kapasitif ve endüktif bileşenleri de kapsar. AC devre analizinde fazörler, genlik ve faz açısı hesaplamaları yapılır.\n" +
                                "\n" +
                                "Devre analizi teknikleri, hem analog hem de dijital devre tasarımında, sinyal işleme, filtreleme ve geri besleme sistemlerinde kritik öneme sahiptir."),
                        Topic("Yarı İletkenler", "Yarı iletkenler, elektrik iletkenliği açısından iletkenler ile yalıtkanlar arasında yer alan malzemelerdir. En yaygın yarı iletken malzeme silisyum (Si) olup, modern elektronik cihazların temel yapı taşıdır. Silisyum, belirli safsızlıklarla katkılandığında P tipi ve N tipi malzemeler elde edilir.\n" +
                                "\n" +
                                "P-N birleşimi, diyotların ve transistörlerin temelidir. P-tipi ve N-tipi malzemeler birleştirildiğinde P-N diyodu oluşur. Bu yapı, ileri kutuplamada akım geçiren, ters kutuplamada ise akımı bloke eden bir davranış gösterir. MOSFET ve BJT gibi transistörler, bu yarı iletken yapıların daha karmaşık biçimlerde düzenlenmesiyle oluşur.\n" +
                                "\n" +
                                "Yarı iletkenlerin bir başka önemli özelliği bant aralığıdır. Bir malzemenin iletken veya yalıtkan olup olmadığı, elektronların enerji seviyeleriyle ilgilidir. Yarı iletkenler, belirli bir enerji seviyesinde dışarıdan enerji aldıklarında iletken hale geçebilirler. Bu özellik, fotodiyotlar, güneş panelleri ve LED'ler gibi optoelektronik bileşenlerde kullanılır.\n" +
                                "\n" +
                                "Modern yarı iletken teknolojisi, mikroişlemciler, bellekler, güç elektroniği cihazları ve sensörler gibi çok geniş bir yelpazede uygulamalara sahiptir."),
                        Topic("Yükselteçler", "Yükselteçler, düşük güçlü bir sinyali daha büyük bir genliğe ulaştırmak için kullanılan devrelerdir. Elektronik sistemlerde sinyal işleme, ses sistemleri, radyo frekans devreleri ve iletişim uygulamalarında kritik rol oynarlar.\n" +
                                "\n" +
                                "En yaygın yükselteç türlerinden biri operasyonel yükselteçler (Op-amp) olup, analog sinyal işleme, filtreleme ve osilatör devrelerinde kullanılır. Op-amp devreleri tersleyici, terslemeyen, fark yükselteç ve entegratör/diferansiyel devreler gibi farklı konfigürasyonlarda olabilir.\n" +
                                "\n" +
                                "BJT ve MOSFET transistörlerle yapılan yükselteçler, sınıf A, sınıf B, sınıf AB ve sınıf D gibi farklı kategorilere ayrılır. Sınıf A yükselteçler, sürekli akım çekerek en iyi sinyal doğruluğunu sağlar ancak düşük verimlidir. Sınıf B ve AB yükselteçler, daha yüksek verim sunarak ses sistemlerinde yaygın olarak kullanılır. Sınıf D yükselteçler, anahtarlamalı bir yapı kullanarak yüksek verimli ses yükselteçlerinde tercih edilir.\n" +
                                "\n" +
                                "Yükselteçlerin performansı, kazanç (gain), bant genişliği, giriş/çıkış empedansı, harmonik bozulma (THD) ve sinyal-gürültü oranı (SNR) gibi parametrelerle değerlendirilir. Modern elektronik cihazlarda yükselteçler, ses işlemcileri, haberleşme devreleri, tıbbi cihazlar ve güç elektroniği uygulamalarında yaygın olarak kullanılmaktadır.")
                    )
                ),
                SubCategory(
                    "Dijital Elektronik",
                    listOf(
                        Topic("Dijital Sistem Türleri", "\n" +
                                "\n" +
                                "Dijital sistemler, girdileri işleyerek belirli mantıksal işlemler gerçekleştiren elektronik sistemlerdir. Genellikle sayısal (ikili) verilerle çalışır ve dijital sinyallerle işlem yapar. Dijital sistemler, kombinasyonel (kombinatoryal) ve sıralı (sekansiyel) sistemler olmak üzere iki ana kategoriye ayrılır.\n" +
                                "\n" +
                                "Kombinasyonel sistemler, yalnızca girişlerin anlık değerine bağlı olarak çıktı üreten sistemlerdir. Bellek elemanları içermezler ve giriş değiştiğinde anında yeni bir çıktı üretirler. Örnek olarak aritmetik işlemciler, mantık kapıları, kod çözücüler ve çoklayıcılar verilebilir.\n" +
                                "\n" +
                                "Sıralı sistemler, girişlerin yanı sıra önceki durumlarına (belleklerine) de bağlı olarak çıktı üretirler. İçerisinde flip-floplar, sayaçlar ve kaydediciler gibi bellek birimleri bulunur. Bu tür sistemler, FSM (Sonlu Durum Makineleri) olarak modellenerek kontrol devrelerinde, mikroişlemcilerde ve haberleşme sistemlerinde kullanılır.\n" +
                                "\n" +
                                "Modern dijital sistemler mikrodenetleyiciler, mikroişlemciler, FPGA (Field-Programmable Gate Array) ve DSP (Dijital Sinyal İşleme) sistemleri gibi karmaşık bileşenlerden oluşabilir. Her biri belirli bir görev için optimize edilmiştir ve veri işleme, otomasyon ve haberleşme gibi birçok alanda yaygın olarak kullanılır."),
                        Topic("Sinyal Türleri", "\n" +
                                "\n" +
                                "Elektronik sistemlerde sinyaller, bilgi taşımak ve işlemek için kullanılan elektriksel dalgalardır. Genel olarak sinyaller analog ve dijital olmak üzere iki ana kategoriye ayrılır.\n" +
                                "\n" +
                                "Analog sinyaller, sürekli değişen ve sonsuz çözünürlükte değerlere sahip olan sinyallerdir. Ses, sıcaklık ve ışık gibi fiziksel büyüklükler analog sinyallerle temsil edilir. Örnek: Sinüs dalgası, üçgen dalgası, gerilim değişimleri.\n" +
                                "\n" +
                                "Dijital sinyaller, belirli ve ayrık (discrete) değerler alabilen sinyallerdir. Genellikle ikili sistemde (0 ve 1) temsil edilirler. Dijital sinyallerin avantajı, gürültüye karşı dayanıklılığı ve hata düzeltme kabiliyetidir. Örnek: Kare dalga, PWM (Darbe Genişlik Modülasyonu).\n" +
                                "\n" +
                                "Dijital sistemlerde zamanlama (senkronizasyon) kritik bir faktördür. Sinyaller genellikle senkron (saat darbeli) ve asenkron (saat darbeli olmayan) olarak çalışabilir. Saat darbeli sistemlerde veriler belirli zaman aralıklarında işlenirken, asenkron sistemlerde işlem, giriş değişikliğine bağlı olarak gerçekleşir."),
                        Topic("Mantık Seviyeleri ve Darbe Dalga Şekilleri", "Dijital elektronik devrelerinde mantık seviyeleri, ikili sistemin temelini oluşturur. İkili sistemde iki temel mantık seviyesi bulunur:\n" +
                                "\n" +
                                "    Lojik 0 (LOW - Düşük Seviye): Genellikle 0V veya toprak (GND) seviyesidir.\n" +
                                "    Lojik 1 (HIGH - Yüksek Seviye): Besleme voltajına (örneğin 5V veya 3.3V) karşılık gelir.\n" +
                                "\n" +
                                "Farklı lojik aileleri, farklı gerilim seviyelerini kullanabilir. Örneğin:\n" +
                                "\n" +
                                "    TTL (Transistor-Transistor Logic): Lojik 1 = 5V, Lojik 0 = 0V\n" +
                                "    CMOS (Complementary Metal-Oxide-Semiconductor): Lojik 1 = 3.3V veya 5V, Lojik 0 = 0V\n" +
                                "\n" +
                                "Dijital sinyaller genellikle kare dalga (square wave) formundadır. Kare dalga, belirli zaman aralıklarıyla 0 ve 1 seviyeleri arasında geçiş yapar. Zamanlama açısından önemli parametreler şunlardır:\n" +
                                "\n" +
                                "    Periyot (T): Sinyalin tam bir döngüyü tamamlaması için geçen süre.\n" +
                                "    Frekans (f): Birim zamandaki döngü sayısı. (f = 1/T)\n" +
                                "    Darbe genişliği: Yüksek seviyede kalma süresi.\n" +
                                "    Görev döngüsü (Duty Cycle): Yüksek seviyedeki sürenin periyoda oranı (%).\n" +
                                "\n" +
                                "Darbe sinyalleri, mikrodenetleyicilerde ve sayısal haberleşme sistemlerinde PWM (Darbe Genişlik Modülasyonu) gibi tekniklerle kullanılarak motor kontrolü, güç yönetimi ve sinyal üretimi gibi işlemlerde kritik rol oynar."),
                        Topic("Dijital Sistem Bileşenleri", "Dijital sistemlerin temel bileşenleri, giriş-çıkış elemanları, işleme birimleri ve bellek yapılarından oluşur.\n" +
                                "\n" +
                                "    Mantık Kapıları: AND, OR, NOT, NAND, NOR, XOR gibi kapılar dijital devrelerin temelini oluşturur.\n" +
                                "    Flip-Floplar: Bilgi depolayan temel elemanlardır. Senkron sistemlerde bellek ve sayaç yapılarında kullanılırlar.\n" +
                                "    Kaydediciler (Registers): Verileri saklayan ve ileten hafıza elemanlarıdır.\n" +
                                "    Sayaçlar: Saat darbelerine bağlı olarak belirli bir sayma işlemi gerçekleştiren devrelerdir.\n" +
                                "    Kodlayıcılar ve Kod Çözücüler: Verileri belirli bir kodlama standardına göre dönüştüren bileşenlerdir.\n" +
                                "    Çoklayıcılar (Multiplexer - MUX): Birden fazla giriş sinyalini tek bir çıkışta birleştirir.\n" +
                                "    Demultiplexer (DEMUX): Tek bir giriş sinyalini birden fazla çıkışa yönlendirir.\n" +
                                "    Mikrodenetleyiciler ve Mikroişlemciler: Dijital sistemlerin merkezi işleme birimleridir ve gömülü sistemlerde yaygın olarak kullanılır.\n" +
                                "\n" +
                                "Bu bileşenler birlikte kullanılarak FPGA, ASIC, mikrodenetleyici tabanlı sistemler ve bilgisayarlar gibi kompleks dijital sistemler oluşturulabilir."),
                        Topic("Dijital Mantık İşlemleri", "Dijital mantık, Boole Cebiri temelinde çalışır ve mantık kapıları kullanılarak sayısal işlem yapılmasını sağlar. Temel mantık işlemleri şunlardır:\n" +
                                "\n" +
                                "    AND (VE): İki girişin de 1 olması durumunda 1 üreten işlem. A ∧ B = AB\n" +
                                "    OR (VEYA): En az bir girişin 1 olması durumunda 1 üreten işlem. A ∨ B = A + B\n" +
                                "    NOT (DEĞİL): Girişin tersini üreten işlem. ¬A veya A'\n" +
                                "    NAND (VE DEĞİL): AND işleminin tersidir. (AB)'\n" +
                                "    NOR (VEYA DEĞİL): OR işleminin tersidir. (A + B)'\n" +
                                "    XOR (Özel VEYA): Girişler farklıysa 1, aynıysa 0 üretir. A ⊕ B\n" +
                                "    XNOR (Özel VEYA DEĞİL): XOR işleminin tersidir.\n" +
                                "\n" +
                                "Dijital sistemlerde Boolean ifadelerin sadeleştirilmesi için Karnaugh Haritaları (K-Map) ve De Morgan Teoremleri gibi yöntemler kullanılır. Ayrıca, karmaşık devrelerin tasarımında PLA (Programmable Logic Array) ve FPGA gibi programlanabilir lojik yapılar yaygın olarak tercih edilir.\n" +
                                "\n" +
                                "Dijital mantık, bilgisayar işlemcileri, sayısal kontrol sistemleri, haberleşme protokolleri ve gömülü sistemler gibi geniş bir alanda temel taşlardan biridir.")
                    )
                ),
                SubCategory(
                    "Diyot",
                    listOf(
                        Topic("Diyot Temelleri", "Diyot, elektrik akımını yalnızca tek yönde ileten yarı iletken bir bileşendir. Temel yapısı, p-tipi (pozitif) ve n-tipi (negatif) yarı iletken malzemelerin birleşiminden oluşan PN bağlantısıdır. Bu bağlantı sayesinde diyotlar, doğru yönde (iletim yönü) akım geçirirken ters yönde (kesim yönü) akımı büyük ölçüde engeller.\n" +
                                "\n" +
                                "Diyotun temel çalışma prensibi, barrier (engel) potansiyeli olarak bilinen kavramla ilişkilidir. Silisyum diyotlarda bu potansiyel yaklaşık 0.7V, germanyum diyotlarda ise yaklaşık 0.3V civarındadır. Diyot, anot (+) ve katot (-) olmak üzere iki terminalden oluşur. Anot pozitif, katot negatif olduğunda diyot iletime geçer. Ters durumda ise diyot yalıtkan hale gelir.\n" +
                                "\n" +
                                "Diyotların en önemli parametrelerinden biri ters yönde dayanma gerilimi (V_R) ve maksimum iletim akımıdır (I_F). Eğer ters yönde uygulanan gerilim, diyotun dayanma sınırını aşarsa, çığ (avalanche) veya delinme (breakdown) etkisiyle bozulabilir. Bu yüzden devre tasarımında, diyotun çalışma voltajı dikkatlice seçilmelidir."),
                        Topic("Diyot Türleri", "Diyotlar kullanım alanlarına ve yapısal özelliklerine göre farklı türlere ayrılır:\n" +
                                "\n" +
                                "    Doğrultucu Diyotlar: Alternatif akımı (AC) doğru akıma (DC) çevirmek için kullanılır. Güç elektroniğinde yaygındır. Örnek: 1N4007\n" +
                                "    Zener Diyot: Belirli bir ters gerilimde iletime geçerek gerilim regülasyonu sağlar. Örnek: 5.1V Zener\n" +
                                "    LED (Işık Yayan Diyot): Elektrik akımını ışık enerjisine çevirir. Verimli ve düşük güç tüketimine sahiptir.\n" +
                                "    Fotodiyot: Işığa duyarlıdır, optik algılayıcılarda ve haberleşme sistemlerinde kullanılır.\n" +
                                "    Schottky Diyot: Düşük ileri gerilim düşümüne (yaklaşık 0.2V-0.3V) sahiptir ve yüksek hızlı anahtarlama gerektiren uygulamalarda kullanılır.\n" +
                                "    Varaktör Diyot (Kapasitif Diyot): Kapasitansı değiştirilebilen diyot türüdür, RF (radyo frekans) devrelerinde kullanılır.\n" +
                                "    Tünel Diyot: Negatif direnç özelliği gösterir ve yüksek frekanslı osilatörlerde kullanılır.\n" +
                                "\n" +
                                "Her diyot türü belirli bir uygulama için optimize edilmiştir. Örneğin, Schottky diyotlar hızlı anahtarlama gerektiren güç kaynaklarında, Zener diyotlar gerilim regülasyonunda, LED’ler ise aydınlatmada yaygın olarak kullanılır."),
                        Topic("Uygulamalar", "Diyot Uygulamaları\n" +
                                "\n" +
                                "Diyotların en yaygın kullanım alanlarından bazıları şunlardır:\n" +
                                "\n" +
                                "    Güç Kaynakları: Doğrultucu diyotlar, AC’yi DC’ye çevirmek için kullanılır. Tam dalga ve yarım dalga doğrultma devreleri en bilinen uygulamalardır.\n" +
                                "    Gerilim Regülasyonu: Zener diyotlar, sabit bir çıkış gerilimi sağlamak için kullanılır. Regülatör devrelerinde Zener Diyot + Seri Direnç kombinasyonu sık görülür.\n" +
                                "    Diyot Köprüleri: 4 adet diyottan oluşan köprü doğrultucu devresi, AC akımı tam dalga doğrultarak DC çıkış üretir.\n" +
                                "    Anahtarlama Devreleri: Schottky diyotlar düşük ileri gerilimleri sayesinde hızlı anahtarlama elemanı olarak tercih edilir.\n" +
                                "    LED Göstergeler: LED’ler, cihaz durum göstergeleri, aydınlatma ve ekran teknolojilerinde kullanılır.\n" +
                                "    Darbe Şekillendirme Devreleri: Diyotlar, sinyalleri belirli şekillere sokmak için kesme (clipping) ve sınırlandırma (clamping) devrelerinde kullanılır.\n" +
                                "    RF ve Haberleşme Uygulamaları: Varaktör diyotlar, frekans ayarlamalı osilatörlerde ve radyo devrelerinde kullanılır.\n" +
                                "\n" +
                                "Diyotlar, düşük maliyetli ve güvenilir bileşenler olmaları nedeniyle elektronik devrelerde yaygın olarak kullanılan temel elemanlardır."),
                        Topic("Devre Analizi", "Diyotlu Devre Analizleri\n" +
                                "\n" +
                                "Diyot içeren devreler analiz edilirken ideal ve gerçek modeller kullanılır. İdeal diyot modeli, diyotun yalnızca ileri yönde iletimde olduğunu ve ters yönde tamamen yalıtkan olduğunu varsayar. Gerçekte ise diyotun belirli bir ileri gerilim düşümü ve ters kaçak akımı vardır.\n" +
                                "1. Doğrultucu Devre Analizi\n" +
                                "\n" +
                                "    Yarım Dalga Doğrultucu: AC sinyalinin yalnızca pozitif yarısını geçirir. Çıkış voltajı Vrms = 0.45 * Vin\n" +
                                "    Tam Dalga Doğrultucu: AC sinyalinin hem pozitif hem negatif yarısını doğrultur. Çıkış voltajı Vrms = 0.9 * Vin\n" +
                                "\n" +
                                "2. Zener Diyot Regülatör Devresi\n" +
                                "\n" +
                                "    Çıkış Gerilimi: Vout = Vz (Zener Gerilimi)\n" +
                                "    Yük akımı: Iz + IL = Itoplam\n" +
                                "\n" +
                                "Zener diyot, seri dirençle birlikte bağlanarak sabit çıkış voltajı elde edilir.\n" +
                                "3. Kesme (Clipping) Devresi\n" +
                                "\n" +
                                "Diyot ve direnç kombinasyonlarıyla, sinyalin belirli seviyelerde kırpılması sağlanır. Örneğin, giriş sinyali belirli bir voltajın üzerine çıkarsa diyot iletime geçerek kesme yapar.\n" +
                                "4. Sınırlandırma (Clamping) Devresi\n" +
                                "\n" +
                                "Diyot ve kondansatör kombinasyonu kullanılarak DC ofset eklenir veya çıkartılır. Bu sayede AC sinyalinin belirli bir gerilim seviyesinde kaydırılması sağlanır.\n" +
                                "\n" +
                                "Diyotlu devre analizleri yapılırken, diyot ileri yön gerilim düşümü (0.7V veya 0.3V), ters akım kaçakları, tepki süresi gibi faktörler dikkate alınmalıdır.\n" +
                                "\n" +
                                "Diyotlar elektronik devrelerin en temel bileşenlerinden biri olup, doğru akım yönlendirme, sinyal işleme, güç dönüşümü gibi birçok alanda kritik roller üstlenir.")
                    )
                ),
                SubCategory(
                    "Mantık Kapısı",
                    listOf(
                        Topic("Temel Kapılar", "Temel Kapılar\n" +
                                "\n" +
                                "Temel kapılar, tüm dijital devrelerin oluşturulmasında kullanılan en basit mantık kapılarıdır.\n" +
                                "\n" +
                                "    VE (AND) Kapısı:\n" +
                                "    VE kapısı, tüm girişleri 1 olduğunda çıkışı 1, aksi halde 0 olan bir mantık kapısıdır. Boolean cebirinde \"A ve B\" işlemi, A çarpı B olarak gösterilir. Örneğin, A ve B girişleri 1 olduğunda çıkış 1 olur, ancak girişlerden biri bile 0 olursa çıkış da 0 olur.\n" +
                                "\n" +
                                "    VEYA (OR) Kapısı:\n" +
                                "    VEYA kapısı, en az bir girişin 1 olması durumunda çıkışı 1 yapan bir kapıdır. Eğer tüm girişler 0 ise, çıkış da 0 olur. Boolean cebirinde \"A veya B\" işlemi, A artı B şeklinde ifade edilir. Örneğin, A veya B girişlerinden biri bile 1 olduğunda çıkış 1 olur.\n" +
                                "\n" +
                                "    DEĞİL (NOT) Kapısı:\n" +
                                "    NOT kapısı, tek girişli bir kapıdır ve girişin tersini çıkışa gönderir. Eğer giriş 1 ise çıkış 0 olur, giriş 0 ise çıkış 1 olur. Boolean cebirinde \"A'nın tersi\" olarak gösterilir.\n" +
                                "\n" +
                                "Bu üç temel kapı, tüm dijital devrelerin yapı taşıdır ve daha karmaşık mantık devrelerinin oluşturulmasında kullanılır."),

                        Topic("Evrensel Kapılar", "Evrensel Kapılar\n" +
                                "\n" +
                                "Evrensel kapılar, diğer tüm mantık kapılarını oluşturmak için kullanılabilen özel kapılardır. Bu kapılar sayesinde dijital devreler, daha az bileşen kullanılarak tasarlanabilir.\n" +
                                "\n" +
                                "    NAND Kapısı (VE DEĞİL):\n" +
                                "    NAND kapısı, VE kapısının sonucunu tersine çeviren bir kapıdır. Yani, VE kapısında çıkışın 1 olduğu durumda NAND kapısı 0 üretir; diğer tüm durumlarda çıkış 1 olur. Örneğin, A ve B girişleri 1 olduğunda NAND çıkışı 0’dır, ancak girişlerden biri bile 0 olduğunda çıkış 1 olur. NAND kapısı, tüm diğer mantık kapılarını oluşturmak için kullanılabilir.\n" +
                                "\n" +
                                "    NOR Kapısı (VEYA DEĞİL):\n" +
                                "    NOR kapısı, VEYA kapısının sonucunu tersine çeviren bir kapıdır. VEYA kapısında çıkışın 1 olduğu durumda NOR kapısı 0 üretir; diğer tüm durumlarda çıkış 1 olur. Örneğin, A ve B girişleri 0 olduğunda NOR çıkışı 1 olur, ancak girişlerden biri bile 1 olduğunda çıkış 0 olur. NOR kapısı da tıpkı NAND kapısı gibi diğer tüm kapıları oluşturmak için kullanılabilir.\n" +
                                "\n" +
                                "NAND ve NOR kapıları, herhangi bir dijital devrenin tamamen bu kapılarla tasarlanabilmesini sağladığı için evrensel kapılar olarak adlandırılır. Özellikle mikroişlemcilerde ve dijital kontrol devrelerinde bu kapılar sıkça kullanılır."),

                        Topic("Kombinasyonel Devreler", "Kombinasyonel Devreler\n" +
                                "\n" +
                                "Kombinasyonel devreler, çıkışlarının yalnızca mevcut girişlere bağlı olduğu devrelerdir. Bellek elemanı içermezler, yani önceki durumlarını hatırlamazlar. Örnekler:\n" +
                                "\n" +
                                "    Toplayıcı (Adder) Devreler:\n" +
                                "        Yarım toplayıcı (Half Adder): 2 bitlik sayıları toplar.\n" +
                                "        Tam toplayıcı (Full Adder): Önceki basamaktan gelen taşıma (Carry) girişini de hesaba katar.\n" +
                                "\n" +
                                "    Çıkartıcı (Subtractor) Devreler:\n" +
                                "        Yarım çıkartıcı: İki sayıyı çıkartır.\n" +
                                "        Tam çıkartıcı: Önceki basamaktan gelen borç (Borrow) değerini de dikkate alır.\n" +
                                "\n" +
                                "    Kod Çözücüler (Decoders):\n" +
                                "        Girişteki ikili sayıyı belirli bir hat çıkışına çevirir.\n" +
                                "\n" +
                                "    Kodlayıcılar (Encoders):\n" +
                                "        Belirli bir giriş kombinasyonunu ikili kod haline getirir.\n" +
                                "\n" +
                                "    Multiplexer (MUX):\n" +
                                "        Çoklu girişleri tek bir çıkışa yönlendiren devre.\n" +
                                "\n" +
                                "    Demultiplexer (DEMUX):\n" +
                                "        Tek girişten çoklu çıkışa yönlendirme yapar.\n" +
                                "\n" +
                                "Kombinasyonel devrelerin çıkışı, yalnızca mevcut girişlere bağlıdır ve zamanla değişmez."),

                        Topic("Ardışık Devreler", "Ardışık Devreler\n" +
                                "\n" +
                                "Ardışık devreler, kombinasyonel devrelerden farklı olarak bellek içerir ve önceki giriş durumlarını hatırlar. Yani çıkış, sadece mevcut girişlerden değil, geçmiş girişlerden de etkilenir.\n" +
                                "\n" +
                                "    Flip-Flop'lar:\n" +
                                "        RS Flip-Flop: Set ve Reset girişleriyle çalışır.\n" +
                                "        JK Flip-Flop: RS Flip-Flop'un geliştirilmiş versiyonudur.\n" +
                                "        D Flip-Flop: Tek girişli ve saatsiz çalışabilir.\n" +
                                "        T Flip-Flop: Toggle mantığıyla çalışır.\n" +
                                "\n" +
                                "    Sayıcılar (Counters):\n" +
                                "        Asenkron Sayıcılar: Birbiri ardına tetiklenen Flip-Flop'lardan oluşur.\n" +
                                "        Senkron Sayıcılar: Tüm Flip-Flop'lar aynı anda tetiklenir.\n" +
                                "\n" +
                                "    Kaydediciler (Registers):\n" +
                                "        Verileri saklamak için kullanılır. Paralel ve Seri kaydediciler olmak üzere ikiye ayrılır.\n" +
                                "\n" +
                                "Ardışık devreler mikroişlemciler, bellek birimleri ve zamanlama devreleri gibi birçok dijital sistemde kullanılır.")
                    )
                )
            )
        ),
        MainCategory(
            "Kablolama",
            R.drawable.ic_wiring,
            listOf(
                SubCategory(
                    "Ev Kablolama",
                    listOf(
                        Topic("Temel Kablolama Kavramları", "Temel Kablolama Kavramları\n" +
                                "\n" +
                                "Ev kablolama, temelde elektrik akımının evdeki tüm cihazlara güvenli bir şekilde iletilmesini amaçlayan bir sistemdir. Elektrik hatları genellikle enerji iletimi, veri iletimi ve güç yönetimi gibi farklı amaçlar için kullanılır. Bu hatlar, kablolar, konnektörler, sigortalar ve prizler gibi çeşitli bileşenlerden oluşur. Ayrıca, topraklama, faz hatları ve nötr hatlar gibi temel kavramlar da ev elektrik tesisatında kritik öneme sahiptir.\n" +
                                "\n" +
                                "    Topraklama (Grounding): Elektriksel sistemin güvenliği için kritik olan topraklama, olası bir arıza durumunda elektrik akımının güvenli bir şekilde toprağa iletilmesini sağlar.\n" +
                                "    Faz Hattı: Elektrik akımını taşıyan ana hat olup genellikle siyah renk ile işaretlenir.\n" +
                                "    Nötr Hattı: Faz hattının karşıtı olarak, akımın dönüş yaptığı hattır ve genellikle beyaz renk ile işaretlenir.\n" +
                                "\n" +
                                "Ev kablolama sistemlerinin temelini bu kavramlar oluşturur."),
                        Topic("Devre Planlama", "Ev kablolama sisteminde devre planlaması, enerjinin düzgün ve güvenli bir şekilde dağılmasını sağlamak için kritik bir adımdır. Planlama aşamasında, elektriksel yüklerin doğru bir şekilde dağıtılması, güvenlik önlemlerinin alınması ve gelecekteki genişlemeler için esneklik sağlanması önemlidir. Devre planlamasında dikkat edilmesi gereken birkaç önemli unsur şunlardır:\n" +
                                "\n" +
                                "    Yük Dağılımı: Her oda ve elektrikli cihazın ihtiyaç duyduğu enerji miktarı hesaplanmalıdır. Bu, devre sayısının belirlenmesinde ve kablo çaplarının seçilmesinde önemli rol oynar.\n" +
                                "    Aydınlatma ve Güç Prizleri: Aydınlatma sistemleri ve güç prizleri için ayrı devreler oluşturulması, olası arızaların sadece belirli alanları etkilemesini sağlar.\n" +
                                "    Sigorta Kullanımı: Devrelerin sigortalı olması, aşırı akım durumunda sistemin zarar görmesini engeller.\n" +
                                "\n" +
                                "Devre planlaması yaparken, evin her bir bölgesinin ihtiyacı olan elektrik yükünü doğru bir şekilde hesaplamak, güvenli ve verimli bir elektrik sistemi oluşturmanın temelidir."),
                        Topic("Kurulum Kılavuzları", "Kurulum Kılavuzları\n" +
                                "\n" +
                                "Evdeki elektrik tesisatını kurarken, kurulum kılavuzları her zaman dikkatlice takip edilmelidir. Bu kılavuzlar, hem güvenliği sağlamak hem de sistemin verimli çalışmasını garanti etmek için gereklidir. Elektrik tesisatı kurulumunda aşağıdaki adımlar takip edilmelidir:\n" +
                                "\n" +
                                "    Kabloların Doğru Yerden Geçirilmesi: Kablolar, mümkünse duvarların içinden veya tavan arasından geçirilmelidir. Bu, hem estetik hem de güvenlik açısından önemlidir.\n" +
                                "    Faz Hattı ve Nötr Hatlarının Ayrılması: Elektrik akımının düzenli bir şekilde iletilmesi için faz hattı ve nötr hattı doğru şekilde ayrılmalıdır.\n" +
                                "    Güç Kaynağına Bağlantılar: Tüm elektrikli cihazların doğru güç kaynağına bağlanması gerekir. Bu, her cihazın doğru akımda çalışmasını sağlar.\n" +
                                "\n" +
                                "Bu adımlar dikkatlice takip edilerek yapılan bir kurulum, hem güvenliği artırır hem de sistemin uzun ömürlü olmasını sağlar."),
                        Topic("Güvenlik Standartları", "\n" +
                                "Güvenlik Standartları\n" +
                                "\n" +
                                "Ev kablolama işlemi yapılırken, güvenlik standartlarına uymak son derece önemlidir. Elektriksel sistemlerdeki hatalar ciddi yangınlara, elektrik çarpmalarına veya cihaz hasarlarına yol açabilir. Bu nedenle, ulusal ve uluslararası güvenlik standartlarına uyulmalıdır.\n" +
                                "\n" +
                                "    IEC (Uluslararası Elektroteknik Komisyonu) Standartları: Dünya çapında elektriksel sistemler için geçerli olan standartlar, güvenliği artıran en iyi uygulamaları sunar.\n" +
                                "    NFPA 70 (National Electrical Code - NEC): ABD'deki ev elektrik tesisatları için belirlenmiş güvenlik kurallarını içerir.\n" +
                                "    Topraklama Gereklilikleri: Elektriksel arızalarda topraklama yapılarak, cihazlardan veya hatlardan kaçan akımların güvenli bir şekilde toprağa iletilmesi sağlanır.\n" +
                                "\n" +
                                "Evde elektrik tesisatı kurulumunda, bu güvenlik standartları titizlikle uygulanarak elektriksel kazaların önüne geçilebilir."),
                        Topic("Ev Devrelerinde Arıza Giderme", "Ev Devrelerinde Arıza Giderme\n" +
                                "\n" +
                                "Ev elektrik sistemlerinde zaman zaman arızalar meydana gelebilir. Bu tür arızalar genellikle prizler, anahtarlar, sigortalar veya kablolama hatalarından kaynaklanır. Arıza giderme işlemleri, sistemin doğru bir şekilde çalışmasını sağlamak için önemlidir.\n" +
                                "\n" +
                                "    Sigorta Kontrolü: Eğer bir devre çalışmıyorsa, ilk olarak sigortalar kontrol edilmelidir. Sigortalar, devreyi aşırı akıma karşı korur ve bu korumanın bozulması durumunda devre kapanır.\n" +
                                "    Kablo Bağlantıları: Kabloların bağlantı noktaları da kontrol edilmelidir. Gevşek bağlantılar, elektrik akımının düzgün iletilmemesine neden olabilir.\n" +
                                "    Topraklama: Kötü topraklama da elektriksel arızalara neden olabilir. Topraklama bağlantılarının düzgün olduğundan emin olunmalıdır.\n" +
                                "\n" +
                                "Arıza giderme işlemi sırasında, her zaman güvenlik önlemleri alınmalı ve gerektiğinde profesyonel yardım alınmalıdır."),
                        Topic("Elektrik Kodları ve Yönetmelikleri", "Elektrik Kodları ve Yönetmelikleri\n" +
                                "\n" +
                                "Ev kablolama sisteminin doğru şekilde kurulabilmesi için, yerel ve ulusal elektrik kodları ve yönetmeliklerine uyulması gerekir. Bu kodlar, güvenliği, verimliliği ve performansı garanti altına almak için oluşturulmuştur. Elektrik kodları, kablolamanın hangi standartlarda yapılması gerektiğini belirler ve sistemin uzun süre sorunsuz çalışmasını sağlar.\n" +
                                "\n" +
                                "    Ulusal Elektrik Kodu (NEC): ABD'deki tüm elektrik tesisatlarında uyulması gereken temel yönetmelikleri içerir.\n" +
                                "    Yerel Yönetmelikler: Ülke veya bölge bazında belirli kurallar olabilir, bu nedenle her yerel yönetmelik göz önünde bulundurulmalıdır.\n" +
                                "\n" +
                                "Elektrik kodlarına ve yönetmeliklerine uyum, güvenli, verimli ve yasal bir kablolama sistemi kurmanın temel şartıdır.")
                    )
                )
            )
        ),
        MainCategory(
            title = "Direnç Renk Kodları",
            icon = R.drawable.ic_resistance,
            subCategories = emptyList(),
            isImageCategory = true,
            imageResourceId = R.drawable.resistance_color_codes
        ),
        MainCategory(
            title = "Devre Bileşen Sembolleri",
            icon = R.drawable.ic_circuit_symbols,
            subCategories = emptyList(),
            isImageCategory = true,
            imageResourceId = R.drawable.elsoo
        )
    )
}