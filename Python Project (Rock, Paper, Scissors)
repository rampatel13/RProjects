# This is my first ever Python project that I have ever done! 
# I scored 100% for doing this project on my culminating..
# The code is around 1.5k+ lines

import time
import random
import os

wait = time.sleep
do = os.system

#               -- Welcome Page -- 
print("Hello...")
print("Welcome to Ultimate (⭐ ) Rock Paper Scissors!")
Assistant = str(input("Name your assistant: "))
Assist = 1
while Assist == 1:
  # No Characters
  if Assistant == "":
    print("Error...")
    wait(2)
    print("Your guide needs a name!")
    wait(1)
    do('clear')
    Assist = 1
    print("Hello...")
    print("Welcome to Ultimate (⭐) Rock Paper Scissors!")
    Assistant = str(input("Enter your guide's name: "))    
  # Guide Name Generated
  else:
    Assist = 2
    print("Hi my name is", Assistant,"and I will guide you throughout the game!")
    print("")
#               -- Login Page --
print("-- Sign Up --")
fn = input("Enter your first name: ")
ln = input("Enter your last name: ")
name = 1
while name == 1:
  if fn == "" or ln == "":
    print("Error...")
    wait(2)
    print("Your first or last name does not have a letter!!")
    wait(2.5)
    do('clear')
    name = 1
    print("-- Sign Up --")
    fn = input("Enter your first name: ")
    ln = input("Enter your last name: ")
  else:
    name = 2
fn2 = fn[0:1]
ln2 = ln[0:1]
fn2 = fn2.capitalize()
ln2 = ln2.capitalize()
username = fn2 + ln2
print("Generating Initials...")
wait(1)
print("Generated!")
print("Here is your initial!","(",username,")")
wait(3.5)
print("Number must be 4 Digits only")
Number = int(input("Enter your number: "))
num = 2
while num == 2:
  if Number < 1000 or Number > 9999:
    num = 2
    print("The number is not 4 digits...")
    wait(1)
    do('clear')
    print("Number must be 4 Digits only")
    Number = int(input("Enter your number: "))
  elif Number > 1000 or Number < 9999:
    num = 1
    username = username + str(Number)
    print("Your username is generated!")
    wait(0.5)
    print("Here is your Username!")
    print(username)
