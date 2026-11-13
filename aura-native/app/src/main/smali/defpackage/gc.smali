.class public final Ldefpackage/gc;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:I

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1001
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1002
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ldefpackage/gc;->b:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 1003
    iput-object v0, p0, Ldefpackage/gc;->c:Ljava/lang/Object;

    .line 1004
    iput-object v0, p0, Ldefpackage/gc;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 1005
    iput v0, p0, Ldefpackage/gc;->a:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V
    .locals 0

    .line 1006
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1007
    iput-object p2, p0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 1008
    iput p3, p0, Ldefpackage/gc;->a:I

    if-nez p4, :cond_0

    .line 1009
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 1010
    :cond_0
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ldefpackage/gc;->c:Ljava/lang/Object;

    .line 1011
    iput-object p5, p0, Ldefpackage/gc;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Paint;)V
    .locals 0

    .line 999
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/gc;->b:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 1000
    iput p1, p0, Ldefpackage/gc;->a:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 6

    .line 1017
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1018
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldefpackage/j50;

    .line 1019
    iget-short v0, v0, Ldefpackage/j50;->c:S

    add-int/lit8 v0, v0, 0x1

    .line 1020
    iput v0, p0, Ldefpackage/gc;->a:I

    .line 1021
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 1022
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldefpackage/j50;

    .line 1023
    iget-short v2, v2, Ldefpackage/j50;->c:S

    .line 1024
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1025
    :cond_0
    iget v1, p0, Ldefpackage/gc;->a:I

    new-array v1, v1, [I

    iput-object v1, p0, Ldefpackage/gc;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 1026
    :goto_1
    iget v2, p0, Ldefpackage/gc;->a:I

    if-ge v1, v2, :cond_2

    .line 1027
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1028
    iget-object v2, p0, Ldefpackage/gc;->c:Ljava/lang/Object;

    check-cast v2, [I

    const/high16 v3, 0x40000000    # 2.0f

    aput v3, v2, v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    int-to-short v1, v1

    goto :goto_1

    .line 1029
    :cond_2
    new-instance v1, Ldefpackage/m50;

    mul-int/lit8 v3, v2, 0x4

    const/16 v4, 0x10

    add-int/2addr v3, v4

    const/16 v5, 0x202

    invoke-direct {v1, v3, v5, v4}, Ldefpackage/m50;-><init>(ISS)V

    iput-object v1, p0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 1030
    new-instance v1, Ldefpackage/ew4;

    invoke-direct {v1, p1, v0, v2}, Ldefpackage/ew4;-><init>(Ljava/util/List;Ljava/util/HashSet;I)V

    iput-object v1, p0, Ldefpackage/gc;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;I[B[Ljava/util/UUID;)V
    .locals 0

    .line 1012
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1013
    iput-object p1, p0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 1014
    iput p2, p0, Ldefpackage/gc;->a:I

    .line 1015
    iput-object p3, p0, Ldefpackage/gc;->c:Ljava/lang/Object;

    .line 1016
    iput-object p4, p0, Ldefpackage/gc;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/s63;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v0, Ldefpackage/gc;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object v1, v0, Ldefpackage/gc;->c:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v2, v1, Ldefpackage/s63;->a:Landroid/content/Context;

    .line 18
    .line 19
    iget-object v3, v1, Ldefpackage/s63;->x:Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v4, v1, Ldefpackage/s63;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object v5, v1, Ldefpackage/s63;->d:Ljava/util/ArrayList;

    .line 24
    .line 25
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v7, 0x1a

    .line 28
    .line 29
    if-lt v6, v7, :cond_0

    .line 30
    .line 31
    iget-object v6, v1, Ldefpackage/s63;->s:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, v6}, Ldefpackage/r50;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iput-object v6, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v6, Landroid/app/Notification$Builder;

    .line 41
    .line 42
    invoke-direct {v6, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 43
    .line 44
    .line 45
    iput-object v6, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 46
    .line 47
    :goto_0
    iget-object v6, v1, Ldefpackage/s63;->v:Landroid/app/Notification;

    .line 48
    .line 49
    iget-object v8, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v8, Landroid/app/Notification$Builder;

    .line 52
    .line 53
    iget-wide v9, v6, Landroid/app/Notification;->when:J

    .line 54
    .line 55
    invoke-virtual {v8, v9, v10}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    iget v9, v6, Landroid/app/Notification;->icon:I

    .line 60
    .line 61
    iget v10, v6, Landroid/app/Notification;->iconLevel:I

    .line 62
    .line 63
    invoke-virtual {v8, v9, v10}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    iget-object v9, v6, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 68
    .line 69
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    iget-object v9, v6, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    invoke-virtual {v8, v9, v10}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    iget-object v9, v6, Landroid/app/Notification;->vibrate:[J

    .line 81
    .line 82
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    iget v9, v6, Landroid/app/Notification;->ledARGB:I

    .line 87
    .line 88
    iget v11, v6, Landroid/app/Notification;->ledOnMS:I

    .line 89
    .line 90
    iget v12, v6, Landroid/app/Notification;->ledOffMS:I

    .line 91
    .line 92
    invoke-virtual {v8, v9, v11, v12}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    iget v9, v6, Landroid/app/Notification;->flags:I

    .line 97
    .line 98
    and-int/lit8 v9, v9, 0x2

    .line 99
    .line 100
    const/4 v12, 0x0

    .line 101
    if-eqz v9, :cond_1

    .line 102
    .line 103
    const/4 v9, 0x1

    .line 104
    goto :goto_1

    .line 105
    :cond_1
    move v9, v12

    .line 106
    :goto_1
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    iget v9, v6, Landroid/app/Notification;->flags:I

    .line 111
    .line 112
    and-int/lit8 v9, v9, 0x8

    .line 113
    .line 114
    if-eqz v9, :cond_2

    .line 115
    .line 116
    const/4 v9, 0x1

    .line 117
    goto :goto_2

    .line 118
    :cond_2
    move v9, v12

    .line 119
    :goto_2
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    iget v9, v6, Landroid/app/Notification;->flags:I

    .line 124
    .line 125
    and-int/lit8 v9, v9, 0x10

    .line 126
    .line 127
    if-eqz v9, :cond_3

    .line 128
    .line 129
    const/4 v9, 0x1

    .line 130
    goto :goto_3

    .line 131
    :cond_3
    move v9, v12

    .line 132
    :goto_3
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    iget v9, v6, Landroid/app/Notification;->defaults:I

    .line 137
    .line 138
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    iget-object v9, v1, Ldefpackage/s63;->e:Ljava/lang/CharSequence;

    .line 143
    .line 144
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    iget-object v9, v1, Ldefpackage/s63;->f:Ljava/lang/CharSequence;

    .line 149
    .line 150
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-virtual {v8, v10}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    iget-object v9, v1, Ldefpackage/s63;->g:Landroid/app/PendingIntent;

    .line 159
    .line 160
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    iget-object v9, v6, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 165
    .line 166
    invoke-virtual {v8, v9}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    iget v9, v6, Landroid/app/Notification;->flags:I

    .line 171
    .line 172
    and-int/lit16 v9, v9, 0x80

    .line 173
    .line 174
    if-eqz v9, :cond_4

    .line 175
    .line 176
    const/4 v9, 0x1

    .line 177
    goto :goto_4

    .line 178
    :cond_4
    move v9, v12

    .line 179
    :goto_4
    invoke-virtual {v8, v10, v9}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    invoke-virtual {v8, v12}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    iget v9, v1, Ldefpackage/s63;->m:I

    .line 188
    .line 189
    iget v13, v1, Ldefpackage/s63;->n:I

    .line 190
    .line 191
    invoke-virtual {v8, v9, v13, v12}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 192
    .line 193
    .line 194
    iget-object v8, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v8, Landroid/app/Notification$Builder;

    .line 197
    .line 198
    iget-object v9, v1, Ldefpackage/s63;->h:Landroidx/core/graphics/drawable/IconCompat;

    .line 199
    .line 200
    if-nez v9, :cond_5

    .line 201
    .line 202
    move-object v2, v10

    .line 203
    goto :goto_5

    .line 204
    :cond_5
    invoke-virtual {v9, v2}, Landroidx/core/graphics/drawable/IconCompat;->e(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    :goto_5
    invoke-virtual {v8, v2}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 209
    .line 210
    .line 211
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v2, Landroid/app/Notification$Builder;

    .line 214
    .line 215
    invoke-virtual {v2, v10}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    iget-boolean v8, v1, Ldefpackage/s63;->k:Z

    .line 220
    .line 221
    invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    iget v8, v1, Ldefpackage/s63;->i:I

    .line 226
    .line 227
    invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 228
    .line 229
    .line 230
    iget-object v2, v1, Ldefpackage/s63;->b:Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 233
    .line 234
    .line 235
    move-result v8

    .line 236
    move v9, v12

    .line 237
    :goto_6
    const-string v15, "android.support.allowGeneratedReplies"

    .line 238
    .line 239
    const-string v11, ""

    .line 240
    .line 241
    if-ge v9, v8, :cond_c

    .line 242
    .line 243
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v16

    .line 247
    add-int/lit8 v9, v9, 0x1

    .line 248
    .line 249
    move-object/from16 v13, v16

    .line 250
    .line 251
    check-cast v13, Ldefpackage/q63;

    .line 252
    .line 253
    iget-object v14, v13, Ldefpackage/q63;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 254
    .line 255
    if-nez v14, :cond_6

    .line 256
    .line 257
    iget v14, v13, Ldefpackage/q63;->e:I

    .line 258
    .line 259
    if-eqz v14, :cond_6

    .line 260
    .line 261
    invoke-static {v10, v11, v14}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    iput-object v11, v13, Ldefpackage/q63;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 266
    .line 267
    :cond_6
    iget-object v11, v13, Ldefpackage/q63;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 268
    .line 269
    iget-boolean v14, v13, Ldefpackage/q63;->c:Z

    .line 270
    .line 271
    iget-object v7, v13, Ldefpackage/q63;->a:Landroid/os/Bundle;

    .line 272
    .line 273
    new-instance v12, Landroid/app/Notification$Action$Builder;

    .line 274
    .line 275
    if-eqz v11, :cond_7

    .line 276
    .line 277
    invoke-virtual {v11, v10}, Landroidx/core/graphics/drawable/IconCompat;->e(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 278
    .line 279
    .line 280
    move-result-object v11

    .line 281
    goto :goto_7

    .line 282
    :cond_7
    move-object v11, v10

    .line 283
    :goto_7
    iget-object v10, v13, Ldefpackage/q63;->f:Ljava/lang/CharSequence;

    .line 284
    .line 285
    move-object/from16 v17, v2

    .line 286
    .line 287
    iget-object v2, v13, Ldefpackage/q63;->g:Landroid/app/PendingIntent;

    .line 288
    .line 289
    invoke-direct {v12, v11, v10, v2}, Landroid/app/Notification$Action$Builder;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 290
    .line 291
    .line 292
    if-eqz v7, :cond_8

    .line 293
    .line 294
    new-instance v2, Landroid/os/Bundle;

    .line 295
    .line 296
    invoke-direct {v2, v7}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 297
    .line 298
    .line 299
    goto :goto_8

    .line 300
    :cond_8
    new-instance v2, Landroid/os/Bundle;

    .line 301
    .line 302
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 303
    .line 304
    .line 305
    :goto_8
    invoke-virtual {v2, v15, v14}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v14}, Landroid/app/Notification$Action$Builder;->setAllowGeneratedReplies(Z)Landroid/app/Notification$Action$Builder;

    .line 309
    .line 310
    .line 311
    const-string v7, "android.support.action.semanticAction"

    .line 312
    .line 313
    const/4 v10, 0x0

    .line 314
    invoke-virtual {v2, v7, v10}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 315
    .line 316
    .line 317
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 318
    .line 319
    const/16 v10, 0x1c

    .line 320
    .line 321
    if-lt v7, v10, :cond_9

    .line 322
    .line 323
    invoke-static {v12}, Ldefpackage/ne;->s(Landroid/app/Notification$Action$Builder;)V

    .line 324
    .line 325
    .line 326
    :cond_9
    const/16 v10, 0x1d

    .line 327
    .line 328
    if-lt v7, v10, :cond_a

    .line 329
    .line 330
    invoke-static {v12}, Ldefpackage/yh;->o(Landroid/app/Notification$Action$Builder;)V

    .line 331
    .line 332
    .line 333
    :cond_a
    const/16 v10, 0x1f

    .line 334
    .line 335
    if-lt v7, v10, :cond_b

    .line 336
    .line 337
    invoke-static {v12}, Ldefpackage/qe;->e(Landroid/app/Notification$Action$Builder;)V

    .line 338
    .line 339
    .line 340
    :cond_b
    const-string v7, "android.support.action.showsUserInterface"

    .line 341
    .line 342
    iget-boolean v10, v13, Ldefpackage/q63;->d:Z

    .line 343
    .line 344
    invoke-virtual {v2, v7, v10}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v2}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 348
    .line 349
    .line 350
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v2, Landroid/app/Notification$Builder;

    .line 353
    .line 354
    invoke-virtual {v12}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 359
    .line 360
    .line 361
    move-object/from16 v2, v17

    .line 362
    .line 363
    const/16 v7, 0x1a

    .line 364
    .line 365
    const/4 v10, 0x0

    .line 366
    const/4 v12, 0x0

    .line 367
    goto/16 :goto_6

    .line 368
    .line 369
    :cond_c
    iget-object v2, v1, Ldefpackage/s63;->q:Landroid/os/Bundle;

    .line 370
    .line 371
    if-eqz v2, :cond_d

    .line 372
    .line 373
    iget-object v7, v0, Ldefpackage/gc;->d:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v7, Landroid/os/Bundle;

    .line 376
    .line 377
    invoke-virtual {v7, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 378
    .line 379
    .line 380
    :cond_d
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v2, Landroid/app/Notification$Builder;

    .line 383
    .line 384
    iget-boolean v7, v1, Ldefpackage/s63;->j:Z

    .line 385
    .line 386
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 387
    .line 388
    .line 389
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v2, Landroid/app/Notification$Builder;

    .line 392
    .line 393
    iget-boolean v7, v1, Ldefpackage/s63;->p:Z

    .line 394
    .line 395
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    .line 396
    .line 397
    .line 398
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v2, Landroid/app/Notification$Builder;

    .line 401
    .line 402
    iget-object v7, v1, Ldefpackage/s63;->o:Ljava/lang/String;

    .line 403
    .line 404
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 405
    .line 406
    .line 407
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v2, Landroid/app/Notification$Builder;

    .line 410
    .line 411
    const/4 v7, 0x0

    .line 412
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 413
    .line 414
    .line 415
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v2, Landroid/app/Notification$Builder;

    .line 418
    .line 419
    const/4 v10, 0x0

    .line 420
    invoke-virtual {v2, v10}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    .line 421
    .line 422
    .line 423
    iput v10, v0, Ldefpackage/gc;->a:I

    .line 424
    .line 425
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v2, Landroid/app/Notification$Builder;

    .line 428
    .line 429
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 430
    .line 431
    .line 432
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v2, Landroid/app/Notification$Builder;

    .line 435
    .line 436
    invoke-virtual {v2, v10}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    .line 437
    .line 438
    .line 439
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v2, Landroid/app/Notification$Builder;

    .line 442
    .line 443
    iget v8, v1, Ldefpackage/s63;->r:I

    .line 444
    .line 445
    invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;

    .line 446
    .line 447
    .line 448
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v2, Landroid/app/Notification$Builder;

    .line 451
    .line 452
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setPublicVersion(Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 453
    .line 454
    .line 455
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v2, Landroid/app/Notification$Builder;

    .line 458
    .line 459
    iget-object v7, v6, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 460
    .line 461
    iget-object v8, v6, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 462
    .line 463
    invoke-virtual {v2, v7, v8}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;

    .line 464
    .line 465
    .line 466
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 467
    .line 468
    const/16 v10, 0x1c

    .line 469
    .line 470
    if-ge v2, v10, :cond_12

    .line 471
    .line 472
    if-nez v4, :cond_e

    .line 473
    .line 474
    const/4 v2, 0x0

    .line 475
    goto :goto_9

    .line 476
    :cond_e
    new-instance v2, Ljava/util/ArrayList;

    .line 477
    .line 478
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 479
    .line 480
    .line 481
    move-result v7

    .line 482
    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 486
    .line 487
    .line 488
    move-result-object v7

    .line 489
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 490
    .line 491
    .line 492
    move-result v8

    .line 493
    if-nez v8, :cond_11

    .line 494
    .line 495
    :goto_9
    if-nez v2, :cond_f

    .line 496
    .line 497
    goto :goto_a

    .line 498
    :cond_f
    if-nez v3, :cond_10

    .line 499
    .line 500
    move-object v3, v2

    .line 501
    goto :goto_a

    .line 502
    :cond_10
    new-instance v7, Ldefpackage/qi;

    .line 503
    .line 504
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 505
    .line 506
    .line 507
    move-result v8

    .line 508
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 509
    .line 510
    .line 511
    move-result v9

    .line 512
    add-int/2addr v9, v8

    .line 513
    invoke-direct {v7, v9}, Ldefpackage/qi;-><init>(I)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v7, v2}, Ldefpackage/qi;->addAll(Ljava/util/Collection;)Z

    .line 517
    .line 518
    .line 519
    invoke-virtual {v7, v3}, Ldefpackage/qi;->addAll(Ljava/util/Collection;)Z

    .line 520
    .line 521
    .line 522
    new-instance v3, Ljava/util/ArrayList;

    .line 523
    .line 524
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 525
    .line 526
    .line 527
    goto :goto_a

    .line 528
    :cond_11
    invoke-static {v7}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    throw v0

    .line 533
    :cond_12
    :goto_a
    if-eqz v3, :cond_13

    .line 534
    .line 535
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 536
    .line 537
    .line 538
    move-result v2

    .line 539
    if-nez v2, :cond_13

    .line 540
    .line 541
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 542
    .line 543
    .line 544
    move-result v2

    .line 545
    const/4 v7, 0x0

    .line 546
    :goto_b
    if-ge v7, v2, :cond_13

    .line 547
    .line 548
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v8

    .line 552
    add-int/lit8 v7, v7, 0x1

    .line 553
    .line 554
    check-cast v8, Ljava/lang/String;

    .line 555
    .line 556
    iget-object v9, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v9, Landroid/app/Notification$Builder;

    .line 559
    .line 560
    invoke-virtual {v9, v8}, Landroid/app/Notification$Builder;->addPerson(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 561
    .line 562
    .line 563
    goto :goto_b

    .line 564
    :cond_13
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 565
    .line 566
    .line 567
    move-result v2

    .line 568
    if-lez v2, :cond_1b

    .line 569
    .line 570
    iget-object v2, v1, Ldefpackage/s63;->q:Landroid/os/Bundle;

    .line 571
    .line 572
    if-nez v2, :cond_14

    .line 573
    .line 574
    new-instance v2, Landroid/os/Bundle;

    .line 575
    .line 576
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 577
    .line 578
    .line 579
    iput-object v2, v1, Ldefpackage/s63;->q:Landroid/os/Bundle;

    .line 580
    .line 581
    :cond_14
    iget-object v2, v1, Ldefpackage/s63;->q:Landroid/os/Bundle;

    .line 582
    .line 583
    const-string v3, "android.car.EXTENSIONS"

    .line 584
    .line 585
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    if-nez v2, :cond_15

    .line 590
    .line 591
    new-instance v2, Landroid/os/Bundle;

    .line 592
    .line 593
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 594
    .line 595
    .line 596
    :cond_15
    new-instance v7, Landroid/os/Bundle;

    .line 597
    .line 598
    invoke-direct {v7, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 599
    .line 600
    .line 601
    new-instance v8, Landroid/os/Bundle;

    .line 602
    .line 603
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 604
    .line 605
    .line 606
    const/4 v10, 0x0

    .line 607
    :goto_c
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 608
    .line 609
    .line 610
    move-result v9

    .line 611
    if-ge v10, v9, :cond_19

    .line 612
    .line 613
    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v9

    .line 617
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v12

    .line 621
    check-cast v12, Ldefpackage/q63;

    .line 622
    .line 623
    new-instance v13, Landroid/os/Bundle;

    .line 624
    .line 625
    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 626
    .line 627
    .line 628
    iget-object v14, v12, Ldefpackage/q63;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 629
    .line 630
    if-nez v14, :cond_16

    .line 631
    .line 632
    iget v14, v12, Ldefpackage/q63;->e:I

    .line 633
    .line 634
    if-eqz v14, :cond_16

    .line 635
    .line 636
    move-object/from16 v17, v4

    .line 637
    .line 638
    const/4 v4, 0x0

    .line 639
    invoke-static {v4, v11, v14}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    .line 640
    .line 641
    .line 642
    move-result-object v14

    .line 643
    iput-object v14, v12, Ldefpackage/q63;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 644
    .line 645
    goto :goto_d

    .line 646
    :cond_16
    move-object/from16 v17, v4

    .line 647
    .line 648
    :goto_d
    iget-object v4, v12, Ldefpackage/q63;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 649
    .line 650
    iget-object v14, v12, Ldefpackage/q63;->a:Landroid/os/Bundle;

    .line 651
    .line 652
    if-eqz v4, :cond_17

    .line 653
    .line 654
    invoke-virtual {v4}, Landroidx/core/graphics/drawable/IconCompat;->c()I

    .line 655
    .line 656
    .line 657
    move-result v4

    .line 658
    :goto_e
    move-object/from16 v18, v5

    .line 659
    .line 660
    goto :goto_f

    .line 661
    :cond_17
    const/4 v4, 0x0

    .line 662
    goto :goto_e

    .line 663
    :goto_f
    const-string v5, "icon"

    .line 664
    .line 665
    invoke-virtual {v13, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 666
    .line 667
    .line 668
    const-string v4, "title"

    .line 669
    .line 670
    iget-object v5, v12, Ldefpackage/q63;->f:Ljava/lang/CharSequence;

    .line 671
    .line 672
    invoke-virtual {v13, v4, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 673
    .line 674
    .line 675
    const-string v4, "actionIntent"

    .line 676
    .line 677
    iget-object v5, v12, Ldefpackage/q63;->g:Landroid/app/PendingIntent;

    .line 678
    .line 679
    invoke-virtual {v13, v4, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 680
    .line 681
    .line 682
    if-eqz v14, :cond_18

    .line 683
    .line 684
    new-instance v4, Landroid/os/Bundle;

    .line 685
    .line 686
    invoke-direct {v4, v14}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 687
    .line 688
    .line 689
    goto :goto_10

    .line 690
    :cond_18
    new-instance v4, Landroid/os/Bundle;

    .line 691
    .line 692
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 693
    .line 694
    .line 695
    :goto_10
    iget-boolean v5, v12, Ldefpackage/q63;->c:Z

    .line 696
    .line 697
    invoke-virtual {v4, v15, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 698
    .line 699
    .line 700
    const-string v5, "extras"

    .line 701
    .line 702
    invoke-virtual {v13, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 703
    .line 704
    .line 705
    const-string v4, "remoteInputs"

    .line 706
    .line 707
    const/4 v5, 0x0

    .line 708
    invoke-virtual {v13, v4, v5}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 709
    .line 710
    .line 711
    const-string v4, "showsUserInterface"

    .line 712
    .line 713
    iget-boolean v5, v12, Ldefpackage/q63;->d:Z

    .line 714
    .line 715
    invoke-virtual {v13, v4, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 716
    .line 717
    .line 718
    const-string v4, "semanticAction"

    .line 719
    .line 720
    const/4 v5, 0x0

    .line 721
    invoke-virtual {v13, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v8, v9, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 725
    .line 726
    .line 727
    add-int/lit8 v10, v10, 0x1

    .line 728
    .line 729
    move-object/from16 v4, v17

    .line 730
    .line 731
    move-object/from16 v5, v18

    .line 732
    .line 733
    goto :goto_c

    .line 734
    :cond_19
    move-object/from16 v17, v4

    .line 735
    .line 736
    const-string v4, "invisible_actions"

    .line 737
    .line 738
    invoke-virtual {v2, v4, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v7, v4, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 742
    .line 743
    .line 744
    iget-object v4, v1, Ldefpackage/s63;->q:Landroid/os/Bundle;

    .line 745
    .line 746
    if-nez v4, :cond_1a

    .line 747
    .line 748
    new-instance v4, Landroid/os/Bundle;

    .line 749
    .line 750
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 751
    .line 752
    .line 753
    iput-object v4, v1, Ldefpackage/s63;->q:Landroid/os/Bundle;

    .line 754
    .line 755
    :cond_1a
    iget-object v4, v1, Ldefpackage/s63;->q:Landroid/os/Bundle;

    .line 756
    .line 757
    invoke-virtual {v4, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 758
    .line 759
    .line 760
    iget-object v2, v0, Ldefpackage/gc;->d:Ljava/lang/Object;

    .line 761
    .line 762
    check-cast v2, Landroid/os/Bundle;

    .line 763
    .line 764
    invoke-virtual {v2, v3, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 765
    .line 766
    .line 767
    goto :goto_11

    .line 768
    :cond_1b
    move-object/from16 v17, v4

    .line 769
    .line 770
    :goto_11
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast v2, Landroid/app/Notification$Builder;

    .line 773
    .line 774
    iget-object v3, v1, Ldefpackage/s63;->q:Landroid/os/Bundle;

    .line 775
    .line 776
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 777
    .line 778
    .line 779
    iget-object v2, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v2, Landroid/app/Notification$Builder;

    .line 782
    .line 783
    const/4 v4, 0x0

    .line 784
    invoke-virtual {v2, v4}, Landroid/app/Notification$Builder;->setRemoteInputHistory([Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 785
    .line 786
    .line 787
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 788
    .line 789
    const/16 v3, 0x1a

    .line 790
    .line 791
    if-lt v2, v3, :cond_1c

    .line 792
    .line 793
    iget-object v3, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v3, Landroid/app/Notification$Builder;

    .line 796
    .line 797
    invoke-static {v3}, Ldefpackage/r50;->l(Landroid/app/Notification$Builder;)V

    .line 798
    .line 799
    .line 800
    iget-object v3, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 801
    .line 802
    check-cast v3, Landroid/app/Notification$Builder;

    .line 803
    .line 804
    invoke-static {v3}, Ldefpackage/r50;->r(Landroid/app/Notification$Builder;)V

    .line 805
    .line 806
    .line 807
    iget-object v3, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v3, Landroid/app/Notification$Builder;

    .line 810
    .line 811
    invoke-static {v3}, Ldefpackage/r50;->s(Landroid/app/Notification$Builder;)V

    .line 812
    .line 813
    .line 814
    iget-object v3, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast v3, Landroid/app/Notification$Builder;

    .line 817
    .line 818
    invoke-static {v3}, Ldefpackage/r50;->t(Landroid/app/Notification$Builder;)V

    .line 819
    .line 820
    .line 821
    iget-object v3, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 822
    .line 823
    check-cast v3, Landroid/app/Notification$Builder;

    .line 824
    .line 825
    const/4 v10, 0x0

    .line 826
    invoke-static {v3, v10}, Ldefpackage/r50;->n(Landroid/app/Notification$Builder;I)V

    .line 827
    .line 828
    .line 829
    iget-object v3, v1, Ldefpackage/s63;->s:Ljava/lang/String;

    .line 830
    .line 831
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 832
    .line 833
    .line 834
    move-result v3

    .line 835
    if-nez v3, :cond_1c

    .line 836
    .line 837
    iget-object v3, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 838
    .line 839
    check-cast v3, Landroid/app/Notification$Builder;

    .line 840
    .line 841
    const/4 v4, 0x0

    .line 842
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 843
    .line 844
    .line 845
    move-result-object v3

    .line 846
    invoke-virtual {v3, v10}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 847
    .line 848
    .line 849
    move-result-object v3

    .line 850
    invoke-virtual {v3, v10, v10, v10}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 851
    .line 852
    .line 853
    move-result-object v3

    .line 854
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 855
    .line 856
    .line 857
    :cond_1c
    const/16 v10, 0x1c

    .line 858
    .line 859
    if-lt v2, v10, :cond_1d

    .line 860
    .line 861
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 862
    .line 863
    .line 864
    move-result-object v3

    .line 865
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 866
    .line 867
    .line 868
    move-result v4

    .line 869
    if-nez v4, :cond_1e

    .line 870
    .line 871
    :cond_1d
    const/16 v10, 0x1d

    .line 872
    .line 873
    goto :goto_12

    .line 874
    :cond_1e
    invoke-static {v3}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    throw v0

    .line 879
    :goto_12
    if-lt v2, v10, :cond_1f

    .line 880
    .line 881
    iget-object v3, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast v3, Landroid/app/Notification$Builder;

    .line 884
    .line 885
    iget-boolean v4, v1, Ldefpackage/s63;->u:Z

    .line 886
    .line 887
    invoke-static {v3, v4}, Ldefpackage/yh;->m(Landroid/app/Notification$Builder;Z)V

    .line 888
    .line 889
    .line 890
    iget-object v3, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast v3, Landroid/app/Notification$Builder;

    .line 893
    .line 894
    invoke-static {v3}, Ldefpackage/yh;->n(Landroid/app/Notification$Builder;)V

    .line 895
    .line 896
    .line 897
    :cond_1f
    const/16 v10, 0x1f

    .line 898
    .line 899
    if-lt v2, v10, :cond_20

    .line 900
    .line 901
    iget v3, v1, Ldefpackage/s63;->t:I

    .line 902
    .line 903
    if-eqz v3, :cond_20

    .line 904
    .line 905
    iget-object v4, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v4, Landroid/app/Notification$Builder;

    .line 908
    .line 909
    invoke-static {v4, v3}, Ldefpackage/qe;->f(Landroid/app/Notification$Builder;I)V

    .line 910
    .line 911
    .line 912
    :cond_20
    const/16 v3, 0x24

    .line 913
    .line 914
    if-lt v2, v3, :cond_21

    .line 915
    .line 916
    iget-object v3, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 917
    .line 918
    check-cast v3, Landroid/app/Notification$Builder;

    .line 919
    .line 920
    invoke-static {v3}, Ldefpackage/r3;->e(Landroid/app/Notification$Builder;)V

    .line 921
    .line 922
    .line 923
    :cond_21
    iget-boolean v1, v1, Ldefpackage/s63;->w:Z

    .line 924
    .line 925
    if-eqz v1, :cond_23

    .line 926
    .line 927
    iget-object v1, v0, Ldefpackage/gc;->c:Ljava/lang/Object;

    .line 928
    .line 929
    check-cast v1, Ldefpackage/s63;

    .line 930
    .line 931
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 932
    .line 933
    .line 934
    const/4 v1, 0x1

    .line 935
    iput v1, v0, Ldefpackage/gc;->a:I

    .line 936
    .line 937
    iget-object v1, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast v1, Landroid/app/Notification$Builder;

    .line 940
    .line 941
    const/4 v4, 0x0

    .line 942
    invoke-virtual {v1, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 943
    .line 944
    .line 945
    iget-object v1, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 946
    .line 947
    check-cast v1, Landroid/app/Notification$Builder;

    .line 948
    .line 949
    invoke-virtual {v1, v4}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 950
    .line 951
    .line 952
    iget v1, v6, Landroid/app/Notification;->defaults:I

    .line 953
    .line 954
    and-int/lit8 v1, v1, -0x4

    .line 955
    .line 956
    iput v1, v6, Landroid/app/Notification;->defaults:I

    .line 957
    .line 958
    iget-object v3, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 959
    .line 960
    check-cast v3, Landroid/app/Notification$Builder;

    .line 961
    .line 962
    invoke-virtual {v3, v1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 963
    .line 964
    .line 965
    const/16 v3, 0x1a

    .line 966
    .line 967
    if-lt v2, v3, :cond_23

    .line 968
    .line 969
    iget-object v1, v0, Ldefpackage/gc;->c:Ljava/lang/Object;

    .line 970
    .line 971
    check-cast v1, Ldefpackage/s63;

    .line 972
    .line 973
    iget-object v1, v1, Ldefpackage/s63;->o:Ljava/lang/String;

    .line 974
    .line 975
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 976
    .line 977
    .line 978
    move-result v1

    .line 979
    if-eqz v1, :cond_22

    .line 980
    .line 981
    iget-object v1, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 982
    .line 983
    check-cast v1, Landroid/app/Notification$Builder;

    .line 984
    .line 985
    const-string v2, "silent"

    .line 986
    .line 987
    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 988
    .line 989
    .line 990
    :cond_22
    iget-object v0, v0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 991
    .line 992
    check-cast v0, Landroid/app/Notification$Builder;

    .line 993
    .line 994
    const/4 v1, 0x1

    .line 995
    invoke-static {v0, v1}, Ldefpackage/r50;->n(Landroid/app/Notification$Builder;I)V

    .line 996
    .line 997
    .line 998
    :cond_23
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1d

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    sget-object v0, Ldefpackage/xd5;->a:Ldefpackage/xd5;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ldefpackage/xd5;->a(Landroid/graphics/Paint;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    return-wide v0

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Paint;->getColor()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p0}, Ldefpackage/e35;->b(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    return-wide v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget p0, p0, Ldefpackage/gc;->a:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 p0, 0x200

    .line 12
    .line 13
    return p0

    .line 14
    :cond_1
    const/16 p0, 0x800

    .line 15
    .line 16
    return p0
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Ldefpackage/gc;->a:I

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    move v1, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-static {v1}, Ldefpackage/rr2;->w(Z)V

    .line 13
    .line 14
    .line 15
    iget v1, p0, Ldefpackage/gc;->a:I

    .line 16
    .line 17
    sub-int/2addr v1, v2

    .line 18
    iput v1, p0, Ldefpackage/gc;->a:I

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Ldefpackage/gc;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Landroid/os/HandlerThread;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-object v1, p0, Ldefpackage/gc;->d:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object v1, p0, Ldefpackage/gc;->c:Ljava/lang/Object;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    :goto_1
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p0
.end method

.method public d(F)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/high16 v0, 0x437f0000    # 255.0f

    .line 6
    .line 7
    mul-float/2addr p1, v0

    .line 8
    float-to-double v0, p1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->rint(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    double-to-float p1, v0

    .line 14
    float-to-int p1, p1

    .line 15
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public e(I)V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/gc;->a:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Ldefpackage/gc;->a:I

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Landroid/graphics/Paint;

    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x1d

    .line 15
    .line 16
    if-lt v0, v1, :cond_1

    .line 17
    .line 18
    sget-object v0, Ldefpackage/xd5;->a:Ldefpackage/xd5;

    .line 19
    .line 20
    invoke-virtual {v0, p0, p1}, Ldefpackage/xd5;->b(Landroid/graphics/Paint;I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    .line 25
    .line 26
    invoke-static {p1}, Ldefpackage/q05;->B(I)Landroid/graphics/PorterDuff$Mode;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public f(J)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1d

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    sget-object v0, Ldefpackage/xd5;->a:Ldefpackage/xd5;

    .line 12
    .line 13
    invoke-virtual {v0, p0, p1, p2}, Ldefpackage/xd5;->c(Landroid/graphics/Paint;J)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {p1, p2}, Ldefpackage/e35;->U(J)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public g(Ldefpackage/dt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/gc;->d:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Landroid/graphics/Paint;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Ldefpackage/dt;->a:Landroid/graphics/ColorFilter;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public h(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
