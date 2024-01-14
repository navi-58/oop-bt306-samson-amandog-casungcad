import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class charModifier {
    public static void main(String[] args) {
        charModifier cm = new charModifier();
        defChar begin = cm.new defChar();
}

//9
interface charModReqMethods {
    public void charCreate();
    public void combatModifier();
    public void talentModifier();
}

//7
abstract class defCharFeatures {
    String name, faction, color;
    String subgroup, mem_type, partner;
    String orientum, attributes;
    int skill1, skill2, skillUlt, weapon1, weapon2;
    int age, scale, birthPlanet, form, alt1, alt2;
    boolean hasLicense, hasPartner, hasAlt2, hasGroup;

    //8.1
    abstract public void groupModifer(boolean hGr);
    abstract public void partnerModifer(boolean hPt);

}

//3  //6.1
class defChar extends defCharFeatures implements charModReqMethods {
    Scanner s = new Scanner(System.in);
    setGets sg = new setGets();
    choiceConversion cc = new choiceConversion();

    //2.1  //10.3
    displayBasicInfo dbi = new displayBasicInfo();
    displayBasicInfo dai = new displayAttributeInfo();
    displayBasicInfo dli = new displayLicenseInfo();
    displayBasicInfo dgi = new displayGroupInfo();
    displayBasicInfo dpi = new displayPartnerInfo();
    defChar() {
        System.out.print("\tThis is where you create your Transformer! Press Y to continue or N to exit.\n\tEnter your choice here: ");
        String choice = s.nextLine().toLowerCase();
        while(!choice.equals("y") && !choice.equals("n")) {
            System.out.print("\n\tI didn't quite get that. Please try again\n\tEnter your choice here: "); choice = s.nextLine(); }

        if (choice.equals("y")) {
        System.out.println("\n\t\tWelcome to Cybertron Office of Information\n\tTo start your journey, the EUMBA requires you answer the questions first.\n");
        charCreate(); }
        else if (choice.equals("n")) {
            System.out.println("\n\t\t\t\t[Status exit confirmed]\n");
            System.exit(0); }
        }
        public void charCreate() {
            boolean stop = false;

            //name
            while (true) {
                System.out.print("\tName: "); name = s.nextLine();
                Pattern p = Pattern.compile("^[a-zA-Z.]\s?");
                Matcher m = p.matcher(name);

                if (m.find() == true) { break; }
                else if (m.find() == false) {
                    System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tNames don't have numbers! Enter you name with english alphabets only.\n"); continue;
                }
            }

            while (!stop == true) {
                try { System.out.print("\n\tAge: "); age = s.nextInt();
                if (age < 1) {
                    System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tTime moves on, Scrapmetal! Enter positive numbers for your age."); continue;
                } else { break; } }
                catch (InputMismatchException e) { System.out.print("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly whole numbers are accepted in this question.\n"); s.next(); continue; }}
                stop = false; 
            while (!stop == true) {
                try { System.out.print("\n\tAre you a license holder? Enter 'true' or 'false' only.\n\tAnswer: "); hasLicense = s.nextBoolean(); }
                catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly 'true' and 'false' are accepted in this question.");  s.next(); continue; } stop = true; }
                stop = false;
            while (!stop == true) {
                try {System.out.print("\n\tAre you a Triple Changer? Enter 'true' or 'false only.\n\tAnswer: "); hasAlt2 = s.nextBoolean(); }
                catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly 'true' and 'false' are accepted in this question.");  s.next(); continue; } stop = true; }
                stop = false;
            while (!stop == true) {
                try { System.out.print("\n\tDo you happen to be in a subgroup? Enter 'true or 'false' only.\n\tAnswer: "); hasGroup = s.nextBoolean(); }
                catch (InputMismatchException e) { System.out.println("\t\t\t\t !! [Invalid Input] !!\n\t\t Only 'true' and 'false' are accepted in this question."); s.next(); continue; } stop = true; }
                stop = false;
            while (!stop == true) {
                try { System.out.print("\n\tDo you have a partner? Enter 'true or 'false' only.\n\tAnswer: "); hasPartner = s.nextBoolean(); }
                catch (InputMismatchException e) { System.out.println("\t\t\t\t !! [Invalid Input] !!\n\t\t Only 'true' and 'false' are accepted in this question."); s.next(); continue; } stop = true; }
                stop = false;


            while (true) {

                    //faction
                    System.out.println("\n\tFaction: ");
                    System.out.println("\t\t [ 1. Autobot | 2. Decepticon ]");
                    System.out.println("\n\t\t  Autobot - Led by Optimus Prime.\n\t\t  Decepticon - Led by Megatron.");
                    System.out.print("\n\t\t--------------------------------------------------\n\t\tYou are required to put your choice in full words.\n\n\t\tEnter your input here: ");
                        faction = s.next(); s.nextLine();
                        while (!faction.equalsIgnoreCase("autobot") && !faction.equalsIgnoreCase("decepticon")) {
                            System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  faction = s.nextLine(); }

                    //conjunx orientum
                    System.out.println("\n\tWhat is your Conjunx Orientum?");
                    System.out.println("\t\t [ 1. Eadum Endura | 2. Alius Endura ]");
                    System.out.println("\n\t\t - Conjunx Orientum describes your attraction with the types of robots.\n\t\t\t1. Eadum Endura - Attracted to someone from the same birth planet.\n\t\t\t2. Alius Endura - Attracted to someone from a different birth planet.");
                    System.out.print("\n\t\t--------------------------------------------------\n\t\tYou are required to put your answer without the word 'Endura'.\n\n\t\tEnter your input here: ");
                        orientum = s.next(); s.nextLine();
                        while (!orientum.equalsIgnoreCase("Eadum") && !orientum.equalsIgnoreCase("Alius")) {
                            System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: "); orientum = s.nextLine(); }

                    //attributes
                    System.out.println("\n\tAttrbutes: ");
                    System.out.println("\t\t [ CM - Compassionate | FBM - Fast Brain Module | SC - Short Circuited | R - Resilience ]");
                    System.out.println("\n\t\t  Compassionate - Has care for other sentient beings like animals and humans.\n\t\t  Fast Brain Module - Quick to think but slower with movements.\n\t\t  Short Circuited - May not be reliable in brainstorming but good with tasks.\n\t\t  Resilience - Slow in general but consistent to the power it holds for a lifetime.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYour choices are the capitalized letters above. Full words are not accepted.");
                        while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            attributes = s.nextLine();
                                while (!attributes.equalsIgnoreCase("cm") && !attributes.equalsIgnoreCase("fbm") && !attributes.equalsIgnoreCase("sc") && !attributes.equalsIgnoreCase("r")) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: "); attributes = s.nextLine(); }
                            } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly String inputs are accepted in this question.");  s.next(); continue; }
                            if (attributes.equalsIgnoreCase("cm") ^ attributes.equalsIgnoreCase("fbm") ^ attributes.equalsIgnoreCase("sc") ^ attributes.equalsIgnoreCase("r")) { break; }
                    }

                    //color
                    System.out.println("\n\tColor: ");
                    System.out.println("\t\t [ R - red | O - orange | Y - yellow | G - green | B - blue | I - indigo | V - violet ]");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYour choices are the capitalized letters above. Full words are not accepted.");
                        while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            color = s.nextLine();
                                while (!color.equalsIgnoreCase("r") && !color.equalsIgnoreCase("o") && !color.equalsIgnoreCase("y") && !color.equalsIgnoreCase("g") && !color.equalsIgnoreCase("b") && !color.equalsIgnoreCase("i") && !color.equalsIgnoreCase("v")) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: "); color = s.nextLine(); }
                            } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly String inputs are accepted in this question.");  s.next(); continue; }
                            if (color.equalsIgnoreCase("r") ^ color.equalsIgnoreCase("o") ^ color.equalsIgnoreCase("y") ^ color.equalsIgnoreCase("g") ^ color.equalsIgnoreCase("b") ^ color.equalsIgnoreCase("i") ^ color.equalsIgnoreCase("v")) { break; }
                    }

                    //birth planet
                    System.out.println("\n\tBirth Planet: ");
                    System.out.println("\t\t [ 1. Caminus | 2. Gigantion | 3. Eukaris | 4. Velocitron | 5. Junkion | 6. Cybertron ]");
                    System.out.println("\n\t\t  Caminus (5260 light years) - World of Camien swordsmen and cityspeakers.\n\t\t  Gigantion (137 light years)- World of monumental titans and architects.\n\t\t  Eukaris (54 light years) - Home of mechanimals and beastformers.\n\t\t  Velocitron (74809 light years) - Planet of Cybertronian Trading System and land of sports.\n\t\t  Junkion (9 light years) - Scrap metal land and waste disposal center\n\t\t  Cybertron (you are here) - Origin of Cybertronian race.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            birthPlanet = s.nextInt();
                                while (birthPlanet != 1 && birthPlanet != 2 && birthPlanet != 3 && birthPlanet != 4 && birthPlanet != 5 && birthPlanet != 6) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: "); birthPlanet = s.nextInt(); }
                            } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                            if (birthPlanet == 1 ^ birthPlanet == 2 ^ birthPlanet == 3 ^ birthPlanet == 4 ^ birthPlanet == 5 ^ birthPlanet == 6) { break; }
                    }
                    //form
                    System.out.println("\n\tBody Form: ");
                    System.out.println("\t\t[ 1. Humanoid | 2. Animaloid | 3. Anthropoid ]");
                    System.out.println("\n\t\t  Humanoid - robot mode resembles an organic human.\n\t\t  Animaloid - robot mode resembles an organic animal.\n\t\t  Anthropoid - robot mode resembles both organic human and animal.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            form = s.nextInt();
                                while (form != 1 && form != 2 && form != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");    form = s.nextInt(); }
                            } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                            if (form == 1 ^ form == 2 ^ form == 3) { break; }
                    }
                    //scale
                    System.out.println("\n\tSize: ");
                    System.out.println("\t\t[ 1. Core | 2. Voyager | 3. Titan ]");
                    System.out.println("\n\t\t  Core - Microscopic to humanly-sized scale.\n\t\t  Voyager - Average scale no taller than a three-story building.\n\t\t  Titan - Colossal scale like combiners, battle stations, city centers, and celestial bodies");
                    System.out.print("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            scale = s.nextInt();
                                while (scale != 1 && scale != 2 && scale != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");    scale = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (scale == 1 ^ scale == 2 ^ scale == 3) { break; }
                    }
                    //alt mode
                    System.out.println("\n\tAlt mode: ");
                    System.out.println("\t\t[ 1. Terra | 2. Hydro | 3. Aero | 4. Utility | 5. Mechanimal ]");
                    System.out.println("\n\t\t  Terra - moves on and below the ground with wheels and tracked treads.\n\t\t  Hydro - moves on and below a liquid surface.\n\t\t  Aero - moves through the atmosphere and beyond.\n\t\t  Utility - Mobile objects without locomotor contraptions.\n\t\t  Mechanimal - Moves with limbs and crawling abilities.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            alt1 = s.nextInt();
                                while (alt1 != 1 && alt1 != 2 && alt1 != 3 && alt1 != 4 && alt1 != 5) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");    alt1 = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (alt1 == 1 ^ alt1 == 2 ^ alt1 == 3 ^ alt1 == 4 ^ alt1 == 5) { break; }
                    }
                    //alt mode 2
                    if (hasAlt2 == true) {
                        System.out.println("\n\tAlt mode 2: ");
                        System.out.println("\t\t[ 1. Terra | 2. Hydro | 3. Aero | 4. Utility | 5. Mechanimal ]");
                        System.out.println("\n\t\t  Terra - moves on and below the ground with wheels and tracked treads.\n\t\t  Hydro - moves on and below a liquid surface.\n\t\t  Aero - moves through the atmosphere and beyond.\n\t\t  Utility - Mobile objects without locomotor contraptions.\n\t\t  Mechanimal - Moves with limbs and crawling abilities.");
                        System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                        while (true) {
                            try {
                                System.out.print("\n\n\t\tEnter your input here: ");
                                alt2 = s.nextInt();
                                while (alt2 != 1 && alt2 != 2 && alt2 != 3 && alt2 != 4 && alt2 != 5) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");    alt2 = s.nextInt(); }
                            } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                            if (alt2 == 1 ^ alt2 == 2 ^ alt2 == 3 ^ alt2 == 4 ^ alt2 == 5) { break; }
                        }
                    }
                    else { alt2 = 0; }

                    sg.setName(name.toUpperCase());
                    sg.setAge(age);
                    sg.setFaction(faction.toUpperCase());
                    sg.setColor(color.toUpperCase());
                    sg.setBirthPlanet(birthPlanet);
                    sg.setForm(form);
                    sg.setScale(scale);
                    sg.setAlt1(alt1);
                    sg.setHasAlt2(alt2, hasAlt2);
                    sg.setHasGroup(hasGroup);
                    sg.setHasPartner(hasPartner);
                    if (hasGroup == true) { groupModifer(setGets.getHasGroup()); } else { subgroup = "None"; mem_type = "None"; }
                    if (hasPartner == true) { partnerModifer(setGets.getHasPartner()); } else { partner = "None"; }
                    sg.setOrientum(orientum.toLowerCase());
                    sg.setAttributes(attributes.toUpperCase());
                    sg.setHasLicense(hasLicense);

                cc.convert(setGets.getBirthPlanet(), setGets.getAge(), setGets.getAttributes());
                cc.convert(setGets.getColor(), setGets.getForm(), setGets.getScale());
                cc.convert(setGets.getAlt1());
                cc.convert(setGets.getHasAlt2(), setGets.getAlt2());
                cc.convert(setGets.getColor());

                talentModifier();

                break;
            }
        }
        //8.2
        public void groupModifer(boolean hGr) {

            //subgroup
            System.out.println("\n\tSubgroup: "); s.nextLine();
            System.out.println("\t\t [ C - combiner | U - unit ]");
            System.out.println("\n\t\t  Combiner - A squad of cybertronians that merges into a one big super-transformer.\n\t\t  Unit - A team of cybertronians inside a faction.");
            System.out.println("\n\t\t--------------------------------------------------\n\t\tYour choices are the capitalized letters above. Full words are not accepted.");
                        while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            subgroup = s.nextLine();
                                while (!subgroup.equalsIgnoreCase("c") && !subgroup.equalsIgnoreCase("u")) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: "); subgroup = s.nextLine(); }
                            } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly String inputs are accepted in this question.");  s.next(); continue; }
                            if (subgroup.equalsIgnoreCase("c") ^ subgroup.equalsIgnoreCase("u")) { break; }
                    }
                 sg.setGroup(subgroup.toUpperCase());

            //mem_type
            System.out.println("\n\tMember type: ");
            System.out.println("\t\t [ L - leader | S - Second in command | P - partner ]");
            System.out.println("\n\t\t  Leader - the primary member of the group.\n\t\t  Second in command - the member after the leader in their ranks.\n\t\t  Partner - a normal member in the group.");
            System.out.println("\n\t\t--------------------------------------------------\n\t\tYour choices are the capitalized letters above. Full words are not accepted.");
                        while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            mem_type = s.nextLine();
                                while (!mem_type.equalsIgnoreCase("l") && !mem_type.equalsIgnoreCase("s") && !mem_type.equalsIgnoreCase("p")) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: "); mem_type = s.nextLine(); }
                            } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly String inputs are accepted in this question.");  s.next(); continue; }
                            if (mem_type.equalsIgnoreCase("l") ^ mem_type.equalsIgnoreCase("s") ^ mem_type.equalsIgnoreCase("p")) { break; }
                    }
                sg.setMemType(mem_type.toUpperCase());
                cc.convert(setGets.getHasGroup(), setGets.getGroup(), setGets.getMemType());
        }
        //8.3
        public void partnerModifer(boolean hPt) {

            //partner
            System.out.println("\n\tPartner: ");
            System.out.println("\t\t [ M - minicon | P - powermaster ]");
            System.out.println("\n\t\t  Minicon - powerful human-sized robots that joins you in battle.\n\t\t  Powermaster - human-sized transformers that combines with you to overcharge your power.");
            System.out.println("\n\t\t--------------------------------------------------\n\t\tYour choices are the capitalized letters above. Full words are not accepted.");
                        while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            partner = s.nextLine(); 
                                while (!partner.equalsIgnoreCase("m") && !partner.equalsIgnoreCase("p")) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: "); partner = s.nextLine(); }
                            } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly String inputs are accepted in this question.");  s.next(); continue; }
                            if (partner.equalsIgnoreCase("m") ^ partner.equalsIgnoreCase("p")) { break; }
                    }
                sg.setPartner(partner.toUpperCase());
                cc.convert(setGets.getHasPartner(), setGets.getAge(), setGets.getPartner());
        }
        public void talentModifier() {

            while (true) {
                //skill1
                System.out.println("\n\t1st role: ");
                System.out.println("\t\t[ 1. Warrior | 2. Technician | 3. Scout ]");
                System.out.println("\n\t\t  Warrior - Frontliner in battle.\n\t\t  Technician - Mechanics, hackers, and architects.\n\t\t  Scout - intel-gatherers and infiltrators");
                System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                while (true) {
                    try {
                        System.out.print("\n\t\tEnter your input here: ");
                        skill1 = s.nextInt();
                            while (skill1 != 1 && skill1 != 2 && skill1 != 3) {
                            System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");    skill1 = s.nextInt(); }
                    } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                    if (skill1 == 1 ^ skill1 == 2 ^ skill1 == 3) { break; }
                }
                //skill2
                System.out.println("\n\t2nd role: ");
                System.out.println("\t\t[ 1. Tactician | 2. Brawler | 3. Berserker ]");
                System.out.println("\n\t\t  Tactician - Able to lead and strategize.\n\t\t  Brawler - Fights along with law and justice with brute.\n\t\t  Berserker - Short-circuited war frenzies.");
                System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                while (true) {
                    try {
                        System.out.print("\n\t\tEnter your input here: ");
                        skill2 = s.nextInt();
                            while (skill2 != 1 && skill2 != 2 && skill2 != 3) {
                                System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");    skill2 = s.nextInt(); }
                    } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                    if (skill2 == 1 ^ skill2 == 2 ^ skill2 == 3) { break; }
                }
                sg.setSkill1(skill1);
                sg.setSkill2(skill2);

                //skillUlt
                System.out.println("\n\tSpecial Talent: ");
                if (setGets.getSkill1() == 1 && setGets.getSkill2() == 1) {
                    //Target Hotspot //Search & Destroy //Calling Reinforcements
                    sg.setUltKey(1);
                    System.out.println("\t\t[ 1. Target Hotspot | 2. Search & Destroy | 3. Calling Reinforcements ]");
                    System.out.println("\n\t\t  Target Hostspot - aims to an enemy and nearby allies will prioritize to attack the enemy.\n\t\t  Search & Destroy - Highlights all nearby enemies from crowd and walls.\n\t\t  Calling Reinforcements - summons aerial support that heals during a battle.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            skillUlt = s.nextInt();
                                while (skillUlt != 1 && skillUlt != 2 && skillUlt != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  skillUlt = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (skillUlt == 1 ^ skillUlt == 2 ^ skillUlt == 3) { break; }
                    }
                }
                else if (setGets.getSkill1() == 1 && setGets.getSkill2() == 2) {
                    //Self Defensor //Taste of Your Own Energon //Librium Justice
                    sg.setUltKey(2);
                    System.out.println("\t\t[ 1. Self-defensor | 2. Taste of Your Own Energon | 3. Librium Justice ]");
                    System.out.println("\n\t\t  Self-defensor - creates a shield around you.\n\t\t  Taste of Your Own Energon - imitates the overall damage of the enemy\n\t\t  Librium Justice - Pauses the enemy movement and deal small amounts of damage for a short time.");
                    System.out.print("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            skillUlt = s.nextInt();
                                while (skillUlt != 1 && skillUlt != 2 && skillUlt != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  skillUlt = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (skillUlt == 1 ^ skillUlt == 2 ^ skillUlt == 3) { break; }
                    }
                }
                else if(setGets.getSkill1() == 1 && setGets.getSkill2() == 3) {
                    //Final Blow //Overcharge //Energon Reloaded
                    sg.setUltKey(3);
                    System.out.println("\t\t[ 1. Final Blow | 2. Overcharge | 3. Energon Reloaded ]");
                    System.out.println("\n\t\t  Final Blow - kills the enemy instantly with basic skill sequence. \n\t\t  Overcharge - Overclocks your circuits that turns you into a bomb.\n\t\t  Energon Reloaded - Adds protection and health but decreases damage for a short time.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            skillUlt = s.nextInt();
                                while (skillUlt != 1 && skillUlt != 2 && skillUlt != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  skillUlt = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (skillUlt == 1 ^ skillUlt == 2 ^ skillUlt == 3) { break; }
                    }
                }
                else if(setGets.getSkill1() == 2 && setGets.getSkill2() == 1) {
                    //Match n' March //Inspire Hack //No Loose Screws
                    sg.setUltKey(4);
                    System.out.println("\t\t[ 1.Match n' March | 2. Inspire Hack | 3. No Loose Screws ]");
                    System.out.println("\n\t\t  Match n' March - creates 4 holograms of you for a short time.\n\t\t  Inspire Hack - turns enemy into an ally for a short time that deals damage to them.\n\t\t  No Loose Screws - All nearby allies get 25%-40% heal.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            skillUlt = s.nextInt();
                                while (skillUlt != 1 && skillUlt != 2 && skillUlt != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  skillUlt = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (skillUlt == 1 ^ skillUlt == 2 ^ skillUlt == 3) { break; }
                    }
                }
                else if(setGets.getSkill1() == 2 && setGets.getSkill2() == 2) {
                    //Doppelgangster //Point Blank //Push the Plug
                    sg.setUltKey(5);
                    System.out.println("\t\t[ 1. Doppelgangster | 2. Point Blank | 3. Push the Plug ]");
                    System.out.println("\n\t\t  Doppelgangster - creates a better hologram of you and heals yourself for a short time.\n\t\t  Pont Blank - cancels out enemy damage for a short time.\n\t\t  Push the Plug - Pauses enemy attacks and damages.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            skillUlt = s.nextInt();
                                while (skillUlt != 1 && skillUlt != 2 && skillUlt != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  skillUlt = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (skillUlt == 1 ^ skillUlt == 2 ^ skillUlt == 3) { break; }
                    }
                }
                else if (setGets.getSkill1() == 2 && setGets.getSkill2() == 3) {
                    //Negatiator //DDoS Attack //Troubleshoot
                    sg.setUltKey(6);
                    System.out.print("\t\t[ 1. Negotiator | 2. DDoS Attack | 3. Troubleshoot ]");
                    System.out.println("\n\t\t  Negotiator - Enemy's talent damage will inflict them (healing talent will turn into damage). \n\t\t  DDoS Attack - feeds enemy with intel traffic that deals fair amount of damage.\n\t\t  Troubleshoot - Fires ammo in random directions that deals large amount of damage when enemy gets hit.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            skillUlt = s.nextInt();
                                while (skillUlt != 1 && skillUlt != 2 && skillUlt != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  skillUlt = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (skillUlt == 1 ^ skillUlt == 2 ^ skillUlt == 3) { break; }
                    }
                }
                else if(setGets.getSkill1() == 3 && setGets.getSkill2() == 1) {
                    //Ratchet Replacement //Handy Toolbox //BFG Canopy
                    sg.setUltKey(7);
                    System.out.println("\t\t[ 1. Ratchet Replacement | 2. Handy Toolbox | 3. BFG Canopy ]");
                    System.out.println("\n\t\t  Ratchet Replacement - Heals ally brawlers, warriors, and technicians nearby.\n\t\t  Handy Toolbox - Summons minicons for support.\n\t\t  BFG Canopy - Summons an ally bot to act as a shield.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            skillUlt = s.nextInt();
                                while (skillUlt != 1 && skillUlt != 2 && skillUlt != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  skillUlt = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (skillUlt == 1 ^ skillUlt == 2 ^ skillUlt == 3) { break; }
                    }
                }
                else if(setGets.getSkill1() == 3 && setGets.getSkill2() == 2) {
                    //Reroute //Second Opinion //Sting Like A Bee
                    sg.setUltKey(8);
                    System.out.println("\t\t[ 1. Reroute | 2. Second Opinion | 3. Sting Like A Bee ]");
                    System.out.println("\n\t\t  Reroute - Finds a nearby empty area and teleports there. \n\t\t  Second Opinion - Your damage doubles when enemy attacks you for a short time.\n\t\t  Sting Like A Bee - Injects a virus to an enemy dealing a large amount of damage.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            skillUlt = s.nextInt();
                                while (skillUlt != 1 && skillUlt != 2 && skillUlt != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  skillUlt = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (skillUlt == 1 ^ skillUlt == 2 ^ skillUlt == 3) { break; }
                    }
                }
                else if(setGets.getSkill1() == 3 && setGets.getSkill2() == 3) {
                    //Red Optics //Tin Man //Swtiching Modes
                    sg.setUltKey(9);
                    System.out.println("\t\t[ 1. Red Optics | 2. Tin Man | 3. Switching Modes ]");
                    System.out.println("\n\t\t  Red Optics - Triples the damage of your next attack for a very short time.\n\t\t  Tin Man - Pauses all your movements and grants you large amount of heal for a short time. \n\t\t  Switching Modes - Changes your faction, turning enemies to allies for a fair amount of time.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            skillUlt = s.nextInt();
                                while (skillUlt != 1 && skillUlt != 2 && skillUlt != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  skillUlt = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (skillUlt == 1 ^ skillUlt == 2 ^ skillUlt == 3) { break; }
                    }
                }
                sg.setSkillUlt(skillUlt);

                //2.2 //10.2
                if (setGets.getLicense() == true) { combatModifier(); }
                else if (setGets.getLicense() == false) {
                    cc.convert(setGets.getSkill1(), setGets.getSkill2(), setGets.getSkillUlt(), setGets.getUltKey(), setGets.getWeapon1(), setGets.getWeapon2());
                    dbi.displayInfo();
                    dai.displayInfo();
                    dli.displayInfo();
                    dgi.displayInfo();
                    dpi.displayInfo(); }
                break;
            }
        }
        public void combatModifier() {

            //weapon1
            while (true) {
                System.out.println("\n\tPrimary Weapon: ");
                if (setGets.getSkill1() == 1) {
                    System.out.println("\t\t[ 1. Double-bladed Sword | 2. Gigablaster | 3. Megamace ]");
                    System.out.println("\n\t\t  Double-bladed Sword - A large melee weapon that cuts from front and the back.\n\t\t  Gigablaster - A large single-barrel energon cannon.\n\t\t  Megamace - An retractable energon mace.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            weapon1 = s.nextInt();
                                while (weapon1 != 1 && weapon1 != 2 && weapon1 != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  weapon1 = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (weapon1 == 1 ^ weapon1 == 2 ^ weapon1 == 3) { break; }
                    }
                }
                else if(setGets.getSkill1() == 2) {
                    System.out.println("\t\t[1. Photon Railgun | 2. Energon Gauntlet | 3. Techno-driller ]");
                    System.out.println("\n\t\t  Photon Railgun - Humungous electric rifle that reloads slower.\n\t\t  Energon Gaunlets - Mechanical punching gloves with static electricity.\n\t\t  Techno-driller - Lethal melee machine that grinds the enemies.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            weapon1 = s.nextInt();
                                while (weapon1 != 1 && weapon1 != 2 && weapon1 != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  weapon1 = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (weapon1 == 1 ^ weapon1 == 2 ^ weapon1 == 3) { break; }
                    }
                }
                else if(setGets.getSkill1() == 3) {
                    System.out.print("\t\t[ 1. Dual Fusion Rifle | 2. Plasma Sniper | 3. Mass-shifting Dagger ]");
                    System.out.println("\n\t\t  Dual Fusion Rifle - Dual-wielding automatic light machine guns with small magazines.\n\t\t  Plasma Sniper - Professional range weapon that deals big damage.\n\t\t  Mass-shifting Dagger - A knife that extends into a sword for a short time.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            weapon1 = s.nextInt();
                                while (weapon1 != 1 && weapon1 != 2 && weapon1 != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  weapon1 = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (weapon1 == 1 ^ weapon1 == 2 ^ weapon1 == 3) { break; }
                    }
                }

                //weapon2
                System.out.println("\n\tSecondary Weapon: ");
                if (setGets.getSkill2() == 1) {
                    System.out.print("\t\t[ 1. Excaliburn | 2. Quintessential Staff | 3. Star Saber ]");
                    System.out.println("\n\t\t  Excaliburn - Mighty sword that turns into a gun with flammable rounds.\n\t\t  Quitessential Staff - A powerful club that suits for a leader.\n\t\t  Star Saber - Energized sword with photons and plasma.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            weapon2 = s.nextInt();
                                while (weapon2 != 1 && weapon2 != 2 && weapon2 != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  weapon2 = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (weapon2 == 1 ^ weapon2 == 2 ^ weapon2 == 3) { break; }
                    }
                }
                else if(setGets.getSkill2() == 2) {
                    System.out.print("\t\t[ 1. Forging Hammer | 2. Paralizer | 3. Cybonic Cables ]");
                    System.out.println("\n\t\t  Forging Hammer - Two-faced heated osmium jawbreaker.\n\t\t  Paralizer - Retractable pairs of probe with spark plugs on their ends.\n\t\t  Cybonic Cables - Retractable grapple hook that sends cybonic virus.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            weapon2 = s.nextInt();
                                while (weapon2 != 1 && weapon2 != 2 && weapon2 != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  weapon2 = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (weapon2 == 1 ^ weapon2 == 2 ^ weapon2 == 3) { break; }
                    }
                }
                else if(setGets.getSkill2() == 3) {
                    System.out.print("\t\t[ 1. Scatter-shotgun | 2. Pulverizer | 3. Tracking Fusion Cannon ]");
                    System.out.println("\n\t\t  Scatter-shotgun - A single-barrel shotgun with explosive rounds. \n\t\t  Pulverizer - Large detachable pairs of arm the surely hits your enemies\n\t\t  Tracking Fusion Cannon - Rockets that follow enemies charged with immense damage.");
                    System.out.println("\n\t\t--------------------------------------------------\n\t\tYou can type your choice with the corresponding number.");
                    while (true) {
                        try {
                            System.out.print("\n\t\tEnter your input here: ");
                            weapon2 = s.nextInt();
                                while (weapon2 != 1 && weapon2 != 2 && weapon2 != 3) {
                                    System.out.print("\t\t!!Please only refer from the selection above.!!\n\t\tTry again: ");  weapon2 = s.nextInt(); }
                        } catch (InputMismatchException e) { System.out.println("\t\t\t\t!! [Invalid Input] !!\n\t\tOnly numerical inputs are accepted in this question.");  s.next(); continue; }
                        if (weapon2 == 1 ^ weapon2 == 2 ^ weapon2 == 3) { break; }
                    }
                }
                sg.setWeapon1(weapon1); sg.setWeapon2(weapon2);
            cc.convert(setGets.getSkill1(), setGets.getSkill2(), setGets.getSkillUlt(), setGets.getUltKey(), setGets.getWeapon1(), setGets.getWeapon2());
                dbi.displayInfo();
                dai.displayInfo();
                dli.displayInfo();
                dgi.displayInfo();
                dpi.displayInfo();
                break;
            }
        }



    }
}

class displayBasicInfo {

   //2.3
    public void displayInfo() {
        if(setGets.getHasAlt2() == true) {
                    System.out.println("\n\n\n\n\t" + setGets.getName() + ", A member of the " + setGets.getFaction() +" cause with the age of " + choiceConversion.getA() + " in Solar cybertronian years from " + choiceConversion.getBP() + ".");
                    System.out.println("\n\t Identifiable with his " + choiceConversion.getC() + " color, " + choiceConversion.getF() + " form, \n\t " + choiceConversion.getATM1() + " and " + choiceConversion.getATM2() + " alt mode, and measured to be fit in the " + choiceConversion.getSC() + " class of scales.");
                }
                else if (setGets.getHasAlt2() == false) { System.out.println("\n\n\n\n\t" + setGets.getName() + ", A member of the " + setGets.getFaction() +" cause with the age of " + choiceConversion.getA() + " in Solar cybertronian years from " + choiceConversion.getBP());
                    System.out.println("\n\t Identifiable with his " + choiceConversion.getC() + " color, " + choiceConversion.getF() + " form, \n\t " + choiceConversion.getATM1() + " alt mode, and measured to be fit in the " + choiceConversion.getSC() + " class of scales."); }
    }
}
//10.1 //6.2
class displayAttributeInfo extends displayBasicInfo {
    public void displayInfo() {
        System.out.println("\t This bot is listed to be " + setGets.getOrientum() + " endura and known to being/having a " + choiceConversion.getAtt() + ".");
    }
}
class displayLicenseInfo extends displayBasicInfo {
    public void displayInfo() {
        if(setGets.getLicense() == true) {
                    System.out.println("\n\tAs a license holder, " + setGets.getName() + " wields the " + choiceConversion.getWP1() + " and the " + choiceConversion.getWP2() + ".");
                    System.out.println("\tNOTICE: licensed bots are responsible for the ownership and usage of the weapons they wield.");
                    System.out.println("\n\t" + setGets.getName() + " also possesses the role of a " + choiceConversion.getSkl1() + " and a " + choiceConversion.getSkl2() + ".\n\tThe bot also has the talent known as \"" + choiceConversion.getSklU() + ".\"");
                }
                else if (setGets.getLicense() == false) {
                    System.out.println("\n\t" + setGets.getName() + " possesses the role of a " + choiceConversion.getSkl1() + " and a " + choiceConversion.getSkl2() + ".\n\tThe bot also has the talent known as \"" + choiceConversion.getSklU() + ".\"");
                }
    }
}
class displayGroupInfo extends displayBasicInfo {
    public void displayInfo() {
        if(setGets.getHasGroup() == true) {
                    System.out.println("\n\t" + setGets.getName() + " is a part of a " + choiceConversion.getSB() + ", in which he acts as a " + choiceConversion.getMT() + " of the group.");
                }
                else if (setGets.getHasGroup() == false) { System.out.println(""); }
    }
}
class displayPartnerInfo extends displayBasicInfo {
    public void displayInfo() {
        confirmInfo ci;
        if(setGets.getHasPartner() == true) {
                    System.out.println("\n\tAccording to the input, " + setGets.getName() + " has a " + choiceConversion.getP() + " partner.");
                    ci = new confirmInfo();
                }
                else if (setGets.getHasPartner() == false) {
                    ci = new confirmInfo();
                 }
    }
}
class confirmInfo {
        confirmInfo() {
        Scanner s = new Scanner(System.in);

            System.out.print("\n\n\n\t Do you wish to continue with these selections? Press 'Y' if yes and 'N' if not.\n\t");
            String choice = s.nextLine().toLowerCase();
            while (!choice.equals("y") && !choice.equals("n")) {
                System.out.print("\n\tI didn't quite get that. Please try again\n\tEnter your choice here: "); choice = s.nextLine();
            }
            if (choice.equals("n")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                charModifier.main(null); }
            else if (choice.equals("y")) {
                System.out.println("\n\n\n\t\t\tWelcome to Cybertron, the colonist planet of the Transformer race!");
                System.out.println("\t\t\t\tYou are now ready to continue your journey.\n\t\t\t\t\t   Have a safe travel!\n\n\n\n\n\n");
            }
    }
}

class setGets {

    private static int age, birthPlanet, form, alt1, alt2, scale, skill1, skill2, skillUlt, UltKey, weapon1, weapon2;
    private static String name, color, faction,subgroup, mem_type, orientum, attributes, partner;
    private static boolean hasAlt2, hasGroup, hasPartner, hasLicense;

    //4
    public void setHasLicense(boolean hasLicense) { this.hasLicense = hasLicense; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setFaction(String faction) { this.faction = faction; }
    public void setColor(String color) { this.color = color; }
    public void setBirthPlanet(int birthPlanet) { this.birthPlanet = birthPlanet; }
    public void setForm(int form) { this.form = form; }
    public void setScale(int scale) { this.scale = scale; }
    public void setAlt1(int alt1) { this.alt1 = alt1; }
    public void setHasAlt2(int alt2, boolean hasAlt2) { this.alt2 = alt2; this.hasAlt2 = hasAlt2; }
    public void setHasGroup(boolean hasGroup) { this.hasGroup = hasGroup; }
    public void setGroup(String subgroup) { this.subgroup = subgroup; }
    public void setMemType(String mem_type) { this.mem_type = mem_type; }
    public void setHasPartner(boolean hasPartner) { this.hasPartner = hasPartner; }
    public void setPartner(String partner) { this.partner = partner; }
    public void setSkill1(int skill1) { this.skill1 = skill1; }
    public void setSkill2(int skill2) { this.skill2 = skill2; }
    public void setSkillUlt(int skillUlt) { this.skillUlt = skillUlt; }
    public void setUltKey(int UltKey) { this.UltKey = UltKey; }
    public void setWeapon1(int weapon1) { this.weapon1 = weapon1; }
    public void setWeapon2(int weapon2) { this.weapon2 = weapon2; }
    public void setOrientum(String orientum) { this.orientum = orientum; }
    public void setAttributes(String attributes) { this.attributes = attributes; }

    //5
    public static boolean getLicense() { return hasLicense; }
    public static String getName() { return name; }
    public static int getAge() { return age; }
    public static String getFaction() { return faction; }
    public static String getColor() { return color; }
    public static int getBirthPlanet() { return birthPlanet; }
    public static int getForm() { return form; }
    public static int getScale() { return scale; }
    public static int getAlt1() { return alt1; }
    public static boolean getHasAlt2() { return hasAlt2; }
    public static int getAlt2() { return alt2; }
    public static boolean getHasGroup() { return hasGroup; }
    public static String getGroup() { return subgroup; }
    public static String getMemType() { return mem_type; }
    public static boolean getHasPartner() { return hasPartner; }
    public static String getPartner() { return partner; }
    public static int getSkill1() { return skill1; }
    public static int getSkill2() { return skill2; }
    public static int getSkillUlt() { return skillUlt; }
    public static int getUltKey() { return UltKey; }
    public static int getWeapon1() { return weapon1; }
    public static int getWeapon2() { return weapon2; }
    public static String getOrientum() { return orientum; }
    public static String getAttributes() { return attributes; }
}

class choiceConversion {

    private static String bp, f, sc, atm1, atm2, skl1, skl2, sklU, wp1, wp2, c, sb, mt, p, att;
    private static int a;

    //1
    public void convert(int birthPlanet, int age, String attributes) {
        if (birthPlanet == 1) { bp = "Caminus"; a = age + 5260; }
        else if (birthPlanet == 2) { bp = "Gigantion"; a = age + 137; }
        else if (birthPlanet == 3) { bp = "Eukaris"; a = age + 54; }
        else if (birthPlanet == 4) { bp = "Velocitron"; a = age + 74809; }
        else if (birthPlanet == 5) { bp = "Junkion"; a = age + 9; }
        else if (birthPlanet == 6) { bp = "Cybertron"; a = age; }

        if (attributes.equals("CM")) { att = "Compassionate"; }
        else if (attributes.equals("FBM")) { att = "Fast Brain Module"; }
        else if (attributes.equals("SC")) { att = "Short Circuited"; }
        else if (attributes.equals("R")) { att = "Resilient"; }
    }
    public void convert(String color, int form, int scale) {
        if (form == 1) { f = "Humanoid"; }
        else if (form == 2) { f = "Animaloid"; }
        else if (form == 3) { f = "Anthropoid"; }

        if (scale == 1) {sc = "Core"; }
        else if (scale == 2) { sc = "Voyager"; }
        else if (scale == 3) { sc = "Titan"; }
    }
    public void convert(int alt1) {
        if (alt1 == 1) { atm1 = "Terra"; }
        else if (alt1 == 2) { atm1 = "Hydro"; }
        else if (alt1 == 3) { atm1 = "Aero"; }
        else if (alt1 == 4) { atm1 = "Utility"; }
        else if (alt1 == 5) { atm1 = "Mechanimal"; }
    }
    public void convert(boolean hasAlt2, int alt2) {
        if (hasAlt2 = true) {
            if (alt2 == 1) { atm2 = "Terra"; }
            else if (alt2 == 2) { atm2 = "Hydro"; }
            else if (alt2 == 3) { atm2 = "Aero"; }
            else if (alt2 == 4) { atm2 = "Utility"; }
            else if (alt2 == 5) { atm2 = "Mechanimal"; }
        }
    }
    public void convert(int skill1, int skill2, int skillUlt, int UltKey, int weapon1, int weapon2) {
        if (skill1 == 1) { skl1 = "Warrior"; }
        else if (skill1 == 2) { skl1 = "Technician"; }
        else if (skill1 == 3) { skl1 = "Scout"; }

        if (skill2 == 1) { skl2 = "Tactician"; }
        else if (skill2 == 2) { skl2 = "Brawler"; }
        else if (skill2 == 3) { skl2 = "Demolisher"; }


        if (UltKey == 1 && skillUlt == 1) { sklU = "Target Hotspot"; }
        else if (UltKey == 1 && skillUlt == 2) { sklU = "Search & Destroy"; }
        else if (UltKey == 1 && skillUlt == 3) { sklU = "Calling Reinforcements"; }

        else if (UltKey == 2 && skillUlt == 1) { sklU = "Self-defensor"; }
        else if (UltKey == 2 && skillUlt == 2) { sklU = "Taste of Your Own Energon"; }
        else if (UltKey == 2 && skillUlt == 3) { sklU = "Librium Justice"; }

        else if (UltKey == 3 && skillUlt == 1) { sklU = "Final Blow"; }
        else if (UltKey == 3 && skillUlt == 2) { sklU = "Overcharge"; }
        else if (UltKey == 3 && skillUlt == 3) { sklU = "Energon Reloaded"; }

        else if (UltKey == 4 && skillUlt == 1) { sklU = "Match n' March"; }
        else if (UltKey == 4 && skillUlt == 2) { sklU = "Inspire Hack"; }
        else if (UltKey == 4 && skillUlt == 3) { sklU = "No Loose Screws"; }

        else if (UltKey == 5 && skillUlt == 1) { sklU = "Doppelgangster"; }
        else if (UltKey == 5 && skillUlt == 2) { sklU = "Point Blank"; }
        else if (UltKey == 5 && skillUlt == 3) { sklU = "Push the Plug"; }

        else if (UltKey == 6 && skillUlt == 1) { sklU = "Negotiator"; }
        else if (UltKey == 6 && skillUlt == 2) { sklU = "DDoS Attack"; }
        else if (UltKey == 6 && skillUlt == 3) { sklU = "Troubleshoot"; }

        else if (UltKey == 7 && skillUlt == 1) { sklU = "Ratchet Replacement"; }
        else if (UltKey == 7 && skillUlt == 2) { sklU = "Handy Toolbox"; }
        else if (UltKey == 7 && skillUlt == 3) { sklU = "BFG Canopy"; }

        else if (UltKey == 8 && skillUlt == 1) { sklU = "Reroute"; }
        else if (UltKey == 8 && skillUlt == 2) { sklU = "Second Opinion"; }
        else if (UltKey == 8 && skillUlt == 3) { sklU = "Sting Like A Bee"; }

        else if (UltKey == 9 && skillUlt == 1) { sklU = "Red Optics"; }
        else if (UltKey == 9 && skillUlt == 2) { sklU = "Tin Man"; }
        else if (UltKey == 9 && skillUlt == 3) { sklU = "Switching Modes"; }


        if (skill1 == 1) {
            if (weapon1 == 1) { wp1 = "Double-bladed Sword"; }
            else if (weapon1 == 2)  { wp1 = "Gigablaster"; }
            else if (weapon1 == 3) { wp1 = "Megamace"; }
        }
        else if (skill1 == 2) {
            if (weapon1 == 1) { wp1 = "Photon Railgun"; }
            else if (weapon1 == 2)  { wp1 = "Energon Gauntlet"; }
            else if (weapon1 == 3) { wp1 = "Techno-driller"; }
        }
        else if (skill1 == 3) {
            if (weapon1 == 1) { wp1 = "Dual Fusion Rifle"; }
            else if (weapon1 == 2)  { wp1 = "Plasma Rifle"; }
            else if (weapon1 == 3) { wp1 = "Mass-shifting Dagger"; }
        }

        if (skill2 == 1) {
            if (weapon2 == 1) { wp2 = "Excaliburn"; }
            else if (weapon2 == 2) { wp2 = "Quintessential Staff"; }
            else if (weapon2 == 3) { wp2 = "Star Saber"; }
        }
        else if (skill2 == 2) {
            if (weapon2 == 1) { wp2 = "Forging Hammer"; }
            else if (weapon2 == 2) { wp2 = "Paralizer"; }
            else if (weapon2 == 3) { wp2 = "Cybonic Cables"; }
        }
        else if (skill2 == 3) {
            if (weapon2 == 1) { wp2 = "Scatter-shotgun"; }
            else if (weapon2 == 2) { wp2 = "Pulverizer"; }
            else if (weapon2 == 3) { wp2 = "Tracking Fusion Cannon"; }
        }
    }
    public void convert(String color) {
        if (color.equals("R")) { c = "Red"; }
        else if (color.equals("O")) { c = "Orange"; }
        else if (color.equals("Y")) { c = "Yellow"; }
        else if (color.equals("G")) { c = "Green"; }
        else if (color.equals("B")) { c = "Blue"; }
        else if (color.equals("I")) { c = "Indigo"; }
        else if (color.equals("V")) { c = "Violet"; }
    }
    public void convert(boolean hGr, String subgroup, String mem_type) {
        if (subgroup.equals("C")) { sb = "Combiner"; }
        else if (subgroup.equals("U")) { sb = "Unit"; }

        if (mem_type.equals("L")) { mt = "Leader"; }
        else if (mem_type.equals("S")) { mt = "Second in command"; }
        else if (mem_type.equals("P")) { mt = "Partner"; }
    }
    public void convert(boolean hPr, int age, String partner) {
        if (partner.equals("M")) { p = "Minicon"; }
        else if (partner.equals("P")) { p = "Powermaster"; }
    }

    public static String getBP() { return bp; }
    public static int getA() { return a; }
    public static String getF() { return f; }
    public static String getSC() { return sc; }
    public static String getATM1() { return atm1; }
    public static String getATM2() { return atm2; }
    public static String getSkl1() { return skl1; }
    public static String getSkl2() { return skl2; }
    public static String getSklU() { return sklU; }
    public static String getWP1() { return wp1; }
    public static String getWP2() { return wp2; }
    public static String getC() { return c; }
    public static String getSB() { return sb; }
    public static String getMT() { return mt; }
    public static String getP() { return p; }
    public static String getAtt() { return att; }

}