print("Now I will teleport you to the menu!")
wait(2.5)
print("Please wait... [Teleporting]")
wait(1.5)
do('clear')
#                   -- Menu -- 
def main():
  print("[",Assistant,"]","Hello I'm back! As you know this is the menu!")
  wait(1.25)
  print("[",Assistant,"]","Do you need a guide on how to play?")
  wait(0.75)
  print("Y/y = Yes and N/n = No)")
  guideChoice = str(input("(Y) or (N): "))
  guideChoice = guideChoice.lower()
  #                   -- How to Play -- 
  i = 1
  while i == 1:
    if guideChoice == "y":
      i = 2
      print("-- How to Play -- ")
      print("1. Choose how many rounds you want!")
      print("2. Choose your gamemode!")
      print("3. Your goal is to get the most points!")
      print("4. The person with the most points win or moves on to the next level!")
      print("")
      print("-- Rock, Paper, or Scissors? --")
      print("1. You will go against a bot")
      print("2. You will be prompt a countdown timer! ")
      print("3. You will enter one out of the 3 commands provided!")
      print("4. Rock beats Scissors!")
      print("5. Paper beats Rock")
      print("6. Scissors beat Paper")
      print("7. If your command is the same then it will be a tie!")
      str(input("Enter if you are done: "))

    elif guideChoice == "n":
      i = 2
    if guideChoice == "y" or guideChoice == "n":
      print("Skipping Guide...")
      wait(1.25)
      print("Starting Game...")
      wait(1)
      do('clear')

    else:
      do('clear')
      i = 1
      print("You must use [y for yes] and [n for no]")
      guideChoice = str(input("(y) or (n): "))


  #                   -- Rounds -- 

  print("normalround [nr] or tournament [t]")
  RoundChooser = str(input("Which round do you wanna play?: "))
  #                   -- Normal Round -- 
  r = 1
  while r == 1:
    if RoundChooser == "nr" or RoundChooser == "normalround":
      r = 2
      do('clear')

  #                -- Round Selector -- 
      print("[Min: 1] and [Max: 10]")
      Rounds = int(input("How many rounds do you want?: "))
      Q = 2
      while Q == 2:
        if Rounds > 0 and Rounds < 11:
         Q = 1
         print("Playing Game...")
         wait(1)
         print("Please wait...")
         wait(1.5)
         print("[0%]")
         wait(1.5)
         do('clear')
         print("[25%]")
         wait(1.5)
         do('clear')
         print("[50%]")
         wait(1.5)
         do('clear')
         print("[75%]")
         wait(1.5)
         do('clear')
         print("[100%]")
         wait(1.5)
         do('clear')
         print("Loaded!")
         wait(2)
         do('clear')
         # Point System
         BotPoints = 0
         PlayerPoints = 0
         # Bot Commands
         bot = random.randint(1,3)
         if bot == 1:
           bot = "Rock"
         elif bot == 2:
           bot = "Paper"
         elif bot == 3:
            bot = "Scissors"
         # NormalRound [Game]
         print("Welcome!",username)
         print("to Rock, Paper, Scissors! [Normal mode]")
         wait(2.5)
         print("You have selected",Rounds,"rounds!")
         wait(1.5)
         do('clear')
         print("Here are the current stats!")
         wait(0.75)
         print("-- Stats --")
         print(username,":",PlayerPoints)
         print("Bot",":",BotPoints)
         str(input("Enter to continue: "))
         print("Starting Game...")
         wait(0.85)
         do('clear')

         player = str(input("Rock, Paper, or Scissors?: "))
         D = 2
         if player == "Rock" or player == "Paper" or player == "Scissors":
           do('clear')
           print("Rock")
           wait(1)
           do('clear')
           print("Paper")
           wait(1)
           do('clear')
           print("Scissors")
           wait(1)
           do('clear')
           print("Shoot")
           wait(1)
           do('clear')
           D = 1

         D = 1
         while D == 1:
           if player == "Rock" or player == "Paper" or player == "Scissors":
             D = 2
             # Rock, Paper, Scissors Game
             print("Your command has been sent...")
             wait(1)
             print("[YOU]",username,"has selected",player)
             print("The Bot has selected", bot)
             # Player Win
             if player == "Rock" and bot == "Scissors" or player == "Paper" and bot == "Rock" or player == "Scissors" and bot == "Paper":
               print("You Win! 🥳")
               print("You earned 1 Point!")
               Rounds = Rounds - 1
               PlayerPoints = PlayerPoints + 1
               wait(3)
               do('clear')
               print("Here are the stats!!!")
               print("-- Stats --")
               print(username,":",PlayerPoints)
               print("Bot",":",BotPoints)
               print("Rounds Left",":",Rounds)
               str(input("Enter to continue: "))
               bot = random.randint(1,3)
               if bot == 1:
                 bot = "Rock"
               elif bot == 2:
                 bot = "Paper"
               elif bot == 3:
                 bot = "Scissors"
               do('clear')
               # Player
               D = 2
               if Rounds == 0:
                 do('clear')
                 D = 2
                 str(input("Enter to continue: "))
                 # End Results
               if Rounds == 0:
                print("The game has ended!")
                wait(1)
                print("Final Results!")
                wait(1)
                do('clear')
                print("-- Stats --")
                print(username,":",PlayerPoints)
                print("Bot",":",BotPoints)
                if PlayerPoints > BotPoints:
                  print("You Won!")
                  wait(1)
                  print("Congrats!")
                  Next = str(input("Enter: "))
                  if Next == Next:
                    do('clear')
                    print("Teleporting back to menu!")
                    wait(1)
                    print("Please wait for a few seconds!")
                    wait(3)
                    print("Loading...")
                    wait(1.5)
                    do('clear')
                    main()
                  # Loop HERE

                elif BotPoints > PlayerPoints:
                  print("You Lost!")
                  wait(1)
                  print("It's alright! You did well!")
                  Next = str(input("Enter: "))
                  if Next == Next:
                    do('clear')
                    print("Teleporting back to menu!")
                    wait(1)
                    print("Please wait for a few seconds!")
                    wait(3)
                    print("Loading...")
                    wait(1.5)
                    do('clear')
                    main()
                  # Loop HERE

                elif BotPoints == PlayerPoints:
                  print("You tied with the bot!")
                  wait(1)
                  print("Overall, great job! Keep up the effort")
                  Next = str(input("Enter: "))
                  if Next == Next:
                    do('clear')
                    print("Teleporting back to menu!")
                    wait(1)
                    print("Please wait for a few seconds!")
                    wait(3)
                    print("Loading...")
                    wait(1.5)
                    do('clear')
                    main()
                  # Loop HERE

               else:
                 D = 1
                 player = str(input("Rock, Paper, or Scissors?: "))
                 if player == "Rock" or player == "Paper" or player == "Scissors":
                   do('clear')
                   print("Rock")
                   wait(1)
                   do('clear')
                   print("Paper")
                   wait(1)
                   do('clear')
                   print("Scissors")
                   wait(1)
                   do('clear')
                   print("Shoot")
                   wait(1)
                   do('clear')

               # Player Tie
             elif player == bot:
               print("You tied with the bot! 😲")
               print("No one earned any points, but nice try!")
               Rounds = Rounds - 1
               wait(3)
               do('clear')
               print("Here are the stats!!!")
               print("-- Stats --")
               print(username,":",PlayerPoints)
               print("Bot",":",BotPoints)
               print("Rounds Left",":",Rounds)
               str(input("Enter to continue: "))
               bot = random.randint(1,3)
               if bot == 1:
                 bot = "Rock"
               elif bot == 2:
                 bot = "Paper"
               elif bot == 3:
                  bot = "Scissors"
               do('clear')
               # Player
               D = 2
               if Rounds == 0:
                 do('clear')
                 D = 2
                 str(input("Enter to continue: "))
                   # Loop HERE

                 # End Results
                 if Rounds == 0:
                  print("The game has ended!")
                  wait(1)
                  print("Final Results!")
                  wait(1)
                  do('clear')
                  print("-- Stats --")
                  print(username,":",PlayerPoints)
                  print("Bot",":",BotPoints)
                  if PlayerPoints > BotPoints:
                    print("You Won!")
                    wait(1)
                    print("Congrats!")
                    Next = str(input("Enter: "))
                    if Next == Next:
                      do('clear')
                      print("Teleporting back to menu!")
                      wait(1)
                      print("Please wait for a few seconds!")
                      wait(3)
                      print("Loading...")
                      wait(1.5)
                      do('clear')
                      main()
                    # Loop HERE


                  elif BotPoints > PlayerPoints:
                    print("You Lost!")
                    wait(1)
                    print("It's alright! You did well!")
                    Next = str(input("Enter: "))
                    if Next == Next:
                      do('clear')
                      print("Teleporting back to menu!")
                      wait(1)
                      print("Please wait for a few seconds!")
                      wait(3)
                      print("Loading...")
                      wait(1.5)
                      do('clear')
                      main()
                    # Loop HERE


                  elif BotPoints == PlayerPoints:
                    print("You tied with the bot!")
                    wait(1)
                    print("Overall, great job! Keep up the effort")
                    Next = str(input("Enter: "))
                    if Next == Next:
                      do('clear')
                      print("Teleporting back to menu!")
                      wait(1)
                      print("Please wait for a few seconds!")
                      wait(3)
                      print("Loading...")
                      wait(1.5)
                      do('clear')
                      main()
                    # Loop HERE


               else:
                  D = 1
                  player = str(input("Rock, Paper, or Scissors?: "))
               if player == "Rock" or player == "Paper" or player == "Scissors":
                 do('clear')
                 print("Rock")
                 wait(1)
                 do('clear')
                 print("Paper")
                 wait(1)
                 do('clear')
                 print("Scissors")
                 wait(1)
                 do('clear')
                 print("Shoot")
                 wait(1)
                 do('clear')


               # Player Lose
             elif player == "Rock" and bot == "Paper" or player == "Paper" and bot == "Scissors" or player == "Scissors" and bot == "Rock":
               print("You Lost! 😭")
               print("Bot earned 1 point! Nice try!")
               Rounds = Rounds - 1
               BotPoints = BotPoints + 1
               wait(3)
               do('clear')
               print("Here are the stats!!!")
               print("-- Stats --")
               print(username,":",PlayerPoints)
               print("Bot",":",BotPoints)
               print("Rounds Left",":",Rounds)
               str(input("Enter to continue: "))
               bot = random.randint(1,3)
               if bot == 1:
                 bot = "Rock"
               elif bot == 2:
                  bot = "Paper"
               elif bot == 3:
                  bot = "Scissors"
               do('clear')
               D = 1
               # Player
               if Rounds == 0:
                 do('clear')
                 D = 2
                 str(input("Enter to continue: "))
               # End Results
                 if Rounds == 0:
                   print("The game has ended!")
                   wait(1)
                   print("Final Results!")
                   wait(1)
                   do('clear')
                   print("-- Stats --")
                   print(username,":",PlayerPoints)
                   print("Bot",":",BotPoints)
                 if PlayerPoints > BotPoints:
                   print("You Won!")
                   wait(1)
                   print("Congrats!")
                   Next = str(input("Enter: "))
                   if Next == Next:
                     do('clear')
                     print("Teleporting back to menu!")
                     wait(1)
                     print("Please wait for a few seconds!")
                     wait(3)
                     print("Loading...")
                     wait(1.5)
                     do('clear')
                     main()
                   # Loop HERE


                 elif BotPoints > PlayerPoints:
                   print("You Lost!")
                   wait(1)
                   print("It's alright! You did well!")
                   Next = str(input("Enter: "))
                   if Next == Next:
                     do('clear')
                     print("Teleporting back to menu!")
                     wait(1)
                     print("Please wait for a few seconds!")
                     wait(3)
                     print("Loading...")
                     wait(1.5)
                     do('clear')
                     main()
                   # Loop HERE


                 elif BotPoints == PlayerPoints:
                   print("You tied with the bot!")
                   wait(1)
                   print("Overall, great job! Keep up the effort")
                   Next = str(input("Enter: "))
                   if Next == Next:
                     do('clear')
                     print("Teleporting back to menu!")
                     wait(1)
                     print("Please wait for a few seconds!")
                     wait(3)
                     print("Loading...")
                     wait(1.5)
                     do('clear')
                     main()
                   # Loop HERE

               else:
                  D = 1
                  player = str(input("Rock, Paper, or Scissors?: "))
                  if player == "Rock" or player == "Paper" or player == "Scissors":
                    do('clear')
                    print("Rock")
                    wait(1)
                    do('clear')
                    print("Paper")
                    wait(1)
                    do('clear')
                    print("Scissors")
                    wait(1)
                    do('clear')
                    print("Shoot")
                    wait(1)
                    do('clear')


           # Command Loops
           elif player == "rock" or player == "paper" or player == "scissors":
             do('clear')
             D = 1
             wait(1)
             print("Your Command's first letter has to be captial!")
             player = str(input("Rock, Paper, or Scissors?: "))
           else:
             do('clear')
             D = 1
             wait(1)
             player = str(input("Rock, Paper, or Scissors?: "))

  #           -- Round Selector Loops -- 
        else:
          do('clear')
          Q = 2
          print("[Min: 1] and [Max: 10]")
          Rounds = int(input("How many rounds do you want?: "))


  #                   -- Tournament -- 
    elif RoundChooser == "tournament" or RoundChooser == "t":
      # Welcome
      do('clear')
      print("[",Assistant,"]","You have arrived",username,"to this massive arena of bots!!")
      wait(1)
      print("[",Assistant,"]","Well, these bots will surely have a unique name assigned to them!")
      wait(1)
      str(input("Enter to continue: "))
      do('clear')
      print("[",Assistant,"]","Anyways... Do you want a basic guide of how this tournament will work?")
      wait(2)
      print("y = yes and n = no [all letters has to be lowercase!")
      ArenaGuide = str(input("y or n: "))
      if ArenaGuide == "y":
        print("-- How To Play [Tournament]")
        print("1. You will have to go against 10 bots in total!")
        print("2. There will be 4 stages!")
        print("3. Each bot will get more intense as you move on!")
        print("4. Pre-Quarter Finals will have 1 bot")
        print("5. Quarter-Finals will have 2 bots")
        print("6. Semi-Finals will have 3 bots!")
        print("7. Finale will have 4 bots!")
        print("8. For all 4 stages! You must reach 5 points or above to qualify!")
        print("")
        print(" --- Types of Bots --- ")
        print("Spy Bot 😎/ Reduces 0.5 points from the player and gains 0.5 points from the player!")
        print("Drainer Bot 😈/ Reduces 0.5 points from the player!")
        print("Human Bot🙂/ Fair and Square")
        print("Rich Bot💸/ Increases players points by 0.5! [1.5x]")
        print("VIP Bot👑/ Increases players points by 1! [2x]")
        print("Lucky Bot🍀/ Incrases players points 1.5! [2.5x]")
        print("")
        print("--- Rarities ---")
        print("Spy Bot 😎 - Massively Unlucky")
        print("Drainer Bot 😈 - Unlucky")
        print("Human Bot🙂 - Common")
        print("Rich Bot💸 - Rare")
        print("VIP Bot👑 - Legendary")
        print("Lucky Bot🍀 - Mythic (JACKPOT)")
        print("")
        print("--- Events [Semi-Finals] ---")
        print("🎮 - Arcade [Semi-Finals] (You get 2 Extra Points) [25%]")
        print("👽 - Invasion [Semi-Finals] (You will Lose 2 Points) -- You will go in negatives! [25%]")
        print("🍀❌ - Lucky or Not [Semi-Finals] (You have a 50%/50% chance! of gaining +1 point or losing -1 point -- May go in Negatives! [50%]")
        print("")
        print("--- Events [Finale] ---")
        print("😈 - Point Eater (Its over! You lost!) [25%]")
        print("👻 - Ghost (You get cursed and lose 0.5 points! -- You may go in negatives [25%]")
        print("⭐ - Bonus (You will get a spam full of 15 bonuses of 0.1 points each! [1.5 Point] [25%]")
        print("👑 - JACKPOT (You Win!) You will have 5 Points! [25%]")
        print("")
        print("The semi-finals/finale events will roll these events [ONE-TIME] and you will get lucky or unlucky!")
        print("You will get extra points from bots that increases points if you win!")
        print("If you lose against the bot or tie with the bot, then it won't make a difference!")
        str(input("Enter if you are done: "))
      if ArenaGuide == "n":
        do('clear')
        print("Skipping Guide...")
        wait(2)
      if ArenaGuide == "y" or ArenaGuide == "n":
        do('clear')
        print("[",Assistant,"]","Before starting the game..")
        print("[",Assistant,"]","Say yes or go on to continue...")
        exit = str(input("Would you like to go back to the guide?: "))
        if exit == "Y" or exit == "y" or exit == "yes" or exit == "Yes":
          print("[",Assistant,"]","Taking you back to the guide!")
          wait(2)
          do('clear')
          wait(0.5)
          main()
        else:
          do('clear')
          # Bot Selector
          print("Starting Game...")
          print("-- Opponent Selection --")
          bots = ["[🙂] James","[🍀] Ethan","[👑] Jack","[🙂] Drake","[💸] Ronald","[🙂] Mike","[🍀] Ram","[🙂] Carl","[🙂] Sam"]
          bot1 = random.choice(bots)
          print("[",Assistant,"]","Picking a opponent! ")
          wait(2)
          print("Your opponent is", bot1)
          if bot1 == "[💸] Ronald":
            print("You got a Rare Bot!")
          if bot1 == "[👑] Jack":
            print("You got a Legendary Bot!!")
          if bot1 == "[🍀] Ethan" or bot1 == "[🍀] Ram":
            print("JACKPOT!! You got a MYTHIC Lucky Bot!!")
          else:
            print("")
          str(input("Enter to continue: "))
          print("Starting Round Please wait!")
          wait(2.5)
          do('clear')
          print("Loading.[0%]")
          wait(0.75)
          do('clear')
          print("Loading..[25%]")
          print(0.75)
          do('clear')
          print("Loading...[50%]")
          wait(0.75)
          do('clear')
          print("Loading....[75%]")
          wait(0.75)
          do('clear')
          print("Loading....[100%]")
          wait(0.75)
          do('clear')
          print("Loaded!")
          wait(0.75)
          do('clear')
          # Point System
          PlayerPoint = 0
          BotPoint1 = 0
          # Welcome [Pre Quarter-Finals]
          print("[",Assistant,"]","Welcome to Pre Quarter-Finals!")
          print("[",Assistant,"]","Here are the beginning stats!")
          print(username,":", PlayerPoint)
          print(bot1,":", BotPoint1)
          str(input("Enter to continue: "))
          do('clear')
          print("[",Assistant,"]","You will go against 1 bot!")
          print("Your goal is to reach 5 points or above before the bot reaches that mark!")
          wait(3)
          print("[",Assistant,"]","and the winner moves on to the next stage!")
          wait(2)
          str(input("Enter to continue: "))
          do('clear')
          # Game
          print("Ready....")
          wait(1)
          do('clear')
          print("Get Set....")
          wait(1)
          do('clear')
          print("GO.......")
          wait(1)
          do('clear')
          botone = bot1
          player = str(input("Rock, Paper, or Scissors: "))
          T = 1
          while True:
            while T == 1:
              if player == "Rock" or player == "Paper" or player == "Scissors":
                CMD = ["Rock","Paper","Scissors"]
                bot1 = random.choice(CMD)
                T = 2
                do('clear')
                wait(0.5)
                print("Command has been sent")
                # Player Wins
                if player == "Rock" and bot1 == "Scissors" or player == "Paper" and bot1 == "Rock" or player == "Scissors" and bot1 == "Paper":
                  T = 1
                  print("You Win! 🥳")
                  print("You earned 1 Point!")
                  print("")
                  print("-- Selected Commands --")
                  print("(YOU)",username,"selected",player)
                  print(botone,"selected",bot1)
                  PlayerPoint = PlayerPoint + 1
                  if botone == "[👑] Jack":
                    PlayerPoint = PlayerPoint + 1
                    print("Legendary!")
                    print("(⭐) Bonus 1 Point!")

                  if botone == "[🍀] Ram" or botone == "[🍀] Ethan":
                    PlayerPoint = PlayerPoint + 1.5
                    print("(🍀) JACKPOT")
                    print("(⭐) Bonus 1.5 Points!")

                  if botone == "[💸] Ronald":
                    PlayerPoint = PlayerPoint + 0.5
                    print("(⭐) Bonus 0.5 Points!")
                    str(input("Enter to continue: "))
                    # Stats
                    print("-- Stats --")
                    print(username,":",PlayerPoint)
                    print(botone,":",BotPoint1)
                    CMD = ["Rock","Paper","Scissors"]
                    bot1 = random.choice(CMD)


                  else:
                    T = 1
                    print("-- Stats --")
                    print(username,":",PlayerPoint)
                    print(botone,":",BotPoint1)
                    str(input("Enter to continue: "))
                    CMD = ["Rock","Paper","Scissors"]
                    bot1 = random.choice(CMD)

