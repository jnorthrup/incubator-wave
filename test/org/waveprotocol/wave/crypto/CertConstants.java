/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.waveprotocol.wave.crypto;

public class CertConstants {

  public static final byte[] SERVER_PUB = new byte[] {
    48,-126,1,-96,48,-126,1,9,2,2,82,74,48,13,6,9,
    42,-122,72,-122,-9,13,1,1,5,5,0,48,26,49,24,48,
    22,6,3,85,4,3,19,15,73,110,116,101,114,109,101,100,
    105,97,116,101,32,67,65,48,30,23,13,48,57,48,49,50,
    54,48,49,50,49,53,55,90,23,13,49,57,48,49,50,52,
    48,49,50,49,53,55,90,48,22,49,20,48,18,6,3,85,
    4,3,19,11,83,101,114,118,101,114,32,67,101,114,116,48,
    -127,-97,48,13,6,9,42,-122,72,-122,-9,13,1,1,1,5,
    0,3,-127,-115,0,48,-127,-119,2,-127,-127,0,-57,68,62,127,
    25,-92,-64,-44,-72,-71,-22,46,-104,-61,-113,-36,39,49,-4,-38,
    -77,28,-65,46,19,-11,67,94,120,4,26,-59,-89,-22,54,-86,
    38,70,-8,8,-74,54,20,1,-15,-62,76,85,25,36,-88,-117,
    -3,108,-67,114,124,-103,-18,-8,-56,35,125,-14,19,111,100,-122,
    74,-48,-120,-25,22,-16,-14,16,121,-23,115,-116,82,117,-71,68,
    119,78,-118,121,10,-111,123,-20,-123,-87,-107,-105,79,51,-34,-37,
    -104,93,122,5,-100,-56,-79,58,-118,19,44,-16,-78,-57,75,46,
    -125,-42,-29,2,68,-101,122,92,53,-102,36,115,2,3,1,0,
    1,48,13,6,9,42,-122,72,-122,-9,13,1,1,5,5,0,
    3,-127,-127,0,-54,-45,51,-106,48,48,-86,-98,76,-92,65,-77,
    -37,44,-86,18,-59,-90,16,-88,32,52,-72,1,2,96,57,-37,
    -117,100,-71,-98,-79,-93,-32,79,29,66,-40,-45,116,67,-70,-78,
    57,-19,-109,13,119,-94,86,5,1,-74,26,37,10,-34,-31,-92,
    116,33,-20,46,-99,-6,-55,123,-121,48,22,68,-104,-16,112,39,
    -14,16,-67,85,-88,-119,-87,-57,116,126,-123,-70,-12,-114,70,50,
    97,-42,-68,-108,18,1,43,68,-25,68,-33,-99,-20,-12,-23,-84,
    12,-125,-81,64,121,65,-25,-10,-88,97,-72,-11,55,69,-25,15,
    -94,-78,-73,-108,
  };

