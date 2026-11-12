.class public final Lcom/eddyizm/tempus/model/HomeSector;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final id:Ljava/lang/String;

.field private isVisible:Z

.field private final order:I

.field private final sectorTitle:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/eddyizm/tempus/model/HomeSector;->id:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/eddyizm/tempus/model/HomeSector;->sectorTitle:Ljava/lang/String;

    .line 13
    .line 14
    iput-boolean p3, p0, Lcom/eddyizm/tempus/model/HomeSector;->isVisible:Z

    .line 15
    .line 16
    iput p4, p0, Lcom/eddyizm/tempus/model/HomeSector;->order:I

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic copy$default(Lcom/eddyizm/tempus/model/HomeSector;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/Object;)Lcom/eddyizm/tempus/model/HomeSector;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/eddyizm/tempus/model/HomeSector;->id:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/eddyizm/tempus/model/HomeSector;->sectorTitle:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    iget-boolean p3, p0, Lcom/eddyizm/tempus/model/HomeSector;->isVisible:Z

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 20
    .line 21
    if-eqz p5, :cond_3

    .line 22
    .line 23
    iget p4, p0, Lcom/eddyizm/tempus/model/HomeSector;->order:I

    .line 24
    .line 25
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/eddyizm/tempus/model/HomeSector;->copy(Ljava/lang/String;Ljava/lang/String;ZI)Lcom/eddyizm/tempus/model/HomeSector;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/HomeSector;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/HomeSector;->sectorTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/model/HomeSector;->isVisible:Z

    .line 2
    .line 3
    return p0
.end method

.method public final component4()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/model/HomeSector;->order:I

    .line 2
    .line 3
    return p0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZI)Lcom/eddyizm/tempus/model/HomeSector;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Lcom/eddyizm/tempus/model/HomeSector;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 10
    .line 11
    .line 12
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
    instance-of v1, p1, Lcom/eddyizm/tempus/model/HomeSector;

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
    check-cast p1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/eddyizm/tempus/model/HomeSector;->id:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/eddyizm/tempus/model/HomeSector;->id:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/eddyizm/tempus/model/HomeSector;->sectorTitle:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/eddyizm/tempus/model/HomeSector;->sectorTitle:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-boolean v1, p0, Lcom/eddyizm/tempus/model/HomeSector;->isVisible:Z

    .line 36
    .line 37
    iget-boolean v3, p1, Lcom/eddyizm/tempus/model/HomeSector;->isVisible:Z

    .line 38
    .line 39
    if-eq v1, v3, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget p0, p0, Lcom/eddyizm/tempus/model/HomeSector;->order:I

    .line 43
    .line 44
    iget p1, p1, Lcom/eddyizm/tempus/model/HomeSector;->order:I

    .line 45
    .line 46
    if-eq p0, p1, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/HomeSector;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOrder()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/model/HomeSector;->order:I

    .line 2
    .line 3
    return p0
.end method

.method public final getSectorTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/HomeSector;->sectorTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/model/HomeSector;->id:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, Lcom/eddyizm/tempus/model/HomeSector;->sectorTitle:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lf34;->e(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lcom/eddyizm/tempus/model/HomeSector;->isVisible:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lxa3;->c(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget p0, p0, Lcom/eddyizm/tempus/model/HomeSector;->order:I

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public final isVisible()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/model/HomeSector;->isVisible:Z

    .line 2
    .line 3
    return p0
.end method

.method public final setVisible(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/model/HomeSector;->isVisible:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/model/HomeSector;->id:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/eddyizm/tempus/model/HomeSector;->sectorTitle:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/eddyizm/tempus/model/HomeSector;->isVisible:Z

    .line 6
    .line 7
    iget p0, p0, Lcom/eddyizm/tempus/model/HomeSector;->order:I

    .line 8
    .line 9
    const-string v3, ", sectorTitle="

    .line 10
    .line 11
    const-string v4, ", isVisible="

    .line 12
    .line 13
    const-string v5, "HomeSector(id="

    .line 14
    .line 15
    invoke-static {v5, v0, v3, v1, v4}, Lb11;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", order="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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
