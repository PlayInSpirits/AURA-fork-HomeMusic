.class public final Ldefpackage/sq;
.super Ldefpackage/z41;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final D:Lcom/google/android/material/slider/Slider;

.field public final E:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Lcom/google/android/material/slider/Slider;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ldefpackage/z41;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/sq;->E:Landroid/graphics/Rect;

    .line 10
    .line 11
    iput-object p1, p0, Ldefpackage/sq;->D:Lcom/google/android/material/slider/Slider;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final n(FF)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Ldefpackage/sq;->D:Lcom/google/android/material/slider/Slider;

    .line 3
    .line 4
    invoke-virtual {v1}, Ldefpackage/uq;->getValues()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ge v0, v2, :cond_1

    .line 13
    .line 14
    iget-object v2, p0, Ldefpackage/sq;->E:Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-virtual {v1, v0, v2}, Ldefpackage/uq;->t(ILandroid/graphics/Rect;)V

    .line 17
    .line 18
    .line 19
    float-to-int v1, p1

    .line 20
    float-to-int v3, p2

    .line 21
    invoke-virtual {v2, v1, v3}, Landroid/graphics/Rect;->contains(II)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    return v0

    .line 28
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 p0, -0x1

    .line 32
    return p0
.end method

.method public final o(Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Ldefpackage/sq;->D:Lcom/google/android/material/slider/Slider;

    .line 3
    .line 4
    invoke-virtual {v1}, Ldefpackage/uq;->getValues()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method public final s(IILandroid/os/Bundle;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/sq;->D:Lcom/google/android/material/slider/Slider;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    const/16 v1, 0x1000

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const/16 v3, 0x2000

    .line 15
    .line 16
    if-eq p2, v1, :cond_3

    .line 17
    .line 18
    if-eq p2, v3, :cond_3

    .line 19
    .line 20
    const v1, 0x102003d

    .line 21
    .line 22
    .line 23
    if-eq p2, v1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_1
    if-eqz p3, :cond_8

    .line 28
    .line 29
    const-string p2, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    .line 30
    .line 31
    invoke-virtual {p3, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-virtual {p3, p2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-virtual {v0, p1, p2}, Ldefpackage/uq;->r(IF)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_8

    .line 47
    .line 48
    invoke-virtual {v0}, Ldefpackage/uq;->u()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ldefpackage/z41;->p(I)V

    .line 55
    .line 56
    .line 57
    return v2

    .line 58
    :cond_3
    iget p3, v0, Ldefpackage/uq;->e0:F

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    cmpl-float v1, p3, v1

    .line 62
    .line 63
    if-nez v1, :cond_4

    .line 64
    .line 65
    const/high16 p3, 0x3f800000    # 1.0f

    .line 66
    .line 67
    :cond_4
    iget v1, v0, Ldefpackage/uq;->a0:F

    .line 68
    .line 69
    iget v4, v0, Ldefpackage/uq;->W:F

    .line 70
    .line 71
    sub-float/2addr v1, v4

    .line 72
    div-float/2addr v1, p3

    .line 73
    const/high16 v4, 0x41a00000    # 20.0f

    .line 74
    .line 75
    cmpg-float v5, v1, v4

    .line 76
    .line 77
    if-gtz v5, :cond_5

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_5
    div-float/2addr v1, v4

    .line 81
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    int-to-float v1, v1

    .line 86
    mul-float/2addr p3, v1

    .line 87
    :goto_0
    if-ne p2, v3, :cond_6

    .line 88
    .line 89
    neg-float p3, p3

    .line 90
    :cond_6
    invoke-virtual {v0}, Ldefpackage/uq;->j()Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-eqz p2, :cond_7

    .line 95
    .line 96
    neg-float p3, p3

    .line 97
    :cond_7
    invoke-virtual {v0}, Ldefpackage/uq;->getValues()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    check-cast p2, Ljava/lang/Float;

    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    add-float/2addr p2, p3

    .line 112
    invoke-virtual {v0}, Lcom/google/android/material/slider/Slider;->getValueFrom()F

    .line 113
    .line 114
    .line 115
    move-result p3

    .line 116
    invoke-virtual {v0}, Lcom/google/android/material/slider/Slider;->getValueTo()F

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-static {p2, p3, v1}, Ldefpackage/su3;->k(FFF)F

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    invoke-virtual {v0, p1, p2}, Ldefpackage/uq;->r(IF)Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-eqz p2, :cond_8

    .line 129
    .line 130
    invoke-virtual {v0}, Ldefpackage/uq;->u()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, p1}, Ldefpackage/z41;->p(I)V

    .line 137
    .line 138
    .line 139
    return v2

    .line 140
    :cond_8
    :goto_1
    const/4 p0, 0x0

    .line 141
    return p0
.end method

.method public final u(ILdefpackage/v3;)V
    .locals 7

    .line 1
    iget-object v0, p2, Ldefpackage/v3;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    sget-object v1, Ldefpackage/o3;->t:Ldefpackage/o3;

    .line 4
    .line 5
    invoke-virtual {p2, v1}, Ldefpackage/v3;->b(Ldefpackage/o3;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/sq;->D:Lcom/google/android/material/slider/Slider;

    .line 9
    .line 10
    invoke-virtual {v1}, Ldefpackage/uq;->getValues()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Ljava/lang/Float;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v1}, Lcom/google/android/material/slider/Slider;->getValueFrom()F

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-virtual {v1}, Lcom/google/android/material/slider/Slider;->getValueTo()F

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    cmpl-float v6, v3, v4

    .line 39
    .line 40
    if-lez v6, :cond_0

    .line 41
    .line 42
    const/16 v6, 0x2000

    .line 43
    .line 44
    invoke-virtual {p2, v6}, Ldefpackage/v3;->a(I)V

    .line 45
    .line 46
    .line 47
    :cond_0
    cmpg-float v6, v3, v5

    .line 48
    .line 49
    if-gez v6, :cond_1

    .line 50
    .line 51
    const/16 v6, 0x1000

    .line 52
    .line 53
    invoke-virtual {p2, v6}, Ldefpackage/v3;->a(I)V

    .line 54
    .line 55
    .line 56
    :cond_1
    const/4 v6, 0x1

    .line 57
    invoke-static {v6, v4, v5, v3}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    .line 62
    .line 63
    .line 64
    const-class v4, Landroid/widget/SeekBar;

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {p2, v4}, Ldefpackage/v3;->i(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    new-instance p2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    invoke-virtual {v1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v4, ","

    .line 92
    .line 93
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    :cond_2
    invoke-virtual {v1, v3}, Ldefpackage/uq;->e(F)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    const v5, 0x7f130317

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-le v2, v6, :cond_5

    .line 116
    .line 117
    invoke-virtual {v1}, Ldefpackage/uq;->getValues()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    sub-int/2addr v2, v6

    .line 126
    if-ne p1, v2, :cond_3

    .line 127
    .line 128
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    const v4, 0x7f130315

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    :goto_0
    move-object v4, v2

    .line 140
    goto :goto_1

    .line 141
    :cond_3
    if-nez p1, :cond_4

    .line 142
    .line 143
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const v4, 0x7f130316

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    goto :goto_0

    .line 155
    :cond_4
    const-string v2, ""

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_5
    :goto_1
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 159
    .line 160
    new-instance v2, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v4, ", "

    .line 169
    .line 170
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    invoke-virtual {v0, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 188
    .line 189
    .line 190
    iget-object p0, p0, Ldefpackage/sq;->E:Landroid/graphics/Rect;

    .line 191
    .line 192
    invoke-virtual {v1, p1, p0}, Ldefpackage/uq;->t(ILandroid/graphics/Rect;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method
