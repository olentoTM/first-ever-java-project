package saari;

import java.util.*;

public class saariProjekti {

	public static void main(String [] args) {
		
		Scanner lukija = new Scanner(System.in);
		
		int valinta;
		boolean vOsa1 = false;
		boolean fixed = false;
		
		//Pelin päävalikko. Pitää pelin käynnissä, kunnes pelaaja valitsee vaihtoehdon 4.
		do{
			
			System.out.println("SAARI - PÄÄVALIKKO");
			System.out.println("__________________" + "\n");
			System.out.println("1. Aloita Peli" + "\n" + "2. Ohjeet (Suositellaan uusille pelaajille!)" + "\n" + "3. Tietoa Pelistä" + "\n" + "4. Lopeta Peli");
			System.out.print("Syötä numero: ");
			valinta = lukija.nextInt();
			
			if(valinta == 1) {
				System.out.println("\n" + "Peli alkaa...");
				alku();
				boolean onOsa1 = scenario01(vOsa1);
				boolean boatFixed = scenario02(fixed, onOsa1);
				scenario03();
				scenario04();
				loppu(boatFixed);
			}
			else if(valinta == 2) {
				ohjeet();
			}
			else if(valinta == 3) {
				tietoa();
			}
			else if(valinta == 4) {
				System.out.println("\n" + "Lopetit pelin. Kiitos pelaamisesta!");
				break;
			}
			else {
				System.out.println("\n" + "Virheellinen numero." + "\n");
			}
			
		}while(valinta != 4);
	}
	
	public static void ohjeet(){
		
		//Ohjeet pelaajalle.
		
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("\n" + "OHJEET" + "\n" + "______");
		System.out.println("\n" + "Peliä pelataan kirjoittamalla toiminnot tekstikenttään kun peli kysyy niitä." + "\n" + "Lukemalla pystyy helposti selvittämään, mitä vaihtoehtoja sinulla on käytössäsi. Jotkin tärkeät asiat ja kiinnostksen kohteet ovat kirjoitettu ISOIN kirjaimin. Tämä ei kuitenkaan päde kaikkiin asioihin. Joskus joudut itse keksimään minkä asioiden kanssa voit tehdä jotain." + "\n" + "Tässä kuitenkin kaksi tärkeintä komentoa, jotka on hyvä pitää mielessä:" + "\n\n" + "- katso" + "\n" + "Tämä komento yksin saa sinut tarkkailemaan ympäristöäsi. Liittämällä jonkin kohteen tälle komennolle, voit myös tarkastella kohdetta tarkemmin (katso, katso paikkaa tai katso paikka)." + "\n\n" + "- mene" + "\n" + "Tämä komento nimensä mukaan saa sinut menemään johonkin paikkaan. Yhdistä tämä komento paikan nimen kanssa (mene paikkaan tai mene paikka)." + "\n\n" + "KOMENNOT TULLE KIRJOITTAA PIENIN KIRJAIMIN! Voit kirjoitta komennot joko oikeaoppisesti (esim. mene paikkaan) tai yhdistämällä sanat kieliopista välittämättä (esim. mene paikka)." + "\n" + "Jos komentosi palauttaa viestin \"Mitään ei tapahdu\" saatoit kirjoittaa komentosi väärin tai kirjoitit komennon jota ei ole peliin ohjelmoitu.");
		System.out.print("\n" +"Jatka syöttämällä mikä tahansa merkki: ");
		lukija.next();
		System.out.println();
		return;
	}
	
	public static void tietoa() {
		
		//Tässä hieman tietoa pelistä.
		
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("\n" + "TIETOA" + "\n" + "______");
		System.out.println("\n" + "SAARI on Java-pohjainen tekstiseikkailupeli, jonka on luonut Markus Jäntti." + "\n" + "Tämä peli on luotu projektina Laurea ammattikorkeakoulun \"Ohjelmoninnin perustaito\" -kurssia varten.");
		System.out.print("\n" + "Jatka syöttämällä mikä tahansa merkki: ");
		lukija.next();
		System.out.println();
		return;
	}
	
