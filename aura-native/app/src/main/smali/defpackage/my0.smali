.class public final Ldefpackage/my0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/lt2;


# instance fields
.field public final a:Lcom/eddyizm/tempus/service/MediaService;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/service/MediaService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/my0;->a:Lcom/eddyizm/tempus/service/MediaService;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d(Ldefpackage/gn2;)Ldefpackage/bq;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 5
    .line 6
    iget-object v0, v0, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v2, "type"

    .line 12
    .line 13
    const-string v3, ""

    .line 14
    .line 15
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v1

    .line 21
    :goto_0
    const-string v2, "radio"

    .line 22
    .line 23
    invoke-static {v0, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x1

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p1, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const-string v4, "ir-"

    .line 37
    .line 38
    invoke-static {v0, v4, v2}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move v0, v2

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    :goto_1
    move v0, v3

    .line 48
    :goto_2
    invoke-static {}, Ldefpackage/ud3;->F()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    long-to-int v6, v4

    .line 53
    if-nez v6, :cond_4

    .line 54
    .line 55
    :cond_3
    :goto_3
    move v2, v3

    .line 56
    goto :goto_4

    .line 57
    :cond_4
    const-wide/16 v6, 0x0

    .line 58
    .line 59
    cmp-long v4, v4, v6

    .line 60
    .line 61
    if-lez v4, :cond_5

    .line 62
    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_5
    if-lez v4, :cond_3

    .line 67
    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    :goto_4
    iget-object p0, p0, Ldefpackage/my0;->a:Lcom/eddyizm/tempus/service/MediaService;

    .line 71
    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    const-class v0, Ldefpackage/au0;

    .line 75
    .line 76
    monitor-enter v0

    .line 77
    :try_start_0
    new-instance v2, Ldefpackage/rf2;

    .line 78
    .line 79
    invoke-static {}, Ldefpackage/au0;->y()Ldefpackage/bl0;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-direct {v2, p0, v4}, Ldefpackage/rf2;-><init>(Landroid/content/Context;Ldefpackage/bi0;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p0}, Ldefpackage/au0;->u(Landroid/content/Context;)Ldefpackage/se4;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {v2, p0}, Ldefpackage/au0;->d(Ldefpackage/bi0;Ldefpackage/se4;)Ldefpackage/kx;

    .line 91
    .line 92
    .line 93
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    monitor-exit v0

    .line 95
    goto :goto_5

    .line 96
    :catchall_0
    move-exception p0

    .line 97
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    throw p0

    .line 99
    :cond_6
    if-eqz v2, :cond_7

    .line 100
    .line 101
    invoke-static {p0}, Ldefpackage/au0;->E(Lcom/eddyizm/tempus/service/MediaService;)Ldefpackage/kx;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    goto :goto_5

    .line 106
    :cond_7
    const-class v0, Ldefpackage/au0;

    .line 107
    .line 108
    monitor-enter v0

    .line 109
    :try_start_2
    new-instance v2, Ldefpackage/kx;

    .line 110
    .line 111
    invoke-direct {v2}, Ldefpackage/kx;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-static {p0}, Ldefpackage/au0;->B(Landroid/content/Context;)Ldefpackage/se4;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    iput-object v4, v2, Ldefpackage/kx;->n:Ldefpackage/se4;

    .line 119
    .line 120
    new-instance v4, Ldefpackage/xi4;

    .line 121
    .line 122
    const/16 v5, 0xa

    .line 123
    .line 124
    invoke-direct {v4, v5}, Ldefpackage/xi4;-><init>(I)V

    .line 125
    .line 126
    .line 127
    iput-object v4, v2, Ldefpackage/kx;->p:Ldefpackage/px;

    .line 128
    .line 129
    invoke-static {p0}, Ldefpackage/au0;->E(Lcom/eddyizm/tempus/service/MediaService;)Ldefpackage/kx;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    iput-object v4, v2, Ldefpackage/kx;->r:Ldefpackage/bi0;

    .line 134
    .line 135
    new-instance v4, Ldefpackage/wo0;

    .line 136
    .line 137
    new-instance v5, Ldefpackage/rm2;

    .line 138
    .line 139
    const/16 v6, 0x15

    .line 140
    .line 141
    invoke-direct {v5, v6, v2}, Ldefpackage/rm2;-><init>(ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    new-instance v2, Ldefpackage/mj0;

    .line 145
    .line 146
    const/16 v6, 0xc

    .line 147
    .line 148
    invoke-direct {v2, v6}, Ldefpackage/mj0;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-direct {v4, v5, v2}, Ldefpackage/wo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-static {p0}, Ldefpackage/au0;->u(Landroid/content/Context;)Ldefpackage/se4;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-static {v4, p0}, Ldefpackage/au0;->d(Ldefpackage/bi0;Ldefpackage/se4;)Ldefpackage/kx;

    .line 159
    .line 160
    .line 161
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 162
    monitor-exit v0

    .line 163
    :goto_5
    iget-object v0, p1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 164
    .line 165
    if-eqz v0, :cond_8

    .line 166
    .line 167
    iget-object v0, v0, Ldefpackage/bn2;->b:Ljava/lang/String;

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_8
    move-object v0, v1

    .line 171
    :goto_6
    const-string v2, "application/x-mpegURL"

    .line 172
    .line 173
    invoke-static {v0, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-nez v0, :cond_d

    .line 178
    .line 179
    iget-object v0, p1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 180
    .line 181
    if-eqz v0, :cond_9

    .line 182
    .line 183
    iget-object v0, v0, Ldefpackage/bn2;->a:Landroid/net/Uri;

    .line 184
    .line 185
    if-eqz v0, :cond_9

    .line 186
    .line 187
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-eqz v0, :cond_9

    .line 192
    .line 193
    const-string v2, ".m3u8"

    .line 194
    .line 195
    invoke-static {v0, v2, v3}, Ldefpackage/xm4;->e0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-ne v0, v3, :cond_9

    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_9
    new-instance v0, Ldefpackage/sk0;

    .line 203
    .line 204
    invoke-direct {v0}, Ldefpackage/sk0;-><init>()V

    .line 205
    .line 206
    .line 207
    new-instance v2, Ldefpackage/jr3;

    .line 208
    .line 209
    invoke-direct {v2, p0, v0}, Ldefpackage/jr3;-><init>(Ldefpackage/bi0;Ldefpackage/n51;)V

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x40000

    .line 213
    .line 214
    iput v0, v2, Ldefpackage/jr3;->e:I

    .line 215
    .line 216
    iget-object v0, p1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 217
    .line 218
    if-eqz v0, :cond_a

    .line 219
    .line 220
    iget-object v0, v0, Ldefpackage/bn2;->a:Landroid/net/Uri;

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_a
    move-object v0, v1

    .line 224
    :goto_7
    if-eqz v0, :cond_b

    .line 225
    .line 226
    const-string v1, "format"

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    :cond_b
    if-eqz v1, :cond_c

    .line 233
    .line 234
    const-string v1, "format"

    .line 235
    .line 236
    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    const-string v1, "raw"

    .line 241
    .line 242
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-nez v0, :cond_c

    .line 247
    .line 248
    const-string v0, "transcodeOffset"

    .line 249
    .line 250
    invoke-static {v0}, Lcom/eddyizm/tempus/util/a;->a(Ljava/lang/String;)Lcom/eddyizm/tempus/subsonic/models/OpenSubsonicExtension;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-eqz v0, :cond_c

    .line 255
    .line 256
    new-instance v0, Ldefpackage/qw4;

    .line 257
    .line 258
    invoke-direct {v0, p1, p0, v2}, Ldefpackage/qw4;-><init>(Ldefpackage/gn2;Ldefpackage/kx;Ldefpackage/jr3;)V

    .line 259
    .line 260
    .line 261
    return-object v0

    .line 262
    :cond_c
    new-instance p0, Ldefpackage/tv2;

    .line 263
    .line 264
    invoke-virtual {v2, p1}, Ldefpackage/jr3;->f(Ldefpackage/gn2;)Ldefpackage/kr3;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-direct {p0, p1}, Ldefpackage/tv2;-><init>(Ldefpackage/kr3;)V

    .line 269
    .line 270
    .line 271
    return-object p0

    .line 272
    :cond_d
    :goto_8
    new-instance v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    .line 273
    .line 274
    invoke-direct {v0, p0}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;-><init>(Ldefpackage/bi0;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->f(Ldefpackage/gn2;)Ldefpackage/zm1;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    return-object p0

    .line 282
    :catchall_1
    move-exception p0

    .line 283
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 284
    throw p0
.end method

.method public final e(Ldefpackage/yc5;)Ldefpackage/lt2;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ldefpackage/p63;

    .line 5
    .line 6
    const-string p1, "An operation is not implemented: Not yet implemented"

    .line 7
    .line 8
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method
