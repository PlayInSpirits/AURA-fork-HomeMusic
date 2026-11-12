.class public final Le20;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;
.implements Ll51;
.implements Lm51;


# instance fields
.field public final synthetic n:I

.field public o:J

.field public p:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Le20;->n:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 35
    iput-wide v0, p0, Le20;->o:J

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    .line 28
    iput p4, p0, Le20;->n:I

    iput-wide p1, p0, Le20;->o:J

    iput-object p3, p0, Le20;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Le20;->n:I

    .line 29
    new-instance v0, Lrm3;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lrm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-wide p3, p0, Le20;->o:J

    .line 32
    iput-object v0, p0, Le20;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfw;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Le20;->n:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le20;->p:Ljava/lang/Object;

    const-wide/32 v0, 0x40000

    .line 27
    iput-wide v0, p0, Le20;->o:J

    return-void
.end method

.method public constructor <init>(Lhb3;I)V
    .locals 0

    const/4 p2, 0x7

    iput p2, p0, Le20;->n:I

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Le20;->p:Ljava/lang/Object;

    const-wide/16 p1, 0x0

    .line 38
    iput-wide p1, p0, Le20;->o:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Le20;->n:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le20;->p:Ljava/lang/Object;

    iput-wide p2, p0, Le20;->o:J

    return-void
.end method

.method public constructor <init>(Ll51;J)V
    .locals 2

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Le20;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Le20;->p:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-interface {p1}, Ll51;->getPosition()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    cmp-long p1, v0, p2

    .line 14
    .line 15
    if-ltz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    invoke-static {p1}, Lrr2;->l(Z)V

    .line 21
    .line 22
    .line 23
    iput-wide p2, p0, Le20;->o:J

    .line 24
    .line 25
    return-void
.end method

.method public static u(Le20;JF)J
    .locals 6

    .line 1
    iget-wide v0, p0, Le20;->o:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lg83;->e(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    iput-wide p1, p0, Le20;->o:J

    .line 8
    .line 9
    iget-object v0, p0, Le20;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lhb3;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {p1, p2}, Lg83;->c(J)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0, p1, p2}, Le20;->x(J)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    :goto_0
    const/4 p2, 0x0

    .line 29
    cmpl-float p2, p1, p2

    .line 30
    .line 31
    if-lez p2, :cond_4

    .line 32
    .line 33
    cmpl-float p1, p1, p3

    .line 34
    .line 35
    if-ltz p1, :cond_4

    .line 36
    .line 37
    iget-object p1, p0, Le20;->p:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lhb3;

    .line 40
    .line 41
    iget-wide v0, p0, Le20;->o:J

    .line 42
    .line 43
    const-wide v2, 0xffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    const/16 p2, 0x20

    .line 49
    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    invoke-static {v0, v1}, Lg83;->c(J)F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    shr-long v4, v0, p2

    .line 57
    .line 58
    long-to-int v4, v4

    .line 59
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    div-float/2addr v4, p1

    .line 64
    and-long/2addr v0, v2

    .line 65
    long-to-int v0, v0

    .line 66
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    div-float/2addr v0, p1

    .line 71
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    int-to-long v4, p1

    .line 76
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    int-to-long v0, p1

    .line 81
    shl-long p1, v4, p2

    .line 82
    .line 83
    and-long/2addr v0, v2

    .line 84
    or-long/2addr p1, v0

    .line 85
    invoke-static {p1, p2, p3}, Lg83;->f(JF)J

    .line 86
    .line 87
    .line 88
    move-result-wide p1

    .line 89
    iget-wide v0, p0, Le20;->o:J

    .line 90
    .line 91
    invoke-static {v0, v1, p1, p2}, Lg83;->d(JJ)J

    .line 92
    .line 93
    .line 94
    move-result-wide p0

    .line 95
    return-wide p0

    .line 96
    :cond_1
    invoke-virtual {p0, v0, v1}, Le20;->x(J)F

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    iget-wide v0, p0, Le20;->o:J

    .line 101
    .line 102
    invoke-virtual {p0, v0, v1}, Le20;->x(J)F

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    mul-float/2addr v0, p3

    .line 111
    sub-float/2addr p1, v0

    .line 112
    iget-wide v0, p0, Le20;->o:J

    .line 113
    .line 114
    iget-object p3, p0, Le20;->p:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p3, Lhb3;

    .line 117
    .line 118
    sget-object v4, Lhb3;->o:Lhb3;

    .line 119
    .line 120
    if-ne p3, v4, :cond_2

    .line 121
    .line 122
    and-long/2addr v0, v2

    .line 123
    :goto_1
    long-to-int p3, v0

    .line 124
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    goto :goto_2

    .line 129
    :cond_2
    shr-long/2addr v0, p2

    .line 130
    goto :goto_1

    .line 131
    :goto_2
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, Lhb3;

    .line 134
    .line 135
    if-ne p0, v4, :cond_3

    .line 136
    .line 137
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    int-to-long p0, p0

    .line 142
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 143
    .line 144
    .line 145
    move-result p3

    .line 146
    int-to-long v0, p3

    .line 147
    shl-long/2addr p0, p2

    .line 148
    and-long p2, v0, v2

    .line 149
    .line 150
    or-long/2addr p0, p2

    .line 151
    return-wide p0

    .line 152
    :cond_3
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    int-to-long v0, p0

    .line 157
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    int-to-long p0, p0

    .line 162
    shl-long p2, v0, p2

    .line 163
    .line 164
    and-long/2addr p0, v2

    .line 165
    or-long/2addr p0, p2

    .line 166
    return-wide p0

    .line 167
    :cond_4
    const-wide p0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    return-wide p0
