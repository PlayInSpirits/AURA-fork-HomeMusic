.class public final synthetic Lfk3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lhk3;


# direct methods
.method public synthetic constructor <init>(Lhk3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfk3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lfk3;->o:Lhk3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget p1, p0, Lfk3;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Lfk3;->o:Lhk3;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lhk3;->l0(Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-virtual {p0, v2}, Lhk3;->l0(Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "PlayerBottomSheet"

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lld1;->D(Ljava/lang/String;)Lkc1;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    instance-of p1, p0, Lxi3;

    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    move-object v0, p0

    .line 38
    check-cast v0, Lxi3;

    .line 39
    .line 40
    :cond_0
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Lkc1;->n()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Lkc1;->y()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    iget-object p0, v0, Lkc1;->T:Landroid/view/View;

    .line 55
    .line 56
    if-nez p0, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iget-object p0, v0, Lxi3;->o0:Lns3;

    .line 60
    .line 61
    iget-object p0, p0, Lns3;->p:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Lom1;

    .line 64
    .line 65
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Ldw3;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, Lck3;

    .line 74
    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    iget-object p0, p0, Lck3;->z:Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Lkc1;

    .line 88
    .line 89
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 90
    .line 91
    if-eqz p0, :cond_2

    .line 92
    .line 93
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0:Landroidx/viewpager2/widget/ViewPager2;

    .line 94
    .line 95
    invoke-virtual {p0, v1, v1}, Landroidx/viewpager2/widget/ViewPager2;->c(IZ)V

    .line 96
    .line 97
    .line 98
    :cond_2
    :goto_0
    return-void

    .line 99
    :pswitch_2
    iget-object p1, p0, Lhk3;->m0:Laj3;

    .line 100
    .line 101
    if-eqz p1, :cond_7

    .line 102
    .line 103
    iget-object v0, p1, Laj3;->f:Lvs3;

    .line 104
    .line 105
    invoke-static {}, Lu52;->c()Lv52;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-boolean v1, v1, Lv52;->a:Z

    .line 110
    .line 111
    const/16 v3, 0x11

    .line 112
    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    invoke-static {}, Lu52;->c()Lv52;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iget-object v1, p1, Lv52;->x:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {}, Lu52;->k()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_6

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eqz v4, :cond_3

    .line 132
    .line 133
    goto/16 :goto_3

    .line 134
    .line 135
    :cond_3
    invoke-static {}, Lu52;->l()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-interface {v4}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    new-instance v5, Lm7;

    .line 144
    .line 145
    invoke-direct {v5, v3}, Lm7;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v4, v5}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-interface {v3, v4}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Ljava/util/List;

    .line 161
    .line 162
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 163
    .line 164
    .line 165
    move-result-wide v4

    .line 166
    invoke-virtual {p1, v4, v5}, Lv52;->b(J)J

    .line 167
    .line 168
    .line 169
    move-result-wide v4

    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-static {v3, v1, v4, v5}, Lvs3;->d(Ljava/util/List;Ljava/lang/String;J)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_4
    iget-object p1, p1, Laj3;->n:Lk03;

    .line 178
    .line 179
    invoke-virtual {p1}, Lad2;->d()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 184
    .line 185
    invoke-virtual {v0}, Lvs3;->b()Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    new-instance v1, Lm7;

    .line 194
    .line 195
    invoke-direct {v1, v3}, Lm7;-><init>(I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, Ljava/util/List;

    .line 211
    .line 212
    if-eqz p1, :cond_6

    .line 213
    .line 214
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {}, Lud3;->A()Ljava/util/Map;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    check-cast v1, Lsp3;

    .line 230
    .line 231
    if-eqz v1, :cond_5

    .line 232
    .line 233
    iget-wide v3, v1, Lsp3;->b:J

    .line 234
    .line 235
    goto :goto_1

    .line 236
    :cond_5
    const-wide/16 v3, 0x0

    .line 237
    .line 238
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    const-string v5, "Saving play queue - Current: "

    .line 241
    .line 242
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v5, ", Items: "

    .line 253
    .line 254
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const-string v5, ", Position: "

    .line 265
    .line 266
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    const-string v5, "PlayerBottomSheetViewModel"

    .line 277
    .line 278
    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-static {v0, p1, v3, v4}, Lvs3;->d(Ljava/util/List;Ljava/lang/String;J)V

    .line 286
    .line 287
    .line 288
    :goto_2
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    sget-object p1, Lqg4;->E:[I

    .line 293
    .line 294
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    const v0, 0x7f1303d9

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-static {p0, p1, v2}, Lqg4;->h(Landroid/view/View;Ljava/lang/CharSequence;I)Lqg4;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    invoke-virtual {p0}, Lqg4;->j()V

    .line 310
    .line 311
    .line 312
    :cond_6
    :goto_3
    return-void

    .line 313
    :cond_7
    const-string p0, "playerBottomSheetViewModel"

    .line 314
    .line 315
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v0

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
