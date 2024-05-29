package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameCLopezJames extends GameActivity {

    private int numLives;
    private TextView tvTitle, tvSubtitile, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;

    @Override
    protected void run() {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitile = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory =  findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("A Journey in The Strain Area");
        tvSubtitile("by James Lopez");
        tvStoryText.setText("Choose Through The Three");

        numLives = 5;

        tvStoryText.setText("The 3 doors leads to any place you can imagine, which one will you choose to win?");

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });


    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

    private void start()
    {
        String text = "Number of lives:\t" + numLives +
                "You awaken in an area called The Strain Area, 3 doors are in front of you, " +
                "which one do you choose to go through?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Open door number one");
        btn2.setText("Don't open door number two and run to seek any help");
        btn3.setText("Open door number three");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoorOne();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                runFromDoorTwo();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoorThree();
            }
        });

    }

    private void openDoorOne()
    {

        String text = "nDoor 1 has you walk into chaos, people running, screaming THE CREATURE IS BACK IT'S BACK, " +
                "not hesitating you run and hide with a group of people in a abandoned mine shaft. " +
                "Do you get out to see the creature in question or stay hiding?\"";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Leave the mineshaft you are in");
        btn2.setText("Stay hidding in the mineshaft");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                leaveMineShaft();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stayHidding();
            }
        });

    }

    private void leaveMineShaft()
    {
        Util.clearConsole();
        System.out.println("Getting out let’s you immediately see the mythical creature known as SUN//EATER, that does not hesitate to pubmed you to the ground and leaves you in unimaginalbe pain. Do you now stay where you are or make an effort to run away?");
        System.out.println("1. Stay where you are on the ground\n2. Attempt to make a run for it");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            stayWhereYouAre();
        }
        else if (choice == 2)
        {
            makeARunForIt();
        }
    }

    private void stayWhereYouAre()
    {
        Util.clearConsole();
        System.out.println("You decide to stay where you are, suddenly the creature goes off in a different direction, after getting back up, you turn to see the group you left, but now you understand why the creature left,they were the reason the creature left you alone, they were it’s next target and now they're all gone. Now all alone, you look around and see a door, do you go towards it or abandon the door and go a different direction?");
        System.out.println("1. Go open the door and walk through\n2. Abondon the door and go look for any help");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goOpenTheDoor();
        }
        else if (choice == 2)
        {
            leaveTheDoor();
        }
    }

    private void goOpenTheDoor()
    {
        Util.clearConsole();
        System.out.println("Going towards the door while in anguasing pain, opening it reveals the real world, perfectly in front of a hospital to get yourself patched it!");
        youWon();
    }

    private void stayHidding()
    {
        Util.clearConsole();
        System.out.println("You stayed inside the mineshaft with the rest of the people, but as pericing silence creeps on you, suddenenly the top of the mineshaft opens up, the creature had found all of you, with one swift motion, everyone seize to exist...");
        defeat();
    }

    private void makeARunForIt()
    {
        Util.clearConsole();
        System.out.println("You attempted to make a run for it as a last ditch effort for any salvation, but this proves to be short lived as the creature quickly catches up to you and quickly you are erased by a swift attack...");
        defeat();
    }

    private void leaveTheDoor()
    {
        Util.clearConsole();
        System.out.println("Angered by seeing another door knowing walking through a door lead you to here, you decide to abandon the door and walk elsewhere looking for any type of help. For what seemed like hours of walking you stop walking from exhausting but your whole body was weak to poing where you collapse on the floor, you slowly lose your conciousness and fall asleep...only to never wake up...");
        defeat();
    }

    private void runFromDoorTwo()
    {
        Util.clearConsole();
        System.out.println("You choose to not open a single door and just RUN, now you can either run AWAY from the door or run PAST the door, which do you do?");
        System.out.println("1. Run away from the door\n2. Run past the door's direction");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            runAwayFromTheDoor();
        }
        else if (choice == 2)
        {
            runPastTheDoor();
        }
    }

    private void runAwayFromTheDoor()
    {
        Util.clearConsole();
        System.out.println("You run away from the door, from a distance you can see a light in the distance just visible enough to know it's real, do you run towards the light or no?");
        System.out.println("1. Run towards the light\n2. Don't run towards the light");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goTowardsTheLight();
        }
        else if (choice == 2)
        {
            runAwayFromTheLight();
        }
    }


    private void goTowardsTheLight()
    {
        Util.clearConsole();
        System.out.println("You go towards the light, and see someone had somehow made a campfire here of all places, you sit near the person and ask, what is this place? No response is given but all the strange man says to you, You want to leaev here don't you? Your quiet but answer yes, the strange man hands you a drink that has a blackend color to it, drinking it tastes very bitter but immediantly finishing it makes you feel sleepy and without much time to even process you knowck out. You know awake in you bed as if it was all a dream, was it a dream? Was it all real? It felt so real, pusing those thoughts aside you lived your normal everyday life from then on.");
        youWon();
    }


    private void runAwayFromTheLight()
    {
        Util.clearConsole();
        System.out.println("You deicide to not chance the light as it can be a trap, going a different direction you walk an endless abyss of pitch black darkness, far into your journey you fall to your kness from exhaustion wondering if there even was a way out of this place..if you can even call it a place..more like an infinite void of pitch black darkness. You fall and lay on the ground, the last thing you thought of was that light you saw ealier...wishing you had gone towards it.");
        defeat();
    }

    private void runPastTheDoor()
    {
        Util.clearConsole();
        System.out.println("Running past the doors direction leads you to a strange hall area that has a left or right area to go through, do you either go left or right?");
        System.out.println("1. Go left\n2. Go right");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goLeft();
        }
        else if (choice == 2)
        {
            goRight();
        }
    }

    private void goLeft()
    {
        Util.clearConsole();
        System.out.println("Going left, it's pitch black, to the point that you fall into a deep hole in the ground which you couldn’t see well because of the darkness, but as you hit the ground, you’re back in the real world in your bed, as if it was bad dream and somehow you made the exact right choices to wake up from this...let's say nightmare, it was all just a...nightmare...right?");
        youWon();
    }

    private void goRight()
    {
        Util.clearConsole();
        System.out.println("Going right..well wasn't right this time as walking in this area as you see a unworldy creature roaming the area, it seems it hasn't noticed you though. Now having to quickly think on what to do, either walk backwards quielty or run for you life in the opposite direction");
        System.out.println("1. Walk backwards quietly\n2. RUN FOR YOUR LIFE");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            walkBackQuietly();
        }
        else if (choice == 2)
        {
            runForYourLife();
        }
    }

    private void walkBackQuietly()
    {
        Util.clearConsole();
        System.out.println("You walk back quietly and the creature seemed to have dissapeared from your line of sight as if it wondered off somewhere else...you turn back to walk back out of this area but as soon as you turn around..the creature was there the whole time...waiting for you. Your journey has come to an end...");
        defeat();
    }


    private void runForYourLife()
    {
        Util.clearConsole();
        System.out.println("You decide to just RUN FOR YOU LIFE. Although the creature did notice you because of the noise, you found the entrance of the area you entered, hidding behind the wall of this split hallway, you feel saftey...not until you look up and see the creature...it snook up on you to catch you by suprise..only seeing it ruined the suprised it had planed for you foolish decision...");
        defeat();
    }


    private void openDoorThree()
    {
        Util.clearConsole();
        System.out.println("You decide to open three, immediantly you are somewhere unrecognizible, it's real life but some place you've never been, someone walks up to you and says あなたはアメリカン人ですか which is Japanese, you are somehow in Japan of all places, with little to no knowledge of the Japanese language, you foolishly say in the most american accent こんにちは as you hear it's constantly used in Animes you've watched before you ended up in this situation, except this isn't one you are in. The Japanese soldier now knowing your american quickly put's a bag over you head, another hitting the back of your knee to fall and you are taking somewhere you don't know. Do you know ask where are you're being taken or try to communicate with the soldiers?");
        System.out.println("1. Ask where you are being taken to\2. Try to communicate with the soldiers");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            askQuestions();
        }
        else if (choice == 2)
        {
            tryAndCommunicate();
        }
    }


    private void askQuestions()
    {
        Util.clearConsole();
        System.out.println("You start asking frantic questions like WHERE AM I GOING, WHY AM I BEING TAKEN SOMEWHERE, WHAT HAVE EVEN DONE!? At some point one the soldiers just says SHUSH AMERICAN. You soon get the bag taken off your head and see a prison cell, your immediantly thrown inside and locked inside of it. You still wonder why this is happening until you hear a nerby radio say the current time you are in year 1943, the year where the war between America and Japan where still taking place, realizing why you are now taken in, now you wonder what to do. Do you either look around for anything to help you or someone or fall asleep on the bed to kill some time?");
        System.out.println("1. Look around for anything to help you\2. Fall asleep to take kill some time");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            lookAroundForHelp();
        }
        else if (choice == 2)
        {
            fallAsleep();
        }
    }


    private void lookAroundForHelp()
    {
        Util.clearConsole();
        System.out.println("You look around for anything to help you out, you find a fully functional phone underneath your bed with full battery and no password! But only downside is there is no reception at all making not so useful to help you now, you soon decide to fall asleep to kill some time. Now awaken, you see a guard sitting next to your cell, they appear to be not so old as the other ones but still fairly enough to be one. You wonder if you should try talking to the guard to see if they know any english, or do something abrupt to get the guards attention?");
        System.out.println("1. Try and talk to the guard\2. Do something abrupt to get the guards attention");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            talkToTheGuard();
        }
        else if (choice == 2)
        {
            doSomethingAbrupt();
        }
    }


    private void talkToTheGuard()
    {
        Util.clearConsole();
        System.out.println("You try to talk the guard, the guard looks up at you and say's What do you want inmate. Cold as ice but you stil persist and ask questions about the situation you walked into, the guard although annoyed answers your questions and you figured that yes, there currently is a war happening against America and Japan and you an American is in Japan. You know question if you can see how far you can go in this place without any resrictions. Do you see if you can end up leaving you cell to examine the place or don't even try to do anythig dumb that can end horribly");
        System.out.println("1. Ask the bathroom to use the bathroom\2. Don't try anything dumb that can end horribly");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            askTheGuardForBathroom();
        }
        else if (choice == 2)
        {
            dontTryAnythingDumb();
        }
    }


    private void askTheGuardForBathroom()
    {
        Util.clearConsole();
        System.out.println("You ask the guard where can you use the bathroom, to your suprise the guard starts opening you cell door and you follow them to a small room with a toliet, the guard tells you not try anything dumb and walks away. Looking around in the room, you see a red door ominously placed to the far left to the room. You really start to question if this is real life but now are left thinking if you should open the door or call for the guard and have them examine the door for you?");
        System.out.println("1. Open the ominus red door\2. Call the guard to examine it for you");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            openTheRedOminusDoor();
        }
        else if (choice == 2)
        {
            callTheGuardToExamineIt();
        }
    }


    private void openTheRedOminusDoor()
    {
        Util.clearConsole();
        System.out.println("Taking your chances once again, you open the door feeling very unsure about your choice, and to your luck, since you found a phone earlier, you used it's flashlight to navigate yourself only to find out you have returned to the Strain Area once again but more darker than before. You hear someone behind you yell something, turning around you see it's the guard and you start running with the guard behind you. Suddenly it get's quiet and turning the guard has dissapeard. Not questioning it you still run but your vision begins to blur and a sense of fatige passes over you in an instant, you try to fight it but it was overwhelming and you lose to it. You wake up in your home, though ironicly at the front door on the ground with the phone you had picked up at that jail cell, stangly enough it still worked as normal. Questioning if it was a dream you don;t open the front door and just live your everyday life afterwards.");
        youWon();
    }


    private void tryAndCommunicate()
    {
        Util.clearConsole();
        System.out.println("You attempt to communicate with them but to the soldiers but in turn it made you sound like a mentally unwell person, and so the soldiers thinking your no use to them...they made you take a nap..and eternal one to say");
        defeat();
    }

    private void fallAsleep()
    {
        Util.clearConsole();
        System.out.println("You jusr decide to fall asleep since it looked as if you were in a no win situation. You awake later and see a guard now in the vacinity of your cell, you wonder to yourself if you can possibly ask the guard to use the bathroom to leave your cell, or do nothing to not get into any more trouble.");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            askToUseTheBathroom();
        }
        else if (choice == 2)
        {
            doNothing();
        }
    }

    private void doSomethingAbrupt()
    {
        Util.clearConsole();
        System.out.println("You decide to do something abrupt to get the guards attention, and in your smart self, yelling of course was a great thing to do. You yell at the top of your lungs to the guard WHY AM I HERE, I DID NOTHING WRONG. The guard suprised by your yells goes into a different room and yells 彼を罰してください! Unsure what they yelled, you awaited to see what would happen. Your taken out of your cell! But not for anything good as a big once again goes over your heard and when dragged to what sounds like the outside, in one second..your journey has come to an end...");
        defeat();
    }

    private void dontTryAnythingDumb()
    {
        Util.clearConsole();
        System.out.println("You choose not to do anything dumb as your already in a bad enough situation. Days pass and you still are in poor condition. Weeks by this point and it seems nothing good has even come from this choice. A month and by now, the amount of poor treatment from the soldiers has weakened you horribly. One day you, feeling tired you choose to take a nap..only this nap was a eternal nap that you never woke up from...");
        defeat();
    }

    private void callTheGuardToExamineIt()
    {
        Util.clearConsole();
        System.out.println("You call the guard to examine it as you did not want to chance another door. The guard walks over and examines it, the guard tell you to go back to your cell and yells in Japanese to the other gurads pressumbly to look at it to, clearly this door wasn't there before. Hours pass and the guards that went to examine it weren't seen, in fact they were never seen again. You walk to the bathroom and notice the door is now gone, you were all alone in the building you were in but the place was sealed from the outside somehow. Days pass and without anything to help you continue to survive, your journey has come to an end.");
        defeat();
    }

    private void askToUseTheBathroom()
    {
        Util.clearConsole();
        System.out.println("You ask to use the bathrooom to see where you would have to go to use it. To your suprise the guard starts opening you cell door and you follow them to a small room with a toliet, the guard tells you not try anything dumb and walks away. Looking around in the room, you see a red door ominously placed to the far left to the room. You really start to question if this is real life but now are left thinking if you should open the door or call for the guard and have them examine the door for you?");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            openRedDoor();
        }
        else if (choice == 2)
        {
            letTheGuardExamineIt();
        }
    }

    private void doNothing()
    {
        Util.clearConsole();
        System.out.println("You choose not to do anything dumb as your already in a bad enough situation. Days pass and you still are in poor condition. Weeks by this point and it seems nothing good has even come from this choice. A month and by now, the amount of poor treatment from the soldiers has weakened you horribly. One day you, feeling tired you choose to take a nap..only this nap was a eternal nap that you never woke up from...");
        defeat();
    }

    private void openRedDoor()
    {
        Util.clearConsole();
        System.out.println("You decide to opent the red door, not really suprsing, the door lead to nothing but darkness, never the less you still walk through it, thinking it won't be able to get worse, the darkness kept on getting worse. Walking still not even being able to see whats in front of you, the darkness continues. Soon the wandering in the darkenss makes you get lost in the abyss this place was...if only you had maybe decided to search for anything..maybe it would have helped you..");
        defeat();
    }

    private void letTheGuardExamineIt()
    {
        Util.clearConsole();
        System.out.println("You call the guard to examine it as you did not want to chance another door. The guard walks over and examines it, the guard tell you to go back to your cell and yells in Japanese to the other gurads pressumbly to look at it to, clearly this door wasn't there before. Hours pass and the guards that went to examine it weren't seen, in fact they were never seen again. You walk to the bathroom and notice the door is now gone, you were all alone in the building you were in but the place was sealed from the outside somehow. Days pass and without anything to help you continue to survive, your journey has come to an end.");
        defeat();
    }

    private void defeat()
    {
        //run method when defeated

        //lose a life
        numLives--;

        //clear console, display text, etc
        System.out.println("");

        //determine if player gets to play again
        if (numLives > 2)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            //print game over message
            System.out.println("GAME OVER");
        }
    }
    private void youWon()
    {
        numLives++;

        System.out.println("You won! Why not see what other choices leads you to in the Strain Area!");
        System.out.println("+1 Life");

        if (numLives > 0)
        {
            Util.pauseConsole();
            Util.clearConsole();
            start();
        }
    }
}