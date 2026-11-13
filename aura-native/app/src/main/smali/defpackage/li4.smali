.class public final synthetic Ldefpackage/li4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/mi4;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/mi4;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/li4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/li4;->o:Ldefpackage/mi4;

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
    .locals 12

    .line 1
    iget p1, p0, Ldefpackage/li4;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/li4;->o:Ldefpackage/mi4;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ldefpackage/mi4;->v:Ldefpackage/ni4;

    .line 9
    .line 10
    iget-object p1, p1, Ldefpackage/ni4;->B:Ldefpackage/rm3;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Ldefpackage/mi4;->t()Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Ldefpackage/mi4;->s()V

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void

    .line 32
    :pswitch_0
    iget-object p1, p0, Ldefpackage/mi4;->v:Ldefpackage/ni4;

    .line 33
    .line 34
    const-string v0, "MediaBrowser retrieved, isPlaying: "

    .line 35
    .line 36
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, -0x1

    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_1
    iget-object v2, p1, Ldefpackage/ni4;->B:Ldefpackage/rm3;

    .line 46
    .line 47
    iget-object v3, p1, Ldefpackage/ni4;->q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 48
    .line 49
    iget-object v4, p1, Ldefpackage/ni4;->v:Ldefpackage/pk;

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    iget-object v2, v2, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0}, Ldefpackage/mi4;->t()Z

    .line 64
    .line 65
    .line 66
    goto/16 :goto_4

    .line 67
    .line 68
    :cond_2
    iget-object v2, v4, Ldefpackage/pk;->f:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 75
    .line 76
    new-instance v2, Landroid/os/Bundle;

    .line 77
    .line 78
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 79
    .line 80
    .line 81
    new-instance v5, Ljava/util/ArrayList;

    .line 82
    .line 83
    iget-object v6, v4, Ldefpackage/pk;->f:Ljava/util/List;

    .line 84
    .line 85
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    sget-object v8, Ldefpackage/e03;->a:Ljava/util/regex/Pattern;

    .line 90
    .line 91
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    const/16 v9, 0x64

    .line 96
    .line 97
    const/16 v10, 0xf

    .line 98
    .line 99
    if-nez v8, :cond_4

    .line 100
    .line 101
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-le v8, v9, :cond_4

    .line 106
    .line 107
    if-ge v7, v10, :cond_3

    .line 108
    .line 109
    const/4 v7, 0x0

    .line 110
    goto :goto_1

    .line 111
    :cond_3
    sub-int/2addr v7, v10

    .line 112
    :goto_1
    add-int/lit8 v8, v7, 0x64

    .line 113
    .line 114
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    invoke-static {v8, v11}, Ljava/lang/Math;->min(II)I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    invoke-interface {v6, v7, v8}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    :cond_4
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 127
    .line 128
    .line 129
    const-string v6, "TRACKS_OBJECT"

    .line 130
    .line 131
    invoke-virtual {v2, v6, v5}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 132
    .line 133
    .line 134
    iget-object v4, v4, Ldefpackage/pk;->f:Ljava/util/List;

    .line 135
    .line 136
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-nez v5, :cond_5

    .line 145
    .line 146
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-le v4, v9, :cond_5

    .line 151
    .line 152
    invoke-static {p0, v10}, Ljava/lang/Math;->min(II)I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    :cond_5
    const-string v4, "ITEM_POSITION"

    .line 157
    .line 158
    invoke-virtual {v2, v4, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 159
    .line 160
    .line 161
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    iget-boolean p0, p0, Ldefpackage/v52;->a:Z

    .line 166
    .line 167
    if-eqz p0, :cond_8

    .line 168
    .line 169
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iget-object p1, p1, Ldefpackage/v52;->x:Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    if-eqz p0, :cond_7

    .line 184
    .line 185
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    iget-boolean p0, p0, Ldefpackage/v52;->k:Z

    .line 190
    .line 191
    if-eqz p0, :cond_6

    .line 192
    .line 193
    const-string p0, "pause"

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_6
    const-string p0, "play"

    .line 197
    .line 198
    :goto_2
    const-wide/16 v0, 0x0

    .line 199
    .line 200
    invoke-static {p0, v0, v1}, Ldefpackage/u52;->a(Ljava/lang/String;J)V

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_7
    invoke-interface {v3, v2}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMediaClick(Landroid/os/Bundle;)V

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_8
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    iget-object v1, p1, Ldefpackage/ni4;->x:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    if-eqz p0, :cond_a

    .line 219
    .line 220
    const-string p0, "Tapping on currently playing song, toggling playback"

    .line 221
    .line 222
    const-string v1, "SongHorizontalAdapter"

    .line 223
    .line 224
    invoke-static {v1, p0}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    :try_start_0
    iget-object p0, p1, Ldefpackage/ni4;->A:Ldefpackage/bl2;

    .line 228
    .line 229
    invoke-virtual {p0}, Ldefpackage/u0;->get()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    check-cast p0, Ldefpackage/bj2;

    .line 234
    .line 235
    new-instance v2, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    iget-boolean v0, p1, Ldefpackage/ni4;->y:Z

    .line 241
    .line 242
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v1, v0}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 250
    .line 251
    .line 252
    iget-boolean p1, p1, Ldefpackage/ni4;->y:Z

    .line 253
    .line 254
    if-eqz p1, :cond_9

    .line 255
    .line 256
    invoke-virtual {p0}, Ldefpackage/sk2;->c()V

    .line 257
    .line 258
    .line 259
    goto :goto_4

    .line 260
    :catch_0
    move-exception p0

    .line 261
    goto :goto_3

    .line 262
    :catch_1
    move-exception p0

    .line 263
    goto :goto_3

    .line 264
    :cond_9
    invoke-virtual {p0}, Ldefpackage/sk2;->m0()V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 265
    .line 266
    .line 267
    goto :goto_4

    .line 268
    :goto_3
    const-string p1, "Error getting MediaBrowser"

    .line 269
    .line 270
    invoke-static {v1, p1, p0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 271
    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_a
    invoke-interface {v3, v2}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMediaClick(Landroid/os/Bundle;)V

    .line 275
    .line 276
    .line 277
    :goto_4
    return-void

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
