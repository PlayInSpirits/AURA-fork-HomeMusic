.class public final Lqk5;
.super Lh2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqk5;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:J

.field public final o:Lrj5;

.field public final p:Lrj5;

.field public final q:Lrj5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lrh5;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lrh5;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lqk5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(J[B[B[B)V
    .locals 1

    .line 1
    invoke-static {p3}, Lji2;->m(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    array-length v0, p3

    .line 5
    invoke-static {v0, p3}, Lrj5;->i(I[B)Lrj5;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-static {p4}, Lji2;->m(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    array-length v0, p4

    .line 13
    invoke-static {v0, p4}, Lrj5;->i(I[B)Lrj5;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    invoke-static {p5}, Lji2;->m(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    array-length v0, p5

    .line 21
    invoke-static {v0, p5}, Lrj5;->i(I[B)Lrj5;

    .line 22
    .line 23
    .line 24
    move-result-object p5

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-wide p1, p0, Lqk5;->n:J

    .line 29
    .line 30
    iput-object p3, p0, Lqk5;->o:Lrj5;

    .line 31
    .line 32
    iput-object p4, p0, Lqk5;->p:Lrj5;

    .line 33
    .line 34
    iput-object p5, p0, Lqk5;->q:Lrj5;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lqk5;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lqk5;

    .line 7
    .line 8
    iget-wide v0, p0, Lqk5;->n:J

    .line 9
    .line 10
    iget-wide v2, p1, Lqk5;->n:J

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lqk5;->o:Lrj5;

    .line 17
    .line 18
    iget-object v1, p1, Lqk5;->o:Lrj5;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lau0;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lqk5;->p:Lrj5;

    .line 27
    .line 28
    iget-object v1, p1, Lqk5;->p:Lrj5;

    .line 29
    .line 30
    invoke-static {v0, v1}, Lau0;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object p0, p0, Lqk5;->q:Lrj5;

    .line 37
    .line 38
    iget-object p1, p1, Lqk5;->q:Lrj5;

    .line 39
    .line 40
    invoke-static {p0, p1}, Lau0;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 49
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, Lqk5;->n:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lqk5;->p:Lrj5;

    .line 8
    .line 9
    iget-object v2, p0, Lqk5;->q:Lrj5;

    .line 10
    .line 11
    iget-object p0, p0, Lqk5;->o:Lrj5;

    .line 12
    .line 13
    filled-new-array {v0, p0, v1, v2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, p2}, Lud3;->R0(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x1

    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lud3;->T0(Landroid/os/Parcel;II)V

    .line 11
    .line 12
    .line 13
    iget-wide v0, p0, Lqk5;->n:J

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lqk5;->o:Lrj5;

    .line 19
    .line 20
    invoke-virtual {v0}, Lrj5;->j()[B

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-static {p1, v1, v0}, Lud3;->L0(Landroid/os/Parcel;I[B)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lqk5;->p:Lrj5;

    .line 29
    .line 30
    invoke-virtual {v0}, Lrj5;->j()[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x3

    .line 35
    invoke-static {p1, v1, v0}, Lud3;->L0(Landroid/os/Parcel;I[B)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lqk5;->q:Lrj5;

    .line 39
    .line 40
    invoke-virtual {p0}, Lrj5;->j()[B

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const/4 v0, 0x4

    .line 45
    invoke-static {p1, v0, p0}, Lud3;->L0(Landroid/os/Parcel;I[B)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2}, Lud3;->S0(Landroid/os/Parcel;I)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