  public static final byte[] SERVER_PRIV = new byte[] {
    48,-126,2,119,2,1,0,48,13,6,9,42,-122,72,-122,-9,
    13,1,1,1,5,0,4,-126,2,97,48,-126,2,93,2,1,
    0,2,-127,-127,0,-57,68,62,127,25,-92,-64,-44,-72,-71,-22,
    46,-104,-61,-113,-36,39,49,-4,-38,-77,28,-65,46,19,-11,67,
    94,120,4,26,-59,-89,-22,54,-86,38,70,-8,8,-74,54,20,
    1,-15,-62,76,85,25,36,-88,-117,-3,108,-67,114,124,-103,-18,
    -8,-56,35,125,-14,19,111,100,-122,74,-48,-120,-25,22,-16,-14,
    16,121,-23,115,-116,82,117,-71,68,119,78,-118,121,10,-111,123,
    -20,-123,-87,-107,-105,79,51,-34,-37,-104,93,122,5,-100,-56,-79,
    58,-118,19,44,-16,-78,-57,75,46,-125,-42,-29,2,68,-101,122,
    92,53,-102,36,115,2,3,1,0,1,2,-127,-128,55,117,-122,
    -17,88,-13,-63,-73,114,-78,75,-69,44,73,65,-128,-60,103,-27,
    55,-7,33,-57,19,-53,-6,55,5,-45,-31,80,-110,50,105,-67,
    77,29,-38,34,-82,74,8,67,9,71,-128,12,62,-93,0,-48,
    -24,37,96,94,89,-66,-44,24,-18,-92,-59,60,7,-27,-112,-53,
    -37,-123,-7,-115,-80,43,-82,-121,75,28,-13,-128,-15,-72,-16,47,
    24,98,-42,82,-69,22,112,-54,36,36,-19,107,82,23,83,-103,
    117,-118,10,87,-33,-58,63,-75,109,84,-18,-71,-127,49,-44,-84,
    23,57,-42,62,-21,-106,20,94,117,105,72,96,1,2,65,0,
    -8,-43,-10,74,-2,-3,110,66,33,118,75,21,63,-88,-39,-122,
    113,55,-99,-40,14,-48,-121,76,41,-63,93,78,-128,-5,76,-83,
    -98,16,-53,101,94,-66,-122,70,38,-42,94,22,-7,-112,32,-78,
    -106,-122,-51,-78,83,-86,109,125,-95,-33,-18,27,31,-44,89,51,
    2,65,0,-51,0,-18,-12,-5,-107,-65,86,1,-97,-87,-61,-19,
    5,-53,-51,96,81,78,-128,-48,-18,112,-124,84,18,33,-22,-101,
    86,-19,76,118,56,-40,-14,-107,62,93,38,86,16,-19,1,73,
    40,31,84,-37,69,117,-82,-37,25,-78,-110,-74,126,-96,-58,-48,
    -93,-121,-63,2,64,113,-106,89,-29,74,26,-83,-90,10,88,81,
    85,-43,-59,97,-26,120,-16,6,97,-122,1,-78,-127,21,-34,106,
    -107,87,83,95,97,49,114,65,38,120,-27,71,-83,-26,52,-100,
    -90,-88,45,30,127,-25,46,-119,-33,9,74,22,-56,-18,-121,-91,
    -51,67,-18,78,-7,2,65,0,-72,92,-112,-119,-84,-1,-36,-44,
    -62,29,14,-107,110,-63,121,-87,55,103,-89,-117,-35,89,-79,-62,
    -81,-64,-90,-45,-49,-29,123,0,-6,-120,-31,66,55,-55,-96,7,
    -21,-6,-56,-54,17,58,-114,2,-56,55,77,64,117,54,69,12,
    0,39,28,-5,-17,-126,65,-127,2,65,0,-39,114,75,-54,95,
    -31,73,-27,39,9,-67,-28,125,88,113,-100,-75,36,126,62,76,
    -114,41,111,-55,-60,-25,-18,-34,-113,77,-50,40,104,-22,-73,75,
    -21,-40,-79,23,0,116,-85,108,53,-126,79,-12,11,-42,86,63,
    -45,56,-72,59,20,65,-16,-125,50,-31,96,
  };

  public static final byte[] INTERMEDIATE_PUB = new byte[] {
    48,-126,1,-74,48,-126,1,31,-96,3,2,1,2,2,2,4,
    42,48,13,6,9,42,-122,72,-122,-9,13,1,1,5,5,0,
    48,18,49,16,48,14,6,3,85,4,3,19,7,82,111,111,
    116,32,67,65,48,30,23,13,48,57,48,49,50,54,48,49,
    50,49,53,55,90,23,13,49,57,48,49,50,52,48,49,50,
    49,53,55,90,48,26,49,24,48,22,6,3,85,4,3,19,
    15,73,110,116,101,114,109,101,100,105,97,116,101,32,67,65,
    48,-127,-97,48,13,6,9,42,-122,72,-122,-9,13,1,1,1,
    5,0,3,-127,-115,0,48,-127,-119,2,-127,-127,0,-40,-65,-112,
    -100,117,123,100,-127,-5,64,-68,0,10,77,-80,43,-19,86,32,
    -81,39,-48,-24,-64,31,-14,-127,62,-60,61,-63,71,-5,54,90,
    -116,-92,35,49,36,84,78,76,18,63,59,-75,97,46,31,39,
    50,-99,30,-14,111,68,13,76,98,114,-19,-55,-30,81,-38,5,
    -74,-76,66,-100,111,42,-1,-108,-124,31,23,-114,50,80,15,-64,
    -39,11,65,-23,7,-21,-27,78,-66,34,29,113,-106,29,-15,80,
    -125,-23,-6,51,-92,-89,-107,55,-117,25,-4,-22,120,85,53,7,
    61,-12,-95,75,110,82,-123,-122,120,-112,-35,6,95,2,3,1,
    0,1,-93,19,48,17,48,15,6,3,85,29,19,4,8,48,
    6,1,1,-1,2,1,1,48,13,6,9,42,-122,72,-122,-9,
    13,1,1,5,5,0,3,-127,-127,0,32,-128,-113,75,76,-75,
    85,-7,3,-89,65,-83,20,44,-43,-125,-17,-56,-78,-108,-103,-15,
    -110,-45,77,-110,67,107,71,-23,-73,-48,-113,-34,53,-94,1,-61,
    47,-25,-18,-51,-36,111,-37,15,-26,-112,-101,-76,11,80,87,-45,
    109,40,78,109,24,-2,-45,-83,-83,-127,-128,40,-59,66,74,-43,
    -1,-3,40,-7,-30,-110,-4,90,-56,50,-72,20,7,-34,54,107,
    88,97,69,-69,91,111,-3,89,15,-40,55,82,-120,69,-26,85,
    29,81,-50,-21,-53,-38,-88,-11,-89,67,110,-46,74,54,-17,-88,
    -3,-114,51,-13,58,98,-125,37,76,-31,
  };