	public static void alku() {
		
		// Pelin alku.
		
		Scanner lukija = new Scanner(System.in);
		String valinta1 = "defval1";
		
		System.out.println("\n" + "Heräät. Korvissasi soi aaltojen lyönti ja naamasi on hautautunut syvästi hiekkaan. Päätäsi särkee kovasti. Vaatteesi ovat läpi märät." + "\n" + "Et näe mitään. Kannattaisi varmaan NOUSTA ylös.");
		
		while(!valinta1.equals("nouse")) {
			System.out.print("Mitä teet? ");
			valinta1 = lukija.next();
			
			if(valinta1.equals("nouse")) {
				break;
			}
			else {
				System.out.println("\n" + "Mitään ei tapahdu. Naamasi on yhä hiekassa. Et varmasti saa mitään aikaiseksi ennen kun NOUSET ylös.");
			}
		}
		return;
	}
	
	public static boolean scenario01(boolean vOsa1) {	
		
		// Ensimmäinen paikka: ranta
		
		Scanner lukija = new Scanner(System.in);
		String valinta2 = "defval2";
		
		System.out.println("\n" + "Nostat pääsi hiekasta ja nouset jaloillesi. Olet rannalla. Ympäristöstä päätellen jonkinlasien saaren rannalla." + "\n" + "Et tunne tätä paikkaa, etkä tiedä miten päädyit tänne.");
		
		while(!valinta2.equals("mene laiturille") || !valinta2.equals("mene laituri")) {
			System.out.print("Mitä teet? ");
			valinta2 = lukija.nextLine();
			
			if(valinta2.equals("katso")) {
				System.out.println("\n" + "Edessäsi on tiheä METSÄ. Et tiedä miksi, mutta jonkin siinä karmii sinua." + "\n" + "Ympärilläsi on pajon ROMUA. Ne ovat jonkinlaisen veneen jänteet." + "\n" + "Rannan päädyssä näyttäisi olevan pieni LAITURI.");
			}
			else if((valinta2.equals("katso romua") || valinta2.equals("katso romu")) && vOsa1 == false) {
				System.out.println("\n" + "Katsot romua. Tämä taisi joskus olla sinun veneesi. Omistitko sinä veneen? No, et ainakaan enään." + "\n" + "Romun seassa näyttäisi olevan jotain ehjiä osia. Veneen pirstaleet ovat sen verran kevyitä, että voisit varmaankin potkaista ne pois tieltä.");
			}
			else if ((valinta2.equals("potkaise romua") || valinta2.equals("potkaise romu")) && vOsa1 == false) {
				System.out.println("\n" + "Romun alta paljastuu muutama ehjä veneen osa, joita voisi vielä ehkä hyödyntää johonkin. Päätät varmuudeksi ottaa ne mukaan.");
				vOsa1 = true;
			}
			else if((valinta2.equals("katso romua") || valinta2.equals("katso romu")) && vOsa1 == true) {
				System.out.println("\n" + "Romukasassa ei ole enään mitään muuta kiinnostavaa.");
			}
			else if(valinta2.equals("katso laituria") || valinta2.equals("katso laituri")) {
				System.out.println("\n" + "Laituri on liian kaukana. On vaikea nähdä enempää nykyisestä paikastasi.");
			}
			else if(valinta2.equals("katso metsää") || valinta2.equals("katso metsä")) {
				System.out.println("\n" + "Metsä on aika tiheä. Se on tästä syystä myös yllättävän pimeä. On vaikea sanoa kuinka suuri se on. Todennäköisesti se peittää koko saaren." + "\n" + "Osa puista näyttäisi vahingoittuneilta. Syvemmällä metsässä osa puista on kaatunut.");
			}
			else if(valinta2.equals("mene metsään") || valinta2.equals("mene metsä")) {
				System.out.println("\n" + "Ehkä metsään vaeltaminen sokeasti ei ole niin hyvä idea.");
			}
			else if(valinta2.equals("mene laiturille") || valinta2.equals("mene laituri")) {
				break;
			}
			else {
				System.out.println("\n" + "Mitään ei tapahdu.");
			}
		}
		return vOsa1;
	}
	
