.class public final Llq1;
.super Lq42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:Lrq1;

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public constructor <init>(Lrq1;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Llq1;->n:Lrq1;

    .line 2
    .line 3
    iput p2, p0, Llq1;->o:I

    .line 4
    .line 5
    iput p3, p0, Llq1;->p:I

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
    .locals 4

    .line 1
    iget-object v0, p0, Llq1;->n:Lrq1;

    .line 2
    .line 3
    iget v1, p0, Llq1;->o:I

    .line 4
    .line 5
    iget p0, p0, Llq1;->p:I

    .line 6
    .line 7
    :try_start_0
    iget-object v2, v0, Lrq1;->J:Lzq1;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-virtual {v2, v1, p0, v3}, Lzq1;->s(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception p0

    .line 15
    invoke-virtual {v0, p0}, Lrq1;->f(Ljava/io/IOException;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-object p0, Lj15;->a:Lj15;

    .line 19
    .line 20
    return-object p0
.end method
