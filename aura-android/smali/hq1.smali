.class public final Lhq1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lr21;


# instance fields
.field public a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcn;Lh04;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lhq1;->b:Ljava/lang/Object;

    .line 28
    iput-object p2, p0, Lhq1;->c:Ljava/lang/Object;

    .line 29
    iput-object p3, p0, Lhq1;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 30
    invoke-static {p1}, Lf35;->q(Lgt0;)Landroid/os/Handler;

    move-result-object p1

    .line 31
    iput-object p1, p0, Lhq1;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lim3;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/List;ILew4;Lcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq1;->g:Ljava/lang/Object;

    iput-object p2, p0, Lhq1;->b:Ljava/lang/Object;

    iput-object p3, p0, Lhq1;->c:Ljava/lang/Object;

    iput-object p4, p0, Lhq1;->d:Ljava/lang/Object;

    iput p5, p0, Lhq1;->a:I

    iput-object p6, p0, Lhq1;->e:Ljava/lang/Object;

    iput-object p7, p0, Lhq1;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lo83;Lq21;Lfw;Lew;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lhq1;->b:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, Lhq1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p3, p0, Lhq1;->d:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p4, p0, Lhq1;->e:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance p1, Le20;

    .line 19
    .line 20
    invoke-direct {p1, p3}, Le20;-><init>(Lfw;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lhq1;->f:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public a(Lk14;)Lej4;
    .locals 9

    .line 1
    invoke-static {p1}, Lbr1;->a(Lk14;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lhq1;->k(J)Leq1;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string v0, "Transfer-Encoding"

    .line 15
    .line 16
    iget-object v1, p1, Lk14;->s:Ltl1;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    move-object v0, v1

    .line 26
    :cond_1
    const-string v2, "chunked"

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const-string v2, "state: "

    .line 33
    .line 34
    const/4 v3, 0x5

    .line 35
    const/4 v4, 0x4

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iget-object p1, p1, Lk14;->n:Loz3;

    .line 39
    .line 40
    iget-object p1, p1, Loz3;->a:Lgr1;

    .line 41
    .line 42
    iget v0, p0, Lhq1;->a:I

    .line 43
    .line 44
    if-ne v0, v4, :cond_2

    .line 45
    .line 46
    iput v3, p0, Lhq1;->a:I

    .line 47
    .line 48
    new-instance v0, Ldq1;

    .line 49
    .line 50
    invoke-direct {v0, p0, p1}, Ldq1;-><init>(Lhq1;Lgr1;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_2
    iget p0, p0, Lhq1;->a:I

    .line 55
    .line 56
    invoke-static {p0, v2}, Lnz2;->e(ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_3
    invoke-static {p1}, Lze5;->e(Lk14;)J

    .line 61
    .line 62
    .line 63
    move-result-wide v5

    .line 64
    const-wide/16 v7, -0x1

    .line 65
    .line 66
    cmp-long p1, v5, v7

    .line 67
    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0, v5, v6}, Lhq1;->k(J)Leq1;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_4
    iget p1, p0, Lhq1;->a:I

    .line 76
    .line 77
    if-ne p1, v4, :cond_5

    .line 78
    .line 79
    iput v3, p0, Lhq1;->a:I

    .line 80
    .line 81
    iget-object p1, p0, Lhq1;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, Lq21;

    .line 84
    .line 85
    invoke-interface {p1}, Lq21;->a()V

    .line 86
    .line 87
    .line 88
    new-instance p1, Lfq1;

    .line 89
    .line 90
    invoke-direct {p1, p0}, Lbq1;-><init>(Lhq1;)V

    .line 91
    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_5
    iget p0, p0, Lhq1;->a:I

    .line 95
    .line 96
    invoke-static {p0, v2}, Lnz2;->e(ILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object v1
.end method

.method public b(Loz3;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhq1;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lq21;

    .line 7
    .line 8
    invoke-interface {v0}, Lq21;->h()Lo34;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Lo34;->b:Ljava/net/Proxy;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v2, p1, Loz3;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/16 v2, 0x20

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v2, p1, Loz3;->a:Lgr1;

    .line 37
    .line 38
    invoke-virtual {v2}, Lgr1;->f()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 45
    .line 46
    if-ne v0, v3, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {v2}, Lgr1;->b()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v2}, Lgr1;->d()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    new-instance v3, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const/16 v0, 0x3f

    .line 71
    .line 72
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    :goto_0
    const-string v0, " HTTP/1.1"

    .line 86
    .line 87
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object p1, p1, Loz3;->c:Ltl1;

    .line 95
    .line 96
    invoke-virtual {p0, p1, v0}, Lhq1;->n(Ltl1;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public c()V
    .locals 0

    .line 1
    iget-object p0, p0, Lhq1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lew;

    .line 4
    .line 5
    invoke-interface {p0}, Lew;->flush()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lhq1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lq21;

    .line 4
    .line 5
    invoke-interface {p0}, Lq21;->cancel()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(Lk14;)J
    .locals 1

    .line 1
    invoke-static {p1}, Lbr1;->a(Lk14;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    iget-object p0, p1, Lk14;->s:Ltl1;

    .line 11
    .line 12
    const-string v0, "Transfer-Encoding"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    :cond_1
    const-string v0, "chunked"

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    const-wide/16 p0, -0x1

    .line 30
    .line 31
    return-wide p0

    .line 32
    :cond_2
    invoke-static {p1}, Lze5;->e(Lk14;)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    return-wide p0
.end method

.method public e(Loz3;J)Lof4;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Loz3;->d:Ltz3;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ltz3;->isDuplex()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p0, Ljava/net/ProtocolException;

    .line 17
    .line 18
    const-string p1, "Duplex connections are not supported for HTTP/1"

    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :cond_1
    :goto_0
    const-string v0, "Transfer-Encoding"

    .line 25
    .line 26
    iget-object p1, p1, Loz3;->c:Ltl1;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "chunked"

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/4 v0, 0x0

    .line 39
    const-string v2, "state: "

    .line 40
    .line 41
    const/4 v3, 0x2

    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    iget p1, p0, Lhq1;->a:I

    .line 45
    .line 46
    if-ne p1, v1, :cond_2

    .line 47
    .line 48
    iput v3, p0, Lhq1;->a:I

    .line 49
    .line 50
    new-instance p1, Lcq1;

    .line 51
    .line 52
    invoke-direct {p1, p0}, Lcq1;-><init>(Lhq1;)V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_2
    iget p0, p0, Lhq1;->a:I

    .line 57
    .line 58
    invoke-static {p0, v2}, Lnz2;->e(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_3
    const-wide/16 v4, -0x1

    .line 63
    .line 64
    cmp-long p1, p2, v4

    .line 65
    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    iget p1, p0, Lhq1;->a:I

    .line 69
    .line 70
    if-ne p1, v1, :cond_4

    .line 71
    .line 72
    iput v3, p0, Lhq1;->a:I

    .line 73
    .line 74
    new-instance p1, Lzn0;

    .line 75
    .line 76
    invoke-direct {p1, p0}, Lzn0;-><init>(Lhq1;)V

    .line 77
    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_4
    iget p0, p0, Lhq1;->a:I

    .line 81
    .line 82
    invoke-static {p0, v2}, Lnz2;->e(ILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_5
    const-string p0, "Cannot stream a request body without chunked encoding or a known content length!"

    .line 87
    .line 88
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object v0
.end method

.method public f(Z)Lj14;
    .locals 11

    .line 1
    iget-object v0, p0, Lhq1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Le20;

    .line 4
    .line 5
    iget v1, p0, Lhq1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x3

    .line 10
    if-eq v1, v2, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    if-ne v1, v4, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p1, "state: "

    .line 19
    .line 20
    iget p0, p0, Lhq1;->a:I

    .line 21
    .line 22
    invoke-static {p0, p1}, Lnz2;->e(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v3

    .line 26
    :cond_1
    :goto_0
    :try_start_0
    iget-object v1, v0, Le20;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lfw;

    .line 29
    .line 30
    iget-wide v5, v0, Le20;->o:J

    .line 31
    .line 32
    invoke-interface {v1, v5, v6}, Lfw;->t(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-wide v5, v0, Le20;->o:J

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-long v7, v2

    .line 43
    sub-long/2addr v5, v7

    .line 44
    iput-wide v5, v0, Le20;->o:J

    .line 45
    .line 46
    invoke-static {v1}, Lhw;->C(Ljava/lang/String;)Lue1;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget v2, v1, Lue1;->o:I

    .line 51
    .line 52
    new-instance v5, Lj14;

    .line 53
    .line 54
    invoke-direct {v5}, Lj14;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-object v6, v1, Lue1;->p:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Lpr3;

    .line 60
    .line 61
    iput-object v6, v5, Lj14;->b:Lpr3;

    .line 62
    .line 63
    iput v2, v5, Lj14;->c:I

    .line 64
    .line 65
    iget-object v1, v1, Lue1;->q:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    iput-object v1, v5, Lj14;->d:Ljava/lang/String;

    .line 70
    .line 71
    new-instance v1, Lsl1;

    .line 72
    .line 73
    invoke-direct {v1}, Lsl1;-><init>()V

    .line 74
    .line 75
    .line 76
    :goto_1
    iget-object v6, v0, Le20;->p:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v6, Lfw;

    .line 79
    .line 80
    iget-wide v7, v0, Le20;->o:J

    .line 81
    .line 82
    invoke-interface {v6, v7, v8}, Lfw;->t(J)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    iget-wide v7, v0, Le20;->o:J

    .line 87
    .line 88
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    int-to-long v9, v9

    .line 93
    sub-long/2addr v7, v9

    .line 94
    iput-wide v7, v0, Le20;->o:J

    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-nez v7, :cond_5

    .line 101
    .line 102
    invoke-virtual {v1}, Lsl1;->c()Ltl1;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Ltl1;->d()Lsl1;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, v5, Lj14;->f:Lsl1;

    .line 111
    .line 112
    sget-object v0, Lgq1;->o:Lgq1;

    .line 113
    .line 114
    iput-object v0, v5, Lj14;->n:Lgf1;

    .line 115
    .line 116
    const/16 v0, 0x64

    .line 117
    .line 118
    if-eqz p1, :cond_2

    .line 119
    .line 120
    if-ne v2, v0, :cond_2

    .line 121
    .line 122
    return-object v3

    .line 123
    :cond_2
    if-ne v2, v0, :cond_3

    .line 124
    .line 125
    iput v4, p0, Lhq1;->a:I

    .line 126
    .line 127
    return-object v5

    .line 128
    :catch_0
    move-exception p1

    .line 129
    goto :goto_2

    .line 130
    :cond_3
    const/16 p1, 0x66

    .line 131
    .line 132
    if-gt p1, v2, :cond_4

    .line 133
    .line 134
    const/16 p1, 0xc8

    .line 135
    .line 136
    if-ge v2, p1, :cond_4

    .line 137
    .line 138
    iput v4, p0, Lhq1;->a:I

    .line 139
    .line 140
    return-object v5

    .line 141
    :cond_4
    const/4 p1, 0x4

    .line 142
    iput p1, p0, Lhq1;->a:I

    .line 143
    .line 144
    return-object v5

    .line 145
    :cond_5
    invoke-virtual {v1, v6}, Lsl1;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :goto_2
    iget-object p0, p0, Lhq1;->c:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p0, Lq21;

    .line 152
    .line 153
    invoke-interface {p0}, Lq21;->h()Lo34;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    iget-object p0, p0, Lo34;->a:Lf6;

    .line 158
    .line 159
    iget-object p0, p0, Lf6;->h:Lgr1;

    .line 160
    .line 161
    invoke-virtual {p0}, Lgr1;->i()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    new-instance v0, Ljava/io/IOException;

    .line 166
    .line 167
    const-string v1, "unexpected end of stream on "

    .line 168
    .line 169
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-direct {v0, p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    throw v0
.end method

.method public g()V
    .locals 0

    .line 1
    iget-object p0, p0, Lhq1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lew;

    .line 4
    .line 5
    invoke-interface {p0}, Lew;->flush()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h()Lq21;
    .locals 0

    .line 1
    iget-object p0, p0, Lhq1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lq21;

    .line 4
    .line 5
    return-object p0
.end method

.method public i()Ltl1;
    .locals 2

    .line 1
    iget v0, p0, Lhq1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, Lhq1;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ltl1;

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lze5;->a:Ltl1;

    .line 13
    .line 14
    :cond_0
    return-object p0

    .line 15
    :cond_1
    const-string p0, "too early; can\'t read the trailers yet"

    .line 16
    .line 17
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lhq1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh04;

    .line 4
    .line 5
    iget-object v1, p0, Lhq1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lh04;->a(Landroid/content/Context;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lhq1;->a:I

    .line 14
    .line 15
    if-eq v1, v0, :cond_0

    .line 16
    .line 17
    iput v0, p0, Lhq1;->a:I

    .line 18
    .line 19
    iget-object v1, p0, Lhq1;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lcn;

    .line 22
    .line 23
    iget-object v1, v1, Lcn;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Llt0;

    .line 26
    .line 27
    invoke-virtual {v1, p0, v0}, Llt0;->b(Lhq1;I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public k(J)Leq1;
    .locals 2

    .line 1
    iget v0, p0, Lhq1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput v0, p0, Lhq1;->a:I

    .line 8
    .line 9
    new-instance v0, Leq1;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, Leq1;-><init>(Lhq1;J)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string p1, "state: "

    .line 16
    .line 17
    iget p0, p0, Lhq1;->a:I

    .line 18
    .line 19
    invoke-static {p0, p1}, Lnz2;->e(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public l()V
    .locals 5

    .line 1
    iget-object v0, p0, Lhq1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lim3;

    .line 4
    .line 5
    iget-object v1, v0, Lim3;->j:Lk03;

    .line 6
    .line 7
    invoke-virtual {v1}, Lad2;->d()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/util/List;

    .line 12
    .line 13
    iget-object v3, p0, Lhq1;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/util/ArrayList;

    .line 16
    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    iget v3, p0, Lhq1;->a:I

    .line 25
    .line 26
    iget-object v4, p0, Lhq1;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 29
    .line 30
    invoke-virtual {v2, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lad2;->k(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v1, p0, Lhq1;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-static {v0, v1, v2}, Lim3;->c(Lim3;Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lhq1;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Lew4;

    .line 47
    .line 48
    invoke-virtual {p0}, Lew4;->o()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public m()I
    .locals 5

    .line 1
    iget-object v0, p0, Lhq1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh04;

    .line 4
    .line 5
    iget-object v1, p0, Lhq1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lh04;->a(Landroid/content/Context;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iput v2, p0, Lhq1;->a:I

    .line 14
    .line 15
    new-instance v2, Landroid/content/IntentFilter;

    .line 16
    .line 17
    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 18
    .line 19
    .line 20
    iget v0, v0, Lh04;->n:I

    .line 21
    .line 22
    and-int/lit8 v3, v0, 0x1

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const-string v3, "connectivity"

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Landroid/net/ConnectivityManager;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v4, Lj04;

    .line 38
    .line 39
    invoke-direct {v4, p0}, Lj04;-><init>(Lhq1;)V

    .line 40
    .line 41
    .line 42
    iput-object v4, p0, Lhq1;->g:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    and-int/lit8 v3, v0, 0x8

    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    const-string v3, "android.intent.action.ACTION_POWER_CONNECTED"

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v3, "android.intent.action.ACTION_POWER_DISCONNECTED"

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    and-int/lit8 v3, v0, 0x4

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    const-string v3, "android.os.action.DEVICE_IDLE_MODE_CHANGED"

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    and-int/lit8 v0, v0, 0x10

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    const-string v0, "android.intent.action.DEVICE_STORAGE_LOW"

    .line 75
    .line 76
    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v0, "android.intent.action.DEVICE_STORAGE_OK"

    .line 80
    .line 81
    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    new-instance v0, Lv9;

    .line 85
    .line 86
    const/16 v3, 0xa

    .line 87
    .line 88
    invoke-direct {v0, v3, p0}, Lv9;-><init>(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lhq1;->f:Ljava/lang/Object;

    .line 92
    .line 93
    iget-object v3, p0, Lhq1;->e:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, Landroid/os/Handler;

    .line 96
    .line 97
    const/4 v4, 0x0

    .line 98
    invoke-virtual {v1, v0, v2, v4, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 99
    .line 100
    .line 101
    iget p0, p0, Lhq1;->a:I

    .line 102
    .line 103
    return p0
.end method

.method public n(Ltl1;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lhq1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lew;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lhq1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {v0, p2}, Lew;->y(Ljava/lang/String;)Lew;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const-string v1, "\r\n"

    .line 17
    .line 18
    invoke-interface {p2, v1}, Lew;->y(Ljava/lang/String;)Lew;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ltl1;->size()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, v2}, Ltl1;->b(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-interface {v0, v3}, Lew;->y(Ljava/lang/String;)Lew;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const-string v4, ": "

    .line 37
    .line 38
    invoke-interface {v3, v4}, Lew;->y(Ljava/lang/String;)Lew;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {p1, v2}, Ltl1;->e(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-interface {v3, v4}, Lew;->y(Ljava/lang/String;)Lew;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-interface {v3, v1}, Lew;->y(Ljava/lang/String;)Lew;

    .line 51
    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-interface {v0, v1}, Lew;->y(Ljava/lang/String;)Lew;

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x1

    .line 60
    iput p1, p0, Lhq1;->a:I

    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    const-string p1, "state: "

    .line 64
    .line 65
    iget p0, p0, Lhq1;->a:I

    .line 66
    .line 67
    invoke-static {p0, p1}, Lnz2;->e(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