	public static boolean scenario02(boolean fixed, boolean onOsa1) {
		
		// Toinen paikka: laituri
		
		Scanner lukija = new Scanner(System.in);
		String valinta3 = "defval3";
		boolean tools = false; //Onko pelaajalla työkalut
		boolean check1 = false; //Onko pelaaja varastossa
		
		System.out.println("\n" + "Kävelet vähän matkaa rantaa pitkin ja saavut venelaiturin luokse.");
		
		while(!valinta3.equals("mene polulle") || !valinta3.equals("mene polku")) {
			System.out.print("Mitä teet? ");
			valinta3 = lukija.nextLine();
			
			if(valinta3.equals("katso") && check1 == false) {
				System.out.println("\n" + "Edessäsi on venelaituri, jonka vieressä lojuu VENE. Laiturin vieressä näyttäisi olevan pieni VARASTO" + "\n" + "Laiturista pohjoiseen kulkee pieni POLKU metsän halki.");
			}
			else if(valinta3.equals("katso") && check1 == true) {
				System.out.println("\n" + "Varastossa on hyvin pieni ja sielä ei ole paljoa nähtävää. Edessäsi on metallinen laatikko pyödällä. Takansi on ovi, josta voit mennä takaisin ulos.");
			}
			else if((valinta3.equals("katso venettä") || valinta3.equals("katso vene")) && check1 == false && fixed == false) {
				System.out.println("\n" + "Vene on pieni moottorivene." + "\n" + "Sen pohjassa ja sivuissa on muutama reikä, jotka voisi mahdollisesti korjata oikeilla osilla ja työkaluilla. Siitä myös puuttuu perämoottori.");
			}
			else if((valinta3.equals("katso venettä") || valinta3.equals("katso vene")) && check1 == false && fixed == true) {
				System.out.println("\n" + "Vene on pieni moottorivene." + "\n" + "Vene on nyt korjattu, mutta siitä kuitenkin vielä puuttuu perämoottori.");
			}
			else if(valinta3.equals("korjaa vene") && check1 == false && (tools == false || onOsa1 == false)) {
				System.out.println("\n" + "Vene on pahasti vaurioitunut. Sen korjaaminen vaati osia sekä työkaluja, joita sinulla ei ole.");
			}
			else if(valinta3.equals("korjaa vene") && check1 == false && tools == true && onOsa1 == true && fixed == false) {
				System.out.println("\n" + "Hyödyntämällä löytämiäsi osia ja työkaluja saat veneen rikkinäisen pohjan korjattua. Veneestä kuitenkin vielä puuttuu välineet, joilla voisit ohjata sitä.");
				fixed = true;
			}
			else if(valinta3.equals("korjaa vene") && check1 == false && fixed == true) {
				System.out.println("\n" + "Vene on jo korjattu. Se vain vielä vaatii jotain, millä ohjata ja liikutta sitä. Olisi hyvä löytää melat tai moottori veneeseen.");
			}
			else if((valinta3.equals("katso varastoa") || valinta3.equals("katso varasto")) && check1 == false) {
				System.out.println("\n" + "Laiturin vieressä on pieni varasto. Varaston ovi on jäänyt auki.");
			}
			else if((valinta3.equals("mene varastoon") || valinta3.equals("mene varasto")) && check1 == false) {
				System.out.println("\n" + "Astut sisään pimeään varastoon. Varasto on täynnä pölyä ja hämähäkkien tekemiä verkkoja. Sen päädyssä lojuu vanha metallinen laatikko, joka on jätetty auki.");
				check1 = true; //Tämä tarkoittaa sitä, että pelaaja on nyt varastossa. Osa valinnoista poistetaan käytöstä tämän ajaksi.
			}
			else if (valinta3.equals("katso laatikkoa") || valinta3.equals("katso laatikko") && check1 == true && tools == false) {
				//Tämä tapahtuu vain jos 1. olet varastossa ja 2. sinulla ei vielä ole työkaluja.
				System.out.println("\n" + "Laatikossa on muutama työkalu. Näitä todennäköisesti käytetään veneiden kunnostamiseen ja ylläpitoon. Päätät ottaa nämä mukaasi varmuuden vuoksi. Ehkä niistä olisi jotain apua.");
				tools = true;
			}
			else if (valinta3.equals("katso laatikkoa") || valinta3.equals("katso laatikko") && check1 == true && tools == true) {
				System.out.println("\n" + "Laatikossa ei ole enään mitään muuta kiinnostavaa.");
			}
			else if(valinta3.equals("mene ulos") && check1 == true) {
				System.out.println("\n" + "Poistut varastosta takaisin laiturin luokse.");
				check1 = false; //Pelaaja poistuu varastosta.
			}
			else if((valinta3.equals("katso polkua") || valinta3.equals("katso polku")) && check1 == false) {
				System.out.println("\n" + "Tiheän metsän halki kulkee pieni polku. Se, mihin polku johtaa, ei ole näkyvissä." + "\n" + "Polun seuraaminen voisi olla hyvä idea. Ehkä voit löytää apua ja päästä takaisin kotiin nopeasti.");
			}
			else if((valinta3.equals("mene polulle") || valinta3.equals("mene polku")) && check1 == false) {
				break;
			}
			else {
				System.out.println("\n" + "Mitään ei tapahdu.");
			}
		}
		return fixed;
	}
	
