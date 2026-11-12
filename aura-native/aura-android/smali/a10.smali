.class public abstract La10;
.super Lz00;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Lp81;


# direct methods
.method public constructor <init>(Lp81;Lne0;ILwv;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4}, Lz00;-><init>(Lne0;ILwv;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La10;->q:Lp81;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lq81;Lvd0;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lz00;->o:I

    .line 2
    .line 3
    const/4 v1, -0x3

    .line 4
    sget-object v2, Lxe0;->n:Lxe0;

    .line 5
    .line 6
    if-ne v0, v1, :cond_4

    .line 7
    .line 8
    invoke-interface {p2}, Lvd0;->getContext()Lne0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    new-instance v3, Ld60;

    .line 15
    .line 16
    const/16 v4, 0xa

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-direct {v3, v4, v5}, Ld60;-><init>(IB)V

    .line 20
    .line 21
    .line 22
    iget-object v4, p0, Lz00;->n:Lne0;

    .line 23
    .line 24
    invoke-interface {v4, v3, v1}, Lne0;->s(Lwf1;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    invoke-interface {v0, v4}, Lne0;->J(Lne0;)Lne0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {v0, v4, v5}, Ljz4;->t(Lne0;Lne0;Z)Lne0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    invoke-static {v1, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    invoke-virtual {p0, p1, p2}, La10;->f(Lq81;Lvd0;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-ne p0, v2, :cond_5

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_1
    sget-object v3, Lfz0;->R:Lfz0;

    .line 59
    .line 60
    invoke-interface {v1, v3}, Lne0;->K(Lme0;)Lle0;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v0, v3}, Lne0;->K(Lme0;)Lle0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v4, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-interface {p2}, Lvd0;->getContext()Lne0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    instance-of v3, p1, Lz94;

    .line 79
    .line 80
    if-nez v3, :cond_3

    .line 81
    .line 82
    instance-of v3, p1, Ln63;

    .line 83
    .line 84
    if-eqz v3, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    new-instance v3, Lz81;

    .line 88
    .line 89
    invoke-direct {v3, p1, v0}, Lz81;-><init>(Lq81;Lne0;)V

    .line 90
    .line 91
    .line 92
    move-object p1, v3

    .line 93
    :cond_3
    :goto_1
    new-instance v0, Lp;

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    const/4 v4, 0x5

    .line 97
    invoke-direct {v0, p0, v3, v4}, Lp;-><init>(Ljava/lang/Object;Lvd0;I)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Lte5;->O(Lne0;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {v1, p1, p0, v0, p2}, Lud3;->J0(Lne0;Ljava/lang/Object;Ljava/lang/Object;Lwf1;Lvd0;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-ne p0, v2, :cond_5

    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_4
    invoke-super {p0, p1, p2}, Lz00;->a(Lq81;Lvd0;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-ne p0, v2, :cond_5

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_5
    sget-object p0, Lj15;->a:Lj15;

    .line 119
    .line 120
    return-object p0
.end method

.method public final b(Lrq3;Lvd0;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lz94;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lz94;-><init>(Lrq3;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p2}, La10;->f(Lq81;Lvd0;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, Lxe0;->n:Lxe0;

    .line 11
    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    sget-object p0, Lj15;->a:Lj15;

    .line 16
    .line 17
    return-object p0
.end method

.method public abstract f(Lq81;Lvd0;)Ljava/lang/Object;
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La10;->q:Lp81;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " -> "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Lz00;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
