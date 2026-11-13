.class public final Ldefpackage/ji5;
.super Ldefpackage/fi5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/NavigableMap;


# static fields
.field public static final s:Ldefpackage/ji5;


# instance fields
.field public final transient p:Ldefpackage/ri5;

.field public final transient q:Ldefpackage/ei5;

.field public final transient r:Ldefpackage/ji5;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Ldefpackage/ni5;->o:Ldefpackage/ni5;

    .line 2
    .line 3
    new-instance v1, Ldefpackage/ji5;

    .line 4
    .line 5
    invoke-static {v0}, Ldefpackage/ki5;->m(Ljava/util/Comparator;)Ldefpackage/ri5;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v2, Ldefpackage/ei5;->o:Ldefpackage/xh5;

    .line 10
    .line 11
    sget-object v2, Ldefpackage/pi5;->r:Ldefpackage/pi5;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, v0, v2, v3}, Ldefpackage/ji5;-><init>(Ldefpackage/ri5;Ldefpackage/ei5;Ldefpackage/ji5;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Ldefpackage/ji5;->s:Ldefpackage/ji5;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Ldefpackage/ri5;Ldefpackage/ei5;Ldefpackage/ji5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ji5;->p:Ldefpackage/ri5;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/ji5;->q:Ldefpackage/ei5;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/ji5;->r:Ldefpackage/ji5;

    .line 9
    .line 10
    return-void
.end method

.method public static b(Ljava/util/TreeMap;)Ldefpackage/ji5;
    .locals 11

    .line 1
    sget-object v0, Ldefpackage/ni5;->o:Ldefpackage/ni5;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/TreeMap;->comparator()Ljava/util/Comparator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    :cond_0
    move v1, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    move v1, v3

    .line 16
    :goto_0
    invoke-virtual {p0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    instance-of v4, p0, Ljava/util/Collection;

    .line 21
    .line 22
    if-nez v4, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v4, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move-object p0, v4

    .line 51
    :cond_3
    sget-object v4, Ldefpackage/fi5;->o:[Ljava/util/Map$Entry;

    .line 52
    .line 53
    invoke-interface {p0, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, [Ljava/util/Map$Entry;

    .line 58
    .line 59
    array-length v4, p0

    .line 60
    if-eqz v4, :cond_c

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    if-eq v4, v2, :cond_7

    .line 64
    .line 65
    new-array v6, v4, [Ljava/lang/Object;

    .line 66
    .line 67
    new-array v7, v4, [Ljava/lang/Object;

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    :goto_2
    if-ge v3, v4, :cond_6

    .line 72
    .line 73
    aget-object v1, p0, v3

    .line 74
    .line 75
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {v2, v1}, Ldefpackage/fh0;->B(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    aput-object v2, v6, v3

    .line 90
    .line 91
    aput-object v1, v7, v3

    .line 92
    .line 93
    add-int/lit8 v3, v3, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    new-instance v1, Ldefpackage/jb2;

    .line 97
    .line 98
    const/16 v8, 0xb

    .line 99
    .line 100
    invoke-direct {v1, v8}, Ldefpackage/jb2;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-static {p0, v3, v4, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 104
    .line 105
    .line 106
    aget-object v1, p0, v3

    .line 107
    .line 108
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    aput-object v8, v6, v3

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    aput-object v1, v7, v3

    .line 122
    .line 123
    aget-object v3, v6, v3

    .line 124
    .line 125
    invoke-static {v3, v1}, Ldefpackage/fh0;->B(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :goto_3
    if-ge v2, v4, :cond_6

    .line 129
    .line 130
    add-int/lit8 v1, v2, -0x1

    .line 131
    .line 132
    aget-object v1, p0, v1

    .line 133
    .line 134
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    aget-object v3, p0, v2

    .line 138
    .line 139
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    invoke-static {v9, v10}, Ldefpackage/fh0;->B(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    aput-object v9, v6, v2

    .line 154
    .line 155
    aput-object v10, v7, v2

    .line 156
    .line 157
    invoke-virtual {v0, v8, v9}, Ldefpackage/ni5;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    if-eqz v8, :cond_5

    .line 162
    .line 163
    add-int/lit8 v2, v2, 0x1

    .line 164
    .line 165
    move-object v8, v9

    .line 166
    goto :goto_3

    .line 167
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 168
    .line 169
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    new-instance v2, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    const-string v3, "Multiple entries with same key: "

    .line 180
    .line 181
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v0, " and "

    .line 188
    .line 189
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p0

    .line 203
    :cond_6
    new-instance p0, Ldefpackage/ji5;

    .line 204
    .line 205
    new-instance v1, Ldefpackage/ri5;

    .line 206
    .line 207
    invoke-static {v4, v6}, Ldefpackage/ei5;->i(I[Ljava/lang/Object;)Ldefpackage/pi5;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-direct {v1, v2, v0}, Ldefpackage/ri5;-><init>(Ldefpackage/ei5;Ljava/util/Comparator;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v4, v7}, Ldefpackage/ei5;->i(I[Ljava/lang/Object;)Ldefpackage/pi5;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-direct {p0, v1, v0, v5}, Ldefpackage/ji5;-><init>(Ldefpackage/ri5;Ldefpackage/ei5;Ldefpackage/ji5;)V

    .line 219
    .line 220
    .line 221
    return-object p0

    .line 222
    :cond_7
    aget-object p0, p0, v3

    .line 223
    .line 224
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    new-instance v4, Ldefpackage/ji5;

    .line 236
    .line 237
    new-instance v6, Ldefpackage/ri5;

    .line 238
    .line 239
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    move v7, v3

    .line 244
    :goto_4
    const-string v8, "at index "

    .line 245
    .line 246
    if-ge v7, v2, :cond_9

    .line 247
    .line 248
    aget-object v9, v1, v7

    .line 249
    .line 250
    if-eqz v9, :cond_8

    .line 251
    .line 252
    add-int/lit8 v7, v7, 0x1

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_8
    invoke-static {v7, v8}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return-object v5

    .line 263
    :cond_9
    invoke-static {v2, v1}, Ldefpackage/ei5;->i(I[Ljava/lang/Object;)Ldefpackage/pi5;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-direct {v6, v1, v0}, Ldefpackage/ri5;-><init>(Ldefpackage/ei5;Ljava/util/Comparator;)V

    .line 268
    .line 269
    .line 270
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    :goto_5
    if-ge v3, v2, :cond_b

    .line 275
    .line 276
    aget-object v0, p0, v3

    .line 277
    .line 278
    if-eqz v0, :cond_a

    .line 279
    .line 280
    add-int/lit8 v3, v3, 0x1

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_a
    invoke-static {v3, v8}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    return-object v5

    .line 291
    :cond_b
    invoke-static {v2, p0}, Ldefpackage/ei5;->i(I[Ljava/lang/Object;)Ldefpackage/pi5;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    invoke-direct {v4, v6, p0, v5}, Ldefpackage/ji5;-><init>(Ldefpackage/ri5;Ldefpackage/ei5;Ldefpackage/ji5;)V

    .line 296
    .line 297
    .line 298
    return-object v4

    .line 299
    :cond_c
    invoke-static {v0}, Ldefpackage/ji5;->c(Ljava/util/Comparator;)Ldefpackage/ji5;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    return-object p0
.end method

.method public static c(Ljava/util/Comparator;)Ldefpackage/ji5;
    .locals 3

    .line 1
    sget-object v0, Ldefpackage/ni5;->o:Ldefpackage/ni5;

    .line 2
    .line 3
    if-eq v0, p0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/ji5;

    .line 6
    .line 7
    invoke-static {p0}, Ldefpackage/ki5;->m(Ljava/util/Comparator;)Ldefpackage/ri5;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v1, Ldefpackage/ei5;->o:Ldefpackage/xh5;

    .line 12
    .line 13
    sget-object v1, Ldefpackage/pi5;->r:Ldefpackage/pi5;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v0, p0, v1, v2}, Ldefpackage/ji5;-><init>(Ldefpackage/ri5;Ldefpackage/ei5;Ldefpackage/ji5;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    sget-object p0, Ldefpackage/ji5;->s:Ldefpackage/ji5;

    .line 21
    .line 22
    return-object p0
.end method


# virtual methods
.method public final ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Ldefpackage/ji5;->f(Ljava/lang/Object;Z)Ldefpackage/ji5;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Ldefpackage/ji5;->firstEntry()Ljava/util/Map$Entry;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/ji5;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ji5;->p:Ldefpackage/ri5;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ki5;->q:Ljava/util/Comparator;

    .line 4
    .line 5
    return-object p0
.end method

.method public final d(Ljava/lang/Object;Z)Ldefpackage/ji5;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/ji5;->p:Ldefpackage/ri5;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Ldefpackage/ri5;->n(Ljava/lang/Object;Z)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-virtual {p0, p2, p1}, Ldefpackage/ji5;->g(II)Ldefpackage/ji5;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final synthetic descendingKeySet()Ljava/util/NavigableSet;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ji5;->p:Ldefpackage/ri5;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/ki5;->k()Ldefpackage/ki5;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final bridge synthetic descendingMap()Ljava/util/NavigableMap;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/ji5;->r:Ldefpackage/ji5;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/fi5;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Ldefpackage/ji5;->p:Ldefpackage/ri5;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p0, v1, Ldefpackage/ki5;->q:Ljava/util/Comparator;

    .line 14
    .line 15
    instance-of v0, p0, Ldefpackage/oi5;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast p0, Ldefpackage/oi5;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Ldefpackage/vh5;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Ldefpackage/vh5;-><init>(Ljava/util/Comparator;)V

    .line 25
    .line 26
    .line 27
    move-object p0, v0

    .line 28
    :goto_0
    invoke-virtual {p0}, Ldefpackage/oi5;->a()Ldefpackage/oi5;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Ldefpackage/ji5;->c(Ljava/util/Comparator;)Ldefpackage/ji5;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    new-instance v0, Ldefpackage/ji5;

    .line 38
    .line 39
    invoke-virtual {v1}, Ldefpackage/ki5;->k()Ldefpackage/ki5;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ldefpackage/ri5;

    .line 44
    .line 45
    iget-object v2, p0, Ldefpackage/ji5;->q:Ldefpackage/ei5;

    .line 46
    .line 47
    invoke-virtual {v2}, Ldefpackage/ei5;->g()Ldefpackage/ei5;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-direct {v0, v1, v2, p0}, Ldefpackage/ji5;-><init>(Ldefpackage/ri5;Ldefpackage/ei5;Ldefpackage/ji5;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-object v0
.end method

.method public final e(Ljava/lang/Object;ZLjava/lang/Object;Z)Ldefpackage/ji5;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/ji5;->p:Ldefpackage/ri5;

    .line 8
    .line 9
    iget-object v0, v0, Ldefpackage/ki5;->q:Ljava/util/Comparator;

    .line 10
    .line 11
    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p3, p4}, Ldefpackage/ji5;->d(Ljava/lang/Object;Z)Ldefpackage/ji5;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, p1, p2}, Ldefpackage/ji5;->f(Ljava/lang/Object;Z)Ldefpackage/ji5;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    filled-new-array {p1, p3}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string p1, "expected fromKey <= toKey but %s > %s"

    .line 31
    .line 32
    invoke-static {p1, p0}, Ldefpackage/hw;->S(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public final f(Ljava/lang/Object;Z)Ldefpackage/ji5;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/ji5;->p:Ldefpackage/ri5;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Ldefpackage/ri5;->o(Ljava/lang/Object;Z)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object p2, p0, Ldefpackage/ji5;->q:Ldefpackage/ei5;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    invoke-virtual {p0, p1, p2}, Ldefpackage/ji5;->g(II)Ldefpackage/ji5;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final firstEntry()Ljava/util/Map$Entry;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/fi5;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ldefpackage/fi5;->a()Ldefpackage/gi5;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ldefpackage/gi5;->i()Ldefpackage/ei5;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/util/Map$Entry;

    .line 23
    .line 24
    return-object p0
.end method

.method public final firstKey()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ji5;->p:Ldefpackage/ri5;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/ri5;->first()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Ldefpackage/ji5;->d(Ljava/lang/Object;Z)Ldefpackage/ji5;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Ldefpackage/ji5;->lastEntry()Ljava/util/Map$Entry;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final floorKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/ji5;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final g(II)Ldefpackage/ji5;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ji5;->q:Ldefpackage/ei5;

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eq p2, p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-object p0

    .line 14
    :cond_1
    :goto_0
    iget-object p0, p0, Ldefpackage/ji5;->p:Ldefpackage/ri5;

    .line 15
    .line 16
    if-ne p1, p2, :cond_2

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/ki5;->q:Ljava/util/Comparator;

    .line 19
    .line 20
    invoke-static {p0}, Ldefpackage/ji5;->c(Ljava/util/Comparator;)Ldefpackage/ji5;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_2
    new-instance v1, Ldefpackage/ji5;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Ldefpackage/ri5;->p(II)Ldefpackage/ri5;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v0, p1, p2}, Ldefpackage/ei5;->h(II)Ldefpackage/ei5;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/4 p2, 0x0

    .line 36
    invoke-direct {v1, p0, p1, p2}, Ldefpackage/ji5;-><init>(Ldefpackage/ri5;Ldefpackage/ei5;Ldefpackage/ji5;)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/ji5;->p:Ldefpackage/ri5;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    :catch_0
    :goto_0
    move p1, v1

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    :try_start_0
    iget-object v2, v0, Ldefpackage/ri5;->s:Ldefpackage/ei5;

    .line 9
    .line 10
    iget-object v0, v0, Ldefpackage/ki5;->q:Ljava/util/Comparator;

    .line 11
    .line 12
    invoke-static {v2, p1, v0}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    .line 13
    .line 14
    .line 15
    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    if-gez p1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    :goto_1
    if-ne p1, v1, :cond_2

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_2
    iget-object p0, p0, Ldefpackage/ji5;->q:Ldefpackage/ei5;

    .line 24
    .line 25
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final bridge synthetic headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 7
    invoke-virtual {p0, p1, p2}, Ldefpackage/ji5;->d(Ljava/lang/Object;Z)Ldefpackage/ji5;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Ldefpackage/ji5;->d(Ljava/lang/Object;Z)Ldefpackage/ji5;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public final higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Ldefpackage/ji5;->f(Ljava/lang/Object;Z)Ldefpackage/ji5;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Ldefpackage/ji5;->firstEntry()Ljava/util/Map$Entry;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final higherKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/ji5;->higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final synthetic keySet()Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ji5;->p:Ldefpackage/ri5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final lastEntry()Ljava/util/Map$Entry;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/fi5;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ldefpackage/fi5;->a()Ldefpackage/gi5;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ldefpackage/gi5;->i()Ldefpackage/ei5;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object p0, p0, Ldefpackage/ji5;->q:Ldefpackage/ei5;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    add-int/lit8 p0, p0, -0x1

    .line 24
    .line 25
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/util/Map$Entry;

    .line 30
    .line 31
    return-object p0
.end method

.method public final lastKey()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ji5;->p:Ldefpackage/ri5;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/ri5;->last()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Ldefpackage/ji5;->d(Ljava/lang/Object;Z)Ldefpackage/ji5;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Ldefpackage/ji5;->lastEntry()Ljava/util/Map$Entry;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final lowerKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/ji5;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final synthetic navigableKeySet()Ljava/util/NavigableSet;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ji5;->p:Ldefpackage/ri5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final pollFirstEntry()Ljava/util/Map$Entry;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public final pollLastEntry()Ljava/util/Map$Entry;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ji5;->q:Ldefpackage/ei5;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final bridge synthetic subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 8
    invoke-virtual {p0, p1, p2, p3, p4}, Ldefpackage/ji5;->e(Ljava/lang/Object;ZLjava/lang/Object;Z)Ldefpackage/ji5;

    move-result-object p0

    return-object p0
.end method

.method public final bridge synthetic subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, p1, v0, p2, v1}, Ldefpackage/ji5;->e(Ljava/lang/Object;ZLjava/lang/Object;Z)Ldefpackage/ji5;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final bridge synthetic tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 7
    invoke-virtual {p0, p1, p2}, Ldefpackage/ji5;->f(Ljava/lang/Object;Z)Ldefpackage/ji5;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Ldefpackage/ji5;->f(Ljava/lang/Object;Z)Ldefpackage/ji5;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public final synthetic values()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ji5;->q:Ldefpackage/ei5;

    .line 2
    .line 3
    return-object p0
.end method