	public static void scenario03() {
		
		// Kolmas paikka: mökki (ulkopuoli)
		
		Scanner lukija = new Scanner(System.in);
		String valinta4 = "defval4";
		boolean avain = false; //Onko pelaajalla avain
		boolean check1 = false; //Onko pelaaja katsonut puita
		boolean check2 = false; //Onko pelaaja katsonut kaarnapinoa
		int potku = 0; //Monta kertaa pelaaja on potkaissut ovea
		
		System.out.println("\n" + "Seuraat polkua metsän läpi ja saavut vanhan näköisen mökin luokse.");
		
		while(!valinta4.equals("avaa ovi") && avain != true || potku != 10) {
			System.out.print("Mitä teet? ");
			valinta4 = lukija.nextLine();
			
			if(valinta4.equals("avaa ovi") && avain == false) {
				System.out.println("\n" + "Yrität avata oven, mutta se tuntuisi olevan lukossa. Sinulla ei ole avainta sen avaamiseen.");
			}
			else if(valinta4.equals("avaa ovi") && avain == true) {
				break;
			}
			//Jos pelaaja toistaa "potkaise ovea" tai "potkaise ovi" komentoa 10 kertaa, ovi avautuu ja pelaaja pääsee jatkamaan.
			else if((valinta4.equals("potkaise ovea") || valinta4.equals("potkaise ovi")) && potku < 10) {
				System.out.println("\n" + "Potkaiset ovea.");
				potku++;
			}
			else if(potku == 10) {
				System.out.println("\n" + "Yhtäkkiä oven saranat pettävät ja ovi kaatuu edessäsi.");
				break;
			}
			else if(valinta4.equals("katso")) {
				System.out.println("\n" + "Edessäsi on mökki. On vaikea sanoa onko sisällä ketään, sillä IKKUNAT ovat laudoitetut. Mökin OVI on näyttäisi olevan huonossa kunnossa." + "\n" + "Ovea vastapäätä on rivi vahingoittuneita PUITA.");
			}
			else if(valinta4.equals("katso ovea") || valinta4.equals("katso ovi")) {
				System.out.println("\n" + "Ovi on hyvin huonossa kunnossa, mutta silti pystyssä. Sen pinta on täynnä naarmuja ja halkeamia. Joku tai jokin on yrittänyt murtautua sisään onnistumatta.");
			}
			else if(valinta4.equals("koputa ovea") || valinta4.equals("koputa ovi")) {
				System.out.println("\n" + "Koputat ovea ja odotat. Kukaan ei kuitenkaan vastaa koputukseen.");
			}
			else if(valinta4.equals("katso ikkunoita") || valinta4.equals("katso ikkuna")) {
				System.out.println("\n" + "Ikkunat ovat laudoitettu sisältä käsin. On hyvin epätodennäköistä, että pääsisit sisään tätä kautta.");
			}
			else if(valinta4.equals("katso puita") || valinta4.equals("katso puu")) {
				System.out.println("\n" + "Puiden pinnat ovat täynnä syviä naarmuja. Suuri määrä kaarnaa on irronnut niistä ja lojuu maassa puiden edessä.");
				check1 = true;
			}
			else if(valinta4.equals("katso kaarnaa") || valinta4.equals("katso kaarna") && check1 == true && avain == false) {
				System.out.println("\n" + "Suuri määrä kaarnaa on kasautunut vahingoittuneiden puiden alle. Katsot tarkemmin kasaa ja huomaat sen seassa olevan myös kankaan palasia sekä jotain kiiltävää metallia.");
				check2 = true;
			}
			else if(valinta4.equals("katso kaarnaa") || valinta4.equals("katso kaarna") && check1 == true && avain == true) {
				System.out.println("Kaarnakasassa ei ole enään mitään kiinnostavaa.");
			}
			else if((valinta4.equals("katso metallia") || valinta4.equals("katso metalli")) && avain == false && check2 == true) {
				System.out.println("\n" + "Kyykistyt kasan päälle ja nappaat maasta metallipalasen. Tämä palanen osittautuukin avaimeksi. Päätät ottaa sen mukaan.");
				avain = true;
			}
			else {
				System.out.println("\n" + "Mitään ei tapahdu.");
			}
		}
		return;
	}
	
