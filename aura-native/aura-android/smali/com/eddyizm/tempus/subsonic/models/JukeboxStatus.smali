.class public Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private currentIndex:I

.field private gain:F

.field private isPlaying:Z

.field private position:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getCurrentIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;->currentIndex:I

    .line 2
    .line 3
    return p0
.end method

.method public final getGain()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;->gain:F

    .line 2
    .line 3
    return p0
.end method

.method public final getPosition()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;->position:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isPlaying()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;->isPlaying:Z

    .line 2
    .line 3
    return p0
.end method

.method public final setCurrentIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;->currentIndex:I

    .line 2
    .line 3
    return-void
.end method

.method public final setGain(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;->gain:F

    .line 2
    .line 3
    return-void
.end method

.method public final setPlaying(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;->isPlaying:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setPosition(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;->position:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method
