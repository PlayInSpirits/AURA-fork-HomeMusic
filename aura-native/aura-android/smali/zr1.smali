.class public final synthetic Lzr1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/homemusic/HubFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzr1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lzr1;->o:Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lzr1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lj15;->a:Lj15;

    .line 5
    .line 6
    iget-object p0, p0, Lzr1;->o:Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 12
    .line 13
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object v0, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-static {p0, p1}, Lcom/eddyizm/tempus/homemusic/b;->i(Lcom/eddyizm/tempus/ui/activity/MainActivity;Lcom/eddyizm/tempus/homemusic/WaveOut;)V

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :cond_0
    const-string p0, "activity"

    .line 29
    .line 30
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v1

    .line 34
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    sget-object v0, Ljs1;->a:Lk03;

    .line 41
    .line 42
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Ljava/lang/String;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lad2;->k(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    const/4 v0, 0x0

    .line 54
    invoke-virtual {p0, p1, v0}, Lcom/eddyizm/tempus/homemusic/HubFragment;->h0(Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-object v2

    .line 58
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 65
    .line 66
    xor-int/lit8 p1, p1, 0x1

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0(Z)V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
