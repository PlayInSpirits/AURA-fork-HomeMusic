.class public final Lpp2;
.super Landroid/widget/ArrayAdapter;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final n:F

.field public final synthetic o:Lqp2;


# direct methods
.method public constructor <init>(Lqp2;Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpp2;->o:Lqp2;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p2, p1, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lfu;->v(Landroid/content/Context;)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, p0, Lpp2;->n:F

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .line 1
    const v0, 0x7f0a03e5

    .line 2
    .line 3
    .line 4
    const v1, 0x7f0a065f

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    iget-object v3, p0, Lpp2;->o:Lqp2;

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    const p2, 0x7f0d00df

    .line 13
    .line 14
    .line 15
    invoke-static {p3, p2, p3, v2}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Landroid/widget/LinearLayout;

    .line 25
    .line 26
    iget v5, v3, Lqp2;->b0:I

    .line 27
    .line 28
    invoke-static {v4, v5}, Lqp2;->r(Landroid/view/View;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget v6, v3, Lqp2;->a0:I

    .line 40
    .line 41
    iput v6, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 42
    .line 43
    iput v6, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lwq2;

    .line 53
    .line 54
    if-eqz p1, :cond_8

    .line 55
    .line 56
    iget-boolean v4, p1, Lwq2;->g:Z

    .line 57
    .line 58
    const v5, 0x7f0a03da

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Landroid/widget/TextView;

    .line 66
    .line 67
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 68
    .line 69
    .line 70
    iget-object v6, p1, Lwq2;->d:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    const v5, 0x7f0a03e6

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    check-cast v5, Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    .line 83
    .line 84
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    iget-object v6, v3, Lqp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 89
    .line 90
    invoke-static {p3, v2}, Lfu;->u(Landroid/content/Context;I)I

    .line 91
    .line 92
    .line 93
    move-result p3

    .line 94
    invoke-static {p3}, Landroid/graphics/Color;->alpha(I)I

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    const/16 v8, 0xff

    .line 99
    .line 100
    if-eq v7, v8, :cond_1

    .line 101
    .line 102
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    invoke-static {p3, v6}, Lv50;->g(II)I

    .line 113
    .line 114
    .line 115
    move-result p3

    .line 116
    :cond_1
    invoke-virtual {v5, p3, p3}, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->a(II)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object p3, v3, Lqp2;->e0:Ljava/util/HashMap;

    .line 123
    .line 124
    invoke-virtual {p3, p1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    xor-int/lit8 p3, v4, 0x1

    .line 128
    .line 129
    invoke-virtual {v5, p3}, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->b(Z)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 133
    .line 134
    .line 135
    const/4 p3, 0x1

    .line 136
    if-eqz v4, :cond_5

    .line 137
    .line 138
    iget-boolean v6, v3, Lqp2;->L:Z

    .line 139
    .line 140
    if-eqz v6, :cond_4

    .line 141
    .line 142
    invoke-virtual {p1}, Lwq2;->e()Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-eqz v6, :cond_3

    .line 147
    .line 148
    sget-object v6, Lyq2;->c:Lui1;

    .line 149
    .line 150
    if-nez v6, :cond_2

    .line 151
    .line 152
    move v6, v2

    .line 153
    goto :goto_1

    .line 154
    :cond_2
    invoke-static {}, Lyq2;->c()Lui1;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    :cond_3
    iget v6, p1, Lwq2;->o:I

    .line 162
    .line 163
    :goto_1
    if-ne v6, p3, :cond_4

    .line 164
    .line 165
    iget v6, p1, Lwq2;->q:I

    .line 166
    .line 167
    invoke-virtual {v5, v6}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 168
    .line 169
    .line 170
    iget v6, p1, Lwq2;->p:I

    .line 171
    .line 172
    invoke-virtual {v5, v6}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 173
    .line 174
    .line 175
    iget-object v6, v3, Lqp2;->Y:Lop2;

    .line 176
    .line 177
    invoke-virtual {v5, v6}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_4
    const/16 v6, 0x64

    .line 182
    .line 183
    invoke-virtual {v5, v6}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5, v6}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 190
    .line 191
    .line 192
    :cond_5
    :goto_2
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Landroid/widget/ImageView;

    .line 197
    .line 198
    if-eqz v4, :cond_6

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_6
    const/high16 v4, 0x437f0000    # 255.0f

    .line 202
    .line 203
    iget p0, p0, Lpp2;->n:F

    .line 204
    .line 205
    mul-float/2addr p0, v4

    .line 206
    float-to-int v8, p0

    .line 207
    :goto_3
    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setAlpha(I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    check-cast p0, Landroid/widget/LinearLayout;

    .line 215
    .line 216
    iget-object v0, v3, Lqp2;->W:Ljava/util/HashSet;

    .line 217
    .line 218
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_7

    .line 223
    .line 224
    const/4 v2, 0x4

    .line 225
    :cond_7
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 226
    .line 227
    .line 228
    iget-object p0, v3, Lqp2;->U:Ljava/util/HashSet;

    .line 229
    .line 230
    if-eqz p0, :cond_8

    .line 231
    .line 232
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    if-eqz p0, :cond_8

    .line 237
    .line 238
    new-instance p0, Landroid/view/animation/AlphaAnimation;

    .line 239
    .line 240
    const/4 p1, 0x0

    .line 241
    invoke-direct {p0, p1, p1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 242
    .line 243
    .line 244
    const-wide/16 v0, 0x0

    .line 245
    .line 246
    invoke-virtual {p0, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0, p3}, Landroid/view/animation/Animation;->setFillEnabled(Z)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0, p3}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p2}, Landroid/view/View;->clearAnimation()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p2, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 259
    .line 260
    .line 261
    :cond_8
    return-object p2
.end method

.method public final isEnabled(I)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
