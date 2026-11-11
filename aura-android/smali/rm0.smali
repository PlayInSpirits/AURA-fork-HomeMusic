.class public final Lrm0;
.super Lx21;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final q:Lrm0;


# instance fields
.field public p:Lve0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lrm0;

    .line 2
    .line 3
    sget v2, Lir4;->c:I

    .line 4
    .line 5
    sget v3, Lir4;->d:I

    .line 6
    .line 7
    sget-wide v4, Lir4;->e:J

    .line 8
    .line 9
    sget-object v6, Lir4;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, Lpe0;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lve0;

    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, Lve0;-><init>(IIJLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lrm0;->p:Lve0;

    .line 20
    .line 21
    sput-object v0, Lrm0;->q:Lrm0;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final W(Lne0;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lrm0;->p:Lve0;

    .line 2
    .line 3
    const/4 p1, 0x6

    .line 4
    invoke-static {p0, p2, p1}, Lve0;->j(Lve0;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final X(Lne0;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lrm0;->p:Lve0;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-static {p0, p2, p1}, Lve0;->j(Lve0;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final close()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Dispatchers.Default cannot be closed"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.Default"

    .line 2
    .line 3
    return-object p0
.end method