  public static final byte[] INTERMEDIATE_PRIV = new byte[] {
    48,-126,2,119,2,1,0,48,13,6,9,42,-122,72,-122,-9,
    13,1,1,1,5,0,4,-126,2,97,48,-126,2,93,2,1,
    0,2,-127,-127,0,-40,-65,-112,-100,117,123,100,-127,-5,64,-68,
    0,10,77,-80,43,-19,86,32,-81,39,-48,-24,-64,31,-14,-127,
    62,-60,61,-63,71,-5,54,90,-116,-92,35,49,36,84,78,76,
    18,63,59,-75,97,46,31,39,50,-99,30,-14,111,68,13,76,
    98,114,-19,-55,-30,81,-38,5,-74,-76,66,-100,111,42,-1,-108,
    -124,31,23,-114,50,80,15,-64,-39,11,65,-23,7,-21,-27,78,
    -66,34,29,113,-106,29,-15,80,-125,-23,-6,51,-92,-89,-107,55,
    -117,25,-4,-22,120,85,53,7,61,-12,-95,75,110,82,-123,-122,
    120,-112,-35,6,95,2,3,1,0,1,2,-127,-127,0,-41,4,
    -62,-6,-45,121,3,110,6,-56,99,56,79,0,94,-62,85,1,
    -38,14,-88,-101,16,42,120,6,-28,-68,85,-123,69,-42,-104,-103,
    -123,30,124,62,5,36,27,22,73,84,-40,-79,-20,-17,105,7,
    -78,-92,-3,69,-108,15,89,29,48,39,-126,7,-18,-6,-25,126,
    -17,37,-78,73,-42,26,6,110,-101,-104,-66,-71,60,58,-25,-101,
    -104,114,-32,34,38,43,-32,-90,44,-102,-88,105,-35,31,105,-2,
    -45,-1,-3,-29,-76,-74,6,-15,86,-16,11,74,-123,49,117,117,
    11,44,12,31,120,-123,37,-70,-105,-19,65,-12,85,-111,2,65,
    0,-9,17,-3,-25,-52,-120,29,-8,-9,113,-111,117,55,14,123,
    -35,-78,127,13,34,-80,-73,-20,-89,104,49,19,-78,-93,78,-49,
    -32,-17,89,112,106,125,37,91,123,-125,-109,112,-24,-86,-31,-100,
    -73,42,-32,-37,73,-32,7,95,19,110,17,-81,-15,-25,56,43,
    -3,2,65,0,-32,-107,5,38,-37,-94,76,-68,-13,72,82,-18,
    107,121,25,-49,-70,-61,-67,-70,78,3,107,-81,115,-41,-42,101,
    111,46,63,34,-23,56,44,-9,87,113,-119,16,31,86,-28,79,
    -113,-27,-103,-60,45,-46,-53,-124,89,122,-38,91,-109,-103,59,29,
    -20,48,-12,-117,2,65,0,-87,-14,-34,76,76,12,117,81,-124,
    35,-62,-126,118,84,-88,47,95,80,-75,-96,95,30,-92,-46,-94,
    -128,-33,-93,-55,97,-76,-20,108,-73,-128,-12,63,17,43,84,82,
    -75,96,-67,42,-115,-10,86,-88,79,-13,-121,101,106,-84,-93,-104,
    -38,-31,-61,-21,-32,95,-95,2,64,116,72,20,115,-53,50,-36,
    -62,-44,-64,116,-40,39,-29,123,30,-40,-105,-13,11,-100,-53,30,
    -99,-88,-64,111,-84,-13,-123,33,-127,-92,-7,-58,38,-121,43,45,
    9,-95,0,111,-108,86,112,78,78,-118,95,99,-86,-14,93,-82,
    -29,-51,-89,-128,57,125,10,-40,3,2,64,114,38,83,-115,-111,
    -90,-97,-20,-100,49,-11,-14,87,3,19,108,-31,-107,99,-45,111,
    -63,-48,42,115,106,-50,124,-20,5,102,60,53,35,-106,-38,77,
    -22,105,55,120,30,-77,-1,60,73,67,69,-67,-35,112,96,-54,
    20,-116,-11,-76,4,-112,-125,85,-13,-123,96,
  };

