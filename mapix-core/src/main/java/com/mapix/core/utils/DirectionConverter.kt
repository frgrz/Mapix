package com.mapix.core.utils

import android.content.Context
import android.util.DisplayMetrics
import androidx.annotation.ColorInt
import androidx.annotation.Dimension
import com.mapix.core.model.Step
import com.google.android.gms.maps.model.*
import java.util.*

/**
 * Utility class for value convert in the Google Direction Library.
 */
object DirectionConverter {
    /**
     * Convert the route paths to list of latitude and longitude.
     *
     * @param stepList The list of steps.
     * @return The list of latitude and longitude that converted from the list of steps.
     * @since 1.0.0
     */
    fun getDirectionPoint(stepList: List<Step>?): ArrayList<LatLng> {
        val directionPointList = ArrayList<LatLng>()
        if (stepList != null && stepList.size > 0) {
            for (step in stepList) {
                convertStepToPosition(
                    step,
                    directionPointList
                )
            }
        }
        return directionPointList
    }

    /**
     * For internal use.
     */
    private fun convertStepToPosition(
        step: Step,
        directionPointList: ArrayList<LatLng>
    ) {
        // Get start location
        directionPointList.add(step.startLocation?.toLatLng())

        // Get encoded points location
        if (step.polyline != null) {
            val decodedPointList = step.polyline!!.pointList
            if (decodedPointList != null && decodedPointList.isNotEmpty()) {
                directionPointList.addAll(decodedPointList)
            }
        }

        // Get end location
        directionPointList.add(step.endLocation.toLatLng())
    }

    /**
     * Convert the position of each step to list of latitude and longitude.
     *
     * @param stepList The list of steps.
     * @return The list of latitude and longitude that converted from the list of steps.
     * @since 1.0.0
     */
    fun getSectionPoint(stepList: List<Step>?): ArrayList<LatLng> {
        val directionPointList = ArrayList<LatLng>()
        if (stepList != null && stepList.size > 0) {
            // Get start location only first position
            directionPointList.add(stepList[0].startLocation.toLatLng())
            for ((_, _, endLocation) in stepList) {
                // Get end location
                directionPointList.add(endLocation.toLatLng())
            }
        }
        return directionPointList
    }

    /**
     * Convert the path option to the polyline options.
     *
     * @param context    A context.
     * @param pathOption Path options of the steps.
     * @return Options for a polyline.
     * @since 1.2.0
     */
    fun createPolyline(
        context: Context,
        pathOption: PathOption
    ): PolylineOptions {
        return createPolyline(
            context,
            pathOption.locationList,
            pathOption.width,
            pathOption.color,
            pathOption.isClickable,
            pathOption.jointType,
            pathOption.startCap,
            pathOption.endCap,
            pathOption.patternItemList
        )
    }

    /**
     * Convert the list of latitude and longitude to the polyline options.
     *
     * @param context      A context.
     * @param locationList A list of latitude and longitude.
     * @param width        Width of the polyline in screen pixels.
     * @param color        Color of the polyline as a 32-bit ARGB color.
     * @param clickable    Is polyline clickable.
     * @param startCap     Cap at the start vertex of the polyline.
     * @param endCap       Cap at the end vertex of the polyline.
     * @return Options for a polyline.
     * @since 1.2.0
     */
    fun createPolyline(
        context: Context,
        locationList: ArrayList<LatLng>?,
        @Dimension(unit = Dimension.DP) width: Int,
        @ColorInt color: Int,
        clickable: Boolean,
        startCap: Cap?,
        endCap: Cap?
    ): PolylineOptions {
        return createPolyline(
            context,
            locationList,
            width,
            color,
            clickable,
            JointType.DEFAULT,
            startCap,
            endCap,
            null
        )
    }

