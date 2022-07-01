package com.palyground.java10;

/**
 * <pre>
 * 1. Heap Allocation on Alternative Memory Device
 *  Applications have become memory hungry, there’s an increase in cloud-native applications, in-memory databases, 
 *  streaming applications. In order to cater to these services, there are various memory architectures available. 
 *  This feature enhances the capability of HotSpot VM to allocate the Java object heap on an alternative memory device, 
 *  such as an NV-DIMM, specified by the user.
 *  
 * 2. Parallel full GC for G1
 *  G1 garbage collector was made default in JDK 9. G1 Garbage collector avoids any full garbage collection, 
 *  but when concurrent threads for collection cannot revive the memory fast enough users experience is impacted.
 *  This change improves the G1 worst-case latency by making the full GC parallel. 
 *  The mark-sweep-compact algorithm from G1 collector is parallelized as part of this change and will be triggered 
 *  when concurrent threads for collection can’t revive the memory fast enough.
 * </pre>
 * 
 * @author XKS9
 *
 */
public class OtherChanges {

}
