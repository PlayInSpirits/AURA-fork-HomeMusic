.class public final Lzn2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Loi3;


# instance fields
.field public final synthetic n:Lbj2;

.field public final synthetic o:I

.field public final synthetic p:J


# direct methods
.method public constructor <init>(Lbj2;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzn2;->n:Lbj2;

    .line 5
    .line 6
    iput p2, p0, Lzn2;->o:I

    .line 7
    .line 8
    iput-wide p3, p0, Lzn2;->p:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final I(Lcu4;I)V
    .locals 3

    .line 1
    iget-object p1, p0, Lzn2;->n:Lbj2;

    .line 2
    .line 3
    invoke-virtual {p1}, Lsk2;->Q0()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    iget v0, p0, Lzn2;->o:I

    .line 8
    .line 9
    if-lez p2, :cond_1

    .line 10
    .line 11
    if-ltz v0, :cond_1

    .line 12
    .line 13
    if-ge v0, p2, :cond_1

    .line 14
    .line 15
    invoke-static {}, Lu52;->c()Lv52;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget-boolean p2, p2, Lv52;->a:Z

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Lsk2;->r0(Loi3;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-wide v1, p0, Lzn2;->p:J

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1, v2}, Lsk2;->n(IJ)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lsk2;->m0()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p0}, Lsk2;->r0(Loi3;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string p1, "Cannot start playback: itemCount="

    .line 42
    .line 43
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p1, ", startIndex="

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string p1, "MediaManager"

    .line 62
    .line 63
    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    return-void
.end method
