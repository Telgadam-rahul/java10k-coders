public class Switch {
    public static void rahul(int num){
       switch(num){
        case 1:
            System.out.println("sunday");
            break;
            case 2:
                System.out.println("monday");
                break;
                case 3:
                    System.out.println("tuesday");
                    break;
                    case 4:
                        System.out.println("wednesday");
                        break;
                        case 5:
                            System.out.println("thursday");
                            break;
                            case 6:
                            System.out.println("Day six is:" +"friday");
                            break;
                            case 7:
                                System.out.println("saturday");
                        default:
                            System.out.println("nothing to display");
       }

       }
       public static void main(String[] args) {
        rahul(6);
       }
    }