    /**
     * Convert the list of latitude and longitude to the polyline options.
     *
     * @param context         A context.
     * @param locationList    A list of latitude and longitude.
     * @param width           Width of the polyline in screen pixels.
     * @param color           Color of the polyline as a 32-bit ARGB color.
     * @param clickable       Is polyline clickable.
     * @param patternItemList Stroke pattern for the polyline.
     * @return Options for a polyline.
     * @since 1.2.0
     */
    fun createPolyline(
        context: Context,
        locationList: ArrayList<LatLng>?,
        @Dimension(unit = Dimension.DP) width: Int,
        @ColorInt color: Int,
        clickable: Boolean,
        patternItemList: List<PatternItem?>?
    ): PolylineOptions {
        return createPolyline(
            context,
            locationList,
            width,
            color,
            clickable,
            JointType.DEFAULT,
            null,
            null,
            patternItemList
        )
    }
    /**
     * Convert the list of latitude and longitude to the polyline options.
     *
     * @param context         A context.
     * @param locationList    A list of latitude and longitude.
     * @param width           Width of the polyline in screen pixels.
     * @param color           Color of the polyline as a 32-bit ARGB color.
     * @param clickable       Is polyline clickable.
     * @param jointType       Joint type for all vertices of the polyline except the start and end vertices.
     * @param startCap        Cap at the start vertex of the polyline.
     * @param endCap          Cap at the end vertex of the polyline.
     * @param patternItemList Stroke pattern for the polyline.
     * @return Options for a polyline.
     * @since 1.2.0
     */
    /**
     * Convert the list of latitude and longitude to the polyline options.
     *
     * @param context      A context.
     * @param locationList A list of latitude and longitude.
     * @param width        Width of the polyline in screen pixels.
     * @param color        Color of the polyline as a 32-bit ARGB color.
     * @return Options for a polyline.
     * @since 1.0.0
     */
    /**
     * Convert the list of latitude and longitude to the polyline options.
     *
     * @param context      A context.
     * @param locationList A list of latitude and longitude.
     * @param width        Width of the polyline in screen pixels.
     * @param color        Color of the polyline as a 32-bit ARGB color.
     * @param clickable    Is polyline clickable.
     * @return Options for a polyline.
     * @since 1.2.0
     */
    /**
     * Convert the list of latitude and longitude to the polyline options.
     *
     * @param context      A context.
     * @param locationList A list of latitude and longitude.
     * @param width        Width of the polyline in screen pixels.
     * @param color        Color of the polyline as a 32-bit ARGB color.
     * @param clickable    Is polyline clickable.
     * @param jointType    Joint type for all vertices of the polyline except the start and end vertices.
     * @return Options for a polyline.
     * @since 1.2.0
     */
    @JvmOverloads
    fun createPolyline(
        context: Context,
        locationList: ArrayList<LatLng>?,
        @Dimension(unit = Dimension.DP) width: Int,
        @ColorInt color: Int,
        clickable: Boolean =
            true,
        jointType: Int =
            JointType.DEFAULT,
        startCap: Cap? =
            null,
        endCap: Cap? =
            null,
        patternItemList: List<PatternItem?>? =
            null
    ): PolylineOptions {
        val rectLine = PolylineOptions().width(
            dpToPx(
                context,
                width
            ).toFloat()
        ).color(color).geodesic(true)
        rectLine.clickable(clickable)
        rectLine.jointType(jointType)
        if (patternItemList != null) {
            rectLine.pattern(patternItemList)
        }
        if (startCap != null) {
            rectLine.startCap(startCap)
        }
        if (endCap != null) {
            rectLine.endCap(endCap)
        }
        if (locationList != null && locationList.size > 0) {
            for (location in locationList) {
                rectLine.add(location)
            }
        }
        return rectLine
    }

    /**
     * Convert the path option to the polyline options.
     *
     * @param context           A context.
     * @param transitPathOption Path options of the steps for transit result.
     * @return Options for a polyline.
     * @since 1.2.0
     */
    fun createTransitPolyline(
        context: Context,
        transitPathOption: TransitPathOption
    ): ArrayList<PolylineOptions> {
        return createTransitPolyline(
            context,
            transitPathOption.stepList,
            transitPathOption.transitWidth,
            transitPathOption.transitColor,
            transitPathOption.transitPatternItemList,
            transitPathOption.walkingWidth,
            transitPathOption.walkingColor,
            transitPathOption.walkingPatternItemList,
            transitPathOption.isClickable,
            transitPathOption.jointType,
            transitPathOption.startCap,
            transitPathOption.endCap
        )
    }

