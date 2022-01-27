/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package software.bernie.geckolib3.core.builder;

import software.bernie.geckolib3.core.keyframe.BoneAnimation;
import software.bernie.geckolib3.core.keyframe.EventKeyFrame;
import software.bernie.geckolib3.core.keyframe.ParticleEventKeyFrame;

import java.util.ArrayList;
import java.util.List;

/**
 * A specific animation instance
 */
public class Animation
{
	public final String animationName;
	public final double animationLength;
	public final boolean loop;
	public final List<BoneAnimation> boneAnimations;
	public final List<EventKeyFrame<String>> soundKeyFrames;
	public final List<ParticleEventKeyFrame> particleKeyFrames;
	public final List<EventKeyFrame<List<String>>> customInstructionKeyframes;

	public Animation(String animationName, double animationLength, boolean loop, List<BoneAnimation> boneAnimations, List<EventKeyFrame<String>> soundKeyFrames, List<ParticleEventKeyFrame> particleKeyFrames, List<EventKeyFrame<List<String>>> customInstructionKeyframes) {
		this.animationName = animationName;
		this.animationLength = animationLength;
		this.loop = loop;
		this.boneAnimations = boneAnimations;
		this.soundKeyFrames = soundKeyFrames;
		this.particleKeyFrames = particleKeyFrames;
		this.customInstructionKeyframes = customInstructionKeyframes;
	}
}
