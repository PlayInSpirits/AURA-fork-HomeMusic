.class public final Ls01;
.super Lzw1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final t:Ls01;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ls01;

    .line 2
    .line 3
    sget-object v1, Lly3;->t:Lly3;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lzw1;-><init>(Lly3;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ls01;->t:Ls01;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lzw1;->r:Lly3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Lbx1;
    .locals 0

    .line 1
    iget-object p0, p0, Lzw1;->r:Lly3;

    .line 2
    .line 3
    return-object p0
.end method