# Player TIES
                elif player == bot1:
                  T = 1
                  print("You tied with the bot! 😲")
                  print("No one earned any points, but nice try!")
                  print("")
                  print("-- Selected Commands --")
                  print("(YOU)",username,"selected",player)
                  print(botone,"selected",bot1)
                  print("")
                  print("-- Stats --")
                  print("")
                  print(username,":",PlayerPoint)
                  print(botone,":",BotPoint1)
                  str(input("Enter to continue: "))
                  CMD = ["Rock","Paper","Scissors"]
                  bot1 = random.choice(CMD)


                  # Player Loses
                elif player == "Rock" and bot1 == "Paper" or player == "Paper" and bot1 == "Scissors" or player == "Scissors" and bot1 == "Rock":
                  T = 1
                  print("You Lost! 😭")
                  print("Bot earned 1 point! Nice try!")
                  print("")
                  print("-- Selected Commands --")
                  print("(YOU)",username,"selected",player)
                  print(botone,"selected",bot1)
                  BotPoint1 = BotPoint1 + 1
                  print("")
                  print("-- Stats --")
                  print("")
                  print(username,":",PlayerPoint)
                  print(botone,":",BotPoint1)
                  str(input("Enter to continue: "))
                  CMD = ["Rock","Paper","Scissors"]
                  bot1 = random.choice(CMD)


              if PlayerPoint == 5 or PlayerPoint > 5:
                do('clear')
                T = 2
                print("You Won! 🥳")
                print("Moving on to the next stage!")
                wait(2.5)
                str(input("Enter to continue: "))
                do('clear')
                # Quarter-Finals [2 BOTS]
                # Welcome
                print("[",Assistant,"]","Welcome to the Quarter-Finals! You have made it!")
                print("I'm not here to scare you but...")
                wait(2)
                print("Everything now from this stage will get difficult!")
                wait(1.5)
                print("Winner will go to the sweet semi-finals!")
                wait(2.5)
                print("Good Luck!")
                str(input("Enter to continue: "))
                do('clear')
                print("[",Assistant,"]","Picking 2 Opponents!")
                print("Please wait!")
                # Bot Generator
                bots1 = ["[🍀] Dharm","[🙂] Jacob","[😈] Steven","[🙂] Matt","[💸] Marco","[🙂] Carlos","[🙂] Robert","[🙂] Tyler",]
                bot2 = random.choice(bots1)
                bot3 = random.choice(bots1)
                if bot2 == bot3:
                  random.choice(bots1)
                else:
                  print("Your Opponents are",bot2,"and",bot3)
                  if bot1 == "[😈] Steven":
                    print("You got a Unlucky Bot!")
                    str(input("Enter to continue: "))
                  if bot1 == "[💸] Marco":
                    print("You got a Rare Bot!")
                    str(input("Enter to continue: "))                 
                  if bot1 == "[🍀] Dharm":
                    print("JACKPOT!! You got a MYTHIC Lucky Bot!!")
                    str(input("Enter to continue: "))
                  else:
                    print("Starting Round Please wait!")
                    wait(2.5)
                  do('clear')
                  print("Loading.[0%]")
                  wait(0.75)
                  do('clear')
                  print("Loading..[25%]")
                  print(0.75)
                  do('clear')
                  print("Loading...[50%]")
                  wait(0.75)
                  do('clear')
                  print("Loading....[75%]")
                  wait(0.75)
                  do('clear')
                  print("Loading....[100%]")
                  wait(0.75)
                  do('clear')
                  print("Loaded!")
                  wait(0.75)
                  do('clear')
                  # Point System
                  PlayerPoint = 0
                  Bot1Points = 0
                  Bot2Points = 0
                  # Welcome [Quarter-Finals]
                  print("[",Assistant,"]","Welcome to Quarter-Finals!")
                  print("[",Assistant,"]","Here are the beginning stats!")
                  print(username,":", PlayerPoint)
                  print(bot2,":", Bot1Points)
                  print(bot3,":", Bot2Points)
                  str(input("Enter to continue: "))
                  do('clear')
                  print("[",Assistant,"]","You will go against 2 bots!")
                  wait(2)
                  print("Your goal is to reach 5 points or above before the bot reaches that mark!")
                  wait(3)
                  print("[",Assistant,"]","and the winner moves on to the next stage!")
                  wait(2)
                  str(input("Enter to continue: "))
                  do('clear')
                  # Game
                  print("Ready....")
                  wait(1)
                  do('clear')
                  print("Get Set....")
                  wait(1)
                  do('clear')
                  print("GO.......")
                  wait(1)
                  do('clear')
                  botone = bot2
                  bottwo = bot3
                  player = str(input("Rock, Paper, or Scissors: "))
                  T = 1
                  while True:
                    while T == 1:
                      if player == "Rock" or player == "Paper" or player == "Scissors":
                        CMD = ["Rock","Paper","Scissors"]
                        bot2 = random.choice(CMD)
                        bot3 = random.choice(CMD)
                        T = 2
                        do('clear')
                        wait(0.5)
                        print("Command has been sent")
                        # Player Wins
                        if player == "Rock" and bot2 == "Scissors" or player == "Paper" and bot2 == "Rock" or player == "Scissors" and bot2 == "Paper" or player == "Rock" and bot3 == "Scissors" or player == "Paper" and bot3 == "Rock" or player == "Scissors" and bot3 == "Paper":
                          T = 1
                          print("You Win! 🥳")
                          print("You earned 1 Point!")
                          print("")
                          print("-- Selected Commands --")
                          print("(YOU)",username,"selected",player)
                          print(botone,"selected",bot2)
                          print(bottwo,"selected",bot3)
                          PlayerPoint = PlayerPoint + 1
                          if botone == "[🍀] Dharm" or bottwo == "[🍀] Dharm":
                            PlayerPoint = PlayerPoint + 1.5
                            print("(🍀) JACKPOT")
                            print("(⭐) Bonus 1.5 Points!")

                          if botone == "[😈] Steven" or bottwo == "[😈] Steven":
                            PlayerPoint = PlayerPoint - 0.5
                            print("(😭) You lost 0.5 Points!")


                          if botone == "[💸] Marco" or bottwo == "[💸] Marco":
                            PlayerPoint = PlayerPoint + 0.5
                            print("(⭐) Bonus 0.5 Points!")
                            str(input("Enter to continue: "))
                            # Stats
                            print("-- Stats --")
                            print(username,":",PlayerPoint)
                            print(botone,":",Bot1Points)
                            print(bottwo,":",Bot2Points)
                            CMD = ["Rock","Paper","Scissors"]
                            bot1 = random.choice(CMD)


                          else:
                            T = 1
                            print("-- Stats --")
                            print(username,":",PlayerPoint)
                            print(botone,":",Bot1Points)
                            print(bottwo,":",Bot2Points)
                            str(input("Enter to continue: "))
                            CMD = ["Rock","Paper","Scissors"]
                            bot2 = random.choice(CMD)
                            bot3 = random.choice(CMD) 

                            # Player Ties
                        elif player == bot2 or player == bot3:
                          T = 1
                          print("You tied with the bot! 😲")
                          print("No one earned any points, but nice try!")
                          print("")
                          print("-- Selected Commands --")
                          print("(YOU)",username,"selected",player)
                          print(botone,"selected",bot2)
                          print(bottwo,"selected",bot3)
                          print("")
                          print("-- Stats --")
                          print("")
                          print(username,":",PlayerPoint)
                          print(botone,":",Bot1Points)
                          print(bottwo,":",Bot2Points)
                          str(input("Enter to continue: "))
                          CMD = ["Rock","Paper","Scissors"]
                          bot2 = random.choice(CMD)
                          bot3 = random.choice(CMD)

                        elif player == "Rock" and bot2 == "Paper" or player == "Paper" and bot2 == "Scissors" or player == "Scissors" and bot2 == "Rock":
                          T = 1
                          print("You Lost! 😭")
                          print("The bots earned 1 point each! Nice try!")
                          print("")
                          print("-- Selected Commands --")
                          print("(YOU)",username,"selected",player)
                          print(botone,"selected",bot2)
                          print(bottwo,"selected",bot3)
                          Bot1Points = Bot1Points + 1
                          Bot2Points = Bot2Points + 1
                          print("")
                          print("-- Stats --")
                          print("")
                          print(username,":",PlayerPoint)
                          print(botone,":",Bot1Points)
                          print(bottwo,":",Bot2Points)
                          str(input("Enter to continue: "))
                          CMD = ["Rock","Paper","Scissors"]
                          bot2 = random.choice(CMD)
                          bot3 = random.choice(CMD)

                      # 
                      if PlayerPoint == 5 or PlayerPoint > 5: 
                        do('clear')
                        T = 2
                        print("You Won! 🥳")
                        print("Moving on to the next stage!")
                        wait(2.5)
                        str(input("Enter to continue: "))
                        do('clear')
                        # Semi Finals / Welcome
                        print("[",Assistant,"]","Welcome to Semi-Finals!")
                        print("[",Assistant,"]","I can feel the power of you, but the side-effects too!")
                        print("You will face many events around you willing to give you benefits or disadventages throughout the rounds!")
                        wait(2)
                        str(input("Enter to Continue: "))
                        print("There will be no loading system from Semi-Finals to Finals!")
                        print("Now, I will roll 3 random Opponents!")
                        bots = ["[😎] Lee","[😈] Pearl","[💸] Zood","[👑] Leo","[🍀] Shiv","[🙂] Lyla",]
                        bot1 = random.choice(bots)
                        bot2 = random.choice(bots)
                        bot3 = random.choice(bots)  
                        if bot1 == bot2 or bot2 == bot3 or bot1 == bot3:
                          random.choice(bots)
                        print("Your opponents are", bot1,bot2,"and",bot3)
                        str(input("Enter to Continue: "))
                        print("Playing Game...")
                        do('clear')
                        print("[",Assistant,"]","Welcome to Semi-Finals!")
                        print("[",Assistant,"]","Here are the beginning stats!")
                        # Point System
                        PlayerPoint = 0
                        Bot1Points = 0
                        Bot2Points = 0
                        Bot3Points = 0
                        print(username,":", PlayerPoint)
                        print(bot1,":", Bot1Points)
                        print(bot2,":", Bot2Points)
                        print(bot3,":", Bot3Points)
                        str(input("Enter to continue: "))
                        do('clear')
                        print("[",Assistant,"]","You will go against 3 bots!")
                        wait(2)
                        print("Your goal is to reach 5 points or above before the bot reaches that mark!")
                        wait(3)
                        print("[",Assistant,"]","and the winner moves on to the next stage!")
                        wait(2)
                        print("")
                        # Events
                        print("-- SPECIAL EVENT --")
                        Events = ["[🎮] Arcade","[👽] Invasion","[❌] 25/25","[🍀] 25/25"]
                        Event = random.choice(Events)
                        print("Your event is",Event)
                        str(input("Enter to continue: "))
                        if Event == "[🎮] Arcade":
                          T = 1
                          print("[🎮] Arcade")
                          print("The event has gifted you two points!")
                          PlayerPoint = 2
                          T = 2
                        if Event == "[🍀] 25/25":
                          T = 1
                          print("[🍀] 25/25")
                          print("The event has gifted you an extra point!")
                          PlayerPoint = 1
                          T = 2
                        if Event == "[❌] 25/25":
                          T = 1
                          print("[❌] 25/25")
                          print("The event took away your point! You are at -1")
                          PlayerPoint = -1
                          T = 2
                        if Event == "[👽] Invasion":
                          T = 1
                          print("[👽] Invasion")
                          print("The event took away two points!")
                          PlayerPoint = -2
                          T = 2 
                        wait(4)
                        do('clear')
                        print("This is your current score!")
                        print(PlayerPoint)
                        str(input("Enter to continue: "))
                        do('clear')
                        # Game
                        print("Ready....")
                        wait(1)
                        do('clear')
                        print("Get Set....")
                        wait(1)
                        do('clear')
                        print("GO.......")
                        wait(1)
                        do('clear')
                        botone = bot1
                        bottwo = bot2
                        botthree = bot3
                        player = str(input("Rock, Paper, or Scissors: "))
                        T = 1
                        while True:
                          while T == 1:
                            if player == "Rock" or player == "Paper" or player == "Scissors":
                              CMD = ["Rock","Paper","Scissors"]
                              bot1 = random.choice(CMD)
                              bot2 = random.choice(CMD)
                              bot3 = bot2
                              T = 2
                              do('clear')
                              wait(0.5)
                              print("Command has been sent")
                              # Player Wins
                              if player == "Rock" and bot1 == "Scissors" or player == "Paper" and bot1 == "Rock" or player == "Scissors" and bot1 == "Paper" or player == "Rock" and bot2 == "Scissors" or player == "Paper" and bot2 == "Rock" or player == "Scissors" and bot2 == "Paper":
                                T = 1
                                print("You Win! 🥳")
                                print("You earned 1 Point!")
                                print("")
                                print("-- Selected Commands --")
                                print("(YOU)",username,"selected",player)
                                print(botone,"selected",bot1)
                                print(bottwo,"selected",bot2)
                                print(botthree,"selected",bot3)
                                PlayerPoint = PlayerPoint + 1
                                if botone == "[👑] Leo" or bottwo == "[👑] Leo" or botthree == "[👑] Leo":
                                  PlayerPoint = PlayerPoint + 1
                                  print("(👑) LEGENDARY!")
                                  print("(⭐) Bonus 1 Point!")

                                if botone == "[😎] Lee" or bottwo == "[😎] Lee" or botthree == "[😎] Lee":
                                  PlayerPoint = PlayerPoint - 0.5
                                  Bot1Points = Bot1Points + 0.5
                                  Bot2Points = Bot2Points + 0.5
                                  Bot3Points = Bot3Points + 0.5
                                  print("(😭) You lost 0.5 Points!")
                                  print("(😈) The bots claimed 0.5 Points!")

                                if botone == "[🍀] Shiv" or bottwo == "[🍀] Shiv" or botthree == "[🍀] Shiv":
                                  PlayerPoint = PlayerPoint + 1.5
                                  print("(🍀) JACKPOT")
                                  print("(⭐) Bonus 1.5 Points!")

                                if botone == "[😈] Pearl" or bottwo == "[😈] Pearl" or botthree == "[😈] Pearl":
                                  PlayerPoint = PlayerPoint - 0.5
                                  print("(😭) You lost 0.5 Points!")


                                if botone == "[💸] Zood" or bottwo == "[💸] Zood" or botthree == "[💸] Zood":
                                  PlayerPoint = PlayerPoint + 0.5
                                  print("(⭐) Bonus 0.5 Points!")
                                  str(input("Enter to continue: "))
                                  # Stats
                                  print("-- Stats --")
                                  print(username,":",PlayerPoint)
                                  print(botone,":",Bot1Points)
                                  print(bottwo,":",Bot2Points)
                                  print(botthree,":",Bot3Points)
                                  CMD = ["Rock","Paper","Scissors"]
                                  bot1 = random.choice(CMD)


                                else:
                                  T = 1
                                  print("-- Stats --")
                                  print(username,":",PlayerPoint)
                                  print(botone,":",Bot1Points)
                                  print(bottwo,":",Bot2Points)
                                  print(botthree,":",Bot3Points)
                                  str(input("Enter to continue: "))
                                  CMD = ["Rock","Paper","Scissors"]
                                  bot1 = random.choice(CMD)
                                  bot2 = random.choice(CMD) 
                                  bot3 = bot2

                                  # Player Ties
                              elif player == bot1 or player == bot2:
                                T = 1
                                print("You tied with the bot! 😲")
                                print("No one earned any points, but nice try!")
                                print("")
                                print("-- Selected Commands --")
                                print("(YOU)",username,"selected",player)
                                print(botone,"selected",bot1)
                                print(bottwo,"selected",bot2)
                                print(botthree,"selected",bot3)
                                print("")
                                print("-- Stats --")
                                print("")
                                print(username,":",PlayerPoint)
                                print(botone,":",Bot1Points)
                                print(bottwo,":",Bot2Points)
                                print(botthree,":",Bot3Points)
                                str(input("Enter to continue: "))
                                CMD = ["Rock","Paper","Scissors"]
                                bot1 = random.choice(CMD)
                                bot2 = random.choice(CMD)
                                bot3 = bot2

                              elif player == "Rock" and bot1 == "Paper" or player == "Paper" and bot1 == "Scissors" or player == "Scissors" and bot1 == "Rock" or player == "Rock" and bot2 == "Paper" or player == "Paper" and bot2 == "Scissors" or player == "Scissors" and bot2 == "Rock":
                                T = 1
                                print("You Lost! 😭")
                                print("The bots earned 1 point each! Nice try!")
                                print("")
                                print("-- Selected Commands --")
                                print("(YOU)",username,"selected",player)
                                print(botone,"selected",bot1)
                                print(bottwo,"selected",bot2)
                                print(botthree,"selected",bot3)
                                Bot1Points = Bot1Points + 1
                                Bot2Points = Bot2Points + 1
                                Bot3Points = Bot3Points + 1
                                print("")
                                print("-- Stats --")
                                print("")
                                print(username,":",PlayerPoint)
                                print(botone,":",Bot1Points)
                                print(bottwo,":",Bot2Points)
                                print(botthree,":",Bot3Points)
                                str(input("Enter to continue: "))
                                CMD = ["Rock","Paper","Scissors"]
                                bot1 = random.choice(CMD)
                                bot2 = random.choice(CMD)
                                bot3 = bot2



                            # Semi-Finals Command Loops
                            elif player == "rock" or player == "paper" or player == "scissors":
                              do('clear')
                              T = 1
                              print("Letter MUST be captial!")
                              player = str(input("Rock, Paper, or Scissors: "))
                            else:
                              do('clear')
                              T = 1
                              player = str(input("Rock, Paper, or Scissors: "))

                            # Semi-Finals Done [Finale]
                            if PlayerPoint == 5 or PlayerPoint > 5: 
                              do('clear')
                              T = 2
                              print("You Won! 🥳")
                              print("Moving on to the next stage!")
                              wait(2.5)
                              str(input("Enter to continue: "))
                              do('clear')
                              # Finals
                              print("You made it this far!")
                              print("You are at the end of the level!")
                              wait(2.5)
                              str(input("Enter to Continue: "))
                              do('clear')
                              print("Are you ready? Because your about to go against 4 bots!")
                              print("These bots are dangerous, but first lets see what event you get!")
                              wait(2.5)
                              str(input("Enter to Continue: "))
                              do('clear')
                              print("Rolling Event..")
                              # Event
                              print("-- SPECIAL EVENT --")
                              Event = ["(😈) Point Eater","(👻) Ghost's Curse","(⭐) Bonus Stars","(👑) JACKPOT"]
                              random.choice(Event)
                              print("You got a", Event)
                              str(input("Enter to continue: "))
                              # If Event Selection
                              if Event == "(😈) Point Eater":
                                do('clear')
                                print("You Lost 😭")
                                wait(2)
                                print("Teleporting to menu...")
                                wait(1.5)
                                do('clear')
                                main()
                              if Event == "(👻) Ghost's Curse":
                                print("You lost 0.5 Points")
                                PlayerPoint = -0.5
                                str(input("Enter to Continue: "))
                              if Event == "(⭐) Bonus Stars":
                                print("(⭐) Bonus Star [Gifted 0.1 Points]" * 15)
                                PlayerPoint = 1.5
                                str(input("Enter to Continue: "))
                              if Event == "(👑) JACKPOT":
                                PlayerPoint = 5
                                print("The game will take you to the rock, paper, scissors game")
                                wait(2)
                                print("All you do is input your command and you will insantly win!")
                                str(input("Enter to Continue: "))
                              else: 
                                print("")
                              print("Now lets roll the Opponents...")
                              print("The bots will be the same as last time, but worse!")
                              bots = ["[😎] Li","[😈] Mash","[💸] Vash","[👑] Mat","[🍀] Bradon","[🙂] Rash",]
                              bot1 = random.choice(bots)
                              bot2 = random.choice(bots)
                              bot3 = random.choice(bots) 
                              bot4 = random.choice(bots)
                              if bot1 == bot2 or bot1 == bot3 or bot1 == bot4 or bot2 == bot3 or bot2 == bot4 or bot3 == bot4:
                                random.choice(bots)
                              else:
                                print("Your Opponents are",bot1,bot2,bot3,"and",bot4)
                                print("Playing Game...")
                                str(input("Enter to Continue: "))
                                print("Ready....")
                                wait(1)
                                do('clear')
                                print("Get Set....")
                                wait(1)
                                do('clear')
                                print("GO.......")
                                wait(1)
                                do('clear')
                                # Point System
                                Bot1Points = 0
                                Bot2Points = 0
                                Bot3Points = 0
                                Bot4Points = 0
                                # Bots
                                botone = bot1
                                bottwo = bot2
                                botthree = bot3
                                botfour = bot4
                                player = str(input("Rock, Paper, or Scissors: "))
                                T = 1
                                while True:
                                  while T == 1:
                                    if player == "Rock" or player == "Paper" or player == "Scissors":
                                      CMD = ["Rock","Paper","Scissors"]
                                      bot1 = random.choice(CMD)
                                      bot2 = random.choice(CMD)
                                      bot3 = bot2
                                      bot4 = bot2
                                      T = 2
                                      do('clear')
                                      wait(0.5)
                                      print("Command has been sent")
                                      # Player Wins
                                      if player == "Rock" and bot1 == "Scissors" or player == "Paper" and bot1 == "Rock" or player == "Scissors" and bot1 == "Paper" or player == "Rock" and bot2 == "Scissors" or player == "Paper" and bot2 == "Rock" or player == "Scissors" and bot2 == "Paper":
                                        T = 1
                                        print("You Win! 🥳")
                                        print("You earned 1 Point!")
                                        print("")
                                        print("-- Selected Commands --")
                                        print("(YOU)",username,"selected",player)
                                        print(botone,"selected",bot1)
                                        print(bottwo,"selected",bot2)
                                        print(botthree,"selected",bot3)
                                        print(botfour,"seclected",bot4)
                                        PlayerPoint = PlayerPoint + 1
                                        if botone == "[👑] Mat" or bottwo == "[👑] Mat" or botthree == "[👑] Mat" or botfour == "[👑] Mat":
                                          PlayerPoint = PlayerPoint + 1
                                          print("(👑) LEGENDARY!")
                                          print("(⭐) Bonus 1 Point!")

                                        if botone == "[😎] Li" or bottwo == "[😎] Li" or botthree == "[😎] Li" or botfour == "[😎] Li":
                                          PlayerPoint = PlayerPoint - 0.5
                                          Bot1Points = Bot1Points + 0.5
                                          Bot2Points = Bot2Points + 0.5
                                          Bot3Points = Bot3Points + 0.5
                                          Bot4Points = Bot4Points + 0.5
                                          print("(😭) You lost 0.5 Points!")
                                          print("(😈) The bots claimed 0.5 Points!")

                                        if botone == "[🍀] Brandon" or bottwo == "[🍀] Brandon" or botthree == "[🍀] Brandon" or botfour == "[🍀] Brandon":
                                          PlayerPoint = PlayerPoint + 1.5
                                          print("(🍀) JACKPOT")
                                          print("(⭐) Bonus 1.5 Points!")

                                        if botone == "[😈] Mash" or bottwo == "[😈] Mash" or botthree == "[😈] Mash" or botfour == "[😈] Mash":
                                          PlayerPoint = PlayerPoint - 0.5
                                          print("(😭) You lost 0.5 Points!")


                                        if botone == "[💸] Vash" or bottwo == "[💸] Vash" or botthree == "[💸] Vash" or botfour == "[💸] Vash":
                                          PlayerPoint = PlayerPoint + 0.5
                                          print("(⭐) Bonus 0.5 Points!")
                                          str(input("Enter to continue: "))
                                          # Stats
                                          print("-- Stats --")
                                          print(username,":",PlayerPoint)
                                          print(botone,":",Bot1Points)
                                          print(bottwo,":",Bot2Points)
                                          print(botthree,":",Bot3Points)
                                          print(botfour,":",Bot4Points)
                                          CMD = ["Rock","Paper","Scissors"]
                                          bot1 = random.choice(CMD)
                                          bot2 = random.choice(CMD)
                                          bot3 = bot2
                                          bot4 = bot2


                                        else:
                                          T = 1
                                          print("-- Stats --")
                                          print(username,":",PlayerPoint)
                                          print(botone,":",Bot1Points)
                                          print(bottwo,":",Bot2Points)
                                          print(botthree,":",Bot3Points)
                                          print(botfour,":",Bot4Points)
                                          str(input("Enter to continue: "))
                                          CMD = ["Rock","Paper","Scissors"]
                                          bot1 = random.choice(CMD)
                                          bot2 = random.choice(CMD)
                                          bot3 = bot2
                                          bot4 = bot2

                                          # Player Ties
                                      elif player == bot1 or player == bot2:
                                        T = 1
                                        print("You tied with the bot! 😲")
                                        print("No one earned any points, but nice try!")
                                        print("")
                                        print("-- Selected Commands --")
                                        print("(YOU)",username,"selected",player)
                                        print(botone,"selected",bot1)
                                        print(bottwo,"selected",bot2)
                                        print(botthree,"selected",bot3)
                                        print(botfour,"seclected",bot4)
                                        print(botfour,":",Bot4Points)
                                        print("")
                                        print("-- Stats --")
                                        print("")
                                        print(username,":",PlayerPoint)
                                        print(botone,":",Bot1Points)
                                        print(bottwo,":",Bot2Points)
                                        print(botthree,":",Bot3Points)
                                        print(botfour,":",Bot4Points)
                                        str(input("Enter to continue: "))
                                        CMD = ["Rock","Paper","Scissors"]
                                        bot1 = random.choice(CMD)
                                        bot2 = random.choice(CMD)
                                        bot3 = bot2
                                        bot4 = bot2

                                      elif player == "Rock" and bot1 == "Paper" or player == "Paper" and bot1 == "Scissors" or player == "Scissors" and bot1 == "Rock" or player == "Rock" and bot2 == "Paper" or player == "Paper" and bot2 == "Scissors" or player == "Scissors" and bot2 == "Rock":
                                        T = 1
                                        print("You Lost! 😭")
                                        print("The bots earned 1 point each! Nice try!")
                                        print("")
                                        print("-- Selected Commands --")
                                        print("(YOU)",username,"selected",player)
                                        print(botone,"selected",bot1)
                                        print(bottwo,"selected",bot2)
                                        print(botthree,"selected",bot3)
                                        print(botfour,"seclected",bot4)
                                        Bot1Points = Bot1Points + 1
                                        Bot2Points = Bot2Points + 1
                                        Bot3Points = Bot3Points + 1
                                        Bot4Points = Bot4Points + 1
                                        print("")
                                        print("-- Stats --")
                                        print("")
                                        print(username,":",PlayerPoint)
                                        print(botone,":",Bot1Points)
                                        print(bottwo,":",Bot2Points)
                                        print(botthree,":",Bot3Points)
                                        print(botfour,":",Bot4Points)
                                        str(input("Enter to continue: "))
                                        CMD = ["Rock","Paper","Scissors"]
                                        bot1 = random.choice(CMD)
                                        bot2 = random.choice(CMD)
                                        bot3 = bot2
                                        bot4 = bot2
                                    # Finals DONE
                                    if PlayerPoint == 5 or PlayerPoint > 5: 
                                      do('clear')
                                      T = 2
                                      print("You Won! 🥳")
                                      print("Moving on to the next stage!")
                                      wait(2.5)
                                      str(input("Enter to continue: "))
                                      print("Teleporting to menu...")
                                      wait(1.5)
                                      do('clear')
                                      main()

                                    # Lost Finals  
                                    elif Bot1Points == 5 or Bot2Points == 5 or Bot3Points == 5 or Bot4Points == 5:
                                      T = 2
                                      do('clear')
                                      print("You Lost 😭")
                                      wait(2)
                                      print("Teleporting to menu...")
                                      wait(1.5)
                                      do('clear')
                                      main()

                                    # Finals Command Loops
                                    elif player == "rock" or player == "paper" or player == "scissors":
                                      do('clear')
                                      T = 1
                                      print("Letter MUST be captial!")
                                      player = str(input("Rock, Paper, or Scissors: "))
                                    else:
                                      do('clear')
                                      T = 1
                                      player = str(input("Rock, Paper, or Scissors: "))




                            # Semi-Finals [LOST]
                            elif Bot1Points == 5 or Bot2Points == 5 or Bot3Points == 5:
                              T = 2
                              do('clear')
                              print("You Lost 😭")
                              wait(2)
                              print("Teleporting to menu...")
                              wait(1.5)
                              do('clear')
                              main()



                      # Quarter Finals [LOST]
                      elif Bot1Points == 5 or Bot2Points == 5:
                        T = 2
                        do('clear')
                        print("You Lost 😭")
                        wait(2)
                        print("Teleporting to menu...")
                        wait(1.5)
                        do('clear')
                        main()


                      # Command loop [Quarter-Finals]
                      elif player == "rock" or player == "paper" or player == "scissors":
                        do('clear')
                        T = 1
                        print("Letter MUST be captial!")
                        player = str(input("Rock, Paper, or Scissors: "))
                      else:
                        do('clear')
                        T = 1
                        player = str(input("Rock, Paper, or Scissors: "))


              # Pre Quarter-Finals [LOST]
              elif BotPoint1 == 5:
                T = 2
                do('clear')
                print("You Lost 😭")
                wait(2)
                print("Teleporting to menu...")
                wait(1.5)
                do('clear')
                main()

# Command loop [Pre Quarter-Finals]
              elif player == "rock" or player == "paper" or player == "scissors":
                do('clear')
                T = 1
                print("Letter MUST be captial!")
                player = str(input("Rock, Paper, or Scissors: "))
              else:
                do('clear')
                T = 1
                player = str(input("Rock, Paper, or Scissors: "))

  #              -- Rounds Loop System -- 
    else:
      do('clear')
      r = 1
      print("normalRound [nr] or tournament [t]")
      RoundChooser = str(input("Which round do you wanna play?: "))
      wait(0.25)
main()
