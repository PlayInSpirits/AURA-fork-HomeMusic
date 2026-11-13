.class public final Ldefpackage/o8;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/k03;

.field public final synthetic p:Z

.field public final synthetic q:I


# direct methods
.method public constructor <init>(ILdefpackage/k03;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldefpackage/o8;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Ldefpackage/o8;->o:Ldefpackage/k03;

    .line 8
    .line 9
    iput-boolean p3, p0, Ldefpackage/o8;->p:Z

    .line 10
    .line 11
    iput p1, p0, Ldefpackage/o8;->q:I

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(ZLdefpackage/k03;II)V
    .locals 0

    .line 14
    iput p4, p0, Ldefpackage/o8;->n:I

    iput-boolean p1, p0, Ldefpackage/o8;->p:Z

    iput-object p2, p0, Ldefpackage/o8;->o:Ldefpackage/k03;

    iput p3, p0, Ldefpackage/o8;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/o8;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public final onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 3

    .line 1
    iget p1, p0, Ldefpackage/o8;->n:I

    .line 2
    .line 3
    iget v0, p0, Ldefpackage/o8;->q:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-boolean v2, p0, Ldefpackage/o8;->p:Z

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/o8;->o:Ldefpackage/k03;

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStarred2()Lcom/eddyizm/tempus/subsonic/models/Starred2;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStarred2()Lcom/eddyizm/tempus/subsonic/models/Starred2;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Starred2;->getSongs()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    new-instance p2, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-static {p1}, Ldefpackage/kb4;->U(Ljava/util/List;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 68
    .line 69
    .line 70
    if-nez v2, :cond_0

    .line 71
    .line 72
    invoke-virtual {p0, p2}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-static {p2}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-virtual {p2, v1, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    :goto_0
    return-void

    .line 95
    :pswitch_0
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_6

    .line 100
    .line 101
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-eqz p1, :cond_6

    .line 106
    .line 107
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_6

    .line 118
    .line 119
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 124
    .line 125
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getGenres()Lcom/eddyizm/tempus/subsonic/models/Genres;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-eqz p1, :cond_6

    .line 134
    .line 135
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 140
    .line 141
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getGenres()Lcom/eddyizm/tempus/subsonic/models/Genres;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Genres;->getGenres()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    if-eqz p1, :cond_5

    .line 154
    .line 155
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    if-eqz p2, :cond_2

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_2
    if-eqz v2, :cond_3

    .line 163
    .line 164
    invoke-static {p1}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 165
    .line 166
    .line 167
    :cond_3
    const/4 p2, -0x1

    .line 168
    if-eq v0, p2, :cond_4

    .line 169
    .line 170
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    invoke-interface {p1, v1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_4
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    new-instance p2, Ldefpackage/m7;

    .line 191
    .line 192
    const/16 v0, 0x18

    .line 193
    .line 194
    invoke-direct {p2, v0}, Ldefpackage/m7;-><init>(I)V

    .line 195
    .line 196
    .line 197
    invoke-static {p2}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    invoke-interface {p1, p2}, Ljava/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava/util/stream/Stream;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    invoke-interface {p1, p2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    check-cast p1, Ljava/util/List;

    .line 214
    .line 215
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_5
    :goto_1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 220
    .line 221
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_6
    :goto_2
    return-void

    .line 225
    :pswitch_1
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-eqz p1, :cond_8

    .line 230
    .line 231
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    if-eqz p1, :cond_8

    .line 236
    .line 237
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 242
    .line 243
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStarred2()Lcom/eddyizm/tempus/subsonic/models/Starred2;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    if-eqz p1, :cond_8

    .line 252
    .line 253
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 258
    .line 259
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStarred2()Lcom/eddyizm/tempus/subsonic/models/Starred2;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Starred2;->getAlbums()Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    if-eqz p1, :cond_8

    .line 272
    .line 273
    if-eqz v2, :cond_7

    .line 274
    .line 275
    invoke-static {p1}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 276
    .line 277
    .line 278
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 279
    .line 280
    .line 281
    move-result p2

    .line 282
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 283
    .line 284
    .line 285
    move-result p2

    .line 286
    invoke-interface {p1, v1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    goto :goto_3

    .line 294
    :cond_7
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :cond_8
    :goto_3
    return-void

    .line 298
    nop

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