.end method


# virtual methods
.method public A(I)V
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Le20;->r()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Le20;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1}, Le20;->A(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-wide v0, p0, Le20;->o:J

    .line 18
    .line 19
    const-wide/16 v2, 0x1

    .line 20
    .line 21
    shl-long/2addr v2, p1

    .line 22
    or-long/2addr v0, v2

    .line 23
    iput-wide v0, p0, Le20;->o:J

    .line 24
    .line 25
    return-void
.end method

.method public a([BIIZ)Z
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll51;

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    invoke-interface {p0, p1, p2, p3, p4}, Ll51;->a([BIIZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public d(IZ)Z
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll51;

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    invoke-interface {p0, p1, p2}, Ll51;->d(IZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public e([BIIZ)Z
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll51;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2, p3, p4}, Ll51;->e([BIIZ)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public f()J
    .locals 4

    .line 1
    iget-object v0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll51;

    .line 4
    .line 5
    invoke-interface {v0}, Ll51;->f()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Le20;->o:J

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    return-wide v0
.end method

.method public g(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll51;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ll51;->g(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public getLength()J
    .locals 4

    .line 1
    iget-object v0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll51;

    .line 4
    .line 5
    invoke-interface {v0}, Ll51;->getLength()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Le20;->o:J

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    return-wide v0
.end method

.method public getPosition()J
    .locals 4

    .line 1
    iget-object v0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll51;

    .line 4
    .line 5
    invoke-interface {v0}, Ll51;->getPosition()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Le20;->o:J

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    return-wide v0
.end method

.method public h(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll51;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ll51;->h(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public i([BII)I
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll51;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2, p3}, Ll51;->i([BII)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public k()V
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll51;

    .line 4
    .line 5
    invoke-interface {p0}, Ll51;->k()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public l(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll51;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ll51;->l(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public n([BII)V
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll51;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2, p3}, Ll51;->n([BII)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public o(I)V
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Le20;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    sub-int/2addr p1, v0

    .line 12
    invoke-virtual {p0, p1}, Le20;->o(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :cond_1
    iget-wide v0, p0, Le20;->o:J

    .line 17
    .line 18
    const-wide/16 v2, 0x1

    .line 19
    .line 20
    shl-long/2addr v2, p1

    .line 21
    not-long v2, v2

    .line 22
    and-long/2addr v0, v2

    .line 23
    iput-wide v0, p0, Le20;->o:J

    .line 24
    .line 25
    return-void
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v0, "createBookmark id="

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Le20;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v0, " pos="

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-wide v0, p0, Le20;->o:J

    .line 21
    .line 22
    const-string p0, " failed"

    .line 23
    .line 24
    invoke-static {p1, v0, v1, p0}, Lb11;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "QueueRepository"

    .line 29
    .line 30
    invoke-static {p1, p0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, ""

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStatus()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

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
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Error;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const-string p1, "unknown"

    .line 75
    .line 76
    :cond_1
    :goto_0
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    const-string v1, "ok"

    .line 83
    .line 84
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_2

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    return-void

    .line 92
    :cond_3
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v2, "createBookmark id="

    .line 95
    .line 96
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v2, p0, Le20;->p:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v2, Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v2, " pos="

    .line 107
    .line 108
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    iget-wide v2, p0, Le20;->o:J

    .line 112
    .line 113
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string p0, " -> HTTP "

    .line 117
    .line 118
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2}, Lretrofit2/Response;->code()I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string p0, " subsonicStatus="

    .line 129
    .line 130
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string p0, " "

    .line 137
    .line 138
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    const-string p1, "QueueRepository"

    .line 149
    .line 150
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    return-void
.end method

.method public p()V
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lm51;

    .line 4
    .line 5
    invoke-interface {p0}, Lm51;->p()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q(I)I
    .locals 6

    .line 1
    iget-object v0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Le20;

    .line 4
    .line 5
    const/16 v1, 0x40

    .line 6
    .line 7
    const-wide/16 v2, 0x1

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-wide v4, p0, Le20;->o:J

    .line 12
    .line 13
    if-lt p1, v1, :cond_0

    .line 14
    .line 15
    invoke-static {v4, v5}, Ljava/lang/Long;->bitCount(J)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    shl-long p0, v2, p1

    .line 21
    .line 22
    sub-long/2addr p0, v2

    .line 23
    and-long/2addr p0, v4

    .line 24
    invoke-static {p0, p1}, Ljava/lang/Long;->bitCount(J)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_1
    if-ge p1, v1, :cond_2

    .line 30
    .line 31
    iget-wide v0, p0, Le20;->o:J

    .line 32
    .line 33
    shl-long p0, v2, p1

    .line 34
    .line 35
    sub-long/2addr p0, v2

    .line 36
    and-long/2addr p0, v0

    .line 37
    invoke-static {p0, p1}, Ljava/lang/Long;->bitCount(J)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_2
    sub-int/2addr p1, v1

    .line 43
    invoke-virtual {v0, p1}, Le20;->q(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget-wide v0, p0, Le20;->o:J

    .line 48
    .line 49
    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    add-int/2addr p0, p1

    .line 54
    return p0
.end method

.method public r()V
    .locals 1

    .line 1
    iget-object v0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Le20;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Le20;

    .line 8
    .line 9
    invoke-direct {v0}, Le20;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Le20;->p:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public read([BII)I
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll51;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2, p3}, Lwh0;->read([BII)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public readFully([BII)V
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll51;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2, p3}, Ll51;->readFully([BII)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public s(I)Z
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Le20;->r()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Le20;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1}, Le20;->s(I)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    iget-wide v0, p0, Le20;->o:J

    .line 19
    .line 20
    const-wide/16 v2, 0x1

    .line 21
    .line 22
    shl-long p0, v2, p1

    .line 23
    .line 24
    and-long/2addr p0, v0

    .line 25
    const-wide/16 v0, 0x0

    .line 26
    .line 27
    cmp-long p0, p0, v0

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public t(II)Lwv4;
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lm51;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Lm51;->t(II)Lwv4;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Le20;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Le20;->p:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Le20;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-wide v0, p0, Le20;->o:J

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Le20;->p:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Le20;

    .line 32
    .line 33
    invoke-virtual {v1}, Le20;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "xx"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-wide v1, p0, Le20;->o:J

    .line 46
    .line 47
    invoke-static {v1, v2}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_0
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public v(IZ)V
    .locals 9

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Le20;->r()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Le20;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1, p2}, Le20;->v(IZ)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-wide v0, p0, Le20;->o:J

    .line 18
    .line 19
    const-wide/high16 v2, -0x8000000000000000L

    .line 20
    .line 21
    and-long/2addr v2, v0

    .line 22
    const-wide/16 v4, 0x0

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x1

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    move v2, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v2, v3

    .line 33
    :goto_0
    const-wide/16 v5, 0x1

    .line 34
    .line 35
    shl-long v7, v5, p1

    .line 36
    .line 37
    sub-long/2addr v7, v5

    .line 38
    and-long v5, v0, v7

    .line 39
    .line 40
    not-long v7, v7

    .line 41
    and-long/2addr v0, v7

    .line 42
    shl-long/2addr v0, v4

    .line 43
    or-long/2addr v0, v5

    .line 44
    iput-wide v0, p0, Le20;->o:J

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Le20;->A(I)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p0, p1}, Le20;->o(I)V

    .line 53
    .line 54
    .line 55
    :goto_1
    if-nez v2, :cond_4

    .line 56
    .line 57
    iget-object p1, p0, Le20;->p:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Le20;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    return-void

    .line 65
    :cond_4
    :goto_2
    invoke-virtual {p0}, Le20;->r()V

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Le20;

    .line 71
    .line 72
    invoke-virtual {p0, v3, v2}, Le20;->v(IZ)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public w(Lm84;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm51;

    .line 4
    .line 5
    new-instance v1, Lfl4;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, p1}, Lfl4;-><init>(Le20;Lm84;Lm84;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lm51;->w(Lm84;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public x(J)F
    .locals 2

    .line 1
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lhb3;

    .line 4
    .line 5
    sget-object v0, Lhb3;->o:Lhb3;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0x20

    .line 10
    .line 11
    shr-long p0, p1, p0

    .line 12
    .line 13
    :goto_0
    long-to-int p0, p0

    .line 14
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    const-wide v0, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long p0, p1, v0

    .line 25
    .line 26
    goto :goto_0
.end method

.method public y(I)Z
    .locals 10

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Le20;->r()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Le20;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1}, Le20;->y(I)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const-wide/16 v0, 0x1

    .line 19
    .line 20
    shl-long v2, v0, p1

    .line 21
    .line 22
    iget-wide v4, p0, Le20;->o:J

    .line 23
    .line 24
    and-long v6, v4, v2

    .line 25
    .line 26
    const-wide/16 v8, 0x0

    .line 27
    .line 28
    cmp-long p1, v6, v8

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    move p1, v6

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move p1, v7

    .line 37
    :goto_0
    not-long v8, v2

    .line 38
    and-long/2addr v4, v8

    .line 39
    iput-wide v4, p0, Le20;->o:J

    .line 40
    .line 41
    sub-long/2addr v2, v0

    .line 42
    and-long v0, v4, v2

    .line 43
    .line 44
    not-long v2, v2

    .line 45
    and-long/2addr v2, v4

    .line 46
    invoke-static {v2, v3, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    or-long/2addr v0, v2

    .line 51
    iput-wide v0, p0, Le20;->o:J

    .line 52
    .line 53
    iget-object v0, p0, Le20;->p:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Le20;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0, v7}, Le20;->s(I)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    const/16 v0, 0x3f

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Le20;->A(I)V

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, Le20;

    .line 73
    .line 74
    invoke-virtual {p0, v7}, Le20;->y(I)Z

    .line 75
    .line 76
    .line 77
    :cond_3
    return p1
.end method

.method public z()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Le20;->o:J

    .line 4
    .line 5
    iget-object p0, p0, Le20;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Le20;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Le20;->z()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
