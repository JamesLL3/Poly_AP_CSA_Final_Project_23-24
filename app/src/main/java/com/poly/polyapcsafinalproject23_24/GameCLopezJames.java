package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameCLopezJames extends GameActivity {

    private int numLives;
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;
    //private int numLives;

    @Override
    protected void run() {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory =  findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("A Journey in The Strain Area");
        tvSubtitle("by James Lopez");
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

     private void tvSubtitle(String byJamesLopez) {
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

    //______FIRST DOOR PATH______

    private void openDoorOne()
    {

        String text = "Door 1 has you walk into chaos, people running, screaming THE CREATURE IS BACK IT'S BACK, " +
                "not hesitating you run and hide with a group of people in a abandoned mine shaft. " +
                "Do you get out to see the creature in question or stay hiding?";

        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Leave the mineshaft you are in");
        btn2.setText("Stay hiding in the mineshaft");
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
                stayHiding();
            }
        });
    }

    private void leaveMineShaft()
    {
        tvStoryText.setText("Getting out let’s you immediately see the mythical creature known as SUN//EATER, that does not hesitate to pubmed you to the ground and leaves you in an extreme searing amount of pain. Do you now stay where you are or make an effort to run away?");

        ivStory.setImageResource(R.drawable.im_sun_eater);

        setAllBtnsVisible();
        btn1.setText("stayWhereYouAre");
        btn2.setText("makeARunForIt");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {stayWhereYouAre(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { makeARunForIt(); }
        });
    }

    private void stayWhereYouAre()
    {
        tvStoryText.setText("You decide to stay where you are, suddenly the creature goes off in a different direction, after getting back up, you turn to see the group you left, but now you understand why the creature left,they were the reason the creature left you alone, they were it’s next target and now they're all gone. Now all alone, you look around and see a door, do you go towards it or abandon the door and go a different direction?");

        ivStory.setImageResource(R.drawable.im_abandoned_left_mineshaft);

        setAllBtnsVisible();
        btn1.setText("stayWhereYouAre");
        btn2.setText("makeARunForIt");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { leaveTheDoor(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { makeARunForIt(); }
        });
    }

    private void goOpenTheDoor()
    {
        isWon = true;
        tvStoryText.setText("Going towards the door while in exponential pain, opening it reveals the real world, perfectly in front of a hospital to get yourself patched it!");


        ivStory.setImageResource(R.drawable.im_hospital_good_end);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { end(); }
        });
    }

    private void stayHiding()
    {
        isWon = false;
        tvStoryText.setText("You stayed inside the mineshaft with the rest of the people, but as piercing silence creeps on you, but in one second, the top of the mineshaft opens up, the creature had found all of you, with one swift motion, everyone seize to exist in the matter of seconds...");

        ivStory.setImageResource(R.drawable.im_sun_eater_found_you);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void makeARunForIt()
    {
        isWon = false;
        tvStoryText.setText("You attempted to make a run for it as a last ditch effort for any salvation, but this proves to be short lived as the creature quickly catches up to you and quickly you are erased by a swift attack...");

        ivStory.setImageResource(R.drawable.im_sun_eater_found_you_again);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void leaveTheDoor()
    {
        isWon = false;
        tvStoryText.setText("Angered by seeing another door knowing walking through a door lead you to here, you decide to abandon the door and walk elsewhere looking for any type of help. For what seemed like hours of walking you stop walking from exhausting but your whole body was weak to going where you collapse on the floor, you slowly lose your focus ans stability to be awake and fall asleep...only to never wake up...");

        ivStory.setImageResource(R.drawable.im_black_door);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }




    //______DOOR 2 PATH_______

    private void runFromDoorTwo()
    {
        ivStory.setImageResource(R.drawable.im_run_from_white_door_door_two);

        tvStoryText.setText("You choose to not open a single door and just RUN, now you can either run AWAY from the door or run PAST the door, which do you do?");

        setAllBtnsVisible();
        btn1.setText("Run away from the door");
        btn2.setText("Run PAST the door's direction");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { runAwayFromTheDoor(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { runPastTheDoor(); }
        });
    }

    private void runAwayFromTheDoor()
    {
        ivStory.setImageResource(R.drawable.im_fire_place_light_in_distance);

        tvStoryText.setText("You run away from the door, from a distance you can see a light in the distance just visible enough to know it's real, do you run towards the light or no?");

        setAllBtnsVisible();
        btn1.setText("RUN towards the light");
        btn2.setText("DON'T run towards the light");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goTowardsTheLight(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { runAwayFromTheDoor(); }
        });
    }


    private void goTowardsTheLight()
    {
        isWon = true;
        tvStoryText.setText("You go towards the light, and see someone had somehow made a campfire here of all places, you sit near the person and ask, what is this place? No response is given but all the strange man says to you, You want to leave here don't you? Your quiet but answer yes, the strange man hands you a drink that has a blackened color to it, drinking it tastes very bitter, but upon finishing the drink, it makes you feel sleepy and without much time to even process you knock out. You know awake in you bed as if it was all a dream, was it a dream? Was it all real? It felt so real, pushing those thoughts aside you lived your normal everyday life from then on.");

        ivStory.setImageResource(R.drawable.im_person_in_front_of_fire_place);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }


    private void runAwayFromTheLight()
    {
        isWon = false;
        tvStoryText.setText("You decided to not chance the light as it can be a trap, going a different direction you walk an endless abyss of pitch black darkness, far into your journey you fall to your knee from exhaustion wondering if there even was a way out of this place..if you can even call it a place..more like an infinite void of pitch black darkness. You fall and lay on the ground, the last thing you thought of was that light you saw earlier...wishing you had gone towards it.");

        ivStory.setImageResource(R.drawable.im_abandoned_desolate_area);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void runPastTheDoor()
    {
        ivStory.setImageResource(R.drawable.im_hall_that_splits_into_two);

        tvStoryText.setText("Running past the doors direction leads you to a strange hall area that has a left or right area to go through, do you either go left or right?");

        setAllBtnsVisible();
        btn1.setText("Go left");
        btn2.setText("Go right");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goLeft(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { goRight(); }
        });
    }

    private void goLeft()
    {
        isWon = true;
        tvStoryText.setText("Going left, it's pitch black, to the point that you fall into a deep hole in the ground which you could not see well because of the darkness, but as you hit the ground, you’re back in the real world in your bed, as if it was bad dream and somehow you made the exact right choices to wake up from this...let's say nightmare, it was all just a...nightmare...right?");

        ivStory.setImageResource(R.drawable.im_good_end_bed_fall_into_hole);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void goRight()
    {
        tvStoryText.setText("Going right...well wasn't right this time, get it? As your walking in this area as you see an unworldly creature roaming the area, it seems it hasn't noticed you though. Now having to quickly think on what to do, either walk backwards quietly or run for you life in the opposite direction");
        ivStory.setImageResource(R.drawable.im_sun_eater_has_not_found_you_yet);

        setAllBtnsVisible();
        btn1.setText("Walk back very..very...quietly");
        btn2.setText("RUN FOR YOUR LIFE AHHHHHHHH");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { walkBackQuietly(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { runForYourLife(); }
        });
    }

    private void walkBackQuietly()
    {
        isWon = false;
        tvStoryText.setText("You walk back quietly and the creature seemed to have vanished from your line of sight as if it wondered off somewhere else...you turn back to walk back out of this area but as soon as you turn around..the creature was there the whole time...waiting for you. Your journey has come to an end...");

        ivStory.setImageResource(R.drawable.im_sun_eater_found_you_path_two_door_two);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }


    private void runForYourLife()
    {
        isWon = false;
        tvStoryText.setText("You decide to just RUN FOR YOU LIFE. Although the creature did notice you because of the noise, you found the entrance of the area you entered, hiding behind the wall of this split hallway, you feel safety...not until you look up and see the creature...it slowly creeped its way up on you to catch you by surprise..only seeing it ruined the surprised it had planed for you foolish decision...");

        ivStory.setImageResource(R.drawable.im_sun_eater_found_you_foolish_decision);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }




    //______DOOR THREE PATH______
    private void openDoorThree()
    {
        tvStoryText.setText("You decide to open three, immediately you are somewhere unrecognizable, it's real life but some place you've never been, someone walks up to you and says あなたはアメリカン人ですか which is Japanese, you are somehow in Japan of all places, with little to no knowledge of the Japanese language, you foolishly say in the most american accent こんにちは as you hear it's constantly used in Anime you've watched before you ended up in this situation, except this isn't one you are in. The Japanese soldier now knowing your american quickly put's a bag over you head, another hitting the back of your knee to fall and you are taking somewhere you don't know. Do you know ask where are you're being taken or try to communicate with the soldiers?");
        ivStory.setImageResource(R.drawable.im_path_three_start);

        setAllBtnsVisible();
        btn1.setText("Ask questions");
        btn2.setText("Try your best and communicate");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { askQuestions(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { tryAndCommunicate(); }
        });
    }

    private void askQuestions()
    {
        tvStoryText.setText("You start asking frantic questions like WHERE AM I GOING, WHY AM I BEING TAKEN SOMEWHERE, WHAT HAVE EVEN DONE!? At some point one the soldiers just says SHUSH AMERICAN. You soon get the bag taken off your head and see a prison cell, your immediately thrown inside and locked inside of it. You still wonder why this is happening until you hear a nearby radio say the current time you are in year 1943, the year where the war between America and Japan where still taking place, realizing why you are now taken in, now you wonder what to do. Do you either look around for anything to help you or someone or fall asleep on the bed to kill some time?");
        ivStory.setImageResource(R.drawable.im_thrown_in_jail_first_time);

        setAllBtnsVisible();
        btn1.setText("Look around for anything to aid you in your situation");
        btn2.setText("Catch some probably needed sleep");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { lookAroundForHelp(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { fallAsleep(); }
        });
    }


    private void lookAroundForHelp()
    {
        tvStoryText.setText("You look around for anything to help you out, you find a fully functional phone on the floor with full battery and no password! But only downside is there is no reception at all making not so useful to help you now, you soon decide to fall asleep to kill some time. Now awaken, you see a guard sitting next to your cell, they appear to be not so old as the other ones but still fairly enough to be one. You wonder if you should try talking to the guard to see if they know any english, or do something abrupt to get the guards attention?");
        ivStory.setImageResource(R.drawable.im_in_jail_phone_on_floor);

        setAllBtnsVisible();
        btn1.setText("Try and talk with the guard");
        btn2.setText("Do something completely useless and abrupt to get the guards attention");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { talkToTheGuard(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { doSomethingAbrupt(); }
        });
    }


    private void talkToTheGuard()
    {
        tvStoryText.setText("You try to talk the guard, the guard looks up at you and say's What do you want inmate. Cold as ice but you still persist and ask questions about the situation you walked into, the guard although annoyed answers your questions and you figured that yes, there currently is a war happening against America and Japan and you an American is in Japan. You know question if you can see how far you can go in this place without any restrictions. Do you see if you can end up leaving you cell to examine the place or don't even try to do anything dumb that can end horribly");
        ivStory.setImageResource(R.drawable.im_ask_for_bathroom_or_sleep);

        setAllBtnsVisible();
        btn1.setText("Ask to use the bathroom to wonder a bit");
        btn2.setText("Don't try anything dumb to draw any unwanted attention");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { talkToTheGuard(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { doSomethingAbrupt(); }
        });
    }


    private void askTheGuardForBathroom()
    {
        tvStoryText.setText("You ask the guard where can you use the bathroom, to your surprise the guard starts opening you cell door and you follow them to a small room with a toilet, the guard tells you not try anything dumb and walks away. Looking around in the room, you see a red door ominously placed to the far left to the room. You really start to question if this is real life but now are left thinking if you should open the door or call for the guard and have them examine the door for you?");
        ivStory.setImageResource(R.drawable.im_red_door_now_appears);

        setAllBtnsVisible();
        btn1.setText("Open the ominous red door that awaits any type of fate");
        btn2.setText("Call the guard over to come examine it FOR you");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openRedDoor(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { letTheGuardExamineIt(); }
        });
    }


    private void openTheRedOminousDoor()
    {
        isWon = true;
        tvStoryText.setText("Taking your chances once again, you open the door feeling very unsure about your choice, and to your luck, since you found a phone earlier, you used it's flashlight to navigate yourself only to find out you have returned to the Strain Area once again but more darker than before. You hear someone behind you yell something, turning around you see it's the guard and you start running with the guard behind you. Suddenly it gets quiet and turning the guard has disappeared. Not questioning it you still run but your vision begins to blur and a sense of fatigue passes over you in an instant, you try to fight it but it was overwhelming and you lose to it. You wake up in your home, though ironically at the front door on the ground with the phone you had picked up at that jail cell, strangely enough it still worked as normal. Questioning if it was a dream you don;t open the front door and just live your everyday life afterwards.");

        ivStory.setImageResource(R.drawable.im_good_end_bed_fall_into_hole);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }


    private void tryAndCommunicate()
    {
        tvStoryText.setText("You attempt to communicate with them but to the soldiers but in turn it made you sound like a mentally unwell person, and so the soldiers thinking your no use to them...they made you take a nap..and eternal one to say");

        ivStory.setImageResource(R.drawable.im_taken_outside_to_well_yeah);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void fallAsleep()
    {
        tvStoryText.setText("You just decide to fall asleep since it looked as if you were in a no win situation. You awake later and see a guard now in the vicinity of your cell, you wonder to yourself if you can possibly ask the guard to use the bathroom to leave your cell, or do nothing to not get into any more trouble.");
        ivStory.setImageResource(R.drawable.im_thrown_in_jail_first_time);

        setAllBtnsVisible();
        btn1.setText("Ask to use the bathroom to wonder a bit");
        btn2.setText("Don't try anything dumb to draw any unwanted attention");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { askToUseTheBathroom(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { doNothing(); }
        });
    }

    private void doSomethingAbrupt()
    {
        tvStoryText.setText("You decide to do something abrupt to get the guards attention, and in your smart self, yelling of course was a great thing to do. You yell at the top of your lungs to the guard WHY AM I HERE, I DID NOTHING WRONG. The guard, surprised your yells goes into a different room and yells 彼を罰してください! Unsure what they yelled, you awaited to see what would happen. Your taken out of your cell! But not for anything good as a big once again goes over your heard and when dragged to what sounds like the outside, in one second..your journey has come to an end...");

        ivStory.setImageResource(R.drawable.im_taken_outside_to_well_yeah);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void dontTryAnythingDumb()
    {
        tvStoryText.setText("You choose not to do anything dumb as your already in a bad enough situation. Days pass and you still are in poor condition. Weeks by this point and it seems nothing good has even come from this choice. A month and by now, the amount of poor treatment from the soldiers has weakened you horribly. One day you, feeling tired you choose to take a nap..only this nap was a eternal nap that you never woke up from...");

        ivStory.setImageResource(R.drawable.im_thrown_in_jail_first_time);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void callTheGuardToExamineIt()
    {
        tvStoryText.setText("You call the guard to examine it as you did not want to chance another door. The guard walks over and examines it, the guard tell you to go back to your cell and yells in Japanese to the other guards presumably to look at it to, clearly this door wasn't there before. Hours pass and the guards that went to examine it weren't seen, in fact they were never seen again. You walk to the bathroom and notice the door is now gone, you were all alone in the building you were in but the place was sealed from the outside somehow. Days pass and without anything to help you continue to survive, your journey has come to an end.");

        ivStory.setImageResource(R.drawable.im_guard_inspects_door);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void askToUseTheBathroom()
    {
        tvStoryText.setText("You ask to use the bathroom to see where you would have to go to use it. To your surprise the guard starts opening you cell door and you follow them to a small room with a toilet the guard tells you not try anything dumb and walks away. Looking around in the room, you see a red door ominously placed to the far left to the room. You really start to question if this is real life but now are left thinking if you should open the door or call for the guard and have them examine the door for you?");
        ivStory.setImageResource(R.drawable.im_ask_for_bathroom_or_sleep);

        setAllBtnsVisible();
        btn1.setText("Ask to use the bathroom to wonder a bit");
        btn2.setText("Don't try anything dumb to draw any unwanted attention");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { talkToTheGuard(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { doSomethingAbrupt(); }
        });
    }

    private void doNothing()
    {
        isWon = false;
        tvStoryText.setText("You choose not to do anything dumb as your already in a bad enough situation. Days pass and you still are in poor condition. Weeks by this point and it seems nothing good has even come from this choice. A month and by now, the amount of poor treatment from the soldiers has weakened you horribly. One day you, feeling tired you choose to take a nap..only this nap was a eternal nap that you never woke up from...");

        ivStory.setImageResource(R.drawable.im_thrown_in_jail_first_time);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void openRedDoor()
    {
        isWon = false;
        tvStoryText.setText("You decide to open the red door, not really surprising, the door lead to nothing but darkness, never the less you still walk through it, thinking it won't be able to get worse, the darkness kept on getting worse. Walking still not even being able to see whats in front of you, the darkness continues. Soon the wandering in the darkness makes you get lost in the abyss this place was...if only you had maybe decided to search for anything..maybe it would have helped you...");

        ivStory.setImageResource(R.drawable.im_went_inside_the_red_door);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });

    }

    private void letTheGuardExamineIt()
    {
        isWon = false;
        tvStoryText.setText("You call the guard to examine it as you did not want to chance another door. The guard walks over and examines it, the guard tell you to go back to your cell and yells in Japanese to the other guards presumably to look at it to, clearly this door wasn't there before. Hours pass and the guards that went to examine it weren't seen, in fact they were never seen again. You walk to the bathroom and notice the door is now gone, you were all alone in the building you were in but the place was sealed from the outside somehow. Days pass and without anything to help you continue to survive, your journey has come to an end.");

        ivStory.setImageResource(R.drawable.im_thrown_in_jail_first_time);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
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

    private void end()
    {
        if (isWon)
        {
            tvStoryText.setText("Its a labor day miracle! You get to live the whole day over again!");

            ivStory.setImageResource(R.drawable.im_laborday_miracle);
        }
        else
        {
            numLives--;
            String text = "You wasted an entire year of high school. You have " + numLives + " years remaining";
            tvStoryText.setText(text);
        }

        if (numLives > 0)
        {
            btn1.setText("Play again!");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start();
                }
            });
        }
        else
        {
            tvStoryText.setText("You won! Why not see what other choices leads you to in the Strain Area!");
            btn1.setText("Back to menu");

            ivStory.setImageResource(R.drawable.im_laborday_high_school_over);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(GameCLopezJames.this, MainActivity.class));
                }
            });
        }
    }


}