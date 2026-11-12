.class public final Lfr2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lms2;

.field public final b:I

.field public final c:I

.field public final d:Ler2;

.field public final e:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lms2;IIZLer2;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfr2;->a:Lms2;

    .line 5
    .line 6
    iput p2, p0, Lfr2;->b:I

    .line 7
    .line 8
    iput p3, p0, Lfr2;->c:I

    .line 9
    .line 10
    iput-object p5, p0, Lfr2;->d:Ler2;

    .line 11
    .line 12
    iput-object p6, p0, Lfr2;->e:Landroid/os/Bundle;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lfr2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    if-ne p0, p1, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lfr2;

    .line 12
    .line 13
    iget-object v0, p1, Lfr2;->d:Ler2;

    .line 14
    .line 15
    iget-object v1, p0, Lfr2;->d:Ler2;

    .line 16
    .line 17
    if-nez v1, :cond_3

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object p0, p0, Lfr2;->a:Lms2;

    .line 23
    .line 24
    iget-object p1, p1, Lfr2;->a:Lms2;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lms2;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_3
    :goto_0
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lfr2;->d:Ler2;

    .line 2
    .line 3
    iget-object p0, p0, Lfr2;->a:Lms2;

    .line 4
    .line 5
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ControllerInfo {pkg="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lfr2;->a:Lms2;

    .line 9
    .line 10
    iget-object v1, p0, Lms2;->a:Los2;

    .line 11
    .line 12
    iget-object v1, v1, Los2;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", uid="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lms2;->a:Los2;

    .line 23
    .line 24
    iget p0, p0, Los2;->c:I

    .line 25
    .line 26
    const-string v1, "}"

    .line 27
    .line 28
    invoke-static {v0, p0, v1}, Lf34;->i(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