  public static final byte[] CA_PUB = new byte[] {
    48,-126,2,21,48,-126,1,126,-96,3,2,1,2,2,9,0,
    -116,6,81,-82,41,118,1,-42,48,13,6,9,42,-122,72,-122,
    -9,13,1,1,5,5,0,48,18,49,16,48,14,6,3,85,
    4,3,19,7,82,111,111,116,32,67,65,48,30,23,13,48,
    57,48,49,50,54,48,49,50,49,53,55,90,23,13,49,57,
    48,49,50,52,48,49,50,49,53,55,90,48,18,49,16,48,
    14,6,3,85,4,3,19,7,82,111,111,116,32,67,65,48,
    -127,-97,48,13,6,9,42,-122,72,-122,-9,13,1,1,1,5,
    0,3,-127,-115,0,48,-127,-119,2,-127,-127,0,-59,14,-74,80,
    50,30,-26,-71,76,-126,-36,-22,33,50,-8,48,115,21,39,112,
    107,25,88,50,101,-103,-108,114,89,86,-10,68,-16,-123,92,34,
    5,-116,8,-95,7,101,-30,8,88,-2,111,-77,74,-92,108,-74,
    -1,42,-87,-7,13,39,55,57,78,98,15,3,-50,-56,52,-105,
    76,-34,-70,96,34,-25,48,16,99,96,32,-126,63,-5,119,-35,
    122,-28,36,-102,119,47,-78,21,-111,3,-52,75,-25,126,63,106,
    112,-18,45,-24,110,8,-60,93,71,56,-28,-76,76,-18,-61,-38,
    -118,66,20,-71,-114,100,61,-118,-21,-94,-87,47,2,3,1,0,
    1,-93,115,48,113,48,29,6,3,85,29,14,4,22,4,20,
    -36,-10,39,32,-105,-11,72,-58,91,38,-44,-92,71,72,101,124,
    -42,53,14,62,48,66,6,3,85,29,35,4,59,48,57,-128,
    20,-36,-10,39,32,-105,-11,72,-58,91,38,-44,-92,71,72,101,
    124,-42,53,14,62,-95,22,-92,20,48,18,49,16,48,14,6,
    3,85,4,3,19,7,82,111,111,116,32,67,65,-126,9,0,
    -116,6,81,-82,41,118,1,-42,48,12,6,3,85,29,19,4,
    5,48,3,1,1,-1,48,13,6,9,42,-122,72,-122,-9,13,
    1,1,5,5,0,3,-127,-127,0,116,-72,-39,-124,57,-2,117,
    98,-23,-70,-125,-104,57,-107,47,29,-68,15,-99,19,78,-122,-128,
    -27,-122,-126,71,-87,-62,124,-40,48,-116,8,-38,-31,-128,110,103,
    101,-113,76,-99,125,-15,47,26,-124,-94,-58,62,39,85,9,104,
    115,-68,-101,-86,-42,23,78,123,19,39,127,-105,-124,-114,-50,33,
    -98,30,-101,-43,-11,10,-73,-83,32,-125,120,-119,-77,-2,61,68,
    88,119,-38,74,-127,73,-126,-56,72,59,-48,100,-118,112,122,-45,
    83,116,0,-90,-60,28,87,-16,-75,-89,54,-84,-116,113,-82,95,
    -65,-33,-54,-4,-86,98,-26,-13,76,
  };


