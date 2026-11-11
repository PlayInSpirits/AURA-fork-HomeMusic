.class public final Lyq;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyq;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 8

    .line 1
    iget p0, p0, Lyq;->n:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget p0, p1, Landroid/os/Message;->what:I

    .line 9
    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lq04;

    .line 15
    .line 16
    invoke-interface {p0}, Lq04;->b()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    return v0

    .line 22
    :pswitch_0
    iget p0, p1, Landroid/os/Message;->what:I

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-eqz p0, :cond_6

    .line 26
    .line 27
    if-eq p0, v0, :cond_1

    .line 28
    .line 29
    move v0, v1

    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_1
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Lfr;

    .line 35
    .line 36
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 37
    .line 38
    iget-object v3, p0, Lfr;->i:Ler;

    .line 39
    .line 40
    iget-object v4, p0, Lfr;->u:Landroid/view/accessibility/AccessibilityManager;

    .line 41
    .line 42
    if-nez v4, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-virtual {v4, v0}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-eqz v4, :cond_5

    .line 50
    .line 51
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_5

    .line 56
    .line 57
    :goto_1
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_5

    .line 62
    .line 63
    invoke-virtual {v3}, Ler;->getAnimationMode()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-ne v3, v0, :cond_3

    .line 68
    .line 69
    new-array v2, v2, [F

    .line 70
    .line 71
    fill-array-data v2, :array_0

    .line 72
    .line 73
    .line 74
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object v3, p0, Lfr;->d:Landroid/animation/TimeInterpolator;

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 81
    .line 82
    .line 83
    new-instance v3, Lxq;

    .line 84
    .line 85
    invoke-direct {v3, p0, v1, v1}, Lxq;-><init>(Lfr;IB)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 89
    .line 90
    .line 91
    iget v3, p0, Lfr;->b:I

    .line 92
    .line 93
    int-to-long v3, v3

    .line 94
    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 95
    .line 96
    .line 97
    new-instance v3, Lwq;

    .line 98
    .line 99
    invoke-direct {v3, p0, p1, v1}, Lwq;-><init>(Lfr;II)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :cond_3
    new-instance v3, Landroid/animation/ValueAnimator;

    .line 111
    .line 112
    invoke-direct {v3}, Landroid/animation/ValueAnimator;-><init>()V

    .line 113
    .line 114
    .line 115
    iget-object v4, p0, Lfr;->i:Ler;

    .line 116
    .line 117
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    instance-of v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 126
    .line 127
    if-eqz v6, :cond_4

    .line 128
    .line 129
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 130
    .line 131
    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 132
    .line 133
    add-int/2addr v5, v4

    .line 134
    :cond_4
    filled-new-array {v1, v5}, [I

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    .line 139
    .line 140
    .line 141
    iget-object v4, p0, Lfr;->e:Landroid/animation/TimeInterpolator;

    .line 142
    .line 143
    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 144
    .line 145
    .line 146
    iget v4, p0, Lfr;->c:I

    .line 147
    .line 148
    int-to-long v4, v4

    .line 149
    invoke-virtual {v3, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 150
    .line 151
    .line 152
    new-instance v4, Lwq;

    .line 153
    .line 154
    invoke-direct {v4, p0, p1, v2}, Lwq;-><init>(Lfr;II)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 158
    .line 159
    .line 160
    new-instance p1, Lxq;

    .line 161
    .line 162
    const/4 v2, 0x3

    .line 163
    invoke-direct {p1, p0, v2, v1}, Lxq;-><init>(Lfr;IB)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->start()V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_3

    .line 173
    .line 174
    :cond_5
    invoke-virtual {p0}, Lfr;->c()V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_3

    .line 178
    .line 179
    :cond_6
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p0, Lfr;

    .line 182
    .line 183
    iget-object p1, p0, Lfr;->i:Ler;

    .line 184
    .line 185
    iget-object v3, p0, Lfr;->g:Landroid/view/ViewGroup;

    .line 186
    .line 187
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    if-nez v4, :cond_9

    .line 192
    .line 193
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    instance-of v5, v4, Lge0;

    .line 198
    .line 199
    if-eqz v5, :cond_7

    .line 200
    .line 201
    check-cast v4, Lge0;

    .line 202
    .line 203
    new-instance v5, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;

    .line 204
    .line 205
    invoke-direct {v5}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;-><init>()V

    .line 206
    .line 207
    .line 208
    iget-object v6, v5, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;->v:Ld34;

    .line 209
    .line 210
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    iget-object v7, p0, Lfr;->v:Lbr;

    .line 214
    .line 215
    iput-object v7, v6, Ld34;->o:Ljava/lang/Object;

    .line 216
    .line 217
    new-instance v6, Lzg5;

    .line 218
    .line 219
    invoke-direct {v6, p0}, Lzg5;-><init>(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    iput-object v6, v5, Lcom/google/android/material/behavior/SwipeDismissBehavior;->o:Lzg5;

    .line 223
    .line 224
    invoke-virtual {v4, v5}, Lge0;->b(Lde0;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, Lfr;->b()Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    if-nez v5, :cond_7

    .line 232
    .line 233
    const/16 v5, 0x50

    .line 234
    .line 235
    iput v5, v4, Lge0;->g:I

    .line 236
    .line 237
    :cond_7
    iput-boolean v0, p1, Ler;->x:Z

    .line 238
    .line 239
    invoke-virtual {v3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 240
    .line 241
    .line 242
    iput-boolean v1, p1, Ler;->x:Z

    .line 243
    .line 244
    invoke-virtual {p0}, Lfr;->b()Landroid/view/View;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    if-nez v4, :cond_8

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_8
    new-array v1, v2, [I

    .line 252
    .line 253
    invoke-virtual {p0}, Lfr;->b()Landroid/view/View;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-virtual {v4, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 258
    .line 259
    .line 260
    aget v1, v1, v0

    .line 261
    .line 262
    new-array v2, v2, [I

    .line 263
    .line 264
    invoke-virtual {v3, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 265
    .line 266
    .line 267
    aget v2, v2, v0

    .line 268
    .line 269
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    add-int/2addr v3, v2

    .line 274
    sub-int v1, v3, v1

    .line 275
    .line 276
    :goto_2
    iput v1, p0, Lfr;->q:I

    .line 277
    .line 278
    invoke-virtual {p0}, Lfr;->g()V

    .line 279
    .line 280
    .line 281
    const/4 v1, 0x4

    .line 282
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 283
    .line 284
    .line 285
    :cond_9
    sget-object v1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 286
    .line 287
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 288
    .line 289
    .line 290
    move-result p1

    .line 291
    if-eqz p1, :cond_a

    .line 292
    .line 293
    invoke-virtual {p0}, Lfr;->f()V

    .line 294
    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_a
    iput-boolean v0, p0, Lfr;->t:Z

    .line 298
    .line 299
    :goto_3
    return v0

    .line 300
    nop

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method
