import { UserTypeTO } from "./user-type";

export class UserTO extends BaseDate{
    idUser : number;
    nameUser : string;
    surnames : string;
    email : string;
    userPassword : string;
    idUserType : UserTypeTO;
}