.class public abstract Ljz3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final d:Ljava/util/concurrent/ExecutorService;

.field public static final e:Liz3;

.field public static volatile f:Ljava/lang/ref/WeakReference;

.field public static final g:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-string v4, "REPLAYGAIN_TRACK_PEAK"

    .line 2
    .line 3
    const-string v5, "REPLAYGAIN_ALBUM_PEAK"

    .line 4
    .line 5
    const-string v0, "REPLAYGAIN_TRACK_GAIN"

    .line 6
    .line 7
    const-string v1, "REPLAYGAIN_ALBUM_GAIN"

    .line 8
    .line 9
    const-string v2, "R128_TRACK_GAIN"

    .line 10
    .line 11
    const-string v3, "R128_ALBUM_GAIN"

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Ljz3;->a:[Ljava/lang/String;

    .line 18
    .line 19
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Ljz3;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Ljz3;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Ljz3;->d:Ljava/util/concurrent/ExecutorService;

    .line 38
    .line 39
    new-instance v0, Liz3;

    .line 40
    .line 41
    invoke-direct {v0}, Lfp;-><init>()V

    .line 42
    .line 43
    .line 44
    const/high16 v1, 0x3f800000    # 1.0f

    .line 45
    .line 46
    iput v1, v0, Liz3;->i:F

    .line 47
    .line 48
    iput v1, v0, Liz3;->j:F

    .line 49
    .line 50
    iput v1, v0, Liz3;->k:F

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    iput-boolean v2, v0, Liz3;->l:Z

    .line 54
    .line 55
    iput v1, v0, Liz3;->m:F

    .line 56
    .line 57
    iput v1, v0, Liz3;->n:F

    .line 58
    .line 59
    iput v1, v0, Liz3;->o:F

    .line 60
    .line 61
    const/16 v1, 0x1b9

    .line 62
    .line 63
    iput v1, v0, Liz3;->p:I

    .line 64
    .line 65
    iput v2, v0, Liz3;->q:I

    .line 66
    .line 67
    iput-boolean v2, v0, Liz3;->r:Z

    .line 68
    .line 69
    iput-boolean v2, v0, Liz3;->s:Z

    .line 70
    .line 71
    iput-boolean v2, v0, Liz3;->t:Z

    .line 72
    .line 73
    iput-boolean v2, v0, Liz3;->u:Z

    .line 74
    .line 75
    sput-object v0, Ljz3;->e:Liz3;

    .line 76
    .line 77
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Ljz3;->f:Ljava/lang/ref/WeakReference;

    .line 84
    .line 85
    new-instance v0, Landroid/os/Handler;

    .line 86
    .line 87
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 92
    .line 93
    .line 94
    sput-object v0, Ljz3;->g:Landroid/os/Handler;

    .line 95
    .line 96
    return-void
.end method

.method public static a(Lqi3;)Z
    .locals 3

    .line 1
    invoke-interface {p0}, Lqi3;->a()Lgn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Lqi3;->j0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {p0, v1}, Lqi3;->Y(I)Lgn2;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Lgn2;->d:Ldo2;

    .line 23
    .line 24
    iget-object v0, v0, Lgn2;->d:Ldo2;

    .line 25
    .line 26
    iget-object v0, v0, Ldo2;->c:Ljava/lang/CharSequence;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v1, p0, Ldo2;->c:Ljava/lang/CharSequence;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object p0, p0, Ldo2;->c:Ljava/lang/CharSequence;

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_1
    const/4 p0, 0x0

    .line 53
    return p0
.end method

.method public static b(Lqi3;)Z
    .locals 3

    .line 1
    invoke-interface {p0}, Lqi3;->a()Lgn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Lqi3;->w()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {p0, v1}, Lqi3;->Y(I)Lgn2;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, v0, Lgn2;->d:Ldo2;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    iget-object v1, v0, Ldo2;->c:Ljava/lang/CharSequence;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object p0, p0, Lgn2;->d:Ldo2;

    .line 29
    .line 30
    iget-object p0, p0, Ldo2;->c:Ljava/lang/CharSequence;

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iget-object v0, v0, Ldo2;->c:Ljava/lang/CharSequence;

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_1
    const/4 p0, 0x0

    .line 53
    return p0
.end method

.method public static c(FF)F
    .locals 3

    .line 1
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "loudness_preamp"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    int-to-float v0, v0

    .line 20
    add-float/2addr v0, p0

    .line 21
    const-string p0, "replay_gain_prevent_clipping"

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-static {p0, v1}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    cmpl-float p0, p1, p0

    .line 32
    .line 33
    if-lez p0, :cond_0

    .line 34
    .line 35
    float-to-double p0, p1

    .line 36
    invoke-static {p0, p1}, Ljava/lang/Math;->log10(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide p0

    .line 40
    const-wide/high16 v1, 0x4034000000000000L    # 20.0

    .line 41
    .line 42
    mul-double/2addr p0, v1

    .line 43
    double-to-float p0, p0

    .line 44
    neg-float p0, p0

    .line 45
    cmpl-float p1, v0, p0

    .line 46
    .line 47
    if-lez p1, :cond_0

    .line 48
    .line 49
    move v0, p0

    .line 50
    :cond_0
    const/high16 p0, 0x41700000    # 15.0f

    .line 51
    .line 52
    invoke-static {p0, v0}, Ljava/lang/Math;->min(FF)F

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    const/high16 p1, -0x3d900000    # -60.0f

    .line 57
    .line 58
    invoke-static {p1, p0}, Ljava/lang/Math;->max(FF)F

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0
.end method

.method public static d(Lgn2;)Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-object p0, p0, Lgn2;->d:Ldo2;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p0, p0, Ldo2;->I:Landroid/os/Bundle;

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    const-string v0, "rg_present"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {p0}, Lsi0;->v(Landroid/os/Bundle;)Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->hasAnyValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public static e(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 14

    .line 1
    new-instance v0, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/eddyizm/tempus/model/ReplayGain;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/eddyizm/tempus/model/ReplayGain;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :cond_0
    :goto_0
    if-ge v4, v2, :cond_f

    .line 18
    .line 19
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    add-int/lit8 v4, v4, 0x1

    .line 24
    .line 25
    check-cast v5, Lqv2;

    .line 26
    .line 27
    if-nez v5, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v6, v3

    .line 31
    :goto_1
    iget-object v7, v5, Lqv2;->a:[Lpv2;

    .line 32
    .line 33
    array-length v8, v7

    .line 34
    if-ge v6, v8, :cond_0

    .line 35
    .line 36
    aget-object v7, v7, v6

    .line 37
    .line 38
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 43
    .line 44
    invoke-virtual {v8, v9}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    move v9, v3

    .line 49
    :goto_2
    const/4 v10, 0x6

    .line 50
    if-ge v9, v10, :cond_e

    .line 51
    .line 52
    sget-object v10, Ljz3;->a:[Ljava/lang/String;

    .line 53
    .line 54
    aget-object v11, v10, v9

    .line 55
    .line 56
    invoke-virtual {v8, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    if-eqz v11, :cond_d

    .line 61
    .line 62
    instance-of v8, v7, Lds4;

    .line 63
    .line 64
    if-nez v8, :cond_3

    .line 65
    .line 66
    instance-of v9, v7, Ls02;

    .line 67
    .line 68
    if-eqz v9, :cond_2

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_2
    move-object v9, v1

    .line 72
    goto :goto_4

    .line 73
    :cond_3
    :goto_3
    move-object v9, v0

    .line 74
    :goto_4
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    instance-of v12, v7, Ls02;

    .line 79
    .line 80
    if-eqz v12, :cond_4

    .line 81
    .line 82
    check-cast v7, Ls02;

    .line 83
    .line 84
    iget-object v8, v7, Ls02;->c:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v7, v7, Ls02;->d:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    goto :goto_7

    .line 93
    :cond_4
    if-eqz v8, :cond_7

    .line 94
    .line 95
    check-cast v7, Lds4;

    .line 96
    .line 97
    iget-object v8, v7, Lds4;->d:Lyw1;

    .line 98
    .line 99
    iget-object v11, v7, Lds4;->b:Ljava/lang/String;

    .line 100
    .line 101
    if-eqz v11, :cond_5

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_5
    iget-object v11, v7, Lnv1;->a:Ljava/lang/String;

    .line 105
    .line 106
    :goto_5
    invoke-static {v11}, Lxa3;->i(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v8}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    if-nez v11, :cond_6

    .line 115
    .line 116
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    check-cast v8, Ljava/lang/String;

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_6
    const-string v8, ""

    .line 124
    .line 125
    :goto_6
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    :cond_7
    :goto_7
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 133
    .line 134
    invoke-virtual {v11, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    aget-object v8, v10, v3

    .line 139
    .line 140
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-eqz v8, :cond_8

    .line 145
    .line 146
    invoke-static {v11}, Ljz3;->f(Ljava/lang/String;)F

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    invoke-virtual {v9, v8}, Lcom/eddyizm/tempus/model/ReplayGain;->setTrackGain(F)V

    .line 151
    .line 152
    .line 153
    :cond_8
    const/4 v8, 0x1

    .line 154
    aget-object v8, v10, v8

    .line 155
    .line 156
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    if-eqz v8, :cond_9

    .line 161
    .line 162
    invoke-static {v11}, Ljz3;->f(Ljava/lang/String;)F

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    invoke-virtual {v9, v8}, Lcom/eddyizm/tempus/model/ReplayGain;->setAlbumGain(F)V

    .line 167
    .line 168
    .line 169
    :cond_9
    const/4 v8, 0x2

    .line 170
    aget-object v8, v10, v8

    .line 171
    .line 172
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    const/high16 v12, 0x40a00000    # 5.0f

    .line 177
    .line 178
    const/high16 v13, 0x43800000    # 256.0f

    .line 179
    .line 180
    if-eqz v8, :cond_a

    .line 181
    .line 182
    invoke-static {v11}, Ljz3;->f(Ljava/lang/String;)F

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    div-float/2addr v8, v13

    .line 187
    add-float/2addr v8, v12

    .line 188
    invoke-virtual {v9, v8}, Lcom/eddyizm/tempus/model/ReplayGain;->setTrackGain(F)V

    .line 189
    .line 190
    .line 191
    :cond_a
    const/4 v8, 0x3

    .line 192
    aget-object v8, v10, v8

    .line 193
    .line 194
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    if-eqz v8, :cond_b

    .line 199
    .line 200
    invoke-static {v11}, Ljz3;->f(Ljava/lang/String;)F

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    div-float/2addr v8, v13

    .line 205
    add-float/2addr v8, v12

    .line 206
    invoke-virtual {v9, v8}, Lcom/eddyizm/tempus/model/ReplayGain;->setAlbumGain(F)V

    .line 207
    .line 208
    .line 209
    :cond_b
    const/4 v8, 0x4

    .line 210
    aget-object v8, v10, v8

    .line 211
    .line 212
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    if-eqz v8, :cond_c

    .line 217
    .line 218
    invoke-static {v11}, Ljz3;->f(Ljava/lang/String;)F

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    invoke-virtual {v9, v8}, Lcom/eddyizm/tempus/model/ReplayGain;->setTrackPeak(F)V

    .line 223
    .line 224
    .line 225
    :cond_c
    const/4 v8, 0x5

    .line 226
    aget-object v8, v10, v8

    .line 227
    .line 228
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    if-eqz v7, :cond_e

    .line 233
    .line 234
    invoke-static {v11}, Ljz3;->f(Ljava/lang/String;)F

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    invoke-virtual {v9, v7}, Lcom/eddyizm/tempus/model/ReplayGain;->setAlbumPeak(F)V

    .line 239
    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_d
    add-int/lit8 v9, v9, 0x1

    .line 243
    .line 244
    goto/16 :goto_2

    .line 245
    .line 246
    :cond_e
    :goto_8
    add-int/lit8 v6, v6, 0x1

    .line 247
    .line 248
    goto/16 :goto_1

    .line 249
    .line 250
    :cond_f
    new-instance p0, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    return-object p0
.end method

.method public static f(Ljava/lang/String;)F
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "(-?\\d+(?:\\.\\d+)?)\\s*(?:dB)?\\s*$"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 32
    .line 33
    .line 34
    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    return p0

    .line 36
    :catch_0
    :cond_1
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public static g(Lqi3;)V
    .locals 5

    .line 1
    invoke-static {}, Lud3;->z()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "disabled"

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Ljz3;->f:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-interface {p0}, Lqi3;->Q0()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ge v0, v1, :cond_8

    .line 28
    .line 29
    invoke-interface {p0, v0}, Lqi3;->Y(I)Lgn2;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v2, v1, Lgn2;->a:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz v2, :cond_7

    .line 36
    .line 37
    iget-object v2, v1, Lgn2;->b:Lbn2;

    .line 38
    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    iget-object v2, v1, Lgn2;->d:Ldo2;

    .line 43
    .line 44
    iget-object v2, v2, Ldo2;->I:Landroid/os/Bundle;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    const-string v3, "type"

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    const/4 v2, 0x0

    .line 56
    :goto_1
    const-string v3, "radio"

    .line 57
    .line 58
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    iget-object v2, v1, Lgn2;->a:Ljava/lang/String;

    .line 66
    .line 67
    const-string v3, "ir-"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    invoke-static {v1}, Ljz3;->d(Lgn2;)Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iget-object v3, v1, Lgn2;->a:Ljava/lang/String;

    .line 81
    .line 82
    if-eqz v2, :cond_5

    .line 83
    .line 84
    sget-object v4, Ljz3;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 85
    .line 86
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_7

    .line 91
    .line 92
    sget-object v3, Ljz3;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 93
    .line 94
    iget-object v4, v1, Lgn2;->a:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v2}, Ljz3;->o(Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;)Ljava/util/ArrayList;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    new-instance v2, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v3, "Prefetch skip (server RG available) "

    .line 106
    .line 107
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v1, v1, Lgn2;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const-string v2, "ReplayGainUtil"

    .line 120
    .line 121
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    sget-object v2, Ljz3;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 126
    .line 127
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-nez v2, :cond_6

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    sget-object v2, Ljz3;->d:Ljava/util/concurrent/ExecutorService;

    .line 135
    .line 136
    new-instance v3, Ljq3;

    .line 137
    .line 138
    const/4 v4, 0x4

    .line 139
    invoke-direct {v3, v4, v1}, Ljq3;-><init>(ILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 143
    .line 144
    .line 145
    :cond_7
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_8
    :goto_3
    return-void
.end method

.method public static h(Lqi3;)V
    .locals 17

    .line 1
    sget-object v0, Ljz3;->e:Liz3;

    .line 2
    .line 3
    invoke-interface/range {p0 .. p0}, Lqi3;->j0()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, -0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    move-object/from16 v3, p0

    .line 13
    .line 14
    invoke-interface {v3, v1}, Lqi3;->Y(I)Lgn2;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_e

    .line 19
    .line 20
    iget-object v1, v1, Lgn2;->a:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto/16 :goto_6

    .line 25
    .line 26
    :cond_1
    sget-object v4, Ljz3;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    invoke-virtual {v4, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/util/List;

    .line 33
    .line 34
    const-string v5, "album"

    .line 35
    .line 36
    const-string v7, "auto"

    .line 37
    .line 38
    const/4 v8, 0x1

    .line 39
    const-string v9, "disabled"

    .line 40
    .line 41
    const/4 v10, 0x0

    .line 42
    if-eqz v4, :cond_7

    .line 43
    .line 44
    invoke-static {}, Lud3;->z()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    invoke-static {v11, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    if-nez v11, :cond_7

    .line 53
    .line 54
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-eqz v11, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-static {}, Lud3;->z()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v11

    .line 65
    const-string v12, ""

    .line 66
    .line 67
    invoke-static {v11, v12}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    sparse-switch v12, :sswitch_data_0

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :sswitch_0
    const-string v12, "track"

    .line 83
    .line 84
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    if-nez v11, :cond_3

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    const/4 v2, 0x2

    .line 92
    goto :goto_0

    .line 93
    :sswitch_1
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    if-nez v11, :cond_4

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    move v2, v8

    .line 101
    goto :goto_0

    .line 102
    :sswitch_2
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    if-nez v11, :cond_5

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    const/4 v2, 0x0

    .line 110
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :pswitch_0
    invoke-static {v4}, Ljz3;->m(Ljava/util/List;)F

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    goto :goto_2

    .line 119
    :pswitch_1
    invoke-static {v4}, Ljz3;->j(Ljava/util/List;)F

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    goto :goto_2

    .line 124
    :pswitch_2
    invoke-static {v3}, Ljz3;->a(Lqi3;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_6

    .line 129
    .line 130
    invoke-static {v4}, Ljz3;->j(Ljava/util/List;)F

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    goto :goto_2

    .line 135
    :cond_6
    invoke-static {v4}, Ljz3;->m(Ljava/util/List;)F

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    goto :goto_2

    .line 140
    :cond_7
    :goto_1
    move v2, v10

    .line 141
    :goto_2
    cmpl-float v11, v2, v10

    .line 142
    .line 143
    const-wide/high16 v13, 0x4024000000000000L    # 10.0

    .line 144
    .line 145
    const/high16 v6, 0x41700000    # 15.0f

    .line 146
    .line 147
    const-wide/high16 v15, 0x4034000000000000L    # 20.0

    .line 148
    .line 149
    const/high16 v12, -0x3d900000    # -60.0f

    .line 150
    .line 151
    if-nez v11, :cond_9

    .line 152
    .line 153
    const-string v2, "ReplayGainUtil"

    .line 154
    .line 155
    if-nez v4, :cond_8

    .line 156
    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const-string v3, "queuePendingForNextTrack: no RG data yet for "

    .line 160
    .line 161
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v1, ", carrying over current gain"

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_8
    invoke-static {v10, v10}, Ljz3;->c(FF)F

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-static {v6, v3}, Ljava/lang/Math;->min(FF)F

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    invoke-static {v12, v4}, Ljava/lang/Math;->max(FF)F

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    float-to-double v4, v4

    .line 196
    div-double/2addr v4, v15

    .line 197
    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 198
    .line 199
    .line 200
    move-result-wide v4

    .line 201
    double-to-float v4, v4

    .line 202
    iput v4, v0, Liz3;->j:F

    .line 203
    .line 204
    iput-boolean v8, v0, Liz3;->l:Z

    .line 205
    .line 206
    new-instance v0, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    const-string v4, "queuePendingForNextTrack: no RG tags for "

    .line 209
    .line 210
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    const-string v1, ", queuing preamp-only totalGain="

    .line 217
    .line 218
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :cond_9
    invoke-static {}, Lud3;->z()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-static {v1, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-nez v1, :cond_d

    .line 241
    .line 242
    if-eqz v4, :cond_d

    .line 243
    .line 244
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-eqz v1, :cond_a

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_a
    invoke-static {}, Lud3;->z()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-static {v1, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-nez v1, :cond_c

    .line 260
    .line 261
    invoke-static {}, Lud3;->z()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-static {v1, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-eqz v1, :cond_b

    .line 270
    .line 271
    invoke-static {v3}, Ljz3;->a(Lqi3;)Z

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    if-eqz v1, :cond_b

    .line 276
    .line 277
    goto :goto_3

    .line 278
    :cond_b
    const/4 v1, 0x0

    .line 279
    goto :goto_4

    .line 280
    :cond_c
    :goto_3
    move v1, v8

    .line 281
    :goto_4
    invoke-static {v4, v1}, Ljz3;->n(Ljava/util/List;Z)F

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    :cond_d
    :goto_5
    invoke-static {v2, v10}, Ljz3;->c(FF)F

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-static {v6, v1}, Ljava/lang/Math;->min(FF)F

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    invoke-static {v12, v1}, Ljava/lang/Math;->max(FF)F

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    float-to-double v1, v1

    .line 301
    div-double/2addr v1, v15

    .line 302
    invoke-static {v13, v14, v1, v2}, Ljava/lang/Math;->pow(DD)D

    .line 303
    .line 304
    .line 305
    move-result-wide v1

    .line 306
    double-to-float v1, v1

    .line 307
    iput v1, v0, Liz3;->j:F

    .line 308
    .line 309
    iput-boolean v8, v0, Liz3;->l:Z

    .line 310
    .line 311
    :cond_e
    :goto_6
    return-void

    .line 312
    nop

    .line 313
    :sswitch_data_0
    .sparse-switch
        0x2dddaf -> :sswitch_2
        0x5897e6f -> :sswitch_1
        0x697f14b -> :sswitch_0
    .end sparse-switch

    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static i(Lqi3;)V
    .locals 8

    .line 1
    invoke-interface {p0}, Lqi3;->a()Lgn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ReplayGainUtil"

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object v2, v0, Lgn2;->a:Ljava/lang/String;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto/16 :goto_0

    .line 14
    .line 15
    :cond_0
    invoke-static {v0}, Ljz3;->d(Lgn2;)Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v3, Ljz3;->e:Liz3;

    .line 20
    .line 21
    const-string v4, " totalGain="

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-static {v0}, Ljz3;->o(Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;)Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p0, v0}, Ljz3;->k(Lqi3;Ljava/util/List;)F

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-static {p0, v0}, Ljz3;->l(Lqi3;Ljava/util/List;)F

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {v5, p0}, Ljz3;->c(FF)F

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v5, "reapplyCurrentTrackGain: server RG for "

    .line 44
    .line 45
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, p0}, Liz3;->n(F)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    sget-object v0, Ljz3;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Ljava/util/List;

    .line 75
    .line 76
    const-string v5, ", keeping current gain"

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    invoke-static {p0, v0}, Ljz3;->k(Lqi3;Ljava/util/List;)F

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    const/4 v7, 0x0

    .line 85
    cmpl-float v7, v6, v7

    .line 86
    .line 87
    if-eqz v7, :cond_2

    .line 88
    .line 89
    invoke-static {p0, v0}, Ljz3;->l(Lqi3;Ljava/util/List;)F

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-static {v6, p0}, Ljz3;->c(FF)F

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v5, "reapplyCurrentTrackGain: cache hit for "

    .line 100
    .line 101
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, p0}, Liz3;->n(F)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v0, "reapplyCurrentTrackGain: cache hit but gain=0 for "

    .line 127
    .line 128
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v0, "reapplyCurrentTrackGain: no cached data for "

    .line 148
    .line 149
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_4
    :goto_0
    const-string p0, "reapplyCurrentTrackGain: no current item, skipping"

    .line 167
    .line 168
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    return-void
.end method

.method public static j(Ljava/util/List;)F
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/ReplayGain;->getAlbumGain()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/ReplayGain;->getAlbumGain()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    cmpl-float v3, v0, v2

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v1

    .line 30
    :goto_0
    cmpl-float v1, v0, v2

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    return v0

    .line 35
    :cond_1
    invoke-static {p0}, Ljz3;->m(Ljava/util/List;)F

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method public static k(Lqi3;Ljava/util/List;)F
    .locals 3

    .line 1
    invoke-static {}, Lud3;->z()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "disabled"

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_5

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-static {}, Lud3;->z()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, ""

    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, -0x1

    .line 38
    sparse-switch v1, :sswitch_data_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :sswitch_0
    const-string v1, "track"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v2, 0x2

    .line 52
    goto :goto_0

    .line 53
    :sswitch_1
    const-string v1, "album"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/4 v2, 0x1

    .line 63
    goto :goto_0

    .line 64
    :sswitch_2
    const-string v1, "auto"

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    const/4 v2, 0x0

    .line 74
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :pswitch_0
    invoke-static {p1}, Ljz3;->m(Ljava/util/List;)F

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    return p0

    .line 83
    :pswitch_1
    invoke-static {p1}, Ljz3;->j(Ljava/util/List;)F

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    return p0

    .line 88
    :pswitch_2
    invoke-static {p0}, Ljz3;->b(Lqi3;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_4

    .line 93
    .line 94
    invoke-static {p1}, Ljz3;->j(Ljava/util/List;)F

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    return p0

    .line 99
    :cond_4
    invoke-static {p1}, Ljz3;->m(Ljava/util/List;)F

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    return p0

    .line 104
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 105
    return p0

    .line 106
    nop

    .line 107
    :sswitch_data_0
    .sparse-switch
        0x2dddaf -> :sswitch_2
        0x5897e6f -> :sswitch_1
        0x697f14b -> :sswitch_0
    .end sparse-switch

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static l(Lqi3;Ljava/util/List;)F
    .locals 2

    .line 1
    invoke-static {}, Lud3;->z()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "disabled"

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    invoke-static {}, Lud3;->z()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "album"

    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    invoke-static {}, Lud3;->z()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "auto"

    .line 37
    .line 38
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-static {p0}, Ljz3;->b(Lqi3;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 p0, 0x0

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 54
    :goto_1
    invoke-static {p1, p0}, Ljz3;->n(Ljava/util/List;Z)F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0

    .line 59
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 60
    return p0
.end method

.method public static m(Ljava/util/List;)F
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/ReplayGain;->getTrackGain()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/ReplayGain;->getTrackGain()F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 v1, 0x0

    .line 24
    cmpl-float v1, v0, v1

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    return v0

    .line 29
    :cond_0
    return p0
.end method

.method public static n(Ljava/util/List;Z)F
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/ReplayGain;->getAlbumPeak()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 21
    .line 22
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/ReplayGain;->getAlbumPeak()F

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    cmpl-float v4, p1, v2

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p1, v3

    .line 32
    :goto_0
    cmpl-float v3, p1, v2

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    return p1

    .line 37
    :cond_1
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/ReplayGain;->getTrackPeak()F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/ReplayGain;->getTrackPeak()F

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    cmpl-float v0, p1, v2

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    return p1

    .line 62
    :cond_2
    return p0
.end method

.method public static o(Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/eddyizm/tempus/model/ReplayGain;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackGain()Ljava/lang/Float;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackGain()Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/model/ReplayGain;->setTrackGain(F)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumGain()Ljava/lang/Float;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumGain()Ljava/lang/Float;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/model/ReplayGain;->setAlbumGain(F)V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackPeak()Ljava/lang/Float;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackPeak()Ljava/lang/Float;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/model/ReplayGain;->setTrackPeak(F)V

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumPeak()Ljava/lang/Float;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumPeak()Ljava/lang/Float;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/model/ReplayGain;->setAlbumPeak(F)V

    .line 72
    .line 73
    .line 74
    :cond_3
    new-instance v1, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 75
    .line 76
    invoke-direct {v1}, Lcom/eddyizm/tempus/model/ReplayGain;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getFallbackGain()Ljava/lang/Float;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    if-eqz p0, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v1, v2}, Lcom/eddyizm/tempus/model/ReplayGain;->setTrackGain(F)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    invoke-virtual {v1, p0}, Lcom/eddyizm/tempus/model/ReplayGain;->setAlbumGain(F)V

    .line 97
    .line 98
    .line 99
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    return-object p0
.end method

.method public static p(Lqi3;Ljw4;)V
    .locals 9

    .line 1
    if-eqz p1, :cond_b

    .line 2
    .line 3
    iget-object p1, p1, Ljw4;->a:Lyw1;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    invoke-interface {p0}, Lqi3;->a()Lgn2;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "ReplayGainUtil"

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {v0}, Ljz3;->d(Lgn2;)Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    new-instance p1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v2, "setReplayGain: server RG already applied for "

    .line 30
    .line 31
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, Lgn2;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, ", ignoring tag-extracted values"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Ljz3;->h(Lqi3;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    move v4, v3

    .line 62
    :goto_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-ge v4, v5, :cond_5

    .line 67
    .line 68
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, Liw4;

    .line 73
    .line 74
    if-eqz v5, :cond_4

    .line 75
    .line 76
    iget-object v6, v5, Liw4;->b:Lsv4;

    .line 77
    .line 78
    if-nez v6, :cond_2

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move v7, v3

    .line 82
    :goto_1
    iget v8, v6, Lsv4;->a:I

    .line 83
    .line 84
    if-ge v7, v8, :cond_4

    .line 85
    .line 86
    invoke-virtual {v5, v7}, Liw4;->a(I)Ltb1;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    iget-object v8, v8, Ltb1;->l:Lqv2;

    .line 91
    .line 92
    if-eqz v8, :cond_3

    .line 93
    .line 94
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_5
    invoke-static {v2}, Ljz3;->e(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const/4 v2, 0x0

    .line 108
    if-eqz v0, :cond_6

    .line 109
    .line 110
    iget-object v0, v0, Lgn2;->a:Ljava/lang/String;

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    move-object v0, v2

    .line 114
    :goto_3
    sget-object v3, Ljz3;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 115
    .line 116
    if-eqz v0, :cond_7

    .line 117
    .line 118
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Ljava/util/List;

    .line 123
    .line 124
    :cond_7
    invoke-static {p1}, Ljz3;->m(Ljava/util/List;)F

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    const/4 v5, 0x0

    .line 129
    cmpl-float v4, v4, v5

    .line 130
    .line 131
    if-nez v4, :cond_8

    .line 132
    .line 133
    invoke-static {p1}, Ljz3;->j(Ljava/util/List;)F

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    cmpl-float v4, v4, v5

    .line 138
    .line 139
    if-nez v4, :cond_8

    .line 140
    .line 141
    if-eqz v2, :cond_8

    .line 142
    .line 143
    new-instance p1, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string v3, "setReplayGain: extracted gains empty (seek past header?), keeping cached gains for "

    .line 146
    .line 147
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-object p1, v2

    .line 161
    goto :goto_4

    .line 162
    :cond_8
    if-eqz v0, :cond_9

    .line 163
    .line 164
    invoke-virtual {v3, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    sget-object v2, Ljz3;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 168
    .line 169
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    :cond_9
    :goto_4
    invoke-static {p0, p1}, Ljz3;->k(Lqi3;Ljava/util/List;)F

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    cmpl-float v3, v2, v5

    .line 177
    .line 178
    sget-object v4, Ljz3;->e:Liz3;

    .line 179
    .line 180
    if-nez v3, :cond_a

    .line 181
    .line 182
    invoke-static {v5, v5}, Ljz3;->c(FF)F

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    new-instance v2, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    const-string v3, "setReplayGain: no effective gain data for "

    .line 189
    .line 190
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string v0, ", applying preamp-only totalGain="

    .line 197
    .line 198
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 209
    .line 210
    .line 211
    invoke-virtual {v4, p1}, Liz3;->n(F)V

    .line 212
    .line 213
    .line 214
    invoke-static {p0}, Ljz3;->h(Lqi3;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :cond_a
    invoke-static {p0, p1}, Ljz3;->l(Lqi3;Ljava/util/List;)F

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    invoke-static {v2, p1}, Ljz3;->c(FF)F

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    invoke-virtual {v4, p1}, Liz3;->n(F)V

    .line 227
    .line 228
    .line 229
    invoke-static {p0}, Ljz3;->h(Lqi3;)V

    .line 230
    .line 231
    .line 232
    :cond_b
    :goto_5
    return-void
.end method