    /**
     * Convert the list of latitude and longitude to the polyline options in transit mode.
     *
     * @param context      A context.
     * @param stepList     A list of latitude and longitude for the steps.
     * @param transitWidth Width of the polyline in screen pixels for transit polyline.
     * @param transitColor Color of the polyline as a 32-bit ARGB color for transit polyline.
     * @param walkingWidth Width of the polyline in screen pixels for walking polyline.
     * @param walkingColor Color of the polyline as a 32-bit ARGB color for walking polyline.
     * @return Options for a polyline.
     * @since 1.0.0
     */
    fun createTransitPolyline(
        context: Context,
        stepList: List<Step>?,
        @Dimension(unit = Dimension.DP) transitWidth: Int,
        @ColorInt transitColor: Int,
        @Dimension(unit = Dimension.DP) walkingWidth: Int,
        @ColorInt walkingColor: Int
    ): ArrayList<PolylineOptions> {
        return createTransitPolyline(
            context,
            stepList,
            transitWidth,
            transitColor,
            null,
            walkingWidth,
            walkingColor,
            null,
            true,
            JointType.DEFAULT,
            null,
            null
        )
    }

    /**
     * Convert the list of latitude and longitude to the polyline options in transit mode.
     *
     * @param context                A context.
     * @param stepList               A list of latitude and longitude for the steps.
     * @param transitWidth           Width of the polyline in screen pixels for transit polyline.
     * @param transitColor           Color of the polyline as a 32-bit ARGB color for transit polyline.
     * @param transitPatternItemList Stroke pattern for the polyline for transit polyline.
     * @param walkingWidth           Width of the polyline in screen pixels for walking polyline.
     * @param walkingColor           Color of the polyline as a 32-bit ARGB color for walking polyline.
     * @param walkingPatternItemList Stroke pattern for the polyline for walking polyline.
     * @return Options for a polyline.
     * @since 1.2.0
     */
    fun createTransitPolyline(
        context: Context,
        stepList: List<Step>?,
        @Dimension(unit = Dimension.DP) transitWidth: Int,
        transitPatternItemList: List<PatternItem?>?,
        @ColorInt transitColor: Int,
        @Dimension(unit = Dimension.DP) walkingWidth: Int,
        @ColorInt walkingColor: Int,
        walkingPatternItemList: List<PatternItem?>?
    ): ArrayList<PolylineOptions> {
        return createTransitPolyline(
            context,
            stepList,
            transitWidth,
            transitColor,
            transitPatternItemList,
            walkingWidth,
            walkingColor,
            walkingPatternItemList,
            true,
            JointType.DEFAULT,
            null,
            null
        )
    }

    /**
     * Convert the list of latitude and longitude to the polyline options in transit mode.
     *
     * @param context      A context.
     * @param stepList     A list of latitude and longitude for the steps.
     * @param transitWidth Width of the polyline in screen pixels for transit polyline.
     * @param transitColor Color of the polyline as a 32-bit ARGB color for transit polyline.
     * @param walkingWidth Width of the polyline in screen pixels for walking polyline.
     * @param walkingColor Color of the polyline as a 32-bit ARGB color for walking polyline.
     * @param clickable    Is polyline clickable.
     * @return Options for a polyline.
     * @since 1.2.0
     */
    fun createTransitPolyline(
        context: Context,
        stepList: List<Step>?,
        @Dimension(unit = Dimension.DP) transitWidth: Int,
        @ColorInt transitColor: Int,
        @Dimension(unit = Dimension.DP) walkingWidth: Int,
        @ColorInt walkingColor: Int,
        clickable: Boolean
    ): ArrayList<PolylineOptions> {
        return createTransitPolyline(
            context,
            stepList,
            transitWidth,
            transitColor,
            null,
            walkingWidth,
            walkingColor,
            null,
            clickable,
            JointType.DEFAULT,
            null,
            null
        )
    }

