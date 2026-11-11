.class public final synthetic Ldo1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Ldo1;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldo1;->o:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ldo1;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldo1;->o:Ljava/lang/String;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lrr1;->a:Lrr1;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, Ltz3;->Companion:Lsz3;

    .line 14
    .line 15
    sget-object v1, Lrr1;->c:Lnk1;

    .line 16
    .line 17
    const-string v2, "id_token"

    .line 18
    .line 19
    invoke-static {v2, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p0}, Lnk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v1, Lrr1;->b:Lhu2;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1}, Lsz3;->b(Ljava/lang/String;Lhu2;)Lwe5;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object v0, Lrr1;->a:Lrr1;

    .line 43
    .line 44
    new-instance v0, Lnr1;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-direct {v0, p0, v1}, Lnr1;-><init>(Lwe5;I)V

    .line 48
    .line 49
    .line 50
    new-instance p0, Lor1;

    .line 51
    .line 52
    const/16 v1, 0x8

    .line 53
    .line 54
    invoke-direct {p0, v1}, Lor1;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, p0}, Lrr1;->d(Lif1;Lif1;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    const/4 v0, 0x0

    .line 65
    invoke-static {p0, v0, v0}, Lrr1;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/HubGoogleLogin;

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
    const-string v1, ""

    .line 74
    .line 75
    if-nez v0, :cond_0

    .line 76
    .line 77
    move-object v0, v1

    .line 78
    :cond_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubGoogleLogin;->getPassword()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-nez p0, :cond_1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move-object v1, p0

    .line 86
    :goto_0
    new-instance p0, Lkd3;

    .line 87
    .line 88
    invoke-direct {p0, v0, v1}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-object p0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
