.class public final Lcom/eddyizm/tempus/homemusic/SmartRec;
.super Lcom/eddyizm/tempus/homemusic/WaveTrack;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private after:Ljava/lang/String;

.field private slot:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/eddyizm/tempus/homemusic/WaveTrack;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getAfter()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartRec;->after:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getQueueId()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/WaveTrack;->getSongId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/WaveTrack;->getRef()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p0, v0

    .line 22
    :goto_0
    if-eqz p0, :cond_1

    .line 23
    .line 24
    const-string v0, "hub:"

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    return-object v0
.end method

.method public final getSlot()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/homemusic/SmartRec;->slot:I

    .line 2
    .line 3
    return p0
.end method

.method public final setAfter(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/SmartRec;->after:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSlot(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/homemusic/SmartRec;->slot:I

    .line 2
    .line 3
    return-void
.end method
