.class public final Lma3;
.super Le22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:Lma3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lma3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v2}, Le22;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lma3;->f:Lma3;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(Lx20;Lbi;Llg4;Luy3;Lwa3;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, Lx20;->d(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, Lgf1;

    .line 7
    .line 8
    iget-object p1, p4, Luy3;->g:Lf13;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Lf13;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