  public static final byte[] CA_PRIV = new byte[] {
    48,-126,2,119,2,1,0,48,13,6,9,42,-122,72,-122,-9,
    13,1,1,1,5,0,4,-126,2,97,48,-126,2,93,2,1,
    0,2,-127,-127,0,-59,14,-74,80,50,30,-26,-71,76,-126,-36,
    -22,33,50,-8,48,115,21,39,112,107,25,88,50,101,-103,-108,
    114,89,86,-10,68,-16,-123,92,34,5,-116,8,-95,7,101,-30,
    8,88,-2,111,-77,74,-92,108,-74,-1,42,-87,-7,13,39,55,
    57,78,98,15,3,-50,-56,52,-105,76,-34,-70,96,34,-25,48,
    16,99,96,32,-126,63,-5,119,-35,122,-28,36,-102,119,47,-78,
    21,-111,3,-52,75,-25,126,63,106,112,-18,45,-24,110,8,-60,
    93,71,56,-28,-76,76,-18,-61,-38,-118,66,20,-71,-114,100,61,
    -118,-21,-94,-87,47,2,3,1,0,1,2,-127,-127,0,-121,-92,
    -80,-22,83,21,-30,75,-6,-42,-71,-86,-112,95,-67,103,-36,79,
    -37,110,14,-54,-53,99,37,124,-86,42,108,68,-24,16,92,95,
    -16,35,-101,29,-31,114,-74,-36,-14,-46,60,48,40,67,-118,69,
    -44,111,-61,5,99,43,4,90,-46,48,-88,59,-25,-120,-56,13,
    101,108,23,-48,-85,113,12,-26,-51,-72,-32,-61,-68,71,68,-22,
    105,-16,67,39,-19,-92,-68,-55,37,3,-113,24,84,56,46,81,
    21,-116,127,59,-26,-21,61,-38,-21,-99,84,59,-83,-91,15,25,
    106,-123,120,33,87,104,-41,-126,-40,-6,14,19,118,65,2,65,
    0,-3,2,-117,15,-51,-59,-77,-121,-16,-7,102,-61,74,-112,-102,
    66,3,96,-115,99,-127,97,42,24,104,-6,94,-120,16,-109,85,
    121,-65,65,-65,14,8,-77,50,-22,-114,-76,19,-95,5,-31,-124,
    -110,-57,-92,16,89,18,-93,-15,87,-24,82,-93,-15,52,104,100,
    -115,2,65,0,-57,98,-29,-25,30,-33,67,8,92,73,63,-89,
    -26,-40,-74,44,-98,51,-104,-89,99,-90,-65,107,41,59,113,-27,
    -69,122,-18,-85,72,48,126,-113,11,87,-12,117,-113,101,41,91,
    84,-60,23,-27,-6,16,125,-39,-6,-127,-37,-104,57,46,-31,7,
    126,103,59,-85,2,65,0,-90,107,-39,-44,-41,97,71,-86,15,
    -109,-67,72,-113,-17,117,-56,30,56,-112,71,-9,126,86,22,32,
    87,47,127,8,-120,33,29,39,-12,-77,27,36,21,-37,83,-11,
    -15,-11,71,97,122,-23,-99,50,-68,116,20,98,-14,123,121,123,
    83,-128,-118,-44,18,38,-79,2,64,93,-29,-50,104,14,92,-102,
    7,60,-43,-19,88,-42,86,-28,106,92,80,-11,-88,-107,63,119,
    82,50,7,97,26,10,79,-40,69,-27,-25,-104,33,41,-7,80,
    15,111,-25,-10,50,-96,-42,-6,93,-4,-124,121,-113,4,-20,-45,
    -120,122,28,-2,48,118,48,-116,-93,2,64,13,-11,-3,119,92,
    21,3,-112,-119,122,-114,103,-83,85,52,-105,27,-127,-17,-116,-86,
    -19,27,-119,-35,99,-52,-108,52,-32,-28,98,-44,48,-105,-93,-120,
    45,36,-126,-76,123,115,73,63,-119,94,42,64,-9,-57,-72,17,
    -30,35,33,53,26,-122,-9,-13,-44,-102,0,
  };

  private CertConstants() {
  }
}
