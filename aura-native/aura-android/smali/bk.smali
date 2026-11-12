.class public final Lbk;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;


# instance fields
.field public final synthetic n:I

.field public o:I

.field public p:Z

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 29
    const/4 v0, 0x7

    iput v0, p0, Lbk;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lbk;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lbk;->q:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance p1, Lmj0;

    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    invoke-direct {p1, v0}, Lmj0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lbk;->r:Ljava/lang/Object;

    .line 16
    .line 17
    sget-object p1, Lyl0;->h:Lgo4;

    .line 18
    .line 19
    const p1, 0x7f1300d6

    .line 20
    .line 21
    .line 22
    iput p1, p0, Lbk;->o:I

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lja;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lbk;->n:I

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p2, p0, Lbk;->q:Ljava/lang/Object;

    const/4 p2, 0x0

    .line 41
    iput p2, p0, Lbk;->o:I

    .line 42
    new-instance p2, Landroid/view/GestureDetector;

    .line 43
    new-instance v0, Lny1;

    invoke-direct {v0, p0}, Lny1;-><init>(Lbk;)V

    .line 44
    invoke-direct {p2, p1, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Lbk;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbk;[Lp61;ZI)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lbk;->n:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lbk;->r:Ljava/lang/Object;

    .line 27
    iput-object p2, p0, Lbk;->q:Ljava/lang/Object;

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    :cond_0
    iput-boolean p1, p0, Lbk;->p:Z

    iput p4, p0, Lbk;->o:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lbk;->n:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbk;->r:Ljava/lang/Object;

    .line 33
    new-instance p1, Lg5;

    const/4 v0, 0x5

    invoke-direct {p1, v0, p0}, Lg5;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lbk;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lbk;->n:I

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbk;->r:Ljava/lang/Object;

    .line 31
    new-instance p1, Ljq3;

    const/4 v0, 0x7

    invoke-direct {p1, v0, p0}, Ljq3;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lbk;->q:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLk03;II)V
    .locals 0

    .line 28
    iput p5, p0, Lbk;->n:I

    iput-object p1, p0, Lbk;->r:Ljava/lang/Object;

    iput-boolean p2, p0, Lbk;->p:Z

    iput-object p3, p0, Lbk;->q:Ljava/lang/Object;

    iput p4, p0, Lbk;->o:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ZILjava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lbk;->n:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-boolean p1, p0, Lbk;->p:Z

    .line 36
    iput p2, p0, Lbk;->o:I

    .line 37
    iput-object p3, p0, Lbk;->q:Ljava/lang/Object;

    if-eqz p4, :cond_0

    goto :goto_0

    .line 38
    :cond_0
    sget-object p4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :goto_0
    iput-object p4, p0, Lbk;->r:Ljava/lang/Object;

    return-void
.end method

.method public static b()Lbk;
    .locals 2

    .line 1
    new-instance v0, Lbk;

    .line 2
    .line 3
    invoke-direct {v0}, Lbk;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lbk;->p:Z

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput v1, v0, Lbk;->o:I

    .line 11
    .line 12
    return-object v0
.end method