    /**
     * Convert the list of latitude and longitude to the polyline options in transit mode.
     *
     * @param context      A context.
     * @param stepList     A list of latitude and longitude for the steps.
     * @param transitWidth Width of the polyline in screen pixels for transit polyline.
     * @param transitColor Color of the polyline as a 32-bit ARGB color for transit polyline.
     * @param walkingWidth Width of the polyline in screen pixels for walking polyline.
     * @param walkingColor Color of the polyline as a 32-bit ARGB color for walking polyline.
     * @param clickable    Is polyline clickable.
     * @param jointType    Joint type for all vertices of the polyline except the start and end vertices.
     * @return Options for a polyline.
     * @since 1.2.0
     */
    fun createTransitPolyline(
        context: Context,
        stepList: List<Step>?,
        @Dimension(unit = Dimension.DP) transitWidth: Int,
        @ColorInt transitColor: Int,
        @Dimension(unit = Dimension.DP) walkingWidth: Int,
        @ColorInt walkingColor: Int,
        clickable: Boolean,
        jointType: Int
    ): ArrayList<PolylineOptions> {
        return createTransitPolyline(
            context,
            stepList,
            transitWidth,
            transitColor,
            null,
            walkingWidth,
            walkingColor,
            null,
            clickable,
            jointType,
            null,
            null
        )
    }

    /**
     * Convert the list of latitude and longitude to the polyline options in transit mode.
     *
     * @param context      A context.
     * @param stepList     A list of latitude and longitude for the steps.
     * @param transitWidth Width of the polyline in screen pixels for transit polyline.
     * @param transitColor Color of the polyline as a 32-bit ARGB color for transit polyline.
     * @param walkingWidth Width of the polyline in screen pixels for walking polyline.
     * @param walkingColor Color of the polyline as a 32-bit ARGB color for walking polyline.
     * @param clickable    Is polyline clickable.
     * @param startCap     Cap at the start vertex of the polyline.
     * @param endCap       Cap at the end vertex of the polyline.
     * @return Options for a polyline.
     * @since 1.2.0
     */
    fun createTransitPolyline(
        context: Context,
        stepList: List<Step>?,
        @Dimension(unit = Dimension.DP) transitWidth: Int,
        @ColorInt transitColor: Int,
        @Dimension(unit = Dimension.DP) walkingWidth: Int,
        @ColorInt walkingColor: Int,
        clickable: Boolean,
        startCap: Cap?,
        endCap: Cap?
    ): ArrayList<PolylineOptions> {
        return createTransitPolyline(
            context,
            stepList,
            transitWidth,
            transitColor,
            null,
            walkingWidth,
            walkingColor,
            null,
            clickable,
            JointType.DEFAULT,
            startCap,
            endCap
        )
    }

    /**
     * Convert the list of latitude and longitude to the polyline options in transit mode.
     *
     * @param context                A context.
     * @param stepList               A list of latitude and longitude for the steps.
     * @param transitWidth           Width of the polyline in screen pixels for transit polyline.
     * @param transitColor           Color of the polyline as a 32-bit ARGB color for transit polyline.
     * @param transitPatternItemList Stroke pattern for the polyline for transit polyline.
     * @param walkingWidth           Width of the polyline in screen pixels for walking polyline.
     * @param walkingColor           Color of the polyline as a 32-bit ARGB color for walking polyline.
     * @param walkingPatternItemList Stroke pattern for the polyline for walking polyline.
     * @param clickable              Is polyline clickable.
     * @param jointType              Joint type for all vertices of the polyline except the start and end vertices.
     * @param startCap               Cap at the start vertex of the polyline.
     * @param endCap                 Cap at the end vertex of the polyline.
     * @return Options for a polyline.
     * @since 1.2.0
     */
    fun createTransitPolyline(
        context: Context,
        stepList: List<Step>?,
        @Dimension(unit = Dimension.DP) transitWidth: Int,
        @ColorInt transitColor: Int,
        transitPatternItemList: List<PatternItem?>?,
        @Dimension(unit = Dimension.DP) walkingWidth: Int,
        @ColorInt walkingColor: Int,
        walkingPatternItemList: List<PatternItem?>?,
        clickable: Boolean,
        jointType: Int,
        startCap: Cap?,
        endCap: Cap?
    ): ArrayList<PolylineOptions> {
        val polylineOptionsList =
            ArrayList<PolylineOptions>()
        if (stepList != null && stepList.size > 0) {
            for (step in stepList) {
                val directionPointList = ArrayList<LatLng>()
                convertStepToPosition(
                    step,
                    directionPointList
                )
                if (step.containSteps) {
                    polylineOptionsList.add(
                        createPolyline(
                            context,
                            directionPointList,
                            walkingWidth,
                            walkingColor,
                            clickable,
                            jointType,
                            startCap,
                            endCap,
                            walkingPatternItemList
                        )
                    )
                } else {
                    polylineOptionsList.add(
                        createPolyline(
                            context,
                            directionPointList,
                            transitWidth,
                            transitColor,
                            clickable,
                            jointType,
                            startCap,
                            endCap,
                            transitPatternItemList
                        )
                    )
                }
            }
        }
        return polylineOptionsList
    }

