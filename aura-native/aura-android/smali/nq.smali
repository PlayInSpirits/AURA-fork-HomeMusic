.class public final Lnq;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;
.implements Lpp;


# instance fields
.field public n:Z

.field public final o:Ljava/lang/Object;

.field public final p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;

.field public final s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IFLad3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnq;->o:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance p3, Lwd3;

    .line 7
    .line 8
    invoke-direct {p3, p1}, Lwd3;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p3, p0, Lnq;->p:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance p3, Lvd3;

    .line 14
    .line 15
    invoke-direct {p3, p2}, Lvd3;-><init>(F)V

    .line 16
    .line 17
    .line 18
    iput-object p3, p0, Lnq;->q:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance p2, Lg82;

    .line 21
    .line 22
    invoke-direct {p2, p1}, Lg82;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lnq;->s:Ljava/lang/Object;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Lij1;Lme;Lve;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq;->s:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lnq;->q:Ljava/lang/Object;

    iput-object p1, p0, Lnq;->r:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lnq;->n:Z

    iput-object p2, p0, Lnq;->o:Ljava/lang/Object;

    iput-object p3, p0, Lnq;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll61;Lkn2;Ljava/lang/String;ZLpq;Llb4;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lnq;->o:Ljava/lang/Object;

    iput-object p2, p0, Lnq;->p:Ljava/lang/Object;

    iput-object p3, p0, Lnq;->q:Ljava/lang/Object;

    iput-boolean p4, p0, Lnq;->n:Z

    iput-object p5, p0, Lnq;->r:Ljava/lang/Object;

    iput-object p6, p0, Lnq;->s:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lka0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnq;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lij1;

    .line 4
    .line 5
    iget-object v0, v0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    iget-object p0, p0, Lnq;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lve;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lgf5;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lgf5;->n(Lka0;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public k(Lka0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnq;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lij1;

    .line 4
    .line 5
    iget-object v0, v0, Lij1;->A:Lzw2;

    .line 6
    .line 7
    new-instance v1, Llg1;

    .line 8
    .line 9
    const/16 v2, 0x1d

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v1, p0, p1, v3, v2}, Llg1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lnq;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ll61;

    .line 10
    .line 11
    invoke-static {p1}, Ln61;->l(Ll61;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lnq;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lpq;

    .line 17
    .line 18
    iget-object p2, p0, Lnq;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p2, Lkn2;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, p2, v0}, Lpq;->f(Lkn2;Z)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lnq;->s:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Llb4;

    .line 29
    .line 30
    new-instance p1, Lab4;

    .line 31
    .line 32
    new-instance p2, Lxa4;

    .line 33
    .line 34
    const/4 v0, -0x1

    .line 35
    const-string v1, "An error has occurred"

    .line 36
    .line 37
    invoke-direct {p2, v0, v1}, Lxa4;-><init>(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p1, p2}, Lab4;-><init>(Lxa4;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lu0;->l(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lnq;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llb4;

    .line 4
    .line 5
    iget-object v1, p0, Lnq;->r:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lpq;

    .line 8
    .line 9
    iget-object v2, p0, Lnq;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ll61;

    .line 12
    .line 13
    iget-object v3, p0, Lnq;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lkn2;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStatus()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    :goto_0
    sget-object v4, Lcom/eddyizm/tempus/subsonic/models/ResponseStatus;->FAILED:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {p1, v4}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const/4 v5, 0x0

    .line 54
    if-eqz v4, :cond_3

    .line 55
    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    invoke-static {v2}, Ln61;->a(Ll61;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Lkn2;->a()Lqi3;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-interface {p1}, Lqi3;->Q0()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    move p2, v5

    .line 70
    :goto_1
    if-ge p2, p1, :cond_2

    .line 71
    .line 72
    invoke-virtual {v3}, Lkn2;->a()Lqi3;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {v2, p2}, Lqi3;->Y(I)Lgn2;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-object v4, v2, Lgn2;->a:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v6, p0, Lnq;->q:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v6, Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v4, v6}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_1

    .line 94
    .line 95
    iget-object v4, v2, Lgn2;->d:Ldo2;

    .line 96
    .line 97
    invoke-virtual {v4}, Ldo2;->a()Lco2;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    new-instance v6, Lvl1;

    .line 102
    .line 103
    iget-boolean v7, p0, Lnq;->n:Z

    .line 104
    .line 105
    invoke-direct {v6, v7}, Lvl1;-><init>(Z)V

    .line 106
    .line 107
    .line 108
    iput-object v6, v4, Lco2;->i:Llu3;

    .line 109
    .line 110
    new-instance v6, Ldo2;

    .line 111
    .line 112
    invoke-direct {v6, v4}, Ldo2;-><init>(Lco2;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Lkn2;->a()Lqi3;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v2}, Lgn2;->a()Ltm2;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iput-object v6, v2, Ltm2;->k:Ldo2;

    .line 124
    .line 125
    invoke-virtual {v2}, Ltm2;->a()Lgn2;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-interface {v4, p2, v2}, Lqi3;->z0(ILgn2;)V

    .line 130
    .line 131
    .line 132
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    invoke-virtual {v1, v3, v5}, Lpq;->f(Lkn2;Z)V

    .line 136
    .line 137
    .line 138
    new-instance p0, Lab4;

    .line 139
    .line 140
    invoke-direct {p0, v5}, Lab4;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, p0}, Lu0;->l(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_3
    if-eqz p1, :cond_4

    .line 148
    .line 149
    invoke-static {v2}, Ln61;->j(Ll61;)V

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_4
    invoke-static {v2}, Ln61;->l(Ll61;)V

    .line 154
    .line 155
    .line 156
    :goto_2
    invoke-virtual {v1, v3, v5}, Lpq;->f(Lkn2;Z)V

    .line 157
    .line 158
    .line 159
    new-instance p0, Lab4;

    .line 160
    .line 161
    if-eqz p1, :cond_5

    .line 162
    .line 163
    new-instance p1, Lxa4;

    .line 164
    .line 165
    const/4 p2, -0x1

    .line 166
    const-string v1, "The server refused the change"

    .line 167
    .line 168
    invoke-direct {p1, p2, v1}, Lxa4;-><init>(ILjava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_5
    new-instance p1, Lxa4;

    .line 173
    .line 174
    invoke-virtual {p2}, Lretrofit2/Response;->code()I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    invoke-virtual {p2}, Lretrofit2/Response;->message()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-direct {p1, v1, p2}, Lxa4;-><init>(ILjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :goto_3
    invoke-direct {p0, p1}, Lab4;-><init>(Lxa4;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, p0}, Lu0;->l(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    return-void
.end method