	public static void scenario04() {
		
		//Neljäs paikka: mökki (sisäpuoli)
		
		Scanner lukija = new Scanner(System.in);
		String valinta5 = "defval5";
		boolean avain = false; //Onko pelaajalla avain
		boolean mHylly = false; //Onko pelaaja siirtänyt hyllyn
		int siirto = 0; //Hyllyn siirämiseen käytetyt kerrat
		boolean check1 = false; //Onko pelaaja alakerrassa vai yläkerrassa
		boolean srauta = false; //Onko pelaajalla sorkkarauta
		boolean lauta = false; //Onko lauta irroitettu
		
		System.out.println("\n" + "Astut sisään mökkiin ja näky on kuin katastrofin jäljiltä. Huonekaluja ja esineitä on levällään ympäri mökin olohuonetta ja rakennuksen pinnat ovat pahasti vaurioituneet. Ketään ei näyttäisi olevan paikalla.");
		
		while(!valinta5.equals("avaa ovi") || avain == false || mHylly == false) {
			System.out.print("Mitä teet? ");
			valinta5 = lukija.nextLine();
			
			//Olohuone
			if(valinta5.equals("katso") && check1 == false) {
				System.out.println("\n" + "Kaiken kaaoksen seasta silmääsi osuu muutama erikoinen asia. Olohuoneen päädyssä on OVI, jonka eteen on kaatunut suuri HYLLY." + "\n" + "Lattian puinen laudoitus on kärsinyt pahasti ja joidenkin lautojen välissä on huomattava RAKO." + "\n" + "Huoneen kulmasta löytyy PORTAAT.");
			}
			else if((valinta5.equals("katso ovea") || valinta5.equals("katso ovi")) && check1 == false) {
				System.out.println("\n" + "Toisin kuin mökin ulko-ovi, tämä ovi on tehty vahvasta metallista. Senkin ulkopuolella on vahingon jälkiä, mutta ovi on kestänyt paljon paremmin.");
			}
			else if(valinta5.equals("avaa ovi") && avain == false && mHylly == true && check1 == false) {
				System.out.println("\n" + "Ovi on lukossa eikä se aukea.");
			}
			else if(valinta5.equals("avaa ovi") && mHylly == false && check1 == false) {
				System.out.println("\n" + "Et saa ovea avattua ennen kun hylly on siirretty pois tieltä.");
			}
			else if(valinta5.equals("avaa ovi") && avain == true && mHylly == true && check1 == false) {
				break;
			}
			else if((valinta5.equals("potkaise ovea") || valinta5.equals("potkaise ovi")) && check1 == false) {
				System.out.println("\n" + "Potkaiset ovea, mutta mitään ei tapahdu. Tämä ovi ei kaadu potkimalla.");
			}
			else if((valinta5.equals("katso hyllyä") || valinta5.equals("katso hylly")) && check1 == false && mHylly == false) {
				System.out.println("\n" + "Hylly on suuri ja todennäköisesti hyvin painava. Pienellä vaivannäöllä sen voisi varmaan siirtä oven edestä.");
			}
			else if((valinta5.equals("siirrä hyllyä") || valinta5.equals("siirrä hylly")) && siirto < 4 && check1 == false) {
				System.out.println("\n" + "Työnnät hyllyä ja se saat siirrettyä sitä hieman.");
				siirto++;
			}
			else if((valinta5.equals("siirrä hyllyä") || valinta5.equals("siirrä hylly")) && siirto == 4 && check1 == false) {
				System.out.println("\n" + "Työnnät hyllyä viimeisen kerran ja nyt se on kokonaan pois oven tieltä.");
				mHylly = true;
			}
			else if((valinta5.equals("katso rakoa") || valinta5.equals("katso rako")) && check1 == false && avain == false) {
				System.out.println("\n" + "Keskellä lattiaa on huomattavan kokoinen rako. Sen sisällä on toinen avain.");
			}
			else if((valinta5.equals("katso avainta") || valinta5.equals("katso avain")) && check1 == false && avain == false) {
				System.out.println("\n" + "Avain on syvällä raon sisällä. Jos saisit irrotettua yhden laudan, voisi ehkä napata avaimen.");
			}
			else if(valinta5.equals("irrota lauta") && check1 == false && avain == false && srauta == false) {
				System.out.println("\n" + "Yrität irrottaa lattialautaa käsin, mutta se ei onnistu.");
			}
			else if(valinta5.equals("irrota lauta") && check1 == false && avain == false && srauta == true) {
				System.out.println("\n" + "Irrotat lattiasta yhden laudan ja näin saat poimittua avaimen raosta.");
				avain = true;
			}
			else if((valinta5.equals("katso portaita") || valinta5.equals("katso portaat")) && check1 == false) {
				System.out.println("\n" + "Portaat näyttäisivät vievän mökin ullakolle.");
			}
			else if((valinta5.equals("mene ullakolle") || valinta5.equals("mene ullakko")) && check1 == false) {
				System.out.println("\n" + "Nouset portaita pitkin ullakolle");
				check1 = true;
			}
			//Ullakko
			else if(valinta5.equals("katso") && check1 == true && srauta == false) {
				System.out.println("\n" + "Ullakko on yhtä sekavassa kunnossa kuin alakertakin. Satunnaista tavaraa on levällään joka paikassa. Ullakon seinässä on kiinni sorkkarauta. Takanasi on portaat, jotka vievät takaisin olohuoneeseen.");
			}
			else if(valinta5.equals("katso") && check1 == true && srauta == true) {
				System.out.println("\n" + "Ullakko on yhtä sekavassa kunnossa kuin alakertakin. Satunnaista tavaraa on levällään joka paikassa. Takanasi on portaat, jotka vievät takaisin olohuoneeseen.");
			}
			else if((valinta5.equals("katso sorkkarautaa") || valinta5.equals("katso sorkkarauta")) && check1 == true && srauta == false) {
				System.out.println("\n" + "Sorkkarauta on jotenkin päätynyt kiinni seinään. Pienellä ponnistuksella saat sorkkaraudan vedettyä irti seinästä.");
				srauta = true;
			}
			else if((valinta5.equals("mene olohuoneeseen") || valinta5.equals("mene olohuone")) && check1 == true) {
				System.out.println("\n" + "Astut portaita pitkin takaisin olohuoneeseen.");
				check1 = false;
			}
			else if((valinta5.equals("katso tavaraa") || valinta5.equals("katso tavara")) && check1 == true) {
				System.out.println("\n" + "Ullakolla on paljon pahvilaatikoita, joiden sisältö on levinnyt ympäri huonetta. Tavaroiden seassa on niin vaatteita, huonekaluja kuin astioitakin. Ei kuitakaan mitään, mistä olisi jotain hyötyä sinulle.");
			}
			else {
				System.out.println("\n" + "Mitään ei tapahdu.");
			}
		}
	}
	
