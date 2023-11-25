import { Component, OnInit } from '@angular/core';
<<<<<<< HEAD
import {UserService} from '../user.service'
=======
import {UserService} from '../user.service';
>>>>>>> 95e3ba1 (Springboot & Angular changes)
import { User } from '../user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users: User[] | undefined;
  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.userService.getUsers().subscribe((data: User[]) => {
      console.log(data);
      this.users = data;
    });
  }
<<<<<<< HEAD
}
=======
}
>>>>>>> 95e3ba1 (Springboot & Angular changes)
