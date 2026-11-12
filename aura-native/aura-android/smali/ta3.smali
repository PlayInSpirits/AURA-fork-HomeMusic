.class public final Lta3;
.super Le22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:Lta3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lta3;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, Le22;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lta3;->f:Lta3;

    .line 10
    .line 11
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
    const/4 p3, 0x1

    .line 7
    invoke-virtual {p1, p3}, Lx20;->d(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lwf1;

    .line 12
    .line 13
    invoke-interface {p2, p1, p0}, Lbi;->m(Lwf1;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
