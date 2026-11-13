.class public abstract Ldefpackage/bo2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static a:Ljava/lang/ref/WeakReference;

.field public static final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final d:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldefpackage/bo2;->a:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ldefpackage/bo2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Ldefpackage/bo2;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    .line 24
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Ldefpackage/bo2;->d:Ljava/util/concurrent/ExecutorService;

    .line 29
    .line 30
    return-void
.end method

.method public static a(Ldefpackage/ao2;Ljava/util/List;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-interface {p0}, Ldefpackage/ao2;->b()Ldefpackage/qi3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    invoke-interface {p0}, Ldefpackage/qi3;->Q0()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ge v1, v2, :cond_1

    .line 24
    .line 25
    invoke-interface {p0, v1}, Ldefpackage/qi3;->Y(I)Ldefpackage/gn2;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v2, v2, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance p1, Ldefpackage/tj;

    .line 42
    .line 43
    const/4 v1, 0x3

    .line 44
    invoke-direct {p1, v1, v0}, Ldefpackage/tj;-><init>(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Ljava/util/List;

    .line 60
    .line 61
    return-object p0
.end method

.method public static b(Ldefpackage/ao2;Ljava/util/List;)I
    .locals 6

    .line 1
    invoke-interface {p0}, Ldefpackage/ao2;->b()Ldefpackage/qi3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    sget-object v2, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 10
    .line 11
    const/16 v2, 0xa

    .line 12
    .line 13
    invoke-static {p1, v2}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Ldefpackage/lg2;->W(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x10

    .line 22
    .line 23
    if-ge v2, v3, :cond_1

    .line 24
    .line 25
    move v2, v3

    .line 26
    :cond_1
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 46
    .line 47
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const-string v5, "continuous"

    .line 52
    .line 53
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    sget-object v2, Ldefpackage/v01;->n:Ldefpackage/v01;

    .line 58
    .line 59
    invoke-static {v3, v2}, Ldefpackage/rs1;->b(Ljava/util/LinkedHashMap;Ljava/util/Map;)V

    .line 60
    .line 61
    .line 62
    sget-object v2, Ldefpackage/is3;->a:Landroid/os/Handler;

    .line 63
    .line 64
    invoke-interface {v0}, Ldefpackage/qi3;->x0()Ldefpackage/cu4;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ldefpackage/cu4;->p()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_3

    .line 76
    .line 77
    invoke-interface {v0}, Ldefpackage/qi3;->Q0()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-interface {v0}, Ldefpackage/qi3;->D0()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-virtual {v2, v3}, Ldefpackage/cu4;->c(Z)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-ne v2, v1, :cond_4

    .line 91
    .line 92
    invoke-interface {v0}, Ldefpackage/qi3;->Q0()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    goto :goto_1

    .line 97
    :cond_4
    add-int/lit8 v1, v2, 0x1

    .line 98
    .line 99
    :goto_1
    invoke-static {p1}, Ldefpackage/gi1;->M(Ljava/util/List;)Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    new-instance v3, Ldefpackage/vs3;

    .line 104
    .line 105
    invoke-direct {v3}, Ldefpackage/vs3;-><init>()V

    .line 106
    .line 107
    .line 108
    const/4 v4, 0x0

    .line 109
    invoke-virtual {v3, p1, v4, v1}, Ldefpackage/vs3;->c(Ljava/util/List;ZI)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    invoke-interface {v0}, Ldefpackage/qi3;->Q0()I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    add-int/2addr v4, v3

    .line 125
    invoke-interface {p0, v1, p1, v4}, Ldefpackage/ao2;->a(III)V

    .line 126
    .line 127
    .line 128
    invoke-interface {v0, v2, v1}, Ldefpackage/qi3;->N0(Ljava/util/List;I)V

    .line 129
    .line 130
    .line 131
    return v1
.end method

.method public static c(Ldefpackage/gn2;Ldefpackage/ao2;Ldefpackage/vp;)V
    .locals 6

    .line 1
    sget-object v0, Ldefpackage/bo2;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, "MediaManager"

    .line 8
    .line 9
    if-nez v1, :cond_7

    .line 10
    .line 11
    invoke-static {}, Ldefpackage/ud3;->T()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_0
    invoke-interface {p1}, Ldefpackage/ao2;->b()Ldefpackage/qi3;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    const-string p0, "Continuous Play: queue target gone"

    .line 26
    .line 27
    invoke-static {v2, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    if-eqz p2, :cond_8

    .line 31
    .line 32
    invoke-virtual {p2}, Ldefpackage/vp;->run()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    const-string p2, "Continuous Play"

    .line 37
    .line 38
    invoke-static {v2, p2}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    const-string v3, "last_instant_mix"

    .line 57
    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    invoke-interface {p2, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 67
    .line 68
    .line 69
    const/4 p2, 0x1

    .line 70
    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-string v3, "number_tracks_keep_in_queue"

    .line 85
    .line 86
    const/16 v4, 0x1e

    .line 87
    .line 88
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    sub-int/2addr v0, p2

    .line 93
    invoke-interface {v1}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    const/4 v3, 0x0

    .line 98
    if-eqz p2, :cond_2

    .line 99
    .line 100
    invoke-interface {v1}, Ldefpackage/qi3;->o0()I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    goto :goto_0

    .line 105
    :cond_2
    move p2, v3

    .line 106
    :goto_0
    invoke-interface {v1}, Ldefpackage/qi3;->D0()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_3

    .line 111
    .line 112
    move p2, v3

    .line 113
    goto :goto_1

    .line 114
    :cond_3
    sub-int/2addr p2, v0

    .line 115
    invoke-static {v3, p2}, Ljava/lang/Math;->max(II)I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    :goto_1
    if-lez p2, :cond_4

    .line 120
    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v1, "Continuous Play: purging "

    .line 124
    .line 125
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v1, " old items from queue"

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v2, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    invoke-static {p1, v3, p2}, Ldefpackage/bo2;->k(Ldefpackage/ao2;II)V

    .line 144
    .line 145
    .line 146
    :cond_4
    iget-object p2, p0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 147
    .line 148
    iget-object p0, p0, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 149
    .line 150
    iget-object p0, p0, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 151
    .line 152
    if-eqz p0, :cond_5

    .line 153
    .line 154
    const-string v0, "artistId"

    .line 155
    .line 156
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    goto :goto_2

    .line 161
    :cond_5
    const/4 p0, 0x0

    .line 162
    :goto_2
    new-instance v0, Ldefpackage/xi4;

    .line 163
    .line 164
    const/4 v1, 0x2

    .line 165
    invoke-direct {v0, v1}, Ldefpackage/xi4;-><init>(I)V

    .line 166
    .line 167
    .line 168
    new-instance v1, Ldefpackage/k03;

    .line 169
    .line 170
    invoke-direct {v1}, Ldefpackage/ad2;-><init>()V

    .line 171
    .line 172
    .line 173
    if-eqz p0, :cond_6

    .line 174
    .line 175
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-nez v2, :cond_6

    .line 180
    .line 181
    invoke-static {v3}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v2}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    const-string v3, "BrowsingClient"

    .line 193
    .line 194
    const-string v4, "getSimilarSongs2()"

    .line 195
    .line 196
    invoke-static {v3, v4}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    iget-object v3, v2, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v3, Ldefpackage/ov;

    .line 202
    .line 203
    iget-object v2, v2, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v2, Ldefpackage/pn4;

    .line 206
    .line 207
    invoke-virtual {v2}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    const/16 v4, 0x19

    .line 212
    .line 213
    invoke-interface {v3, v2, p0, v4}, Ldefpackage/ov;->a(Ljava/util/Map;Ljava/lang/String;I)Lretrofit2/Call;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    new-instance v2, Ldefpackage/yc5;

    .line 218
    .line 219
    invoke-direct {v2, v0, v1, p2}, Ldefpackage/yc5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    invoke-interface {p0, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_6
    invoke-virtual {v0, p2, v1}, Ldefpackage/xi4;->l(Ljava/lang/String;Ldefpackage/k03;)V

    .line 227
    .line 228
    .line 229
    :goto_3
    new-instance p0, Ldefpackage/i7;

    .line 230
    .line 231
    const/4 p2, 0x3

    .line 232
    invoke-direct {p0, p2, v1, p1}, Ldefpackage/i7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, p0}, Ldefpackage/ad2;->f(Ldefpackage/a83;)V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_7
    :goto_4
    const-string p0, "Continuous Play: already running"

    .line 240
    .line 241
    invoke-static {v2, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 242
    .line 243
    .line 244
    if-eqz p2, :cond_8

    .line 245
    .line 246
    invoke-virtual {p2}, Ldefpackage/vp;->run()V

    .line 247
    .line 248
    .line 249
    :cond_8
    return-void
.end method

.method public static d(Ldefpackage/gn2;)V
    .locals 3

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    new-instance v0, Ldefpackage/vs3;

    .line 4
    .line 5
    invoke-direct {v0}, Ldefpackage/vs3;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Ldefpackage/ud3;->A()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-static {v0}, Ldefpackage/ud3;->N0(Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ldefpackage/pn4;->b()Ldefpackage/rm3;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-string v1, "deleteBookmark() id="

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "BookmarksClient"

    .line 45
    .line 46
    invoke-static {v2, v1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    iget-object v1, v0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ldefpackage/mt;

    .line 52
    .line 53
    iget-object v0, v0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Ldefpackage/pn4;

    .line 56
    .line 57
    invoke-virtual {v0}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v1, v0, p0}, Ldefpackage/mt;->d(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance v0, Ldefpackage/hh3;

    .line 66
    .line 67
    const/16 v1, 0x9

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ldefpackage/hh3;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p0, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_0
    return-void
.end method

.method public static e(Ldefpackage/ic2;Ljava/util/List;Z)V
    .locals 4

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const-string v0, "next"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, "append"

    .line 7
    .line 8
    :goto_0
    sget-object v1, Ldefpackage/u52;->a:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {p1, v0, v3, v1, v2}, Ldefpackage/u52;->r(Ljava/util/List;Ljava/lang/String;IJ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    if-eqz p0, :cond_2

    .line 24
    .line 25
    new-instance v0, Ldefpackage/bs1;

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    invoke-direct {v0, p0, p1, p2, v1}, Ldefpackage/bs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 32
    .line 33
    invoke-interface {p0, v0, p1}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_1
    return-void
.end method

.method public static f(Ldefpackage/bl2;Lcom/eddyizm/tempus/subsonic/models/Child;Z)V
    .locals 5

    .line 1
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const-string v1, "next"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v1, "append"

    .line 11
    .line 12
    :goto_0
    sget-object v2, Ldefpackage/u52;->a:Landroid/os/Handler;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-static {v0, v1, v4, v2, v3}, Ldefpackage/u52;->r(Ljava/util/List;Ljava/lang/String;IJ)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    if-eqz p0, :cond_2

    .line 28
    .line 29
    new-instance v0, Ldefpackage/bs1;

    .line 30
    .line 31
    const/4 v1, 0x5

    .line 32
    invoke-direct {v0, p0, p1, p2, v1}, Ldefpackage/bs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 36
    .line 37
    invoke-virtual {p0, v0, p1}, Ldefpackage/u0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_1
    return-void
.end method

.method public static g(Ldefpackage/yn2;Ljava/util/List;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/yn2;->n:Ldefpackage/bj2;

    .line 2
    .line 3
    const-string v1, "MediaManager"

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string p2, "enqueue: queue target gone, dropping "

    .line 10
    .line 11
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, " items"

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {v1, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const-string v2, "enqueue"

    .line 35
    .line 36
    invoke-static {v1, v2}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Ldefpackage/rs1;->i(Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ldefpackage/sk2;->o0()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v2, 0x0

    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    const/4 p2, -0x1

    .line 50
    if-eq v1, p2, :cond_1

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    new-instance p2, Ldefpackage/vs3;

    .line 55
    .line 56
    invoke-direct {p2}, Ldefpackage/vs3;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p1, v2, v1}, Ldefpackage/vs3;->c(Ljava/util/List;ZI)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Ldefpackage/gi1;->M(Ljava/util/List;)Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p0, v0, p1}, Ldefpackage/bo2;->i(Ldefpackage/yn2;Ldefpackage/qi3;Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    invoke-virtual {v0}, Ldefpackage/sk2;->Q0()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    new-instance p2, Ldefpackage/vs3;

    .line 75
    .line 76
    invoke-direct {p2}, Ldefpackage/vs3;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, p1, v2, p0}, Ldefpackage/vs3;->c(Ljava/util/List;ZI)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Ldefpackage/gi1;->M(Ljava/util/List;)Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {v0, p0}, Ldefpackage/sk2;->w0(Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public static h(Ldefpackage/ao2;ILjava/util/List;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Ldefpackage/ao2;->b()Ldefpackage/qi3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {p0}, Ldefpackage/qi3;->Q0()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    new-instance v1, Ldefpackage/vs3;

    .line 28
    .line 29
    invoke-direct {v1}, Ldefpackage/vs3;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p2, v0, p1}, Ldefpackage/vs3;->c(Ljava/util/List;ZI)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0, p3, p1}, Ldefpackage/qi3;->N0(Ljava/util/List;I)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    return-void
.end method

.method public static i(Ldefpackage/yn2;Ldefpackage/qi3;Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p1}, Ldefpackage/qi3;->o0()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    invoke-interface {p1}, Ldefpackage/qi3;->Q0()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v1

    .line 23
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p0, v0, v1, v2}, Ldefpackage/yn2;->a(III)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, p2, v0}, Ldefpackage/qi3;->N0(Ljava/util/List;I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static j(Ldefpackage/bl2;Ldefpackage/li3;)V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/om1;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Ldefpackage/om1;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Ldefpackage/lg1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v1, p0, v0}, Ldefpackage/lg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Ldefpackage/u0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static k(Ldefpackage/ao2;II)V
    .locals 2

    .line 1
    invoke-interface {p0}, Ldefpackage/ao2;->b()Ldefpackage/qi3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-string p0, "MediaManager"

    .line 8
    .line 9
    const-string p1, "removeRange: queue target gone"

    .line 10
    .line 11
    invoke-static {p0, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-interface {p0, p1, p2}, Ldefpackage/qi3;->P(II)V

    .line 16
    .line 17
    .line 18
    new-instance p0, Ldefpackage/vs3;

    .line 19
    .line 20
    invoke-direct {p0}, Ldefpackage/vs3;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v0, Ldefpackage/vs3;->b:Ljava/util/concurrent/ExecutorService;

    .line 24
    .line 25
    new-instance v1, Ldefpackage/us3;

    .line 26
    .line 27
    invoke-direct {v1, p0, p1, p2}, Ldefpackage/us3;-><init>(Ldefpackage/vs3;II)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static l(Ldefpackage/gn2;)V
    .locals 3

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Ldefpackage/ot1;->c(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->v()Ldefpackage/r20;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lcom/eddyizm/tempus/model/Chronology;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lcom/eddyizm/tempus/model/Chronology;-><init>(Ldefpackage/gn2;)V

    .line 22
    .line 23
    .line 24
    new-instance p0, Ldefpackage/lg1;

    .line 25
    .line 26
    const/4 v2, 0x7

    .line 27
    invoke-direct {p0, v2, v0, v1}, Ldefpackage/lg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Ljava/lang/Thread;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method public static m(Ldefpackage/gn2;Z)V
    .locals 4

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Ldefpackage/ot1;->c(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 15
    .line 16
    iget-object v0, p0, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string v0, "scrobbling"

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-static {v0, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 30
    .line 31
    const-string v0, "id"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ldefpackage/pn4;->e()Ldefpackage/gp3;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const-string v2, "MediaAnnotationClient"

    .line 50
    .line 51
    const-string v3, "scrobble()"

    .line 52
    .line 53
    invoke-static {v2, v3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    iget-object v2, v1, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Ldefpackage/zi2;

    .line 59
    .line 60
    iget-object v1, v1, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Ldefpackage/pn4;

    .line 63
    .line 64
    invoke-virtual {v1}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-interface {v2, v1, p0, p1}, Ldefpackage/zi2;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;)Lretrofit2/Call;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    new-instance p1, Ldefpackage/xi4;

    .line 77
    .line 78
    invoke-direct {p1, v0}, Ldefpackage/xi4;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    :goto_0
    return-void
.end method

.method public static n(Ldefpackage/gn2;J)V
    .locals 13

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_8

    .line 4
    .line 5
    :cond_0
    iget-object v1, p0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 8
    .line 9
    iget-object v6, p0, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    if-eqz v6, :cond_1

    .line 13
    .line 14
    const-string v0, "type"

    .line 15
    .line 16
    invoke-virtual {v6, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v9, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object v9, v7

    .line 23
    :goto_0
    const/4 v12, 0x0

    .line 24
    if-eqz v6, :cond_2

    .line 25
    .line 26
    const-string v0, "duration"

    .line 27
    .line 28
    invoke-virtual {v6, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move v0, v12

    .line 34
    :goto_1
    int-to-long v2, v0

    .line 35
    const-wide/16 v4, 0x3e8

    .line 36
    .line 37
    mul-long v10, v2, v4

    .line 38
    .line 39
    const-string v0, "radio"

    .line 40
    .line 41
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_e

    .line 46
    .line 47
    const-string v0, "video"

    .line 48
    .line 49
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_3
    move-object v2, v1

    .line 58
    new-instance v1, Ldefpackage/vs3;

    .line 59
    .line 60
    invoke-direct {v1}, Ldefpackage/vs3;-><init>()V

    .line 61
    .line 62
    .line 63
    sget-object v8, Ldefpackage/vs3;->b:Ljava/util/concurrent/ExecutorService;

    .line 64
    .line 65
    new-instance v0, Ldefpackage/ss3;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    move-wide v3, p1

    .line 69
    invoke-direct/range {v0 .. v5}, Ldefpackage/ss3;-><init>(Ldefpackage/vs3;Ljava/lang/String;JI)V

    .line 70
    .line 71
    .line 72
    move-object v1, v2

    .line 73
    move-wide v2, v3

    .line 74
    invoke-interface {v8, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    const-string p1, "podcast"

    .line 78
    .line 79
    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_5

    .line 84
    .line 85
    const-string p1, "audiobook"

    .line 86
    .line 87
    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    const-string p1, "music"

    .line 95
    .line 96
    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_e

    .line 101
    .line 102
    const-wide/32 p1, 0x927c0

    .line 103
    .line 104
    .line 105
    cmp-long p1, v10, p1

    .line 106
    .line 107
    if-lez p1, :cond_e

    .line 108
    .line 109
    :cond_5
    :goto_2
    iget-object p1, p0, Ldefpackage/do2;->a:Ljava/lang/CharSequence;

    .line 110
    .line 111
    if-eqz p1, :cond_6

    .line 112
    .line 113
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    move-object v4, p1

    .line 118
    goto :goto_3

    .line 119
    :cond_6
    move-object v4, v7

    .line 120
    :goto_3
    iget-object p1, p0, Ldefpackage/do2;->c:Ljava/lang/CharSequence;

    .line 121
    .line 122
    if-eqz p1, :cond_7

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    move-object v5, p1

    .line 129
    goto :goto_4

    .line 130
    :cond_7
    move-object v5, v7

    .line 131
    :goto_4
    iget-object p0, p0, Ldefpackage/do2;->b:Ljava/lang/CharSequence;

    .line 132
    .line 133
    if-eqz p0, :cond_8

    .line 134
    .line 135
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    goto :goto_5

    .line 140
    :cond_8
    move-object p0, v7

    .line 141
    :goto_5
    if-eqz v6, :cond_9

    .line 142
    .line 143
    const-string p1, "albumId"

    .line 144
    .line 145
    invoke-virtual {v6, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    goto :goto_6

    .line 150
    :cond_9
    move-object p1, v7

    .line 151
    :goto_6
    if-eqz v6, :cond_a

    .line 152
    .line 153
    const-string p2, "coverArtId"

    .line 154
    .line 155
    invoke-virtual {v6, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    :cond_a
    move-object v8, v7

    .line 160
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-static {v1}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    if-nez p2, :cond_c

    .line 168
    .line 169
    const-wide/16 v6, 0x0

    .line 170
    .line 171
    cmp-long p2, v2, v6

    .line 172
    .line 173
    if-gtz p2, :cond_b

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_b
    invoke-static {}, Ldefpackage/ud3;->A()Ljava/util/Map;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    new-instance v0, Ldefpackage/sp3;

    .line 181
    .line 182
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 183
    .line 184
    .line 185
    move-result-wide v10

    .line 186
    move-object v6, p0

    .line 187
    move-object v7, p1

    .line 188
    invoke-direct/range {v0 .. v11}, Ldefpackage/sp3;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 189
    .line 190
    .line 191
    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    invoke-static {p2}, Ldefpackage/ud3;->N0(Ljava/util/Map;)V

    .line 195
    .line 196
    .line 197
    :cond_c
    :goto_7
    new-instance p0, Ldefpackage/vs3;

    .line 198
    .line 199
    invoke-direct {p0}, Ldefpackage/vs3;-><init>()V

    .line 200
    .line 201
    .line 202
    const-wide/16 p0, 0x1388

    .line 203
    .line 204
    cmp-long p0, v2, p0

    .line 205
    .line 206
    if-gtz p0, :cond_d

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :cond_d
    invoke-static {v12}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-virtual {p0}, Ldefpackage/pn4;->b()Ldefpackage/rm3;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    new-instance p1, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string p2, "createBookmark() id="

    .line 223
    .line 224
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    const-string p2, " position="

    .line 231
    .line 232
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    const-string p2, "BookmarksClient"

    .line 243
    .line 244
    invoke-static {p2, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    iget-object p1, p0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p1, Ldefpackage/mt;

    .line 250
    .line 251
    iget-object p0, p0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast p0, Ldefpackage/pn4;

    .line 254
    .line 255
    invoke-virtual {p0}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-interface {p1, p0, v1, v2, v3}, Ldefpackage/mt;->b(Ljava/util/Map;Ljava/lang/String;J)Lretrofit2/Call;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    new-instance p1, Ldefpackage/e20;

    .line 264
    .line 265
    invoke-direct {p1, v1, v2, v3}, Ldefpackage/e20;-><init>(Ljava/lang/String;J)V

    .line 266
    .line 267
    .line 268
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 269
    .line 270
    .line 271
    :cond_e
    :goto_8
    return-void
.end method

.method public static o(Ldefpackage/ic2;Ljava/util/List;I)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {p0, p1, p2, v0, v1}, Ldefpackage/bo2;->p(Ldefpackage/ic2;Ljava/util/List;IJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static p(Ldefpackage/ic2;Ljava/util/List;IJ)V
    .locals 8

    .line 1
    sget-object v0, Ldefpackage/v01;->n:Ldefpackage/v01;

    .line 2
    .line 3
    sget-object v1, Ldefpackage/rs1;->m:Ldefpackage/kd3;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sput-object v2, Ldefpackage/rs1;->m:Ldefpackage/kd3;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v4, v1, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 13
    .line 14
    if-ne v4, p1, :cond_0

    .line 15
    .line 16
    move v4, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v4, v2

    .line 19
    :goto_0
    if-eqz v4, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, v1, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/util/Map;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object v1, v0

    .line 30
    :goto_1
    sput-object v1, Ldefpackage/rs1;->n:Ljava/util/Map;

    .line 31
    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    sget-object v1, Ldefpackage/rs1;->p:Ljava/util/Map;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move-object v1, v0

    .line 38
    :goto_2
    sput-object v1, Ldefpackage/rs1;->o:Ljava/util/Map;

    .line 39
    .line 40
    sput-object v0, Ldefpackage/rs1;->p:Ljava/util/Map;

    .line 41
    .line 42
    sget-object v0, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 43
    .line 44
    sget-object v0, Ldefpackage/rs1;->n:Ljava/util/Map;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    sget-object v1, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 50
    .line 51
    new-instance v4, Ldefpackage/zs1;

    .line 52
    .line 53
    invoke-direct {v4, v0, v3}, Ldefpackage/zs1;-><init>(Ljava/util/Map;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 60
    .line 61
    sget-object v0, Ldefpackage/rs1;->n:Ljava/util/Map;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v3, Ldefpackage/zs1;

    .line 67
    .line 68
    invoke-direct {v3, v0, v2}, Ldefpackage/zs1;-><init>(Ljava/util/Map;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 72
    .line 73
    .line 74
    const-string v0, "replace"

    .line 75
    .line 76
    invoke-static {p1, v0, p2, p3, p4}, Ldefpackage/u52;->r(Ljava/util/List;Ljava/lang/String;IJ)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    if-eqz p0, :cond_4

    .line 84
    .line 85
    new-instance v1, Ldefpackage/us1;

    .line 86
    .line 87
    const/4 v7, 0x1

    .line 88
    move-object v2, p0

    .line 89
    move-object v3, p1

    .line 90
    move v4, p2

    .line 91
    move-wide v5, p3

    .line 92
    invoke-direct/range {v1 .. v7}, Ldefpackage/us1;-><init>(Ljava/lang/Object;Ljava/lang/Object;IJI)V

    .line 93
    .line 94
    .line 95
    sget-object p0, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 96
    .line 97
    invoke-interface {v2, v1, p0}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 98
    .line 99
    .line 100
    :cond_4
    :goto_3
    return-void
.end method

.method public static q(Ldefpackage/ic2;Ljava/util/List;ILjava/lang/String;)V
    .locals 8

    .line 1
    sget-object v0, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ldefpackage/k62;->c:Ldefpackage/ux3;

    .line 7
    .line 8
    sget-object v0, Ldefpackage/v13;->a:Ljava/util/Set;

    .line 9
    .line 10
    const-string v0, "playlist"

    .line 11
    .line 12
    invoke-virtual {p3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    const-string v0, "playlist:"

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {p3, v0, v1}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object v0, Ldefpackage/v13;->a:Ljava/util/Set;

    .line 29
    .line 30
    invoke-interface {v0, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    move-object v0, p3

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    :goto_0
    const-string v0, "nd_playlist"

    .line 41
    .line 42
    :goto_1
    new-instance v1, Ldefpackage/k62;

    .line 43
    .line 44
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Ldefpackage/gi1;->b0(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {v1, v2, v0}, Ldefpackage/k62;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sget-object v0, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 63
    .line 64
    const/16 v0, 0xa

    .line 65
    .line 66
    invoke-static {p1, v0}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-static {v2}, Ldefpackage/lg2;->W(I)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    const/16 v3, 0x10

    .line 75
    .line 76
    if-ge v2, v3, :cond_3

    .line 77
    .line 78
    move v2, v3

    .line 79
    :cond_3
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 80
    .line 81
    invoke-direct {v4, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_4

    .line 93
    .line 94
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 99
    .line 100
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    sget-object v7, Ldefpackage/v13;->a:Ljava/util/Set;

    .line 105
    .line 106
    sget-object v7, Ldefpackage/rs1;->n:Ljava/util/Map;

    .line 107
    .line 108
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    check-cast v5, Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {p3, v5}, Ldefpackage/v13;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    invoke-static {p1, v0}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-static {v0}, Ldefpackage/lg2;->W(I)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-ge v0, v3, :cond_5

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_5
    move v3, v0

    .line 138
    :goto_3
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 139
    .line 140
    invoke-direct {v0, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-eqz v3, :cond_7

    .line 152
    .line 153
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 158
    .line 159
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    sget-object v6, Ldefpackage/v13;->a:Ljava/util/Set;

    .line 164
    .line 165
    sget-object v6, Ldefpackage/rs1;->n:Ljava/util/Map;

    .line 166
    .line 167
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    check-cast v6, Ljava/lang/String;

    .line 176
    .line 177
    sget-object v7, Ldefpackage/rs1;->o:Ljava/util/Map;

    .line 178
    .line 179
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    check-cast v3, Ldefpackage/k62;

    .line 188
    .line 189
    invoke-static {p3, v6}, Ldefpackage/v13;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-virtual {v6, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    if-nez v6, :cond_6

    .line 198
    .line 199
    if-eqz v3, :cond_6

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_6
    move-object v3, v1

    .line 203
    :goto_5
    invoke-interface {v0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_7
    new-instance p3, Ldefpackage/kd3;

    .line 208
    .line 209
    invoke-direct {p3, p1, v4}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    sput-object p3, Ldefpackage/rs1;->m:Ldefpackage/kd3;

    .line 213
    .line 214
    sput-object v0, Ldefpackage/rs1;->p:Ljava/util/Map;

    .line 215
    .line 216
    invoke-static {p0, p1, p2}, Ldefpackage/bo2;->o(Ldefpackage/ic2;Ljava/util/List;I)V

    .line 217
    .line 218
    .line 219
    return-void
.end method
