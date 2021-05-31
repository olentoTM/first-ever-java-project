package saari;

import java.util.*;

public class saariProjekti {

	public static void main(String [] args) {
		
		Scanner lukija = new Scanner(System.in);
		
		int valinta;
		boolean vOsa1 = false;
		boolean fixed = false;
		
		//Pelin p��valikko. Pit�� pelin k�ynniss�, kunnes pelaaja valitsee vaihtoehdon 4.
		do{
			
			System.out.println("SAARI - P��VALIKKO");
			System.out.println("__________________" + "\n");
			System.out.println("1. Aloita Peli" + "\n" + "2. Ohjeet (Suositellaan uusille pelaajille!)" + "\n" + "3. Tietoa Pelist�" + "\n" + "4. Lopeta Peli");
			System.out.print("Sy�t� numero: ");
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
		System.out.println("\n" + "Peli� pelataan kirjoittamalla toiminnot tekstikentt��n kun peli kysyy niit�." + "\n" + "Lukemalla pystyy helposti selvitt�m��n, mit� vaihtoehtoja sinulla on k�yt�ss�si. Jotkin t�rke�t asiat ja kiinnostksen kohteet ovat kirjoitettu ISOIN kirjaimin. T�m� ei kuitenkaan p�de kaikkiin asioihin. Joskus joudut itse keksim��n mink� asioiden kanssa voit tehd� jotain." + "\n" + "T�ss� kuitenkin kaksi t�rkeint� komentoa, jotka on hyv� pit�� mieless�:" + "\n\n" + "- katso" + "\n" + "T�m� komento yksin saa sinut tarkkailemaan ymp�rist��si. Liitt�m�ll� jonkin kohteen t�lle komennolle, voit my�s tarkastella kohdetta tarkemmin (katso, katso paikkaa tai katso paikka)." + "\n\n" + "- mene" + "\n" + "T�m� komento nimens� mukaan saa sinut menem��n johonkin paikkaan. Yhdist� t�m� komento paikan nimen kanssa (mene paikkaan tai mene paikka)." + "\n\n" + "KOMENNOT TULLE KIRJOITTAA PIENIN KIRJAIMIN! Voit kirjoitta komennot joko oikeaoppisesti (esim. mene paikkaan) tai yhdist�m�ll� sanat kieliopista v�litt�m�tt� (esim. mene paikka)." + "\n" + "Jos komentosi palauttaa viestin \"Mit��n ei tapahdu\" saatoit kirjoittaa komentosi v��rin tai kirjoitit komennon jota ei ole peliin ohjelmoitu.");
		System.out.print("\n" +"Jatka sy�tt�m�ll� mik� tahansa merkki: ");
		lukija.next();
		System.out.println();
		return;
	}
	
	public static void tietoa() {
		
		//T�ss� hieman tietoa pelist�.
		
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("\n" + "TIETOA" + "\n" + "______");
		System.out.println("\n" + "SAARI on Java-pohjainen tekstiseikkailupeli, jonka on luonut Markus J�ntti." + "\n" + "T�m� peli on luotu projektina Laurea ammattikorkeakoulun \"Ohjelmoninnin perustaito\" -kurssia varten.");
		System.out.print("\n" + "Jatka sy�tt�m�ll� mik� tahansa merkki: ");
		lukija.next();
		System.out.println();
		return;
	}
	
	public static void alku() {
		
		// Pelin alku.
		
		Scanner lukija = new Scanner(System.in);
		String valinta1 = "defval1";
		
		System.out.println("\n" + "Her��t. Korvissasi soi aaltojen ly�nti ja naamasi on hautautunut syv�sti hiekkaan. P��t�si s�rkee kovasti. Vaatteesi ovat l�pi m�r�t." + "\n" + "Et n�e mit��n. Kannattaisi varmaan NOUSTA yl�s.");
		
		while(!valinta1.equals("nouse")) {
			System.out.print("Mit� teet? ");
			valinta1 = lukija.next();
			
			if(valinta1.equals("nouse")) {
				break;
			}
			else {
				System.out.println("\n" + "Mit��n ei tapahdu. Naamasi on yh� hiekassa. Et varmasti saa mit��n aikaiseksi ennen kun NOUSET yl�s.");
			}
		}
		return;
	}
	
	public static boolean scenario01(boolean vOsa1) {	
		
		// Ensimm�inen paikka: ranta
		
		Scanner lukija = new Scanner(System.in);
		String valinta2 = "defval2";
		
		System.out.println("\n" + "Nostat p��si hiekasta ja nouset jaloillesi. Olet rannalla. Ymp�rist�st� p��tellen jonkinlasien saaren rannalla." + "\n" + "Et tunne t�t� paikkaa, etk� tied� miten p��dyit t�nne.");
		
		while(!valinta2.equals("mene laiturille") || !valinta2.equals("mene laituri")) {
			System.out.print("Mit� teet? ");
			valinta2 = lukija.nextLine();
			
			if(valinta2.equals("katso")) {
				System.out.println("\n" + "Edess�si on tihe� METS�. Et tied� miksi, mutta jonkin siin� karmii sinua." + "\n" + "Ymp�rill�si on pajon ROMUA. Ne ovat jonkinlaisen veneen j�nteet." + "\n" + "Rannan p��dyss� n�ytt�isi olevan pieni LAITURI.");
			}
			else if((valinta2.equals("katso romua") || valinta2.equals("katso romu")) && vOsa1 == false) {
				System.out.println("\n" + "Katsot romua. T�m� taisi joskus olla sinun veneesi. Omistitko sin� veneen? No, et ainakaan en��n." + "\n" + "Romun seassa n�ytt�isi olevan jotain ehji� osia. Veneen pirstaleet ovat sen verran kevyit�, ett� voisit varmaankin potkaista ne pois tielt�.");
			}
			else if ((valinta2.equals("potkaise romua") || valinta2.equals("potkaise romu")) && vOsa1 == false) {
				System.out.println("\n" + "Romun alta paljastuu muutama ehj� veneen osa, joita voisi viel� ehk� hy�dynt�� johonkin. P��t�t varmuudeksi ottaa ne mukaan.");
				vOsa1 = true;
			}
			else if((valinta2.equals("katso romua") || valinta2.equals("katso romu")) && vOsa1 == true) {
				System.out.println("\n" + "Romukasassa ei ole en��n mit��n muuta kiinnostavaa.");
			}
			else if(valinta2.equals("katso laituria") || valinta2.equals("katso laituri")) {
				System.out.println("\n" + "Laituri on liian kaukana. On vaikea n�hd� enemp�� nykyisest� paikastasi.");
			}
			else if(valinta2.equals("katso mets��") || valinta2.equals("katso mets�")) {
				System.out.println("\n" + "Mets� on aika tihe�. Se on t�st� syyst� my�s yll�tt�v�n pime�. On vaikea sanoa kuinka suuri se on. Todenn�k�isesti se peitt�� koko saaren." + "\n" + "Osa puista n�ytt�isi vahingoittuneilta. Syvemm�ll� mets�ss� osa puista on kaatunut.");
			}
			else if(valinta2.equals("mene mets��n") || valinta2.equals("mene mets�")) {
				System.out.println("\n" + "Ehk� mets��n vaeltaminen sokeasti ei ole niin hyv� idea.");
			}
			else if(valinta2.equals("mene laiturille") || valinta2.equals("mene laituri")) {
				break;
			}
			else {
				System.out.println("\n" + "Mit��n ei tapahdu.");
			}
		}
		return vOsa1;
	}
	
	public static boolean scenario02(boolean fixed, boolean onOsa1) {
		
		// Toinen paikka: laituri
		
		Scanner lukija = new Scanner(System.in);
		String valinta3 = "defval3";
		boolean tools = false; //Onko pelaajalla ty�kalut
		boolean check1 = false; //Onko pelaaja varastossa
		
		System.out.println("\n" + "K�velet v�h�n matkaa rantaa pitkin ja saavut venelaiturin luokse.");
		
		while(!valinta3.equals("mene polulle") || !valinta3.equals("mene polku")) {
			System.out.print("Mit� teet? ");
			valinta3 = lukija.nextLine();
			
			if(valinta3.equals("katso") && check1 == false) {
				System.out.println("\n" + "Edess�si on venelaituri, jonka vieress� lojuu VENE. Laiturin vieress� n�ytt�isi olevan pieni VARASTO" + "\n" + "Laiturista pohjoiseen kulkee pieni POLKU mets�n halki.");
			}
			else if(valinta3.equals("katso") && check1 == true) {
				System.out.println("\n" + "Varastossa on hyvin pieni ja siel� ei ole paljoa n�ht�v��. Edess�si on metallinen laatikko py�d�ll�. Takansi on ovi, josta voit menn� takaisin ulos.");
			}
			else if((valinta3.equals("katso venett�") || valinta3.equals("katso vene")) && check1 == false && fixed == false) {
				System.out.println("\n" + "Vene on pieni moottorivene." + "\n" + "Sen pohjassa ja sivuissa on muutama reik�, jotka voisi mahdollisesti korjata oikeilla osilla ja ty�kaluilla. Siit� my�s puuttuu per�moottori.");
			}
			else if((valinta3.equals("katso venett�") || valinta3.equals("katso vene")) && check1 == false && fixed == true) {
				System.out.println("\n" + "Vene on pieni moottorivene." + "\n" + "Vene on nyt korjattu, mutta siit� kuitenkin viel� puuttuu per�moottori.");
			}
			else if(valinta3.equals("korjaa vene") && check1 == false && (tools == false || onOsa1 == false)) {
				System.out.println("\n" + "Vene on pahasti vaurioitunut. Sen korjaaminen vaati osia sek� ty�kaluja, joita sinulla ei ole.");
			}
			else if(valinta3.equals("korjaa vene") && check1 == false && tools == true && onOsa1 == true && fixed == false) {
				System.out.println("\n" + "Hy�dynt�m�ll� l�yt�mi�si osia ja ty�kaluja saat veneen rikkin�isen pohjan korjattua. Veneest� kuitenkin viel� puuttuu v�lineet, joilla voisit ohjata sit�.");
				fixed = true;
			}
			else if(valinta3.equals("korjaa vene") && check1 == false && fixed == true) {
				System.out.println("\n" + "Vene on jo korjattu. Se vain viel� vaatii jotain, mill� ohjata ja liikutta sit�. Olisi hyv� l�yt�� melat tai moottori veneeseen.");
			}
			else if((valinta3.equals("katso varastoa") || valinta3.equals("katso varasto")) && check1 == false) {
				System.out.println("\n" + "Laiturin vieress� on pieni varasto. Varaston ovi on j��nyt auki.");
			}
			else if((valinta3.equals("mene varastoon") || valinta3.equals("mene varasto")) && check1 == false) {
				System.out.println("\n" + "Astut sis��n pime��n varastoon. Varasto on t�ynn� p�ly� ja h�m�h�kkien tekemi� verkkoja. Sen p��dyss� lojuu vanha metallinen laatikko, joka on j�tetty auki.");
				check1 = true; //T�m� tarkoittaa sit�, ett� pelaaja on nyt varastossa. Osa valinnoista poistetaan k�yt�st� t�m�n ajaksi.
			}
			else if (valinta3.equals("katso laatikkoa") || valinta3.equals("katso laatikko") && check1 == true && tools == false) {
				//T�m� tapahtuu vain jos 1. olet varastossa ja 2. sinulla ei viel� ole ty�kaluja.
				System.out.println("\n" + "Laatikossa on muutama ty�kalu. N�it� todenn�k�isesti k�ytet��n veneiden kunnostamiseen ja yll�pitoon. P��t�t ottaa n�m� mukaasi varmuuden vuoksi. Ehk� niist� olisi jotain apua.");
				tools = true;
			}
			else if (valinta3.equals("katso laatikkoa") || valinta3.equals("katso laatikko") && check1 == true && tools == true) {
				System.out.println("\n" + "Laatikossa ei ole en��n mit��n muuta kiinnostavaa.");
			}
			else if(valinta3.equals("mene ulos") && check1 == true) {
				System.out.println("\n" + "Poistut varastosta takaisin laiturin luokse.");
				check1 = false; //Pelaaja poistuu varastosta.
			}
			else if((valinta3.equals("katso polkua") || valinta3.equals("katso polku")) && check1 == false) {
				System.out.println("\n" + "Tihe�n mets�n halki kulkee pieni polku. Se, mihin polku johtaa, ei ole n�kyviss�." + "\n" + "Polun seuraaminen voisi olla hyv� idea. Ehk� voit l�yt�� apua ja p��st� takaisin kotiin nopeasti.");
			}
			else if((valinta3.equals("mene polulle") || valinta3.equals("mene polku")) && check1 == false) {
				break;
			}
			else {
				System.out.println("\n" + "Mit��n ei tapahdu.");
			}
		}
		return fixed;
	}
	
	public static void scenario03() {
		
		// Kolmas paikka: m�kki (ulkopuoli)
		
		Scanner lukija = new Scanner(System.in);
		String valinta4 = "defval4";
		boolean avain = false; //Onko pelaajalla avain
		boolean check1 = false; //Onko pelaaja katsonut puita
		boolean check2 = false; //Onko pelaaja katsonut kaarnapinoa
		int potku = 0; //Monta kertaa pelaaja on potkaissut ovea
		
		System.out.println("\n" + "Seuraat polkua mets�n l�pi ja saavut vanhan n�k�isen m�kin luokse.");
		
		while(!valinta4.equals("avaa ovi") && avain != true || potku != 10) {
			System.out.print("Mit� teet? ");
			valinta4 = lukija.nextLine();
			
			if(valinta4.equals("avaa ovi") && avain == false) {
				System.out.println("\n" + "Yrit�t avata oven, mutta se tuntuisi olevan lukossa. Sinulla ei ole avainta sen avaamiseen.");
			}
			else if(valinta4.equals("avaa ovi") && avain == true) {
				break;
			}
			//Jos pelaaja toistaa "potkaise ovea" tai "potkaise ovi" komentoa 10 kertaa, ovi avautuu ja pelaaja p��see jatkamaan.
			else if((valinta4.equals("potkaise ovea") || valinta4.equals("potkaise ovi")) && potku < 10) {
				System.out.println("\n" + "Potkaiset ovea.");
				potku++;
			}
			else if(potku == 10) {
				System.out.println("\n" + "Yht�kki� oven saranat pett�v�t ja ovi kaatuu edess�si.");
				break;
			}
			else if(valinta4.equals("katso")) {
				System.out.println("\n" + "Edess�si on m�kki. On vaikea sanoa onko sis�ll� ket��n, sill� IKKUNAT ovat laudoitetut. M�kin OVI on n�ytt�isi olevan huonossa kunnossa." + "\n" + "Ovea vastap��t� on rivi vahingoittuneita PUITA.");
			}
			else if(valinta4.equals("katso ovea") || valinta4.equals("katso ovi")) {
				System.out.println("\n" + "Ovi on hyvin huonossa kunnossa, mutta silti pystyss�. Sen pinta on t�ynn� naarmuja ja halkeamia. Joku tai jokin on yritt�nyt murtautua sis��n onnistumatta.");
			}
			else if(valinta4.equals("koputa ovea") || valinta4.equals("koputa ovi")) {
				System.out.println("\n" + "Koputat ovea ja odotat. Kukaan ei kuitenkaan vastaa koputukseen.");
			}
			else if(valinta4.equals("katso ikkunoita") || valinta4.equals("katso ikkuna")) {
				System.out.println("\n" + "Ikkunat ovat laudoitettu sis�lt� k�sin. On hyvin ep�todenn�k�ist�, ett� p��sisit sis��n t�t� kautta.");
			}
			else if(valinta4.equals("katso puita") || valinta4.equals("katso puu")) {
				System.out.println("\n" + "Puiden pinnat ovat t�ynn� syvi� naarmuja. Suuri m��r� kaarnaa on irronnut niist� ja lojuu maassa puiden edess�.");
				check1 = true;
			}
			else if(valinta4.equals("katso kaarnaa") || valinta4.equals("katso kaarna") && check1 == true && avain == false) {
				System.out.println("\n" + "Suuri m��r� kaarnaa on kasautunut vahingoittuneiden puiden alle. Katsot tarkemmin kasaa ja huomaat sen seassa olevan my�s kankaan palasia sek� jotain kiilt�v�� metallia.");
				check2 = true;
			}
			else if(valinta4.equals("katso kaarnaa") || valinta4.equals("katso kaarna") && check1 == true && avain == true) {
				System.out.println("Kaarnakasassa ei ole en��n mit��n kiinnostavaa.");
			}
			else if((valinta4.equals("katso metallia") || valinta4.equals("katso metalli")) && avain == false && check2 == true) {
				System.out.println("\n" + "Kyykistyt kasan p��lle ja nappaat maasta metallipalasen. T�m� palanen osittautuukin avaimeksi. P��t�t ottaa sen mukaan.");
				avain = true;
			}
			else {
				System.out.println("\n" + "Mit��n ei tapahdu.");
			}
		}
		return;
	}
	
	public static void scenario04() {
		
		//Nelj�s paikka: m�kki (sis�puoli)
		
		Scanner lukija = new Scanner(System.in);
		String valinta5 = "defval5";
		boolean avain = false; //Onko pelaajalla avain
		boolean mHylly = false; //Onko pelaaja siirt�nyt hyllyn
		int siirto = 0; //Hyllyn siir�miseen k�ytetyt kerrat
		boolean check1 = false; //Onko pelaaja alakerrassa vai yl�kerrassa
		boolean srauta = false; //Onko pelaajalla sorkkarauta
		boolean lauta = false; //Onko lauta irroitettu
		
		System.out.println("\n" + "Astut sis��n m�kkiin ja n�ky on kuin katastrofin j�ljilt�. Huonekaluja ja esineit� on lev�ll��n ymp�ri m�kin olohuonetta ja rakennuksen pinnat ovat pahasti vaurioituneet. Ket��n ei n�ytt�isi olevan paikalla.");
		
		while(!valinta5.equals("avaa ovi") || avain == false || mHylly == false) {
			System.out.print("Mit� teet? ");
			valinta5 = lukija.nextLine();
			
			//Olohuone
			if(valinta5.equals("katso") && check1 == false) {
				System.out.println("\n" + "Kaiken kaaoksen seasta silm��si osuu muutama erikoinen asia. Olohuoneen p��dyss� on OVI, jonka eteen on kaatunut suuri HYLLY." + "\n" + "Lattian puinen laudoitus on k�rsinyt pahasti ja joidenkin lautojen v�liss� on huomattava RAKO." + "\n" + "Huoneen kulmasta l�ytyy PORTAAT.");
			}
			else if((valinta5.equals("katso ovea") || valinta5.equals("katso ovi")) && check1 == false) {
				System.out.println("\n" + "Toisin kuin m�kin ulko-ovi, t�m� ovi on tehty vahvasta metallista. Senkin ulkopuolella on vahingon j�lki�, mutta ovi on kest�nyt paljon paremmin.");
			}
			else if(valinta5.equals("avaa ovi") && avain == false && mHylly == true && check1 == false) {
				System.out.println("\n" + "Ovi on lukossa eik� se aukea.");
			}
			else if(valinta5.equals("avaa ovi") && mHylly == false && check1 == false) {
				System.out.println("\n" + "Et saa ovea avattua ennen kun hylly on siirretty pois tielt�.");
			}
			else if(valinta5.equals("avaa ovi") && avain == true && mHylly == true && check1 == false) {
				break;
			}
			else if((valinta5.equals("potkaise ovea") || valinta5.equals("potkaise ovi")) && check1 == false) {
				System.out.println("\n" + "Potkaiset ovea, mutta mit��n ei tapahdu. T�m� ovi ei kaadu potkimalla.");
			}
			else if((valinta5.equals("katso hylly�") || valinta5.equals("katso hylly")) && check1 == false && mHylly == false) {
				System.out.println("\n" + "Hylly on suuri ja todenn�k�isesti hyvin painava. Pienell� vaivann��ll� sen voisi varmaan siirt� oven edest�.");
			}
			else if((valinta5.equals("siirr� hylly�") || valinta5.equals("siirr� hylly")) && siirto < 4 && check1 == false) {
				System.out.println("\n" + "Ty�nn�t hylly� ja se saat siirretty� sit� hieman.");
				siirto++;
			}
			else if((valinta5.equals("siirr� hylly�") || valinta5.equals("siirr� hylly")) && siirto == 4 && check1 == false) {
				System.out.println("\n" + "Ty�nn�t hylly� viimeisen kerran ja nyt se on kokonaan pois oven tielt�.");
				mHylly = true;
			}
			else if((valinta5.equals("katso rakoa") || valinta5.equals("katso rako")) && check1 == false && avain == false) {
				System.out.println("\n" + "Keskell� lattiaa on huomattavan kokoinen rako. Sen sis�ll� on toinen avain.");
			}
			else if((valinta5.equals("katso avainta") || valinta5.equals("katso avain")) && check1 == false && avain == false) {
				System.out.println("\n" + "Avain on syv�ll� raon sis�ll�. Jos saisit irrotettua yhden laudan, voisi ehk� napata avaimen.");
			}
			else if(valinta5.equals("irrota lauta") && check1 == false && avain == false && srauta == false) {
				System.out.println("\n" + "Yrit�t irrottaa lattialautaa k�sin, mutta se ei onnistu.");
			}
			else if(valinta5.equals("irrota lauta") && check1 == false && avain == false && srauta == true) {
				System.out.println("\n" + "Irrotat lattiasta yhden laudan ja n�in saat poimittua avaimen raosta.");
				avain = true;
			}
			else if((valinta5.equals("katso portaita") || valinta5.equals("katso portaat")) && check1 == false) {
				System.out.println("\n" + "Portaat n�ytt�isiv�t viev�n m�kin ullakolle.");
			}
			else if((valinta5.equals("mene ullakolle") || valinta5.equals("mene ullakko")) && check1 == false) {
				System.out.println("\n" + "Nouset portaita pitkin ullakolle");
				check1 = true;
			}
			//Ullakko
			else if(valinta5.equals("katso") && check1 == true && srauta == false) {
				System.out.println("\n" + "Ullakko on yht� sekavassa kunnossa kuin alakertakin. Satunnaista tavaraa on lev�ll��n joka paikassa. Ullakon sein�ss� on kiinni sorkkarauta. Takanasi on portaat, jotka viev�t takaisin olohuoneeseen.");
			}
			else if(valinta5.equals("katso") && check1 == true && srauta == true) {
				System.out.println("\n" + "Ullakko on yht� sekavassa kunnossa kuin alakertakin. Satunnaista tavaraa on lev�ll��n joka paikassa. Takanasi on portaat, jotka viev�t takaisin olohuoneeseen.");
			}
			else if((valinta5.equals("katso sorkkarautaa") || valinta5.equals("katso sorkkarauta")) && check1 == true && srauta == false) {
				System.out.println("\n" + "Sorkkarauta on jotenkin p��tynyt kiinni sein��n. Pienell� ponnistuksella saat sorkkaraudan vedetty� irti sein�st�.");
				srauta = true;
			}
			else if((valinta5.equals("mene olohuoneeseen") || valinta5.equals("mene olohuone")) && check1 == true) {
				System.out.println("\n" + "Astut portaita pitkin takaisin olohuoneeseen.");
				check1 = false;
			}
			else if((valinta5.equals("katso tavaraa") || valinta5.equals("katso tavara")) && check1 == true) {
				System.out.println("\n" + "Ullakolla on paljon pahvilaatikoita, joiden sis�lt� on levinnyt ymp�ri huonetta. Tavaroiden seassa on niin vaatteita, huonekaluja kuin astioitakin. Ei kuitakaan mit��n, mist� olisi jotain hy�ty� sinulle.");
			}
			else {
				System.out.println("\n" + "Mit��n ei tapahdu.");
			}
		}
	}
	
	public static void loppu(boolean boatFixed) {
		
		//Pelin loppu
		
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("\n" + "Astut ovesta sis��n ja huomaat edess�si portaat. Portaat viev�t alas kellariin. Kellarissa on valot p��ll�, joten n�keminen ei tuota ongelmia." + "\n" + "Astuessasi alas kellariin huomaat portaiden oikealla puolella suuren m��r�n laatikoita. Ne viev�t noin puolet kellarin tilasta ja rajoittavat p��sy� takasein�lle. Jostain niiden takaa l�htee kamala haju, joka valtaa koko tilan." + "\n" + "portaita vastap��t� kellarin nurkassa lojuu vanha veneen per�moottori. Se ei ole kaikkein upeimmassa kunnossa, mutta se voisi toimia. P��t�t raahata per�moottorin takaisin laiturille." + "\n" + "Astuessasi ulos m�kist� kuulet hyvin voimakkaan ja ep�tavallisen huudon. Se ei ole ihmisen eik� mink��n tuntemasi el�imen huuto. Se saa sinut kuitenkin s�ik�ht�m��n ja alat raahaamaan per�moottoria nopeampaan tahtiin. Joku tai jokin jahtaa sinua.");
		
		//Kaksi mahdollista loppua. Riippuu siit�, korjasiko pelaaja veneen vai ei.
		if(boatFixed == true) {
			System.out.println("\n" + "Saavut laiturin luokse. Aikaa ei ole hukattavana joten asetat per�moottorin �kki� veneseen ja hypp��t kyyttin. Katsot hetkeksi mets�� kohti. Et n�e mit��n, mutta jostain syyst� voit tuntea jonkin l�hestyv�n sinua." + "\n" + "Ved�t henke�. Et edes tied� toimiiko moottori vai ei. Yrit�t k�ynnist�� moottorin, mutta se ei onnistu. Jotain ��nt� se kuitenkin piti. Yrit�t viel� kerran ja moottori l�htee k�yntiin. Nopealla vauhdilla veneesi l�htee liikkeelle ja vain sekuntien p��st� saari on kaukana takanasi.");
		}
		else{
			System.out.println("\n" + "Saavut laiturin luokse ja l�yd�t veneen. Huomaat kuitenkin, ett� veneen pojassa on reiki�, etk� voi k�ytt�� venett� pakenemiseen. Katsot kohti merta ja sitten taaksesi kohti mets��. Et n�e mit��n, mutta jostain syyst� voit tuntea jonkin l�hestyv�n sinua. L�hin ranta on varmaan aika kaukana. P��t�t kuitenkin yritt�� uida pois saarelta." + "\n" + "Uit muutaman tunnin, mutta jostain syyst� et viel� n�e rantaa. Katsot taaksesi, etk� edes n�e saarta. Vaaran h�vitess� kehosi alkaa v�sy�. Yrit�t jatkaa eteenp�in, mutta jokainen veto on edellist� raskaampi. Jatkat viel� v�h�n matkaa, kunnes yht�kki� kehosi p��tt�� luovuttaa. Menet�t tajuntasi.");
		}
		
		System.out.print("\n" + "Peli on p��ttynyt. Sy�t� mik� tahansa merkki palataksesi p��valikkoon. ");
		lukija.next();
		System.out.println();
		return;
	}
}
