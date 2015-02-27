/**
 * 
 */


import java.util.HashMap;
import java.util.Map;

/**
 * @author Jeffrey Finkelstein <jeffrey.finkelstein@gmail.com>
 * @since Spring 2011
 */
public class TestCases extends CyclicIterator<Map<String, Angled>> {

  Map<String, Angled> stop() {
    return this.stop;
  }

  private final Map<String, Angled> stop;

  @SuppressWarnings("unchecked")
  TestCases() {
    this.stop = new HashMap<String, Angled>();
    final Map<String, Angled> peace = new HashMap<String, Angled>();
    final Map<String, Angled> fist = new HashMap<String, Angled>();
    final Map<String, Angled> shaka = new HashMap<String, Angled>();
    final Map<String, Angled> spread = new HashMap<String, Angled>();
    final Map<String, Angled> claw = new HashMap<String, Angled>();

    super.add(stop, peace, fist, shaka, spread, claw);

    // the upper arm, forearm, and hand angles do not change through any of the
    // test cases
    stop.put(PA2.UPPER_ARM_NAME, new BaseAngled(0, 0, 0));
    peace.put(PA2.UPPER_ARM_NAME, new BaseAngled(0, 0, 0));
    fist.put(PA2.UPPER_ARM_NAME, new BaseAngled(0, 0, 0));
    shaka.put(PA2.UPPER_ARM_NAME, new BaseAngled(0, 0, 0));
    spread.put(PA2.UPPER_ARM_NAME, new BaseAngled(0, 0, 0));
    claw.put(PA2.UPPER_ARM_NAME, new BaseAngled(0, 0, 0));

    stop.put(PA2.FOREARM_NAME, new BaseAngled(0, 90, 0));
    peace.put(PA2.FOREARM_NAME, new BaseAngled(0, 90, 0));
    fist.put(PA2.FOREARM_NAME, new BaseAngled(0, 90, 0));
    shaka.put(PA2.FOREARM_NAME, new BaseAngled(0, 90, 0));
    spread.put(PA2.FOREARM_NAME, new BaseAngled(0, 90, 0));
    claw.put(PA2.FOREARM_NAME, new BaseAngled(0, 90, 0));

    stop.put(PA2.HAND_NAME, new BaseAngled(0, 0, 0));
    peace.put(PA2.HAND_NAME, new BaseAngled(0, 0, 0));
    fist.put(PA2.HAND_NAME, new BaseAngled(0, 0, 0));
    shaka.put(PA2.HAND_NAME, new BaseAngled(0, 0, 0));
    spread.put(PA2.HAND_NAME, new BaseAngled(0, 0, 0));
    claw.put(PA2.HAND_NAME, new BaseAngled(0, 0, 0));

    // the stop test case
    stop.put(PA2.PINKY_DISTAL_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.PINKY_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.PINKY_PALM_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.RING_DISTAL_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.RING_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.RING_PALM_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.MIDDLE_DISTAL_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.MIDDLE_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.MIDDLE_PALM_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.INDEX_DISTAL_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.INDEX_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.INDEX_PALM_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.THUMB_DISTAL_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.THUMB_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    stop.put(PA2.THUMB_PALM_NAME, new BaseAngled(0, 50, -60));

    // the peace sign test case
    peace.put(PA2.PINKY_DISTAL_NAME, new BaseAngled(50, 0, 0));
    peace.put(PA2.PINKY_MIDDLE_NAME, new BaseAngled(90, 0, 0));
    peace.put(PA2.PINKY_PALM_NAME, new BaseAngled(60, 0, 0));
    peace.put(PA2.RING_DISTAL_NAME, new BaseAngled(50, 0, 0));
    peace.put(PA2.RING_MIDDLE_NAME, new BaseAngled(90, 0, 0));
    peace.put(PA2.RING_PALM_NAME, new BaseAngled(60, 0, 0));
    peace.put(PA2.MIDDLE_DISTAL_NAME, new BaseAngled(0, 0, 0));
    peace.put(PA2.MIDDLE_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    peace.put(PA2.MIDDLE_PALM_NAME, new BaseAngled(0, 0, 0));
    peace.put(PA2.INDEX_DISTAL_NAME, new BaseAngled(0, 0, 0));
    peace.put(PA2.INDEX_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    peace.put(PA2.INDEX_PALM_NAME, new BaseAngled(0, 0, 0));
    peace.put(PA2.THUMB_DISTAL_NAME, new BaseAngled(10, 0, 0));
    peace.put(PA2.THUMB_MIDDLE_NAME, new BaseAngled(90, 0, 0));
    peace.put(PA2.THUMB_PALM_NAME, new BaseAngled(30, 50, -60));

    // the fist test case
    fist.put(PA2.PINKY_DISTAL_NAME, new BaseAngled(50, 0, 0));
    fist.put(PA2.PINKY_MIDDLE_NAME, new BaseAngled(90, 0, 0));
    fist.put(PA2.PINKY_PALM_NAME, new BaseAngled(60, 0, 0));
    fist.put(PA2.RING_DISTAL_NAME, new BaseAngled(50, 0, 0));
    fist.put(PA2.RING_MIDDLE_NAME, new BaseAngled(90, 0, 0));
    fist.put(PA2.RING_PALM_NAME, new BaseAngled(60, 0, 0));
    fist.put(PA2.MIDDLE_DISTAL_NAME, new BaseAngled(50, 0, 0));
    fist.put(PA2.MIDDLE_MIDDLE_NAME, new BaseAngled(90, 0, 0));
    fist.put(PA2.MIDDLE_PALM_NAME, new BaseAngled(60, 0, 0));
    fist.put(PA2.INDEX_DISTAL_NAME, new BaseAngled(50, 0, 0));
    fist.put(PA2.INDEX_MIDDLE_NAME, new BaseAngled(90, 0, 0));
    fist.put(PA2.INDEX_PALM_NAME, new BaseAngled(60, 0, 0));
    fist.put(PA2.THUMB_DISTAL_NAME, new BaseAngled(50, 0, 0));
    fist.put(PA2.THUMB_MIDDLE_NAME, new BaseAngled(60, 0, 0));
    fist.put(PA2.THUMB_PALM_NAME, new BaseAngled(30, 50, -60));

    // the shaka test case
    shaka.put(PA2.PINKY_DISTAL_NAME, new BaseAngled(0, 0, 0));
    shaka.put(PA2.PINKY_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    shaka.put(PA2.PINKY_PALM_NAME, new BaseAngled(0, -15, 0));
    shaka.put(PA2.RING_DISTAL_NAME, new BaseAngled(50, 0, 0));
    shaka.put(PA2.RING_MIDDLE_NAME, new BaseAngled(80, 0, 0));
    shaka.put(PA2.RING_PALM_NAME, new BaseAngled(45, 0, 0));
    shaka.put(PA2.MIDDLE_DISTAL_NAME, new BaseAngled(50, 0, 0));
    shaka.put(PA2.MIDDLE_MIDDLE_NAME, new BaseAngled(80, 0, 0));
    shaka.put(PA2.MIDDLE_PALM_NAME, new BaseAngled(45, 0, 0));
    shaka.put(PA2.INDEX_DISTAL_NAME, new BaseAngled(50, 0, 0));
    shaka.put(PA2.INDEX_MIDDLE_NAME, new BaseAngled(80, 0, 0));
    shaka.put(PA2.INDEX_PALM_NAME, new BaseAngled(45, 0, 0));
    shaka.put(PA2.THUMB_DISTAL_NAME, new BaseAngled(-10, 0, 0));
    shaka.put(PA2.THUMB_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    shaka.put(PA2.THUMB_PALM_NAME, new BaseAngled(0, 60, -60));

    // the spread test case
    spread.put(PA2.PINKY_DISTAL_NAME, new BaseAngled(0, 0, 0));
    spread.put(PA2.PINKY_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    spread.put(PA2.PINKY_PALM_NAME, new BaseAngled(0, -10, 0));
    spread.put(PA2.RING_DISTAL_NAME, new BaseAngled(0, 0, 0));
    spread.put(PA2.RING_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    spread.put(PA2.RING_PALM_NAME, new BaseAngled(0, -7, 0));
    spread.put(PA2.MIDDLE_DISTAL_NAME, new BaseAngled(0, 0, 0));
    spread.put(PA2.MIDDLE_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    spread.put(PA2.MIDDLE_PALM_NAME, new BaseAngled(0, 0, 0));
    spread.put(PA2.INDEX_DISTAL_NAME, new BaseAngled(0, 0, 0));
    spread.put(PA2.INDEX_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    spread.put(PA2.INDEX_PALM_NAME, new BaseAngled(0, 10, 0));
    spread.put(PA2.THUMB_DISTAL_NAME, new BaseAngled(0, 0, 0));
    spread.put(PA2.THUMB_MIDDLE_NAME, new BaseAngled(0, 0, 0));
    spread.put(PA2.THUMB_PALM_NAME, new BaseAngled(0, 60, -60));

    // the claw test case
    claw.put(PA2.PINKY_DISTAL_NAME, new BaseAngled(60, 0, 0));
    claw.put(PA2.PINKY_MIDDLE_NAME, new BaseAngled(80, 0, 0));
    claw.put(PA2.PINKY_PALM_NAME, new BaseAngled(0, 0, 0));
    claw.put(PA2.RING_DISTAL_NAME, new BaseAngled(60, 0, 0));
    claw.put(PA2.RING_MIDDLE_NAME, new BaseAngled(80, 0, 0));
    claw.put(PA2.RING_PALM_NAME, new BaseAngled(0, 0, 0));
    claw.put(PA2.MIDDLE_DISTAL_NAME, new BaseAngled(60, 0, 0));
    claw.put(PA2.MIDDLE_MIDDLE_NAME, new BaseAngled(80, 0, 0));
    claw.put(PA2.MIDDLE_PALM_NAME, new BaseAngled(0, 0, 0));
    claw.put(PA2.INDEX_DISTAL_NAME, new BaseAngled(60, 0, 0));
    claw.put(PA2.INDEX_MIDDLE_NAME, new BaseAngled(80, 0, 0));
    claw.put(PA2.INDEX_PALM_NAME, new BaseAngled(0, 0, 0));
    claw.put(PA2.THUMB_DISTAL_NAME, new BaseAngled(70, 0, 0));
    claw.put(PA2.THUMB_MIDDLE_NAME, new BaseAngled(20, 0, 0));
    claw.put(PA2.THUMB_PALM_NAME, new BaseAngled(30, 50, -60));
  }
}
