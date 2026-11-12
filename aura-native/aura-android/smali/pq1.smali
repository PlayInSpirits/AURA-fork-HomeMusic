.class public final Lpq1;
.super Lq42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:Lrq1;

.field public final synthetic o:I

.field public final synthetic p:Lb21;


# direct methods
.method public constructor <init>(Lrq1;ILb21;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpq1;->n:Lrq1;

    .line 2
    .line 3
    iput p2, p0, Lpq1;->o:I

    .line 4
    .line 5
    iput-object p3, p0, Lpq1;->p:Lb21;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lq42;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lpq1;->n:Lrq1;

    .line 2
    .line 3
    :try_start_0
    iget v1, p0, Lpq1;->o:I

    .line 4
    .line 5
    iget-object p0, p0, Lpq1;->p:Lb21;

    .line 6
    .line 7
    iget-object v2, v0, Lrq1;->J:Lzq1;

    .line 8
    .line 9
    invoke-virtual {v2, v1, p0}, Lzq1;->u(ILb21;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    invoke-virtual {v0, p0}, Lrq1;->f(Ljava/io/IOException;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    sget-object p0, Lj15;->a:Lj15;

    .line 18
    .line 19
    return-object p0
.end method
