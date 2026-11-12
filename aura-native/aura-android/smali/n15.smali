.class public final Ln15;
.super Lpe0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final p:Ln15;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ln15;

    .line 2
    .line 3
    invoke-direct {v0}, Lpe0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln15;->p:Ln15;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final W(Lne0;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p0, Lrm0;->q:Lrm0;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iget-object p0, p0, Lrm0;->p:Lve0;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p2, p1, v0}, Lve0;->f(Ljava/lang/Runnable;ZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final X(Lne0;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sget-object p0, Lrm0;->q:Lrm0;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iget-object p0, p0, Lrm0;->p:Lve0;

    .line 5
    .line 6
    invoke-virtual {p0, p2, p1, p1}, Lve0;->f(Ljava/lang/Runnable;ZZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final Z(I)Lpe0;
    .locals 1

    .line 1
    invoke-static {p1}, Le35;->o(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lir4;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lpe0;->Z(I)Lpe0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object p0
.end method
