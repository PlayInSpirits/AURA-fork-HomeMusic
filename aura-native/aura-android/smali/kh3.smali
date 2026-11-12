.class public final synthetic Lkh3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/util/HashSet;


# direct methods
.method public synthetic constructor <init>(Ljava/util/HashSet;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkh3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lkh3;->o:Ljava/util/HashSet;

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
    .locals 1

    .line 1
    iget v0, p0, Lkh3;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lkh3;->o:Ljava/util/HashSet;

    .line 4
    .line 5
    check-cast p1, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->a(Ljava/util/HashSet;Lcom/eddyizm/tempus/homemusic/PlayEvent;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    invoke-static {p0, p1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->a(Ljava/util/HashSet;Lcom/eddyizm/tempus/homemusic/PlayEvent;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    goto :goto_0

    .line 24
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getEventId()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    goto :goto_0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
