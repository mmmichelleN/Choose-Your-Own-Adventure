package chooseYourOwnAdventure;

import java.util.Scanner; 
import java.util.Random; 
import java.io.*; //allows me to print quotation marks in string literals 

public class cYOAcode 
{ 
public static void main(String[] args) 
{ 
Scanner scan = new Scanner(System.in); 
Random rand = new Random(); 
/* Opening header 
and title*/ 
System.out.println("Now Leaving Westcliff, West Virginia"); 
System.out.println("By: Michelle Ngo"); 
System.out.println("\t" + "Hi. This program is a short story, about well, you."); 
System.out.println("You are about to head off to your first semester at college and you decide to spend a day with an old friend of yours."); 
System.out.println("This program is an interactive story where you can make choices that affect the story and can reveal extra scenes."); 
System.out.println("However, whenever you choose to make an action, the success of your action will be determined by the sum of two dice rolls."); 
System.out.println("---"); 
String name = " ", c1 = " ", c2 = " ", c3 = " ", c4 = " ", c5 = " "; 
int c6 = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, sum1 = 0, sum2 = 0, sum3 = 0; 
System.out.println("So are you ready to begin? But before we begin I'm going to need a name. So name, please?"); 
name = scan.nextLine(); 
System.out.println("So, " + name + " is it? Alright " + name + ", c’mon"); 
System.out.println("---"); 
System.out.println("\t" + "The sun rises over the trees that surround the small town of Westcliff, West Virginia, but I don't have the time to admire it as I'm too busy rummaging through the bags on the floor of my room."); System.out.println("Tomorrow I have to leave for college and I’m checking to see if I have everything I need."); 
System.out.println("As I continue checking I hear a knock on the door. I rush to open the door and spot, Barry, an old friend of my mom's."); 
System.out.println("\t" + " \"Barry!\" I shout."); 
System.out.println("\t" + " \"Hey, " + name + " ready to go?\" Barry asks." + "\n" + "\t" + " \"Yeah, I am.\" "); 
System.out.println("\t" + " \"Alright, let's head out.\" Barry walks towards his truck. I throw on a jacket, lock the door, and race after him."); 
System.out.println(" \"Are you hungry? If you are, we can go to the diner or to the bakery, your choice.\" Barry offers."); 
System.out.println("Do you want to go to the \"diner\" or to the \"bakery\"?"); 
c1 = scan.nextLine(); 
while (!c1.equals("diner") && (!c1.equals("bakery"))) //catches invalid answers and asks for a valid one 
{ 
System.out.println("Please select a valid choice."); 
c1 = scan.nextLine(); 
}
if (c1.equals("diner")) //user and Barry go to the diner scene should output 
{ 
System.out.println("\t" + " \"Diner.\" I say as Barry starts driving."); 
System.out.println("\t" + " \"So, are you nervous about heading to college? I know I sure was.\" he says."); 
System.out.println("\t" + " \"I guess just a bit.\" "); 
System.out.println("\t" + " \"I hope it passes soon. I really enjoyed being there, and I want you to enjoy your time there as well.\" "); 
System.out.println("\t" + " \"Thanks Barry.\" He pulls into the parking lot of the diner."); 
System.out.println("\t" + " \"Hey no problem. Look " + name + " if you ever need help I'll be there for you.\" Barry stops the truck. We make our way into the diner and find seats."); System.out.println("We order and I watch the birds through the window, until a small paper ball hits me on the forehead. I see Barry prepare to flick another at me."); System.out.println("I rip a napkin, roll it into a ball, and flick it at Barry and it hits him on the nose."); 
System.out.println("As we continued to launch rolled up napkins at each other our food arrives and we eat. When we're finished, we clean up, head into Barry's truck, and start driving."); } 
if (c1.equals("bakery")) //user and Barry go to bakery scene should output 
{ 
System.out.println("\t" + " \"Bakery,\" I say as Barry starts driving."); 
System.out.println("\t" + " \"So, are you nervous about heading to college? I sure was.\" he says."); 
System.out.println("\t" + " \"A bit.\" "); 
System.out.println("\t" + " \"I hope it passes soon. I enjoyed my time there and I want you to enjoy your time there as well.\" "); 
System.out.println("\t" + " \"Thanks Barry.\" He parks close to the bakery and we head inside." + "\n" + "\t" + " \"No problem.\" "); 
System.out.println("Barry grabs some buns while I get us some coffee. When we Barry finishes paying, we slip into his truck to eat."); 
System.out.println("As I reach for a bun, Barry rips his paper bag and begins to fold it. He finishes folding and places a paper crane onto the dash."); System.out.println("\t" + " \"Ta da,\" he says motioning towards the bird."); 
System.out.println("I rip apart my bag and fold it into a smaller crane, the same way Barry taught me when I was kid"); 
System.out.println("and place it under the wing of Barry's bird, \"I made it a friend.\" "); 
System.out.println("He smiles before starting the truck and driving."); 
} 
/*Continued story after the 
correct c1 scene was outputted*/ 
System.out.println("\t" + " \"What are we doing today?\" I shout over the radio."); 
System.out.println("\t" + " \"We're going hiking.\", he shouts back as we drive towards the forest outside of town"); 
System.out.println("Barry parks in a lot near the forest's edge. He grabs his stuff and turns off the radio."); 
System.out.println("We make our way to the edge of the forest and Barry points to a path on the right."); 
System.out.println("\t" + " \"We're taking this one today,\" he says."); 
System.out.println("\t" + "As we walk, Barry comes to a stop under a particularly tall tree."); 
System.out.println("\t" + " \"Do you remember how you used to like climbing trees as a kid?\" Barry asks."); 
System.out.println("\t" + " \"Yeah, I remember.\" "); 
System.out.println("\t" + " \"Wanna race to the top?\" "); 
System.out.println("\"yes\" or \"no\"?"); 
c2 = scan.nextLine();
while (!c2.equals("yes") && (!c2.equals("no"))) 
{ 
System.out.println("Please select a valid choice."); 
c2 = scan.nextLine(); 
} 
if (c2.equals("yes")) //"yes" action success determined here 
{ 
n1 = rand.nextInt(6) + 1; 
n2 = rand.nextInt(6) + 1; 
sum1 = n1 + n2; 
if (sum1 <= 6) //Unsuccessful outcome for c2 
{ 
System.out.println("\t" + " \"You're on.\" I grab ahold of a branch"); 
System.out.println("\t" + " \"On the count of three. One...two...three.\" Barry hauls himself onto a branch and I follow his lead."); 
System.out.println("When I'm half-way up the tree I look down and see that Barry has nearly caught up with me, until I lose my balance and hit the ground with a thud."); System.out.println("I watch as Barry makes his way towards me until he looms over me." + "\n" + "\t" + " \"You alright?\" he asks."); 
System.out.println("\t" + " \"Yeah, ow. I'm fine\" Barry holds out his hand and helps me up."); 
System.out.println("\t" + " \"We should probably let you get some rest.\" Barry hooks his arm underneath mine and leads me towards the base of a tree."); System.out.println("We sit there for a while before Barry says we should get going."); 
} 
else //Successful outcome for c2 
{ 
System.out.println("\t" + " \"You're on,\" I grab ahold of a branch."); 
System.out.println("\t" + " \"On the count of three. One...two...three.\" Barry hauls himself onto a branch and I swing myself upwards onto mine."); System.out.println("As I make it halfway up the tree, I look down and spot Barry before I resume climbing. When I reach the top I sit and wait."); 
System.out.println("A few minutes later, Barry reaches me. \"You sure took your time getting up here.\" I say."); 
System.out.println("\t" + " \"Yeah, I know, no need to rub it in. We both know that I'm not as young as you are, \" he gestures to the grey streaks in his hair."); System.out.println("\t" + " We sit together and watch as the sun continues it's ascent and watch as the trees and the faraway mountains glow in the morning light."); System.out.println("As we watch the scene unfold Barry breaks the silence and says, \"Hey, "+ name + " we should get going.\" "); 
System.out.println("With one last glance over the horizon, we begin the climb down."); 
} 
} 
if (c2.equals("no")) 
{ 
System.out.println("\t" + " \"I think I'm going to sit this one out.\" I glance up at the canopy of the tree."); 
System.out.println("\t" + " \"What? We both know that I'm not as young as you are, but if that's your choice.\" He sits next to the trunk of the tree and pats the ground beside him. I join him."); System.out.println("Barry rummages through his bag before taking out two bottles of water and hands me one. We both drink and talk."); 
System.out.println("Barry stands up, dusts himself off, and pulls me up."); 
}
/*Scene that outputs after c2 chosen 
scene has been outputted*/ 
System.out.println("\t" + "As we walk, I turn to Barry and ask something that's troubling me, \"Hey, Barry can I ask you a question?\" "); System.out.println("\t" + " \"Go for it.\" " + "\n" + "\t" + " \"What do I do if I'm nervous about the future?\" "); 
System.out.println("\t" + " \"First, remind yourself that it's okay to be nervous.\" "); 
System.out.println("He turns towards me, \"Don't let your worries hold you back from living your life. You can reach out to other people for help.\" "); System.out.println(" he puts a hand on my shoulder and gives it a comforting squeeze, \"You got a good head on your shoulders, I know you can do it.\" "); System.out.println("\t" + " \"Thank you\". He nods, and we continue walking until we reach a fork in the road."); 
System.out.println("\t" + "The path in front of us goes up a steep hill, and the path on the left continues on flat ground. \"Do you want to climb up the hill?\" asks Barry."); System.out.println(" \"yes\" or \"no\"?"); 
c3 = scan.nextLine(); 
while (!c3.equals("yes") && (!c3.equals("no"))) 
{ 
System.out.println("Please select a valid choice."); 
c3 = scan.nextLine(); 
} 
if (c3.equals("yes")) //"yes" action success determined here 
{ 
n3 = rand.nextInt(6) + 1; 
n4 = rand.nextInt(6) + 1; 
sum2 = n3 + n4; 
if (sum2 <= 6) //unsuccessful action for c3 
{ 
System.out.println("\t" + " \"I don't mind going over,\" I say as we start up the hill."); 
System.out.println("After a while of avoiding roots and rocks, we make it halfway to the top. I stop to look around before stumbling on a tree root and losing my balance."); System.out.println("\t" + " \"BAr-\" I feel a hand grab my arm and pull me up, \"Thanks.\" "); 
System.out.println("\t" + " \"Everything alright?\" "); 
System.out.println("\t" + " \"I'm fine.\" " + "\n" + "\t" + " \"Just be more careful.\" He continues making his way through the foliage."); 
System.out.println("I step over rocks and roots until I reach Barry sitting on a tree stump. I walk towards him and fall onto the ground next to him."); System.out.println("\t" + " \"You sure took your time getting up here.\" He punches me in the shoulder."); 
System.out.println("\t" + " \"Leave me alone, it's the day before I leave.\" I rub my shoulder."); 
System.out.println("He throws his hands up, \"Alright I will. Care to join me for lunch?\" He hands me a sandwich." + "\n" + "\t" + "\"Thanks.\""); System.out.println("As we eat, Barry shares his college stories, he talks about pranks that he played and a snowball fight with his friends."); System.out.println("We finish eating and clean up."); 
} 
else //Successful outcome for c3 
{ 
System.out.println("\t" + "I look at the hilltop, turn to Barry, and say, \"Race you up there,\" before taking off."); 
System.out.println("When I get close to the top, I glance behind me and watch Barry pick his way through the foliage, before breaking out into a run.");
System.out.println("When I make it to the top, panting, I collapse on a nearby tree stump. When Barry reaches me I shout, \"What took you so long?\" "); System.out.println("\t" + "He notices my breathing, \"At least I'm not gasping for breath.\" " + "\n" + "\t" + " \"Got me there.\" "); System.out.println("\t" + " \"Would you care to join me for lunch?\" He hands me a sandwich." + "\n" + "\t" + " \"Yeah, thanks.\" "); System.out.println("As we eat, Barry tells stories about his time at college before stopping suddenly."); 
System.out.println("I turn to him, he points to the base of a tree. It's deer, two of them. The two deer pay us no mind and as they wandering around us."); System.out.println("We watch in silence, as they disappear into the trees. \"That was a nice surprise,\" Barry says standing up and throwing on his bag."); System.out.println("\t" + " \"Sure was.\" "); 
} 
} 
if (c3.equals("no")) //Scene that outputs after user choose "no" 
{ 
System.out.println("\t" + " \"Let's take the path on the left.\" I answer."); 
System.out.println("\t" + " \"Fine by me.\" "); 
System.out.println("We walked and talked until it was time for lunch and we stop. Barry pulls out a sketchbook and sketches a flower by his feet."); System.out.println("I continue eat and drink before Barry puts his book back in the bag and takes the water from me."); 
System.out.println("\t" + " \"Thanks, that was great.\" I say wiping my mouth \"Should we get going now?\" "); 
System.out.println("\t" + " \"Yeah, lets go.\" He stands up and puts on his bag."); 
} 
//Continued scene after c3 choices 
System.out.println("\n" + "\t" + "As we walk and talk we are eventually accompanied by the sound of water as we approach a river."); System.out.println("The river cuts across the forest floor and empties into a lake in a clearing. It's well past noon, and the water reflects the sun and the sky."); System.out.println("There is a path of stones that run across the river and there is a bridge further off in the distance."); System.out.println("Barry gestures to the path of stones in front of us and asks, \"Do you want to take the path across? It's closer than the bridge.\""); System.out.println(" \"yes\" or \"no\"?"); 
c4 = scan.nextLine(); 
while (!c4.equals("yes") && (!c4.equals("no"))) 
{ 
System.out.println("Please select a valid choice."); 
c4 = scan.nextLine(); 
} 
if (c4.equals("yes")) 
{ 
n5 = rand.nextInt(6) + 1; 
n6 = rand.nextInt(6) + 1; 
sum3 = n5 + n6; 
if (sum3 <= 6) //unsuccessful outcome for c4 
{ 
System.out.println("\t" + " \"Let's take the rocks across the water.\" "); 
System.out.println("\t" + " \"Alright,\" he steps onto the first stone and onto the next.");
System.out.println("I follow his lead, stepping from one stone to another."); 
System.out.println("Barry stands on the other side waiting for me. When I'm about to join him, I lose my balance and he catches me." + "\n"+ "\t" + " \"You alright?\" he asks."); System.out.println("\t" + " \"I'm fine thanks.\" We follow the river down to the lake."); 
System.out.println("When we reach the lake, Barry finds a handful of stones and skips them across the water."); 
System.out.println("I take one of the stones Barry set down and attempt to skip it over the water."); 
System.out.println("\t" + " \"Need some help?\" Barry picks up a stone and demonstrates, \"the trick is to flick your wrist.\" "); 
System.out.println("\t" + " \"Here give a try.\" he hands me some stones, \"Hey, there you got it.\" "); 
System.out.println("\t" + " \"Thanks, \" I say getting up, \"You think it's time to get going?\" I hold out my hand and pull Barry up."); 
} 
else //Successful outcome for c4 
{ 
System.out.println("\t" + " \"Let's take the rocks over the water.\" Barry steps onto the first stone and cautiously makes his way to the next."); 
System.out.println("I follow after him, one careful step after the other until we reach the other side. Then we make our way towards the lake."); System.out.println("When we reach the lake, I take off my shoes and step into the water. Barry sits on a rock sketching in a book."); 
System.out.println("Curious, I walk over to where he's sitting."); 
System.out.println("\t" + "\"What are you up to?\" I ask, looking over his shoulder." + "\n" + "\t" + "\"Here, \" he shows me the book, \" take a look for yourself. \" "); System.out.println("I look at the page and I see that it's a drawing of the lake. He flips through images of wildlife and detailed landscapes."); 
System.out.println("\t" + " \"These are incredible.\" " + "\n" + "\t" + " \"Thanks.\" He adds details to the drawing of the lake."); 
System.out.println("\t" + " \"You can keep watching, I don't mind.\" I keep watching until Barry says it's time to go and I get my shoes."); 
} 
} 
if (c4.equals("no")) //Output that happens after the user choose "no" 
{ 
System.out.println("\t" + " \"Let's take the bridge across. \" I say pointing to the bridge"); 
System.out.println("\t" + " \"Fine by me.\" We cross the bridge and follow the river to the lake."); 
System.out.println("After wandering around the shore, we sit on a dock that stretches out into the water."); 
System.out.println("\t" + " \"I thought the water was going to be warm- \" Barry pushes me into the water and I grab onto his sleeve."); 
System.out.println("We hit the water and when we resurface I splash Barry in the face."); 
System.out.println("\t" + " \"Hey!\" He spits out water." + "\n" + "\t" + " \"That was for pushing me in!\" "); 
System.out.println("\t" + " \"Alright, alright.\" He throws his arms up, \"I promise to never push you into the water again, if you promise to never get lake water in my mouth ever again.\" "); System.out.println("\t" + " \"I agree to those terms, \" I hold out my pinky, \"Never, again.\" "); 
System.out.println("He smiles and loops his finger around mine. We swim around before getting out of the water."); 
System.out.println("\t" + " \"Ready to go? \" He asks, wringing out his jacket."); 
System.out.println("\t" + " \"Yeah, just give me a minute, \" I say, wiping off the water trickling down my face."); 
} 
/* Scene that outputs 
after c4*/ 
System.out.println("\t" + "As we continue our trek, the sun begins to set. \"It's gonna be dark soon,\" I point out"); 
System.out.println("\t" + " \"I have some surprises left in store, \" Barry says as we make our way towards a fire pit, \"First we need to get a fire going.\" "); System.out.println("We start a fire just as the sun was about to disappear and we start roasting marshmallows.");
System.out.println("\t" + " \"Barry, can I ask you something?\" "); 
System.out.println("\t" + " \"Go for it.\" " + "\n" + "\t" + " \"What if I change my mind and I don't want to be an artist? What happens then?\" "); 
System.out.println("\t" + " \"Look, " + name + " it's okay to change your mind. Everything in your life is going to change."); 
System.out.println("Sure, it's scary from your perspective, because you don't know what's going to happen next, but that's okay.\" "); 
System.out.println("Barry puts a hand on my shoulder, \"What happens if you don’t want to be an artist? That’s for you to decide, "); 
System.out.println("others can influence your choices but that decision ultimately comes down to you.\" "); 
System.out.println(" \"Thank you Barry.\" " + "\n" + "\t" + " \"Anytime\" "); 
System.out.println("\t" + "We roast more marshmallows and talk well into the night before Barry says, \"It's getting late.\" "); 
System.out.println("Do you want to leave, \"yes\" or \"no\"?"); 
c5 = scan.nextLine(); 
while (!c5.equals("yes") && (!c5.equals("no"))) 
{ 
System.out.println("Please select a valid choice."); 
c5 = scan.nextLine(); 
} 
if (c5.equals("no")) //Scene outputs if user selects "no" 
{ 
System.out.println("\t" + " \"I want to stay a bit longer.\" " + "\n" + "\t" + " \"Your choice.\" "); 
System.out.println("I turn my head towards the trees and see them, lights flickering, fireflies. Barry turns ands spots them too."); 
System.out.println("\t" + " \"You remember how to catch them, right?\" he asks, walking towards them. I trail behind him."); 
System.out.println("Barry approaches the lights and cups two of them in his hands. I copy him and cup one of them in my hands."); 
System.out.println("I watch as the lights in our hands flicker before releasing them and catching more."); 
System.out.println("Eventually, I get tired. Barry notices and hands me a flashlight. He points to the trees across from us and says, \"There's a shortcut through there. Just follow the path and it'll take you to the road.\" "); System.out.println("I thank him before disappearing into the trees and taking the shortcut."); 
System.out.println("I reach the road and begin walking home. When I get there, I kick off my shoes, get cleaned up, and fall asleep instantly."); 
} 
if (c5.equals("yes")) 
/*Scene that outputs 
if user chooses "yes"*/ 
{ 
System.out.println("\n" + "\t" + " \"I think I'm going to leave, \" he hands me a flashlight, \"Thanks for today I really enjoyed spending time with you.\" "); 
System.out.println("He points to the trees across the campsite and says, \"Don't mention it. There's a shortcut through those trees, follow it and it should take you to the road.\" "); System.out.println("\t" + " \"You got a big day tomorrow.\" "); 
System.out.println("With one last glance over my shoulder I turn away from the fire and make my way out of the woods and onto the road."); 
System.out.println("As soon as I get home, I kick off my shoes, get cleaned up, and fall asleep instantly."); 
} 
// Scenes that output after scene c5 
System.out.println("\n" + "\t" + "The sun begins to rise and I take in the scene from the roof of my house."); 
System.out.println("Today is the day I leave. I crawl through a window and land on the floor of my room."); 
System.out.println("I grab some bags and a painting and load them into my mother's car." + "\n" + "\t" + "\"Need a hand?\", asks Barry.");
System.out.println("\t" + "\"Barry! It's good to see you, and yes I'd love some help. Could you get the bags on the floor of my room and load them into the car?\" I answer."); System.out.println("\t" + "\"Sure thing.\" I watch him disappear into the house before following him. As I take stairs to the top, Barry walks past me with a bag in his arms."); System.out.println("I grab a bag and some books before going outside. Outside, Barry is loading the bag into the trunk and I throw my stuff in after."); System.out.println("\t" + "\" Looks like we're done. Thanks for helping out.\" " + "\n" + "\t" + " \"No problem. Oh, before I forget, I wanted to give you something.\" "); System.out.println("Pick a number between 1 and 3."); 
c6 = scan.nextInt(); 
while (c6 > 3 || c6 < 1) 
{ 
System.out.println("Please select a valid choice."); 
c6 = scan.nextInt(); 
} 
switch (c6) 
{ 
case 1: 
System.out.println("\t" + "Barry takes off his baseball cap and gives it to me. \"Here, one last surprise.\" "); 
System.out.println("The hat has the word, \" Westcliff \", written across it in big bold letters."); 
System.out.println("\t" + " \"But this is your favourite hat. Barry you shouldn't have.\" " + "\n" + "\t" + " \"Take it, I wanted you to have it.\" "); 
System.out.println("\t" + " \"Thank you.\" " + "\n" + "\t" + " \"Don't mention it.\" "); 
break; 
case 2: 
System.out.println("\t" + "Barry takes off his jacket and offers it to me. \"Here, I wanted you to have it. One last surprise as I promised earlier.\", he says"); System.out.println("\t" + " \"Barry, you shouldn't have.\" " + "\n" + "\t" + " \"It was getting to small for me so I thought that you should have it, \" he drapes the denim jacket onto my shoulders."); System.out.println("The motion makes the various buttons and pins on the jacket rattle."); 
System.out.println("\t" + "\"It's lovely, thank you.\" " + "\n" + "\t" + " \"Don't mention it.\" "); 
break; 
case 3: 
System.out.println("\t" + "Barry reaches into his jacket and pulls out a necklace. It's a simple silver chain with a silver ring attached to it. He takes it off and offers it to me."); System.out.println("\t" + "He puts it in my hand and closes my fingers around it, \"Here, \" he says, \" one last surprise before you leave. Just like I promised.\" "); System.out.println("\t" + " \"Thank you, it's beautiful.\" " + "\n" + "\t" + " \"Don't mention it.\" "); 
} 
/* Scene that happens after c5 
also known as the final scene*/ 
System.out.println("\t" + " \"I have something for you too, \" I rush upstairs and grab the flashlight, \"Here.\" "); 
System.out.println("\t" + " \"Thanks, I almost forgot.\" We're both left on the driveway to say our goodbyes."); 
System.out.println("Barry wraps me into a bone-crushing bear hug, \"I'm proud of you.\" "); 
System.out.println("\t" + " \"Thank you, for everything you've done for me.\" He pulls me into another bear hug and I hear a faint \"pop\" in my back."); System.out.println("As we finish our goodbyes, my mother starts the car and I get into the passenger seat."); 
System.out.println("Barry stands on the sidewalk, smiling and waving as we drive past him. I lean out of the window and wave back. We drive along the main road that leads out of town");
System.out.println("andpassbythesignsaying, \"Now leaving, Westcliff, WestVirginia.\""); System.out.println("--- THE END ---"); 
}
}