    /**
     * For internal use.
     */
    private fun dpToPx(context: Context, dp: Int): Int {
        val displayMetrics = context.resources.displayMetrics
        return Math.round(dp * (displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT).toFloat())
    }

    /**
     * A bunch of parameters for convert the step to polyline options.
     *
     * @since 1.2.0
     */
    class PathOption {
        var locationList: ArrayList<LatLng>? = null
        var width = 0
        var color = 0
        var isClickable = false
        var jointType = 0
        var startCap: Cap? = null
        var endCap: Cap? = null
        var patternItemList: List<PatternItem?>? = null

        fun setLocationList(locationList: ArrayList<LatLng>?): PathOption {
            this.locationList = locationList
            return this
        }

        fun setWidth(@Dimension(unit = Dimension.DP) width: Int): PathOption {
            this.width = width
            return this
        }

        fun setColor(@ColorInt color: Int): PathOption {
            this.color = color
            return this
        }

        fun setClickable(clickable: Boolean): PathOption {
            isClickable = clickable
            return this
        }

        fun setJointType(jointType: Int): PathOption {
            this.jointType = jointType
            return this
        }

        fun setStartCap(startCap: Cap?): PathOption {
            this.startCap = startCap
            return this
        }

        fun setEndCap(endCap: Cap?): PathOption {
            this.endCap = endCap
            return this
        }

        fun setPatternItemList(patternItemList: List<PatternItem?>?): PathOption {
            this.patternItemList = patternItemList
            return this
        }
    }

    /**
     * A bunch of parameters for convert the step to polyline options for transit result.
     *
     * @since 1.2.0
     */
    class TransitPathOption {
        var stepList: List<Step>? = null
        var transitWidth = 0
        var transitColor = 0
        var transitPatternItemList: List<PatternItem?>? = null
        var walkingWidth = 0
        var walkingColor = 0
        var walkingPatternItemList: List<PatternItem?>? = null
        var isClickable = false
        var jointType = 0
        var startCap: Cap? = null
        var endCap: Cap? = null

        fun setStepList(stepList: List<Step>?): TransitPathOption {
            this.stepList = stepList
            return this
        }

        fun setTransitWidth(@Dimension(unit = Dimension.DP) transitWidth: Int): TransitPathOption {
            this.transitWidth = transitWidth
            return this
        }

        fun setTransitColor(@ColorInt transitColor: Int): TransitPathOption {
            this.transitColor = transitColor
            return this
        }

        fun setTransitPatternItemList(transitPatternItemList: List<PatternItem?>?): TransitPathOption {
            this.transitPatternItemList = transitPatternItemList
            return this
        }

        fun setWalkingWidth(@Dimension(unit = Dimension.DP) walkingWidth: Int): TransitPathOption {
            this.walkingWidth = walkingWidth
            return this
        }

        fun setWalkingColor(@ColorInt walkingColor: Int): TransitPathOption {
            this.walkingColor = walkingColor
            return this
        }

        fun setWalkingPatternItemList(walkingPatternItemList: List<PatternItem?>?): TransitPathOption {
            this.walkingPatternItemList = walkingPatternItemList
            return this
        }

        fun setClickable(clickable: Boolean): TransitPathOption {
            isClickable = clickable
            return this
        }

        fun setJointType(jointType: Int): TransitPathOption {
            this.jointType = jointType
            return this
        }

        fun setStartCap(startCap: Cap?): TransitPathOption {
            this.startCap = startCap
            return this
        }

        fun setEndCap(endCap: Cap?): TransitPathOption {
            this.endCap = endCap
            return this
        }
    }
}