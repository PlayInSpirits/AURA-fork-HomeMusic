.class public final Lcom/eddyizm/tempus/model/ReplayGain;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private albumGain:F

.field private albumPeak:F

.field private trackGain:F

.field private trackPeak:F


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 31
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/eddyizm/tempus/model/ReplayGain;-><init>(FFFFILxj0;)V

    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput p1, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackGain:F

    .line 28
    iput p2, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumGain:F

    .line 29
    iput p3, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackPeak:F

    .line 30
    iput p4, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumPeak:F

    return-void
.end method

.method public synthetic constructor <init>(FFFFILxj0;)V
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    move p2, v0

    .line 12
    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 13
    .line 14
    if-eqz p6, :cond_2

    .line 15
    .line 16
    move p3, v0

    .line 17
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 18
    .line 19
    if-eqz p5, :cond_3

    .line 20
    .line 21
    move p4, v0

    .line 22
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/eddyizm/tempus/model/ReplayGain;-><init>(FFFF)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static synthetic copy$default(Lcom/eddyizm/tempus/model/ReplayGain;FFFFILjava/lang/Object;)Lcom/eddyizm/tempus/model/ReplayGain;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackGain:F

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    iget p2, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumGain:F

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    iget p3, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackPeak:F

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 20
    .line 21
    if-eqz p5, :cond_3

    .line 22
    .line 23
    iget p4, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumPeak:F

    .line 24
    .line 25
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/eddyizm/tempus/model/ReplayGain;->copy(FFFF)Lcom/eddyizm/tempus/model/ReplayGain;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackGain:F

    .line 2
    .line 3
    return p0
.end method

.method public final component2()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumGain:F

    .line 2
    .line 3
    return p0
.end method

.method public final component3()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackPeak:F

    .line 2
    .line 3
    return p0
.end method

.method public final component4()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumPeak:F

    .line 2
    .line 3
    return p0
.end method

.method public final copy(FFFF)Lcom/eddyizm/tempus/model/ReplayGain;
    .locals 0

    .line 1
    new-instance p0, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/eddyizm/tempus/model/ReplayGain;-><init>(FFFF)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/eddyizm/tempus/model/ReplayGain;

    .line 12
    .line 13
    iget v1, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackGain:F

    .line 14
    .line 15
    iget v3, p1, Lcom/eddyizm/tempus/model/ReplayGain;->trackGain:F

    .line 16
    .line 17
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v1, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumGain:F

    .line 25
    .line 26
    iget v3, p1, Lcom/eddyizm/tempus/model/ReplayGain;->albumGain:F

    .line 27
    .line 28
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget v1, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackPeak:F

    .line 36
    .line 37
    iget v3, p1, Lcom/eddyizm/tempus/model/ReplayGain;->trackPeak:F

    .line 38
    .line 39
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget p0, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumPeak:F

    .line 47
    .line 48
    iget p1, p1, Lcom/eddyizm/tempus/model/ReplayGain;->albumPeak:F

    .line 49
    .line 50
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    return v0
.end method

.method public final getAlbumGain()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumGain:F

    .line 2
    .line 3
    return p0
.end method

.method public final getAlbumPeak()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumPeak:F

    .line 2
    .line 3
    return p0
.end method

.method public final getTrackGain()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackGain:F

    .line 2
    .line 3
    return p0
.end method

.method public final getTrackPeak()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackPeak:F

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackGain:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumGain:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lb11;->d(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackPeak:F

    .line 17
    .line 18
    invoke-static {v0, v2, v1}, Lb11;->d(IFI)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget p0, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumPeak:F

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public final setAlbumGain(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumGain:F

    .line 2
    .line 3
    return-void
.end method

.method public final setAlbumPeak(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumPeak:F

    .line 2
    .line 3
    return-void
.end method

.method public final setTrackGain(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackGain:F

    .line 2
    .line 3
    return-void
.end method

.method public final setTrackPeak(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackPeak:F

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackGain:F

    .line 2
    .line 3
    iget v1, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumGain:F

    .line 4
    .line 5
    iget v2, p0, Lcom/eddyizm/tempus/model/ReplayGain;->trackPeak:F

    .line 6
    .line 7
    iget p0, p0, Lcom/eddyizm/tempus/model/ReplayGain;->albumPeak:F

    .line 8
    .line 9
    const-string v3, ", albumGain="

    .line 10
    .line 11
    const-string v4, ", trackPeak="

    .line 12
    .line 13
    const-string v5, "ReplayGain(trackGain="

    .line 14
    .line 15
    invoke-static {v5, v0, v3, v1, v4}, Lb11;->r(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", albumPeak="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, ")"

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method
