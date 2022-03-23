package ChapterSix;



import java.util.Scanner;
public class Nokia3310 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean power = false;


        System.out.println("press 1 to powerOn nokia phone");
        int powerOn = userInput.nextInt();
        if (powerOn == 1) {
            power = true;
        }
        System.out.println(power);

        System.out.println("press 0 to open the menu dial log");
        int menukey = userInput.nextInt();
        if (menukey == 0) {

        }
            String menu = """
                    1-> Phone book
                    2-> Messages
                    3-> chat
                    4-> call register
                    5-> Tones
                    6-> Settings
                    7-> call divert
                    8-> Games
                    9-> calculator
                    10-> Reminder
                    11-> Clock
                    12-> profiles
                    13->SIM services
                    """;
            System.out.println(menu);
        System.out.println("Enter a number between 1 and four");
        int menuKey = userInput.nextInt();


        switch (menuKey){
            case 1:
                String phoneBook ="""
                    1->search phone book
                    2->Service nos.1
                    3->Add name
                    4->Erase
                    5->Edit
                    6->Assign tone
                    7->send b'card
                    8->Option
                    9->Speed dail
                    10->Voice tag
                 """;
                System.out.println(phoneBook);
                System.out.println("press a key between 1 - 10 to carry out phonebook function");
                int phoneBookKey = userInput.nextInt();
                switch (phoneBookKey) {
                    case 1:
                        System.out.println("search Phone book");
                        break;
                    case 2:
                        System.out.println("Service Nos.1");
                        break;
                    case 3:
                        System.out.println("Add name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("send b'card");
                        break;
                    case 8:
                        System.out.println("Option");
                        System.out.println("Enter a number between 1 and 2 to view option function");
                        int optionKey = userInput.nextInt();
                        if (optionKey == 1) {
                            System.out.println("Type of view");
                            break;
                        } else {
                            if (optionKey == 2) {
                                System.out.println("Memory status");
                                break;
                            }
                            break;
                        }

                    case 9:
                        System.out.println("Speed dails");
                        break;
                    case 10:
                        System.out.println("Voice tags");
                        break;

                }
                break;
            case 2:

                String messages = """
                        1->Write messages
                        2->Inbox
                        3->Outbox
                        4->Picture messages
                        5->Templates
                        6->smileys
                        7->Message settings
                        8->
                   
                        """;
                System.out.println(messages);
                System.out.println("Enter a number between 1 and 7 to carry out the message function");
                int messageKey = userInput.nextInt();
                switch (messageKey){
                    case 1:
                        System.out.println("Write messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Picture messages");
                        break;
                    case 5:
                        System.out.println("Template");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("Message settings");
                        System.out.println("1-> Message set\t");
                        System.out.println(("2-> Messages common\t"));

                        System.out.println("Enter number between 1 and 2 to carryout the message function");
                        int messageSettingKey = userInput.nextInt();
                        if(messageSettingKey ==1){
                            System.out.println("Message set");
                            String messageSet = """
                                    1-> Message center number
                                    2-> Messages sent as
                                    3-> Message validity
                                    """;
                            System.out.println(messageSet);
                            System.out.println("Enter number between 1 to 3 to carry out a message Set function");

                            int messageSetkey = userInput.nextInt();
                            if(messageSetkey == 1) {
                                System.out.println("Message center number");
                            }
                            if(messageSetkey == 2){
                                    System.out.println("Messages sent as");
                                }
                            else{
                                if(messageSetkey == 3){
                                    System.out.println("Message validity");
                                }
                            }
                        }else{
                            if(messageSettingKey == 2){
                                System.out.println("Message common");
                                String messageCommon = """
                                        1-> Delivery reports
                                        2-> Reply via same centre
                                        3-> Character support
                                        """;
                                System.out.println(messageCommon);
                                System.out.println("Enter a number to carry out the message common function");
                                int messageCommonKey = userInput.nextInt();
                                if(messageCommonKey == 1){
                                    System.out.println("Delivery report");
                                    break;
                                }
                                if(messageCommonKey == 2){
                                    System.out.println("Reply via same center");
                                    break;
                                }
                                else{
                                    if(messageCommonKey == 3){
                                        System.out.println("Character support");
                                        break;
                                    }
                                }
                            }
                        }
                    case 8:
                        System.out.println("Info service");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number ");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        break;
                }
                break;
            case 3:
                System.out.println("chat");
                break;
            case 4:
                String callRegister = """
                        1-> Missed calls
                        2-> Received calls
                        3-> Dialled numbers
                        4-> Erase recent call lists
                        5-> Show call duration
                        6-> Show call costs
                        7-> Call cost settings
                        8-> Prepaid credit
                        """;
                System.out.println(callRegister);
                System.out.println("Enter any number between 1 and 8 to carried out the call register function");
                int callRegisterKey = userInput.nextInt();
                switch (callRegisterKey){
                    case 1:
                        System.out.println("Missed calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("Dialled numbers");
                        break;
                    case 4:
                        System.out.println("Erase recent call lists");
                        break;
                    case 5:
                        String callDuration = """
                                1-> Last call duration
                                2-> All calls' duration
                                3-> Received calls' duration
                                4-> Dialled calls' duration
                                5-> Clear timers
                                """;
                        System.out.println(callDuration);
                        System.out.println("Enter a number between 1 and 5 to carry out the call duration function");
                        int callDurationkey = userInput.nextInt();
                        switch (callDurationkey){
                            case 1:
                                System.out.println("Last call duration");
                                break;
                            case 2:
                                System.out.println("All calls' duration");
                                break;
                            case 3:
                                System.out.println("Received calls' duration");
                                break;
                            case 4:
                                System.out.println("Dialled calls' duration");
                                break;
                            case 5:
                                System.out.println("Clear timers");
                                break;
                        }
                    case 6:
                        String callCost = """
                                1-> Last call cost
                                2-> All calls' cost
                                3-> Clear counters
                                """;
                        System.out.println(callCost);
                        System.out.println("Enter a number between 1 and 3 to carry out call cost function");
                        int callCostKey = userInput.nextInt();
                        switch (callCostKey){
                            case 1:
                                System.out.println("Last call  cost");
                                break;
                            case 2:
                                System.out.println("All calls' cost");
                                break;
                            case 3:
                                System.out.println("Clear counter");
                                break;
                        }
                    case 7:
                        System.out.println("1-> Call cost limit");
                        System.out.println("2-> Show costs in");
                        System.out.println("Enter a number between 1 and 2 to carry out the cost settings function");
                        int callSettingskey = userInput.nextInt();
                        if(callSettingskey == 1){
                            System.out.println("Call cost limit");
                        }else{
                            if(callSettingskey == 2){
                                System.out.println("Show costs in");
                                break;
                            }
                        }
                        break;
                    case 8:
                        System.out.println("Prepaid credit");
                        break;
                }
            case 5:
                String Tones = """
                        1-> Ringing tone
                        2-> Ringing volume
                        3-> Incoming call alert
                        4-> Composer
                        5-> message alert tone
                        6-> keypad tones
                        7-> Warning and game tone
                        8-> Vibrating alert
                        9-> Screen saver
                         """;
                System.out.println(Tones);
                System.out.println("Enter a valid key between 1 and 9 to carry out a tone function");
                int toneKey = userInput.nextInt();
                switch (toneKey){
                    case 1:
                        System.out.println("Ringing tone");
                        break;
                    case 2:
                        System.out.println("Ringing volume");
                        break;
                    case 3:
                        System.out.println("Incoming call alert");
                        break;
                    case 4:
                        System.out.println("composer");
                        break;
                    case 5:
                        System.out.println("Message alert tone");
                        break;
                    case 6:
                        System.out.println("Keypad tones");
                        break;
                    case 7:
                        System.out.println("Warning and game tone");
                        break;
                    case 8:
                        System.out.println("Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Screen saver");
                        break;
                }
            case 6:
                String Settings = """
                        1-> Call settings
                        2-> Phone settings
                        3-> Security settings
                        4-> Restore factory settings
                        """;
                System.out.println(Settings);
                System.out.println("Enter a valid number between 1 and 4 to carry out the setting function");
                int settingsKey = userInput.nextInt();
                switch (settingsKey){
                    case 1:

                        String callSetting = """
                                1-> Automatic redial
                                2-> Speed dialling
                                3-> Call waiting option
                                4-> Own number sending
                                5-> Phone line in use
                                6-> Automatic answer
                                """;
                        System.out.println(callSetting);
                        System.out.println("Enter a valid number between 1 and 6 to carry out the call setting function");
                        int callSettingKey = userInput.nextInt();
                        switch (callSettingKey){
                            case 1:
                                System.out.println("Automatic redial");
                                break;
                            case 2:
                                System.out.println("Speed dialling");
                                break;
                            case 3:
                                System.out.println("Call waiting option");
                                break;
                            case 4:
                                System.out.println("Own number sending");
                                break;
                            case 5:
                                System.out.println("Phone line in use");
                                break;
                            case 6:
                                System.out.println("Automatic answer");
                                break;
                        }
                    case 2:
                        String phoneSettings = """
                                1-> Language
                                2-> Cell info display
                                3-> Welcome note
                                4-> Network selection
                                5-> Lights
                                6-> Comfirm SIM service actions
                                """;
                        System.out.println(phoneSettings);
                        System.out.println("Enter a valid number between 1 and 6 carry out the phone settings function");
                        int phoneSettingKey = userInput.nextInt();
                        switch (phoneSettingKey){
                            case 1:
                                System.out.println("Language");
                                break;
                            case 2:
                                System.out.println("Cell info display");
                                break;
                            case 3:
                                System.out.println("Welcome note");
                                break;
                            case 4:
                                System.out.println("Network selection");
                                break;
                            case 5:
                                System.out.println("Lights");
                                break;
                            case 6:
                                System.out.println("Comfirm SIM service actions");
                                break;
                        }
                    case 3:


                }










        }



    }
}
