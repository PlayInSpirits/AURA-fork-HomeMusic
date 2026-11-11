.class public final synthetic Los1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/homemusic/PlayEvent;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/homemusic/PlayEvent;I)V
    .locals 0

    .line 1
    iput p2, p0, Los1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Los1;->o:Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Los1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Los1;->o:Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/eddyizm/tempus/homemusic/b;->b:Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/homemusic/WaveSession;->onEvent(Lcom/eddyizm/tempus/homemusic/PlayEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-ne p0, v1, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/b;->c()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/homemusic/SmartSession;->onEvent(Lcom/eddyizm/tempus/homemusic/PlayEvent;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-ne p0, v1, :cond_1

    .line 32
    .line 33
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->b()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void

    .line 37
    :pswitch_1
    sget-object v0, Lrs1;->a:Lrs1;

    .line 38
    .line 39
    sget-object v0, Lrs1;->g:Lrp4;

    .line 40
    .line 41
    invoke-virtual {v0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Llx0;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, Llx0;->b:Lii;

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Lii;->addLast(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lrs1;->h()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