.method private final d(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a()Lbk;
    .locals 4

    .line 1
    iget-object v0, p0, Lbk;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzy3;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const-string v1, "execute parameter required"

    .line 11
    .line 12
    invoke-static {v1, v0}, Lji2;->h(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lbk;

    .line 16
    .line 17
    iget-object v1, p0, Lbk;->r:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, [Lp61;

    .line 20
    .line 21
    iget-boolean v2, p0, Lbk;->p:Z

    .line 22
    .line 23
    iget v3, p0, Lbk;->o:I

    .line 24
    .line 25
    invoke-direct {v0, p0, v1, v2, v3}, Lbk;-><init>(Lbk;[Lp61;ZI)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public c(I)V
    .locals 3

    .line 1
    iget v0, p0, Lbk;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lbk;->r:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 10
    .line 11
    iget-object v2, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->C:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iput p1, p0, Lbk;->o:I

    .line 23
    .line 24
    iget-boolean p1, p0, Lbk;->p:Z

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-object p1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->C:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Landroid/view/View;

    .line 35
    .line 36
    iget-object v0, p0, Lbk;->q:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljq3;

    .line 39
    .line 40
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    iput-boolean v1, p0, Lbk;->p:Z

    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void

    .line 48
    :pswitch_0
    iget-object v0, p0, Lbk;->r:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 51
    .line 52
    iget-object v2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h0:Ljava/lang/ref/WeakReference;

    .line 53
    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iput p1, p0, Lbk;->o:I

    .line 64
    .line 65
    iget-boolean p1, p0, Lbk;->p:Z

    .line 66
    .line 67
    if-nez p1, :cond_3

    .line 68
    .line 69
    iget-object p1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h0:Ljava/lang/ref/WeakReference;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Landroid/view/View;

    .line 76
    .line 77
    iget-object v0, p0, Lbk;->q:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Lg5;

    .line 80
    .line 81
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 84
    .line 85
    .line 86
    iput-boolean v1, p0, Lbk;->p:Z

    .line 87
    .line 88
    :cond_3
    :goto_1
    return-void

    .line 89
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget p0, p0, Lbk;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 5

    .line 1
    iget p1, p0, Lbk;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lbk;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lk03;

    .line 10
    .line 11
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlaylists()Lcom/eddyizm/tempus/subsonic/models/Playlists;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlaylists()Lcom/eddyizm/tempus/subsonic/models/Playlists;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Playlists;->getPlaylists()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 64
    .line 65
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlaylists()Lcom/eddyizm/tempus/subsonic/models/Playlists;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Playlists;->getPlaylists()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iget-object v1, p0, Lbk;->r:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, Lmm3;

    .line 80
    .line 81
    new-instance v2, Ljava/lang/Thread;

    .line 82
    .line 83
    new-instance v3, Lur2;

    .line 84
    .line 85
    const/16 v4, 0xb

    .line 86
    .line 87
    invoke-direct {v3, v4, v1, p2}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 94
    .line 95
    .line 96
    iget-boolean v1, p0, Lbk;->p:Z

    .line 97
    .line 98
    if-eqz v1, :cond_0

    .line 99
    .line 100
    invoke-static {p2}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    iget p0, p0, Lbk;->o:I

    .line 108
    .line 109
    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    invoke-interface {p2, v0, p0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p1, p0}, Lad2;->k(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_0
    invoke-virtual {p1, p2}, Lad2;->k(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_1
    :goto_0
    return-void

    .line 125
    :pswitch_0
    iget-object p1, p0, Lbk;->q:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, Lk03;

    .line 128
    .line 129
    iget-object v1, p0, Lbk;->r:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, Lpa;

    .line 132
    .line 133
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_3

    .line 138
    .line 139
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    if-eqz v2, :cond_3

    .line 144
    .line 145
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 150
    .line 151
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStarred2()Lcom/eddyizm/tempus/subsonic/models/Starred2;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    if-eqz v2, :cond_3

    .line 160
    .line 161
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 166
    .line 167
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStarred2()Lcom/eddyizm/tempus/subsonic/models/Starred2;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Starred2;->getArtists()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    if-eqz p2, :cond_3

    .line 180
    .line 181
    iget-boolean v2, p0, Lbk;->p:Z

    .line 182
    .line 183
    if-nez v2, :cond_2

    .line 184
    .line 185
    invoke-virtual {v1, p2, p1}, Lpa;->x(Ljava/util/List;Lk03;)V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_2
    invoke-static {p2}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 190
    .line 191
    .line 192
    iget p0, p0, Lbk;->o:I

    .line 193
    .line 194
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    invoke-static {p0, v2}, Ljava/lang/Math;->min(II)I

    .line 199
    .line 200
    .line 201
    move-result p0

    .line 202
    invoke-interface {p2, v0, p0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-virtual {v1, p0, p1}, Lpa;->x(Ljava/util/List;Lk03;)V

    .line 207
    .line 208
    .line 209
    :cond_3
    :goto_1
    return-void

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
