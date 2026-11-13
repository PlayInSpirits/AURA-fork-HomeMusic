.class public final Ldefpackage/mg3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ci0;


# static fields
.field public static final n:Ldefpackage/mg3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/mg3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/mg3;->n:Ldefpackage/mg3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ldefpackage/ii0;)J
    .locals 0

    .line 1
    new-instance p0, Ljava/io/IOException;

    .line 2
    .line 3
    const-string p1, "PlaceholderDataSource cannot be opened"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final c(Ldefpackage/rw4;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final m()Landroid/net/Uri;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final read([BII)I
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
