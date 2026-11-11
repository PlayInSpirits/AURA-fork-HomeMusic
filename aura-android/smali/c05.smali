.class public final Lc05;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lj45;
.implements Lzy3;


# instance fields
.field public n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lc05;->n:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lc05;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lc05;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lss0;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Llg5;

    .line 2
    .line 3
    check-cast p2, Lcr4;

    .line 4
    .line 5
    new-instance v0, Ljg5;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, p2, v1}, Ljg5;-><init>(Lcr4;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->e()Landroid/os/IInterface;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Leh5;

    .line 16
    .line 17
    iget-object p0, p0, Lc05;->n:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lth1;

    .line 20
    .line 21
    invoke-virtual {p1}, Laf5;->m()Landroid/os/Parcel;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    sget v1, Lpg5;->a:I

    .line 26
    .line 27
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p2, p0}, Lpg5;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x3

    .line 34
    invoke-virtual {p1, p2, p0}, Laf5;->U(Landroid/os/Parcel;I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public d(JLce;Lce;Lce;)Lce;
    .locals 6

    .line 1
    iget-object p0, p0, Lc05;->n:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Lss0;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lss0;->d(JLce;Lce;Lce;)Lce;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public k(JLce;Lce;Lce;)Lce;
    .locals 6

    .line 1
    iget-object p0, p0, Lc05;->n:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Lss0;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lss0;->k(JLce;Lce;Lce;)Lce;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public l(Lce;Lce;Lce;)Lce;
    .locals 0

    .line 1
    iget-object p0, p0, Lc05;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lss0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lss0;->l(Lce;Lce;Lce;)Lce;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public m(Lce;Lce;Lce;)J
    .locals 0

    .line 1
    iget-object p0, p0, Lc05;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lss0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lss0;->m(Lce;Lce;Lce;)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0
.end method
