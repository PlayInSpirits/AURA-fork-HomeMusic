.class public final synthetic Lao1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput p4, p0, Lao1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lao1;->o:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lao1;->p:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lao1;->q:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lao1;->r:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lao1;->n:I

    .line 2
    .line 3
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 4
    .line 5
    const-string v2, "password"

    .line 6
    .line 7
    const-string v3, "username"

    .line 8
    .line 9
    const-string v4, "code"

    .line 10
    .line 11
    iget-object v5, p0, Lao1;->r:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lao1;->q:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, p0, Lao1;->p:Ljava/lang/String;

    .line 16
    .line 17
    iget-object p0, p0, Lao1;->o:Ljava/lang/String;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    sget-object p0, Lrr1;->a:Lrr1;

    .line 25
    .line 26
    new-instance p0, Lkd3;

    .line 27
    .line 28
    invoke-direct {p0, v4, v7}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lkd3;

    .line 32
    .line 33
    invoke-direct {v0, v3, v6}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Lkd3;

    .line 37
    .line 38
    invoke-direct {v3, v2, v5}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    filled-new-array {p0, v0, v3}, [Lkd3;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Llg2;->X([Lkd3;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, "/api/auth/register"

    .line 50
    .line 51
    check-cast p0, Ljava/util/Map;

    .line 52
    .line 53
    invoke-static {p0, v0, v1}, Lrr1;->s(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 58
    .line 59
    new-instance p0, Lkd3;

    .line 60
    .line 61
    invoke-direct {p0, v6, v5}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    invoke-static {p0, v7, v6}, Lrr1;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/HubGoogleLogin;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubGoogleLogin;->getUsername()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    move-object v6, v0

    .line 77
    :goto_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubGoogleLogin;->getPassword()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-nez p0, :cond_2

    .line 82
    .line 83
    const-string p0, ""

    .line 84
    .line 85
    :cond_2
    new-instance v0, Lkd3;

    .line 86
    .line 87
    invoke-direct {v0, v6, p0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move-object p0, v0

    .line 91
    :goto_1
    return-object p0

    .line 92
    :pswitch_0
    sget-object v0, Lrr1;->a:Lrr1;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget-object v0, Lrr1;->a:Lrr1;

    .line 98
    .line 99
    new-instance v0, Lkd3;

    .line 100
    .line 101
    const-string v8, "email"

    .line 102
    .line 103
    invoke-direct {v0, v8, p0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    new-instance p0, Lkd3;

    .line 107
    .line 108
    invoke-direct {p0, v4, v7}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    new-instance v4, Lkd3;

    .line 112
    .line 113
    invoke-direct {v4, v3, v6}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    new-instance v3, Lkd3;

    .line 117
    .line 118
    invoke-direct {v3, v2, v5}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    filled-new-array {v0, p0, v4, v3}, [Lkd3;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {p0}, Llg2;->X([Lkd3;)Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    const-string v0, "/api/auth/email/register"

    .line 130
    .line 131
    check-cast p0, Ljava/util/Map;

    .line 132
    .line 133
    invoke-static {p0, v0, v1}, Lrr1;->s(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 138
    .line 139
    new-instance p0, Lkd3;

    .line 140
    .line 141
    invoke-direct {p0, v6, v5}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