	public static void loppu(boolean boatFixed) {
		
		//Pelin loppu
		
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("\n" + "Astut ovesta sisään ja huomaat edessäsi portaat. Portaat vievät alas kellariin. Kellarissa on valot päällä, joten näkeminen ei tuota ongelmia." + "\n" + "Astuessasi alas kellariin huomaat portaiden oikealla puolella suuren määrän laatikoita. Ne vievät noin puolet kellarin tilasta ja rajoittavat pääsyä takaseinälle. Jostain niiden takaa lähtee kamala haju, joka valtaa koko tilan." + "\n" + "portaita vastapäätä kellarin nurkassa lojuu vanha veneen perämoottori. Se ei ole kaikkein upeimmassa kunnossa, mutta se voisi toimia. Päätät raahata perämoottorin takaisin laiturille." + "\n" + "Astuessasi ulos mökistä kuulet hyvin voimakkaan ja epätavallisen huudon. Se ei ole ihmisen eikä minkään tuntemasi eläimen huuto. Se saa sinut kuitenkin säikähtämään ja alat raahaamaan perämoottoria nopeampaan tahtiin. Joku tai jokin jahtaa sinua.");
		
		//Kaksi mahdollista loppua. Riippuu siitä, korjasiko pelaaja veneen vai ei.
		if(boatFixed == true) {
			System.out.println("\n" + "Saavut laiturin luokse. Aikaa ei ole hukattavana joten asetat perämoottorin äkkiä veneseen ja hyppäät kyyttin. Katsot hetkeksi metsää kohti. Et näe mitään, mutta jostain syystä voit tuntea jonkin lähestyvän sinua." + "\n" + "Vedät henkeä. Et edes tiedä toimiiko moottori vai ei. Yrität käynnistää moottorin, mutta se ei onnistu. Jotain ääntä se kuitenkin piti. Yrität vielä kerran ja moottori lähtee käyntiin. Nopealla vauhdilla veneesi lähtee liikkeelle ja vain sekuntien päästä saari on kaukana takanasi.");
		}
		else{
			System.out.println("\n" + "Saavut laiturin luokse ja löydät veneen. Huomaat kuitenkin, että veneen pojassa on reikiä, etkä voi käyttää venettä pakenemiseen. Katsot kohti merta ja sitten taaksesi kohti metsää. Et näe mitään, mutta jostain syystä voit tuntea jonkin lähestyvän sinua. Lähin ranta on varmaan aika kaukana. Päätät kuitenkin yrittää uida pois saarelta." + "\n" + "Uit muutaman tunnin, mutta jostain syystä et vielä näe rantaa. Katsot taaksesi, etkä edes näe saarta. Vaaran hävitessä kehosi alkaa väsyä. Yrität jatkaa eteenpäin, mutta jokainen veto on edellistä raskaampi. Jatkat vielä vähän matkaa, kunnes yhtäkkiä kehosi päättää luovuttaa. Menetät tajuntasi.");
		}
		
		System.out.print("\n" + "Peli on päättynyt. Syötä mikä tahansa merkki palataksesi päävalikkoon. ");
		lukija.next();
		System.out.println();
		return;
	}
}
